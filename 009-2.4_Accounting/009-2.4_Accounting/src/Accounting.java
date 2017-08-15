/*
 * Used for store record data.
 */
public class Accounting {
	private Record[] records = new Record[50];
	private int count = 0;
	
	//Constructor of this class.
	public Accounting() {
		
	}
	
	public void add(String name, int price, CTime recordTime) {
		
		//Create new object of record to store input data and store in array.
		Record record = new Record(name, price, recordTime);
		//If number of input is more than array size, resize it.
		if (this.count >= records.length)
			this.resize();
		
		this.records[this.count++] = record;
	}
	
	public void print() {
		//Create a new Record to assist print data stored in this object.
		
		for (int i = 0; i < count; i++) {
			Record record = this.records[i];
			String item = record.getName();
			int price = record.getPrice();
			CTime time = record.getRecordTime();
			
			System.out.printf("%2d%8s\t%2d\t", (i + 1), item, price);
			time.print();
			System.out.println("");
		}
	}
	
	private void resize() {
		//Create a new array which is twice size of the original one.
		Record[] newRecords = new Record[records.length * 2];
		//Copy all elements to new array.
		for (int i = 0; i < this.count; i++)
			newRecords[i] = this.records[i];
		this.records = null;
		//Point to new array.
		this.records = newRecords;
	}

}
