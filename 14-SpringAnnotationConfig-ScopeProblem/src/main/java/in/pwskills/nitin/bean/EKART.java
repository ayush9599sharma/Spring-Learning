package in.pwskills.nitin.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("prototype")
public class EKART implements ICourier {

	

	@Override
	public String deliverOrder(Integer oid) {	
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "EKART []";
	}

}
