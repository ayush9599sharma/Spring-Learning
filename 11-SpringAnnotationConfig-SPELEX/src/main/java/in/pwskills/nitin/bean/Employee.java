package in.pwskills.nitin.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component("employees")
@PropertySource("application.properties")
public class Employee implements Serializable{

	static {
		System.out.println("Employee.class file is loading....");
	}
	private static final long serialVersionUID = 1L;
	
	
	@Value("${info.emp.eid}")
	private Integer eid;
	
	@Value("${info.emp.ename}")
	private String ename;
	
	@Value("${info.emp.eage}")
	private Float eage;
	
	@Value("${info.emp.friends}")
	private List<String> friends;
	
	@Value("${info.emp.numbers}")
	private Set<String> phnoneNumbers;
	
	@Value("#{${info.emp.accountNumbers}}")
	private Map<String, String> accountNumbers;
	
	public Employee() {
		System.out.println("Employee() object is created :: zero param");
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", friends=" + friends
				+ ", phnoneNumbers=" + phnoneNumbers + ", accountNumbers=" + accountNumbers + "]";
	}
	
	
	



	
	
}
