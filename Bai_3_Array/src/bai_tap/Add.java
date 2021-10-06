package bai_tap;
import java.util.Scanner;
public class Add {
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
	
	public static void add(int a[],int n,int val,int pos) {
		
		if(pos < 0) 
	        pos = 0;
	    
	    else if(pos > n) 
	        pos = n;
		
		
	    
	    for(int i = n; i > pos; i--) 
	        a[i] = a[i-1];
	    
	    a[pos] = val;
	    ++n;
	    disPlay(a,n);
	}
	
	
	public static void main(String[] args) {
		System.out.print("Nhap so phan tu:");
		int n = sc.nextInt();
		int []a = new int [n+1];
		ramdom(a, n);
		disPlay(a,n);
		System.out.print("\nNhap phan tu k muon them:");
		int k = sc.nextInt();
		
		int pos;
		do {
		System.out.printf("Nhap vi tri :");
		pos = sc.nextInt();
		if(pos >= n+1) 
			System.out.print("Chen vi tri khong hop le!Hay nhap lai!\n");
		}while(pos >= n+1);
		
        System.out.print("Mang sau khi them \n");
        add(a, n, k, pos);
        
	}
}
