package osbonsmalandros.renato.bussiness.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import osbonsmalandros.arnaldo.repositorios.RepositorioDeMalandros;
import osbonsmalandros.arnaldo.repositorios.RepositorioDeTipos;
import osbonsmalandros.renato.bussiness.entidades.Malandro;

@Service
public class ServicoDeMalandros {

    @Autowired
    private RepositorioDeMalandros repositorioDeMalandros;

    public boolean verificaUtilizador(Malandro malandro){
        return repositorioDeMalandros.malandroEstaRegistado(malandro);
    }
}
