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


public enum Ambito {
    
    PRIVADO("PRIVADO"), 
    PUBLICO("PUBLICO");
    
    
    public static final Ambito[] TODOS = { PRIVADO, PUBLICO };
    
    
    private final String tipo;

    
    public static Ambito forName(final String tipo) {
        if (tipo == null) {
        	
            throw new IllegalArgumentException("Name cannot be null for type");
        }
        if (tipo.toUpperCase().equals("PUBLICO")) {
            return PUBLICO;
        } else if (tipo.toUpperCase().equals("PRIVADO")) {
            return PRIVADO;
        }
        throw new IllegalArgumentException("O valor indicado \"" + tipo + "\" não corresponde a nen");
    }
    
    
    private Ambito(final String tipo) {
        this.tipo = tipo;
    }
    
    
    public String getTipo() {
        return this.tipo;
    }
    
    @Override
    public String toString() {
        return getTipo();
    }
    
    
}
