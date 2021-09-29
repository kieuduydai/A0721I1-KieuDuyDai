package bai_tap;
import java.util.Scanner;

public class ShowIsPrime {
	public static int isPrime(int number) {
		int dem = 0;
		for(int i = 1; i <= number; i++)
            if(number % i == 0)
                dem++;
        return dem;
	}
	public static void main(String[] args) {
		System.out.println("20 so nguyen to dau tien la ");
		int count = 0;
		
		for(int i = 1 ; i<= 100; i++) {
			if(isPrime(i) == 2) {
				System.out.print(i+" ");
				count++;
			}
			if(count == 20) break;
		}
		
		System.out.println("\nCac so nguyen to nh hon 100 la ");
		for(int i = 1 ; i<= 100; i++) {
			if(isPrime(i) == 2)
				System.out.print(i+" ");
		}
	}
}

