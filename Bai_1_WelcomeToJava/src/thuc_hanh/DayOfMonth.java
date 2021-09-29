package thuc_hanh;

import java.util.Scanner;

public class DayOfMonth {
	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap thang: ");
		
		do{
		a = scanner.nextInt();
		if(a <= 0 || a > 12) 
			System.out.println("Nhap sai thang. Hay nhap lai!");
		}while(a <= 0 || a > 12);
		
		switch(a)
		{
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("tháng "+a+" Có 31 ngày");
				break;
			case 2:
				System.out.println("tháng "+a+" Có 28 ngày hoặc 29 ngày");
				break;
			default: 
				System.out.println("tháng "+a+" Có 30 ngày");
		}
	
	}
}	
