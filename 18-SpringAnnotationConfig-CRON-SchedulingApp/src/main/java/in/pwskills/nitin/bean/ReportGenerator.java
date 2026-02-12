package in.pwskills.nitin.bean;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class ReportGenerator {
	
	@Scheduled(cron="15 * * * * * ")
	public void generateSalesReport() {
		
//		try {
//			Thread.sleep(5000);
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("Sales report on :: " + new Date());
		
		
	}

}
