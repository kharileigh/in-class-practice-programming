/**
 *
 * @author kharileigh
 */
package com.kharileigh.jdbcrefactoring.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.kharileigh")
public class ClientConfiguration {
    
    @Bean(name= "MySqlDataSource")
    public DriverManagerDataSource getDataSource() {
    
        DriverManagerDataSource ds = new DriverManagerDataSource();
        
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://127.0.0.1:3306/wileydi001");
        ds.setUsername("root");
        ds.setPassword("cec1l3r0y!");
        
        return ds;
    }
    
    @Bean
    public JdbcTemplate getTemplate() {
    
        return new JdbcTemplate(getDataSource());
    }
}
