package in.pwskills.nitin.bean;

import java.time.LocalDateTime;

//User-defined type
public class WishMessageGenerator {
	
	static {
		System.out.println("WishMessageGenerator.class() file is loading...");
	}
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator object created with zero param");
	}
	
	
	
	//HAS-A[InbuiltType]
	private LocalDateTime ldt;
		
	public LocalDateTime getLdt() {
		return ldt;
	}

	public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	}

}
