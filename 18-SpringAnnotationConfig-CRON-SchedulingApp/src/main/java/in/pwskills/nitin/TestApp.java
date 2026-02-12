package in.pwskills.nitin;

import java.io.IOException;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import in.pwskills.nitin.config.AppConfig;

public class TestApp {
		public static void main(String[] args) throws IOException {
			//starting the container
			ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			System.out.println("Container started at :: " + new Date());
			
			
			//close the container
			//((AbstractApplicationContext) context).close();
		}
}
