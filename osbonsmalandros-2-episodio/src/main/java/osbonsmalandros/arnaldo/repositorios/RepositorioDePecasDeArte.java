package osbonsmalandros.arnaldo.repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import osbonsmalandros.renato.bussiness.entidades.Malandro;
import osbonsmalandros.renato.bussiness.entidades.PecaDeArte;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

@Repository
public class RepositorioDePecasDeArte {


    private JdbcTemplate jdbcTemplate;
    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    
    public int[] batchUpdateUsingJdbcTemplate(List<PecaDeArte> pecasDeArte) {
        return jdbcTemplate.batchUpdate("INSERT INTO PECA_ARTE VALUES (?,?, ?, ?, ?,?)",
            new BatchPreparedStatementSetter() {
                @Override
                public void setValues(PreparedStatement ps, int i) throws SQLException {
                	ps.setInt(1, pecasDeArte.get(i).getId());
                    ps.setString(2, pecasDeArte.get(i).getTipo().getTipo());
                    ps.setInt(3, pecasDeArte.get(i).getNumeroDePecas());
                    ps.setString(4, pecasDeArte.get(i).getDescricaoDaPeca());
                    ps.setString(5, pecasDeArte.get(i).getAutor());
                    ps.setString(6, pecasDeArte.get(i).getSeculo());
                }
                @Override
                public int getBatchSize() {
                    return pecasDeArte.size();
                }
            });
    }

}