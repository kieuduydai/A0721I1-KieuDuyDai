package thuc_hanh;
import java.util.Scanner;

public class Inverse {
	public static void ramdom(int a[],int n) {
		int i;
		for(i = 0; i < n; i++)
			a[i] = (int) (Math.random() * 100);
	}
	
	public static void disPlay(int a[],int n) {
		int i;
		for(i = 0; i < n; i++)
			System.out.print(a[i]+" ");
	}
	
	public static void inverse(int a[],int n) {
		int i;
		for(i = n-1 ; i >= 0; i--)
			System.out.print(a[i]+" ");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu:");
		int n = sc.nextInt();
		int []a = new int [n];
		
		System.out.print("Mang ramdom la\n");
		ramdom(a, n);
		disPlay(a, n);
		System.out.print("\nMang dao nguoc\n");
		inverse(a, n);
		
}
}
