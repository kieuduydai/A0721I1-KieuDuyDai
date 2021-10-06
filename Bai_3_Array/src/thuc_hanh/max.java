package thuc_hanh;
import java.util.Scanner;

public class max {
	public static void ramdom(int a[],int n) {
		int i;
		for(i = 0; i < n; i++)
			a[i] = (int) (Math.random() * 100);
	}
	
	public static void out(int a[],int n) {
		int i;
		for(i = 0; i < n; i++)
			System.out.print(a[i]+" ");
	}
	
	public static int timMax(int a[],int n) {
		int i,max = a[0];
		for(i = 1; i < n; i++)
			if(max < a[i]) 
				max = a[i];
		return max;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu:");
		int n = sc.nextInt();
		int []a = new int [n];
		
		System.out.print("\nMang ramdom la\n");
		ramdom(a, n);
		out(a, n);
		
		System.out.print("\n\nSo lon nhat la : "+ timMax(a, n));
	}

}
