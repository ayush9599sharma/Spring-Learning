package in.pwskills.nitin.bean;

import org.springframework.stereotype.Component;

@Component(/*value="courier"*/)
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
