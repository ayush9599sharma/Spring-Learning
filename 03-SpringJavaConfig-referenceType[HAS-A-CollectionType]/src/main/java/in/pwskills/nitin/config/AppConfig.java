package in.pwskills.nitin.config;



import java.util.List;
import java.util.Map;
import java.util.Set;

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
		System.out.println("AppConfig.empObj() :: Object is creating....");
		List<String> friends = List.of("saurav", "Dravid", "Yuvi");
		Set<String> phoneNumbers = Set.of("965546", "56645656","546456");
		Map<String, String> accountNumbers = Map.of("canara", "1234" , "SBI" ,"5698" , "Kotak" , "4564");
		
		//creating target object
		Employee emp = new Employee(10,12564.56f,friends , phoneNumbers,accountNumbers);
		return emp;	
	}
	
}
