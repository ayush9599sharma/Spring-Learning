package in.pwskills.nitin.config;



import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.pwskills.nitin.bean.Employee;




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
