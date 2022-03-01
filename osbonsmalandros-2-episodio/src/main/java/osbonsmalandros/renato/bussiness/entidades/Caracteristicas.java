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
package osbonsmalandros.renato.bussiness.entidades;



public enum Caracteristicas {
    
	PERIGOSO("PERIGOSO"), 
    FUGA("FUGA"),
    TEM_RESTAURANTES_PERTO("TEM_RESTAURANTES_PERTO");

    
    public static final Caracteristicas[] TODOS = { FUGA, TEM_RESTAURANTES_PERTO,PERIGOSO };
    
    
    private final String nome;


    
    public static Caracteristicas forName(final String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null for feature");
        }
        if (name.toUpperCase().equals("FUGA")) {
            return FUGA;
        } else if (name.toUpperCase().equals("TEM_RESTAURANTES_PERTO")) {
            return TEM_RESTAURANTES_PERTO;
        }else if (name.toUpperCase().equals("PERIGOSO")) {
            return PERIGOSO;
        }
        throw new IllegalArgumentException("Name \"" + name + "\" does not correspond to any Caracteristicas");
    }
    
    
    private Caracteristicas(final String nome) {
        this.nome = nome;
    }
    
    
    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString() {
        return getNome();
    }
    
}
