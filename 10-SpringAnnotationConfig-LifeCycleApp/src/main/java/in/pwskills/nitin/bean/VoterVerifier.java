package in.pwskills.nitin.bean;

import java.time.LocalDateTime;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voter")
@PropertySource("application.properties")
public class VoterVerifier {
	
	@Value("${info.voter.name}")
	private String name;
	
	@Value("${info.voter.age}")
	private Float age;
	
	private LocalDateTime date;
	
	static {
		System.out.println("VoterVerifier.class file is loading....");
	}
	
	public VoterVerifier() {
		System.out.println("VoterVerifier.VoterVerifier() object instantiated...");
	}
	
	//Initialization method
	@PostConstruct
	public void myInit() {
		System.out.println("Initialization :: VoterVerifier.myInit()");
		date = LocalDateTime.now();
		if(name == null || age < 0)
			throw new IllegalArgumentException("invalid inputs are provided for name and  age properties");
	}
	
	
	public String checkVotingEligibility() {
		if(age >= 18) {
			return "Mr/Mrs/Miss :: " + name + "u r eligible for voting , Don't wait on :: " + date;
			
		}else {
			return "Mr/Mrs/Miss :: " + name + "u r not eligible for voting ,  wait on :: " + date;
			
		}
	}
	
	
	//Destruction method
	@PreDestroy
	public void myDestroy(){
		System.out.println("Destruction :: VoterVerifier.myDestroy()");
		
		date = null;
		age = 0.0f;
		name = null;
	}
	
}
