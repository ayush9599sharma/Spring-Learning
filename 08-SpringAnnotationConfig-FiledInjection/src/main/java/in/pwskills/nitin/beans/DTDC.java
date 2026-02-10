package in.pwskills.nitin.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DTDC implements ICourier {

	static {
		System.out.println("DTDC.class file is loading...");
		
	}
	
	public DTDC() {
		System.out.println("DTDC.DTDC() object is created....");
	}




	@Override
	public String deliver(int oid) {
		return "Delivering " + oid + "order id order products using DTDC";
	}

}
