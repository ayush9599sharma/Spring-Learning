package in.pwskills.nitin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.nitin.bean.Employee;
import in.pwskills.nitin.config.AppConfig;

public class TestApp {
		public static void main(String[] args) {
			//starting the container
			ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			
			String[] definitionNames = context.getBeanDefinitionNames();
			
			for(String x : definitionNames) {
				System.out.println(x);
			}
			Employee emp = context.getBean("employees" , Employee.class);
			System.out.println(emp);
			
			//close the container
			((AbstractApplicationContext) context).close();
		}
}
