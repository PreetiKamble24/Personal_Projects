package encapsulation;

public class StaicDemo {
	
	public StaicDemo() {
	 count++;
	}
	int mycount;
	public int getMycount() {
		return mycount;
	}

	public void setMycount(int mycount) {
		this.mycount = mycount;
	}

	static int count;

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		StaicDemo.count = count;
	}
	

	
}
