package in.pwskills.nitin.bean;

/**
 * 
 */
public class Employee {
	private Integer eid;
	private String ename;
	private Integer eage;
	private String eaddress;
	
	static {
		System.out.println("Employee.class is loading....");
	}
	
	public Employee(){
		System.out.println("Employee object is created by IOC Container");
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getEage() {
		return eage;
	}

	public void setEage(Integer eage) {
		this.eage = eage;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress + "]";
	}
	
	
}
