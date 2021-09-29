package bai_tap;
import java.util.Scanner;

public class ChuyenDoiTienTe {
	public static void change(float vnd) {
		System.out.printf("%-20s%s", "VND", "USD\n");
		System.out.printf("%-20.2f%s", vnd, vnd / 23000);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhap so tien VND: ");
		int vnd = Integer.parseInt(sc.nextLine());
		change(vnd); 
		} 
	}
