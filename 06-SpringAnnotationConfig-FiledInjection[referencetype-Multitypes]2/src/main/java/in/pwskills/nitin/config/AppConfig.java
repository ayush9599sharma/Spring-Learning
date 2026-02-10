package in.pwskills.nitin.config;



import java.time.LocalDateTime;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;






@Configuration
@ComponentScan(basePackages="in.pwskills.nitin")
public class AppConfig {
	static{
		System.out.println("AppConfig File is loading...");
	}
	public AppConfig() {
		System.out.println("App config object is created...");
	}
	
	
}
