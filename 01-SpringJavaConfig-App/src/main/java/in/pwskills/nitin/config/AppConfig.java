package in.pwskills.nitin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskills.nitin.bean.Employee;

@Configuration
public class AppConfig {
	static{
		System.out.println("AppConfig File is loading...");
	}
	public AppConfig() {
		System.out.println("App config object is created...");
	}
	
	@Bean
	public Employee empObj() {
		System.out.println("AppConfig.empObj() :: creating the object");
		Employee employee = new Employee();
		employee.setEid(1);
		employee.setEname("Ayush");
		employee.setEage(26);
		employee.setEaddress("Kheriki , Baghpat");
		return employee;
	}
	
}
