package in.pwskills.nitin.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskills.nitin.bean.WishMessageGenerator;



@Configuration
public class AppConfig {
	static{
		System.out.println("AppConfig File is loading...");
	}
	public AppConfig() {
		System.out.println("App config object is created...");
	}
	
	@Bean
	public WishMessageGenerator wmgObj() {
			System.out.println("AppConfig.wmgObj() :: creating the object....");
			
			//create a target object
			WishMessageGenerator message = new WishMessageGenerator();
			
			//create a dependent object
			LocalDateTime ldt = LocalDateTime.now();
			
			//linking the object using setter style
			message.setLdt(ldt);
			return message;
	}
	
}
