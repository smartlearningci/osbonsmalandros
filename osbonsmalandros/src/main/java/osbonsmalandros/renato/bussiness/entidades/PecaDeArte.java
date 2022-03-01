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

public class PecaDeArte {

    private Tipo tipo = null;
    private Integer numeroDePecas = null;
    private String descricaoDaPeca;
    private String autor;
    private String seculo;
    
    
    public PecaDeArte() {
        super();
    }


    public Tipo getTipo() {
        return this.tipo;
    }


    public void setTipo(final Tipo tipo) {
        this.tipo = tipo;
    }

    public Integer getNumeroDePecas() {
        return this.numeroDePecas;
    }

    public void setNumeroDePecas(final Integer numeroDePecas) {
        this.numeroDePecas = numeroDePecas;
    }



	public String getDescricaoDaPeca() {
		return descricaoDaPeca;
	}


	public void setDescricaoDaPeca(final String descricaoDaPeca) {
		this.descricaoDaPeca = descricaoDaPeca;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(final String autor) {
		this.autor = autor;
	}


	public String getSeculo() {
		return seculo;
	}


	public void setSeculo(String seculo) {
		this.seculo = seculo;
	}



    @Override
    public String toString() {
        return "Row [tipo=" + this.tipo + ", numeroDePecas=" + this.numeroDePecas + "]";
    }
    
}
