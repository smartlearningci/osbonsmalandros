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
package osbonsmalandros.renato.bussiness.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import osbonsmalandros.arnaldo.repositorios.RepositorioDeRoubosDePecasDeArte;
import osbonsmalandros.renato.bussiness.entidades.RouboPecasDeArte;


@Service
public class ServicoDeRouboDePecasDeArte {
    
    
    private RepositorioDeRoubosDePecasDeArte repositorioDeRoubosDePecasDeArte; 
    
    
    public ServicoDeRouboDePecasDeArte() {
        super();
        repositorioDeRoubosDePecasDeArte = new RepositorioDeRoubosDePecasDeArte();
    }
    
    
    
    public List<RouboPecasDeArte> findAll() {
        return this.repositorioDeRoubosDePecasDeArte.findAll();
    }

    public void add(final RouboPecasDeArte rouboPecasDeArte) {
        this.repositorioDeRoubosDePecasDeArte.add(rouboPecasDeArte);
    }
    
}
