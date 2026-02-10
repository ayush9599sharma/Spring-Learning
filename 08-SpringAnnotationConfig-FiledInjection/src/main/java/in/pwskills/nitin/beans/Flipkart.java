package in.pwskills.nitin.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {
	
	static {
		System.out.println("Flipkart.class file is loading...");
	}
	
	public Flipkart() {
		System.out.println("Flipkart.Flipkart() object is created....");
	}
	
	@Autowired
	private ICourier courier;
	
	public String shopping(String[] items , float[] prices) {
		System.out.println("Flipkart.shopping()");
		
		float total = 0.0f;
		for(float price : prices) {
			total+=price;
		}
		String msg = courier.deliver(new Random().nextInt(1000));
		
		return Arrays.toString(items) + "with price " + Arrays.toString(prices) + "having bill amount :: " + total  + msg;
	}
}
