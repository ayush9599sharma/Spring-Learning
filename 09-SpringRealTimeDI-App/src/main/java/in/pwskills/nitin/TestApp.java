package in.pwskills.nitin;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.nitin.beans.CustomerVo;
import in.pwskills.nitin.config.AppConfig;
import in.pwskills.nitin.controller.CustomerController;

public class TestApp {
		public static void main(String[] args) {
			//starting the container
			ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			Scanner scanner =  new Scanner(System.in);
			
			System.out.println("Enter the customer name :: ");
			String name = scanner.next();
			
			System.out.println("Enter the customer address :: ");
			String address = scanner.next();
			
			System.out.println("Enter the customer principal amount :: ");
			String pamt = scanner.next();
			
			System.out.println("Enter the customer rate of interest :: ");
			String rate = scanner.next();
			
			System.out.println("Enter the customer time period :: ");
			String time =scanner.next();
			
			
			
			try {
				CustomerVo customerVo = new  CustomerVo();
				
				customerVo.setCustName(name);
				customerVo.setCustAddr(address);
				customerVo.setPamt(pamt);
				customerVo.setRate(rate);
				customerVo.setTime(time);
				
				CustomerController controller = context.getBean("controller",CustomerController.class);
				String status  = controller.processCustomer(customerVo);
				System.out.println(status);
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("Some problem occured --> try again");
			}
			
			
			//close the container
			((AbstractApplicationContext) context).close();
			scanner.close();
		}
}
