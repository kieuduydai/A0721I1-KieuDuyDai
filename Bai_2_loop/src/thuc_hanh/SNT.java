package thuc_hanh;
import java.util.Scanner;

public class SNT {
	
	public static int isPrime(int number) {
		int dem = 0;
		for(int i = 1; i <= number; i++)
            if(number % i == 0)
                dem++;
        return dem;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so can kiem tra: ");
		int n = sc.nextInt();
		
		if(isPrime(n) == 2)
			System.out.print(n+" la so nguyen to");
		else 
			System.out.print(n+" khong la so nguyen to");
	}

}
