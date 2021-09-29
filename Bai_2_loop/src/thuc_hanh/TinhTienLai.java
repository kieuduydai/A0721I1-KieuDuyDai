package thuc_hanh;
import java.util.Scanner;

public class TinhTienLai {
	
	public static double tienLai(double money, double interset_rate, int month) {
		money = 1.0;
		month = 1;
		interset_rate = 1.0;
		double total_interset = 0;
		for(int i = 0; i < month; i++){
		     total_interset += money * (interset_rate/100)/12 * month;     
		 }
		return total_interset; 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tien muon vay: ");
		double money = sc.nextDouble();
		
		System.out.println("Nhap so thang vay: ");
		int month = sc.nextInt();
		
		System.out.println("Ti le lai suat: ");
		double interset_rate = sc.nextDouble();
		
		System.out.println("So tien nhan duoc la: "+ tienLai(money,interset_rate,month));
}
}
