package osbonsmalandros.arnaldo.repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import osbonsmalandros.renato.bussiness.entidades.Malandro;

import javax.sql.DataSource;

@Repository
public class RepositorioDeMalandros {


    private JdbcTemplate jdbcTemplate;
    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean malandroEstaRegistado(final Malandro malandro) {
        int numeroDeUtilizadores = jdbcTemplate.queryForObject("SELECT COUNT(UTILIZADOR) FROM MALANDRO WHERE UTILIZADOR='" + malandro.getUtilizador() + "' and SENHA='"+ malandro.getSenha()+"'", Integer.class);
        if (numeroDeUtilizadores == 1) {
            return true;
        }
        return false;
    }
}