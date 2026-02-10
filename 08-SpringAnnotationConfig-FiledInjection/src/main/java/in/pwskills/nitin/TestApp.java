package in.pwskills.nitin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.nitin.beans.Flipkart;
import in.pwskills.nitin.config.AppConfig;

public class TestApp {
		public static void main(String[] args) {
			//starting the container
			ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			String[] definitionNames = context.getBeanDefinitionNames();
			
			for(String x : definitionNames) {
				System.out.println(x);
			}
			Flipkart flipkart = context.getBean("flipkart",Flipkart.class);
			String status = flipkart.shopping(new String[] {"fossilwatch","lp belts","arrowshoes"}, new float[] {56700.5f,3500.5f,4500.5f});
			System.out.println(status);
			//close the container
			((AbstractApplicationContext) context).close();
		}
}
