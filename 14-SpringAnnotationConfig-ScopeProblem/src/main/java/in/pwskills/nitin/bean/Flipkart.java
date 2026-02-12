package in.pwskills.nitin.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public  class Flipkart {
	
	static {
		System.out.println("Flipkart.class file is loading....");
		
	}
	
	public Flipkart() {
		System.out.println("Flipkart.Flipkart() object is created.....");
	}

	@Autowired
	@Qualifier("dtdc")
	private ICourier courier;

	
	
	public ICourier getCourier() {
		courier = getCourierObj();
		return courier;
	}


	//Write a method to perform LMI
	@Lookup(value="dtdc")
	public   ICourier getCourierObj() {
		return null;
	}


	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + "]";
	}
	
}
