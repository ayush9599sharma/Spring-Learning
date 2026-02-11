package in.pwskills.nitin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.nitin.bean.VoterVerifier;
import in.pwskills.nitin.config.AppConfig;

public class TestApp {
		public static void main(String[] args) {
			//starting the container
			ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			
			String[] definitionNames = context.getBeanDefinitionNames();
			
			for(String x : definitionNames) {
				System.out.println(x);
			}
			
			
			VoterVerifier verifier = context.getBean("voter",VoterVerifier.class);
			
			
			
			String Status = verifier.checkVotingEligibility();
			System.out.println(Status);
			//close the container
			((AbstractApplicationContext) context).close();
		}
}
