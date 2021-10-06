package bai_tap;

import java.util.Scanner;

public class AddColums {
	public static Scanner sc = new Scanner(System.in);
	
	public static void ramdomArray2d(int a[][],int row, int col ) {
		
		for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) {
	            a[i][j] = (int) (Math.random() * 100);
	        }
	    }
	}
	
	public static void disPlay(int a[][],int row, int col ) {
		
		for (int i = 0; i < row; i++) {
	        for (int j = 0; j < col; j++) 
	            System.out.print(a[i][j] + " ");
	        
	        System.out.println("\n");   
	    }
		
	}
	
	public static int sumCol(int a[][],int col,int k) {
		int sum = 0;
		
		for(int i = 0 ; i < col ; i++)
			sum += a[i][k];
		
		return sum;	
	}
	
	
	public static void main(String[] args) {
		
	    int row, col;

	    System.out.print("Nhap so dong:");
	    row = sc.nextInt();
	    System.out.print("Nhap so cot:");
	    col = sc.nextInt();
	         
	    int[][] a = new int[100][col+1];
	   
	    ramdomArray2d(a, row, col);
	    System.out.println("Ma tran ngau nhien ");
	    disPlay(a, row, col);
	    
	    
	    int k;
	    do {
	    	System.out.print("Nhap cot muon tinh tong: ");
		    k = sc.nextInt();
		    if (k >= col) 
		    	System.out.print("Khong hop le!\n");
	    }while (k >= col);
	    
	    
	    System.out.println("Tong phan tu cua cot "+k+" la: " + sumCol(a, col, k));
	    
		
	}
}
