package misc;

public class Employee {

	String ename;
	int eid;
	Address addr;
	
	public Employee(String ename, int eid, Address addr) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", addr=" + addr + "]";
	}
	
	
}
