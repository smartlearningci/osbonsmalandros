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
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import osbonsmalandros.renato.bussiness.entidades.Ambito;
import osbonsmalandros.renato.bussiness.entidades.Caracteristicas;
import osbonsmalandros.renato.bussiness.entidades.RouboPecasDeArte;
import osbonsmalandros.renato.bussiness.entidades.PecaDeArte;
import osbonsmalandros.renato.bussiness.entidades.Tipo;
import osbonsmalandros.renato.bussiness.servicos.ServicoDeRouboDePecasDeArte;
import osbonsmalandros.renato.bussiness.servicos.ServicoDeTipos;



@Controller
public class FlavioMainController {


    
    private ServicoDeTipos servicoDeTipos;
    
    
    private ServicoDeRouboDePecasDeArte servicoDeRouboDePecasDeArte;
    
    
    
    public FlavioMainController() {
        super();
        servicoDeRouboDePecasDeArte = new ServicoDeRouboDePecasDeArte();
        servicoDeTipos = new ServicoDeTipos();
    }

    
    
   
    @RequestMapping({"/","/osbonsmalandros"})
    public String mostraFurtosDePecasDeArte(final RouboPecasDeArte rouboPecasDeArte) {
    	rouboPecasDeArte.setDataDoFurto(Calendar.getInstance().getTime());
        return "osbonsmalandros";
    }

    @RequestMapping(value="/osbonsmalandros", params={"save"})
    public String gravaFurtosDePecasDeArte(final RouboPecasDeArte rouboPecasDeArte, final BindingResult bindingResult, final ModelMap model) {
        if (bindingResult.hasErrors()) {
            return "osbonsmalandros";
        }

        
        return "redirect:/osbonsmalandros";
    }
    

    
    @RequestMapping(value="/osbonsmalandros", params={"addRow"})
    public String addRow(final RouboPecasDeArte rouboPecasDeArte, final BindingResult bindingResult) {

        
    }
    
    
    @RequestMapping(value="/osbonsmalandros", params={"removeRow"})
    public String removeRow(final RouboPecasDeArte rouboPecasDeArte, final BindingResult bindingResult, final HttpServletRequest req) {

        
    }


}
