package in.pwskills.nitin.bean;

import org.springframework.stereotype.Component;

@Component
public class Bank {
	public double calculateCompountInterest(double pamt , double rate , double time) {
		return (pamt * Math.pow((1+ (rate/100)), time)) - pamt;
		
		
	}
}
