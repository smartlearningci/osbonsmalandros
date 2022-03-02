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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class RouboPecasDeArte {


    private Integer id = null;
    private Date dataDoFurto = null;
    private Boolean roubada = true;
    private Ambito ambito = Ambito.PRIVADO;
    private Caracteristicas[] caracteristicas = null;

    
    
    private List<PecaDeArte> pecasDeArte = new ArrayList<PecaDeArte>();
    
    
    public RouboPecasDeArte() {
        super();
    }


    public Integer getId() {
        return this.id;
    }


    public void setId(final Integer id) {
        this.id = id;
    }




    public Date getDataDoFurto() {
		return dataDoFurto;
	}


	public void setDataDoFurto(final Date dataDoFurto) {
		this.dataDoFurto = dataDoFurto;
	}







    public Ambito getAmbito() {
		return ambito;
	}


	public void setAmbito(final Ambito ambito) {
		this.ambito = ambito;
	}


	public Boolean getRoubada() {
		return roubada;
	}


	public void setRoubada(final Boolean roubada) {
		this.roubada = roubada;
	}





	public Caracteristicas[] getCaracteristicas() {
        return this.caracteristicas;
    }


    public void setCaracteristicas(final Caracteristicas[] features) {
        this.caracteristicas = features;
    }


    public List<PecaDeArte> getPecasDeArte() {
        return this.pecasDeArte;
    }







    
}
