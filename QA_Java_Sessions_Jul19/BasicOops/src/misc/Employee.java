package misc;

public class Employee {

	String ename;
	int eid;
	String edesg;
	Address add;
	
	public Employee(String ename, int eid, String edesg, Address add) {
		this.ename = ename;
		this.eid = eid;
		this.edesg = edesg;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", edesg=" + edesg + ", add=" + add + "]";
	}

	
}