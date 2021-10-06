package bai_tap;

import java.util.Scanner;

public class DelArray {
	public static void ramdomArray2d(int a[],int n) {
		int i;
		for(i = 0; i < n; i++)
			a[i] = (int) (Math.random() * 100);
	}
	
	public static void disPlay(int a[],int n) {
		int i;
		for(i = 0; i < n; i++)
			System.out.print(a[i]+" ");
	}
	
	public static void delete(int a[],int n,int k)
	{	
		int i,c,index;
		boolean check = false;
		for (c = i = 0; i < n; i++) {
	        if (a[i] != k) {
	            a[c] = a[i];
	            c++;
	            check = true;
	        }
	      
	    }
		
		n = c;
		if(check) {
			System.out.print("Mang sau khi xoa\n");
			disPlay(a, n);
		}		
		else 
			System.out.print("\nKhong tim thay "+k+" trong mang");
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu:");
		int n = sc.nextInt();
		int []a = new int [n];
		
		System.out.print("Mang ramdom la\n");
		ramdomArray2d(a, n);
		disPlay(a, n);

		System.out.print("\nNhap gia tri muon xoa:");
		int k = sc.nextInt();
		
		delete(a, n, k);
		
}
}
