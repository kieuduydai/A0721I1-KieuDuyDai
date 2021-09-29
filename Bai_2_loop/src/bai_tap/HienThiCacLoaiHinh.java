package bai_tap;
import java.util.Scanner;

public class HienThiCacLoaiHinh {
	public static void menu(int choice) {
		Scanner sc = new Scanner(System.in);
		choice = -1;
		while(choice != 4) {
			System.out.println("\n1. In hinh chu nhat");
			System.out.println("2. In hinh tam giac vuong");
			System.out.println("3. In hinh tam giac can");
			System.out.println("4. Thoat");
			System.out.println("Lua chon: ");
			choice = sc.nextInt();
			switch (choice) {
		     case 1:
		         System.out.println("In hinh chu nhat");
		         
		         System.out.print("Nhap chieu dai: ");
		         int cd = sc.nextInt();
		         System.out.print("Nhap chieu rong: ");
		         int cr = sc.nextInt();
		         
		         for(int i = 1; i <= cr; i++)
		         {
		        	 for(int j = 1 ; j <= cd; j++)
		        		 System.out.print("*");
		        	 System.out.print("\n");
		        	 
		         }
		         break;
		         
		     case 2:
		         System.out.println("In hinh tam giac vuong");
		         for(int i = 0; i < 5; i++)
		         {
		             for(int j = 0; j < 5 ; j++)
		             {
		                 if (j == 0 || i == j || i == 4)
		                	 System.out.print("*");
		                 else
		                	 System.out.print(" ");
		             }
		             System.out.print("\n");
		         }
		         break;
		     
		     case 3:
		         System.out.println("In hinh tam giac can");
		         int n = 5,q = 0;
		         while(n > 0)
		         {
		             for (int i = 1; i < n; i++)
		            	 System.out.print(" ");
		             for (int j = 0; j <= q; j++)
		            	 System.out.print("*");
		             n -- ;
		             q += 2 ;
		             System.out.print("\n");
		         }
		         break;
		         
		     case 4:
		    	 System.out.println("GOODBYE!");
		         System.exit(0);
		     
		     default:
		         System.out.println("Lua chon sai!");
		 }
	     }
		
	}
	public static void main(String[] args) {
		System.out.println("Menu");
		menu(-1);
	}
}
