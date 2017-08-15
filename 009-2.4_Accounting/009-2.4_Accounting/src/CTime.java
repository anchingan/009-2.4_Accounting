/*
 * Used to represent a time data.
 */
public class CTime {
	private int hour;
	private int minute;
	private int second;
	
	//Constructor of this class.
	public CTime(int h, int m, int s) {
		this.setData(h, m, s);
	}
	
	//Allow the user to edit data.
	public void setData(int h, int m, int s) {
		hour = minute = second = 1;
		this.isValid(h, m, s);
	}
	
	//Check if input data is valid.
//	public static boolean isValid(int h, int m, int s) {
//		if (h < 0 || h > 24)
//			return false;
//		if (m < 0 || m > 60)
//			return false;
//		if (s < 0 || s < 60)
//			return false;
//		return true;
//	}
	
	public void isValid(int h, int m, int s) {
		if (h >= 0 && h <= 24)
			hour = h;
		if (m >= 0 && m <= 60)
			minute = m;
		if (s >= 0 && s <= 60)
			second = s;
	}
	
	//Return value of hour.
	public int getHour() {
		return hour;
	}
	
	//Return value of minute.
	public int getMinute() {
		return minute;
	}

	//Return value of second.
	public int getSecond() {
		return second;
	}
	
	//Compare two CTime objects, return positive number if a is later than b,
	//                           return negative number if a is former than b and 
	//							return 0 if a is at the same time with b.
	public static int compare(CTime a, CTime b) {
		if (a.hour != b.hour)
			return a.hour - b.hour;
		if (a.minute != b.minute)
			return a.minute - b.minute;
		return a.second - b.second;
	}
	
	public void print() {
		System.out.printf("%02d:%02d:%02d", this.hour, this.minute, this.second);
	}
}
