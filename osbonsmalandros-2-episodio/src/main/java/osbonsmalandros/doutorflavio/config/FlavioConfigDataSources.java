package osbonsmalandros.doutorflavio.config;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class FlavioConfigDataSources {

	private static boolean h2 = false;
    @Bean
    public DataSource dataSource() {
    	if (!h2) {
    		h2 = true;
    		return new EmbeddedDatabaseBuilder()
                    .setType(EmbeddedDatabaseType.H2)
                    .addScript("schema.sql")
                    .addScript("test-data.sql").build();
    		
    	} else {
    		return new EmbeddedDatabaseBuilder()
                    .setType(EmbeddedDatabaseType.H2).build();
    	}
        
    }
}