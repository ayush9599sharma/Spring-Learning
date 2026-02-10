package in.pwskills.nitin.config;



import java.sql.Driver;
import java.time.LocalDateTime;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;






@Configuration
@ComponentScan(basePackages="in.pwskills.nitin")
@PropertySource("appication.properties")
public class AppConfig {
	
	@Autowired
	private Environment environment;
	static{
		System.out.println("AppConfig File is loading...");
	}
	public AppConfig() {
		System.out.println("App config object is created...");
	}
	
	@Bean(value="ds")
	public DataSource getDataSource() {
		System.out.println(environment.getClass().getName());
		DriverManagerDataSource dataSource  = new DriverManagerDataSource();
		dataSource.setUrl(environment.getProperty("db.mysql.url"));
		dataSource.setUsername(environment.getProperty("db.mysql.username"));
		dataSource.setPassword(environment.getProperty("db.mysql.password"));
		return dataSource;
	}
	
	
}
