package bai_tap;
import java.util.Scanner;
public class AddArray {
	public static Scanner sc = new Scanner(System.in);
	
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
	
	public static int [] addArray(int a[], int b[]) {
		
		int []c = new int [a.length+b.length];
		
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		
		int count = 0;
		for(int i = a.length;i < a.length+b.length;i++) {
			c[i] = b[count++];
		}
		
		return c;
		
	}
	
	public static void main(String[] args) {
		System.out.print("Nhap so phan tu cua mang A: ");
		int n = sc.nextInt();
		int []a = new int [n];
		
		System.out.print("Nhap so phan tu cua mang B: ");
		int m = sc.nextInt();
		int []b = new int [m];
		
		System.out.print("Mang A: ");
		ramdom(a, n);
		disPlay(a, n);
		
		System.out.print("\nMang B: ");
		ramdom(b,m);
		disPlay(b, n);
		
		System.out.print("\nMang sau khi gop: ");
		disPlay(addArray(a, b),n+m);
	}
}

