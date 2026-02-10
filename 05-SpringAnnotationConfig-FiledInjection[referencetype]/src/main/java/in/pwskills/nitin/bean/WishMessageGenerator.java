package in.pwskills.nitin.bean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//User-defined type
@Component(value="wmg")
public class WishMessageGenerator {
	
	static {
		System.out.println("WishMessageGenerator.class() file is loading...");
	}
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator object created with zero param");
	}
	
	
	
	//HAS-A[InbuiltType]
	@Autowired(required=false)
	private LocalDateTime ldt;

	public String wishMessage(String user) {
		int hour = ldt.getHour();
		String msg="";
		if(hour<12) {
			msg="Good morning " + user;
			
		}else if(hour<16) {
			msg="Good afternoon "+ user;
			
		}else if(hour<20) {
			msg="Good evening " + user;
		}else {
			msg="Good Night "+ user;
		}
		return msg;
	}
}
