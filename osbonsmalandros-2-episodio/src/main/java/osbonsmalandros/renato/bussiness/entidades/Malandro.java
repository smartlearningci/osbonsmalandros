package osbonsmalandros.renato.bussiness.entidades;

public class Malandro {

    private String utilizador;
    private String senha;

    public Malandro()
    {
    	super();
    }
    public String getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(final String utilizador) {
        this.utilizador = utilizador;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(final String senha) {
        this.senha = senha;
    }
}
