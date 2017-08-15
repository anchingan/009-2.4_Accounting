/*
 * Practice 009-2.4_Accounting book
 * Date 20170814
 */

import java.util.Scanner;

public class AccountingTest {

	public static void main(String[] args) {
		Accounting accountBook = new Accounting();
		Scanner scanner = new Scanner(System.in);
		int status = 0, input;
		do {
			System.out.print("選項：1)新增, 2)印出全部, -1)結束：");
			input = scanner.nextInt();
			if (input == -1)
				break;
			else if (input == 1) {
				String item;
				int price, hour, min, sec;
				
				System.out.print("品名：");
				item = scanner.next();
				System.out.print("價格：");
				price = scanner.nextInt();
				System.out.print("時間(時/分/秒)：");
				hour = scanner.nextInt();
				min = scanner.nextInt();
				sec = scanner.nextInt();
				CTime recordTime = new CTime(hour, min, sec);
				
				accountBook.add(item, price, recordTime);
				System.out.println("輸入成功！");
			}
			else if (input == 2) {
				accountBook.print();
			}
			else 
				System.out.println("Input error!");
		} while (true);
		
		System.out.print("Program terminate.");

	}

}
