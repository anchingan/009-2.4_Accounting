/*
 * Used to store data of one record.
 */

public class Record {
	private String name = new String("");
	private int price = 0;
	private CTime recordTime = new CTime(1, 1, 1);
	
	private static int test;
	
	public Record(String n, int p, CTime rt) {
		this.setData(n, p, rt);
	}
	
	public void setData(String n, int p, CTime rt) {
		if (n != null)
			name = n;
		if (p >= 0)
			price = p;
		if (rt != null)
			recordTime = rt;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public CTime getRecordTime() {
		return recordTime;
	}

}
