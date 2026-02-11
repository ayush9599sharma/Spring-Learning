package in.pwskills.nitin;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.nitin.bean.WishMessageGenerator;
import in.pwskills.nitin.config.AppConfig;

public class TestApp {
		public static void main(String[] args) throws IOException {
			//starting the container
			ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			System.in.read();
			
			WishMessageGenerator wmg1 = context.getBean("wmg1",WishMessageGenerator.class);
			WishMessageGenerator wmg2 = context.getBean("wmg1",WishMessageGenerator.class);
			 System.out.println(wmg1.hashCode() + " - " +	 wmg2.hashCode());
			 System.out.println("obj1==obj2 ?" + (wmg1 == wmg2	));
			 
			 
			 System.out.println("=====================================");
			 
				WishMessageGenerator wmg3 = context.getBean("wmg2",WishMessageGenerator.class);
				WishMessageGenerator wmg4 = context.getBean("wmg2",WishMessageGenerator.class);
				 System.out.println(wmg3.hashCode() + " - " +	 wmg4.hashCode());
				 System.out.println("obj1==obj2 ?" + (wmg3 == wmg4	));
			 
			//close the container
			((AbstractApplicationContext) context).close();
		}
}
