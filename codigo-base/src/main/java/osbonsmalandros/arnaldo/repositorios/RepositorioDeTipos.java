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
package osbonsmalandros.arnaldo.repositorios;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import osbonsmalandros.renato.bussiness.entidades.Tipo;



@Repository
public class RepositorioDeTipos {

    private final Map<Integer,	Tipo> tiposPorId;
    
    
    
    public RepositorioDeTipos() {
        
        super();
        
        this.tiposPorId = new LinkedHashMap<Integer,Tipo>();
        
        final Tipo var1 = new Tipo();
        var1.setId(Integer.valueOf(1));
        var1.setTipo("Cerâmica");
        this.tiposPorId.put(var1.getId(), var1);
        
        final Tipo var2 = new Tipo();
        var2.setId(Integer.valueOf(2));
        var2.setTipo("Diversos");
        this.tiposPorId.put(var2.getId(), var2);
        
        final Tipo var3 = new Tipo();
        var3.setId(Integer.valueOf(3));
        var3.setTipo("Escultura");
        this.tiposPorId.put(var3.getId(), var3);
        
        final Tipo var4 = new Tipo();
        var4.setId(Integer.valueOf(4));
        var4.setTipo("Ourivesaria");
        this.tiposPorId.put(var4.getId(), var4);
        
        final Tipo var5 = new Tipo();
        var5.setId(Integer.valueOf(5));
        var5.setTipo("Pintura");
        this.tiposPorId.put(var5.getId(), var5);
        
        final Tipo var6 = new Tipo();
        var6.setId(Integer.valueOf(6));
        var6.setTipo("Religiosa");
        this.tiposPorId.put(var6.getId(), var6);
    }
    
    
    
    public List<Tipo> findAll() {
        return new ArrayList<Tipo>(this.tiposPorId.values());
    }
    
    public Tipo findById(final Integer id) {
        return this.tiposPorId.get(id);
    }
    
    
    
}
