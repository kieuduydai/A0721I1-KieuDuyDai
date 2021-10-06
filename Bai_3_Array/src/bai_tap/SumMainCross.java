package bai_tap;
import java.util.Scanner;

public class SumMainCross {
	public static Scanner sc = new Scanner(System.in);
	
	public static void ramdomArray2d(int a[][],int n ) {
		
		for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            a[i][j] = (int) (Math.random() * 100);
	        }
	    }
	}
	
	public static void disPlay(int a[][],int n ) {
		
		for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) 
	            System.out.print(a[i][j] + " ");
	        
	        System.out.println("\n");   
	    }
		
	}
	
	public static int sumMainCross(int a[][],int n) {
		int sum = a[0][0];
		
		for(int i = 1 ; i < n ; i++)
			for(int j = 1; j < n ; j++)
				if(i == j) 
					sum += a[i][j];
		
		return sum;	
	}
	
	
	public static void main(String[] args) {
		
	    int n;

	    System.out.print("Nhap n:");
	    n = sc.nextInt();
	    
	         
	    int[][] a = new int[n][n];
	   
	    ramdomArray2d(a,n);
	    System.out.println("Ma tran ngau nhien ");
	    disPlay(a, n);
	    
	    System.out.println("Tong duong cheo chinh la: "+ sumMainCross(a, n));
	    
		
	}
}
