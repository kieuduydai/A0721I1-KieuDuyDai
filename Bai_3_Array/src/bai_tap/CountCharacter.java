package bai_tap;
import java.util.Scanner;

public class CountCharacter {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
        System.out.print("Nhap chuoi: ");
        String string = sc.nextLine();
        
        System.out.print("Nhap ki tu muon kiem tra: ");
        char k = sc.nextLine().charAt(0);
        
        int count=0;
        
        for (int i = 0;i < string.length(); i++)
            if(k == string.charAt(i))
                count++;
            
        
        System.out.println("So lan xuat hien cua '"+k+"' la "+count+" lan");
	}
}

