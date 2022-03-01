/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2016, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package osbonsmalandros.doutorflavio.controllers;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import osbonsmalandros.arnaldo.repositorios.RepositorioDeMalandros;
import osbonsmalandros.renato.bussiness.entidades.*;
import osbonsmalandros.renato.bussiness.servicos.ServicoDeMalandros;
import osbonsmalandros.renato.bussiness.servicos.ServicoDeRouboDePecasDeArte;
import osbonsmalandros.renato.bussiness.servicos.ServicoDeTipos;



@Controller
public class FlavioMainController {


    @Autowired
    private ServicoDeTipos servicoDeTipos;
    
    @Autowired
    private ServicoDeRouboDePecasDeArte servicoDeRouboDePecasDeArte;
    
    @Autowired
    private ServicoDeMalandros servicoDeMalandros;

    
    @Autowired
    private RepositorioDeMalandros dao;
    
    
    public FlavioMainController() {
        super();
        servicoDeRouboDePecasDeArte = new ServicoDeRouboDePecasDeArte();
        servicoDeTipos = new ServicoDeTipos();
        dao = new RepositorioDeMalandros();
    }

    
    
    @ModelAttribute("todosOsAmbitos")
    public List<Ambito> populateAmbitos() {
        return Arrays.asList(Ambito.TODOS);
    }
    
    
    
    
    
    
    @ModelAttribute("todasAsCaracteristicas")
    public List<Caracteristicas> populateFeatures() {
    	List<Caracteristicas> c=  Arrays.asList(Caracteristicas.TODOS);
    	return Arrays.asList(Caracteristicas.TODOS);
    }
    
    @ModelAttribute("todosOsTipos")
    public List<Tipo> populateTipos() {
        return this.servicoDeTipos.findAll();
    }
    
    @ModelAttribute("todasAsPecasDeArte")
    public List<RouboPecasDeArte> populatePecasDeArte() {
        return this.servicoDeRouboDePecasDeArte.findAll();
    }


    @RequestMapping({"/ola"})
    public String mostraBlank() {
        return "osbonsmalandros";
    }

    @RequestMapping({"/","/login"})
    public String mostraLogin(Malandro malandro) {
    	malandro = new Malandro();
        return "login";
    }
    @RequestMapping(value="/login", params={"avancar"})
    public String avancar(final Malandro malandro, final BindingResult bindingResult, final ModelMap model) {

    	if (servicoDeMalandros.verificaUtilizador(malandro))
    	{
    		model.clear();
    		return "redirect:/osbonsmalandros";
    	}
    	model.clear();
        return "redirect:/login";
    }
    @RequestMapping({"/osbonsmalandros"})
    public String mostraFurtosDePecasDeArte(final RouboPecasDeArte rouboPecasDeArte) {
    	rouboPecasDeArte.setDataDoFurto(Calendar.getInstance().getTime());
        return "osbonsmalandros";
    }

    @RequestMapping({"/dao"})
    public String dao() {
        //int valor = dao.getCountOfEmployees();
        return "osbonsmalandros";
    }

    @RequestMapping(value="/osbonsmalandros", params={"save"})
    public String gravaFurtosDePecasDeArte(final RouboPecasDeArte rouboPecasDeArte, final BindingResult bindingResult, final ModelMap model) {
        if (bindingResult.hasErrors()) {
            return "osbonsmalandros";
        }
        this.servicoDeRouboDePecasDeArte.add(rouboPecasDeArte);
        model.clear();
        return "redirect:/osbonsmalandros";
    }
    

    
    @RequestMapping(value="/osbonsmalandros", params={"addRow"})
    public String addRow(final RouboPecasDeArte rouboPecasDeArte, final BindingResult bindingResult) {
    	rouboPecasDeArte.getPecasDeArte().add(new PecaDeArte());
        return "osbonsmalandros";
    }
    
    
    @RequestMapping(value="/osbonsmalandros", params={"removeRow"})
    public String removeRow(final RouboPecasDeArte rouboPecasDeArte, final BindingResult bindingResult, final HttpServletRequest req) {
        final Integer rowId = Integer.valueOf(req.getParameter("removeRow"));
        rouboPecasDeArte.getPecasDeArte().remove(rowId.intValue());
        return "osbonsmalandros";
    }


}
