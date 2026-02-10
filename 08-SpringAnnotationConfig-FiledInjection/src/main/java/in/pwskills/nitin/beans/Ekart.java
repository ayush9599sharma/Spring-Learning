package in.pwskills.nitin.beans;

import org.springframework.stereotype.Component;

@Component
public class Ekart implements ICourier {
	
	static {
		System.out.println("Ekart.class is loading.........");
	}
	
	public Ekart() {
		System.out.println("Ekart.Ekart() object is created....");
	}




	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "Delivering " + oid + "order id order products using Ekart";
	}

}
