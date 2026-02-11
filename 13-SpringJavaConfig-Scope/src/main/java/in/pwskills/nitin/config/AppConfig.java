package in.pwskills.nitin.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import in.pwskills.nitin.bean.WishMessageGenerator;



@Configuration
public class AppConfig {
	static{
		System.out.println("AppConfig File is loading...");
	}
	public AppConfig() {
		System.out.println("App config object is created...");
	}
	
	@Bean(name ="wmg1")
	@Scope("prototype")
	public WishMessageGenerator wmgObj1() {
			System.out.println("AppConfig.wmgObj1() :: creating the object....");
			
			//create a target object
			WishMessageGenerator message = new WishMessageGenerator();
			
			//create a dependent object
			LocalDateTime ldt = LocalDateTime.now();
			
			//linking the object using setter style
			message.setLdt(ldt);
			return message;
	}
	
	@Bean(name ="wmg2")
	@Scope("prototype")
	public WishMessageGenerator wmgObj2() {
			System.out.println("AppConfig.wmgObj2() :: creating the object....");
			
			//create a target object
			WishMessageGenerator message = new WishMessageGenerator();
			
			//create a dependent object
			LocalDateTime ldt = LocalDateTime.now();
			
			//linking the object using setter style
			message.setLdt(ldt);
			return message;
	}
	
}
