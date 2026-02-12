package in.pwskills.nitin;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.nitin.bean.Bank;
import in.pwskills.nitin.config.AppConfig;

public class TestApp {
		public static void main(String[] args) throws IOException {
			//starting the container
			ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			String[] definitionNames = context.getBeanDefinitionNames();
			
			for(String x : definitionNames) {
				System.out.println(x);
			}
			Bank bank = context.getBean(Bank.class);
			System.out.println(bank.calculateCompountInterest(10000,2,12));
			
			
			//close the container
			((AbstractApplicationContext) context).close();
		}
}
