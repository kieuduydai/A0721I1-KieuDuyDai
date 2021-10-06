package thuc_hanh;
import java.util.Scanner;

public class FindArray {
	
	public static void main(String[] args) {
		String[] students = {"Christian", "Michael", "Camila", "Sienna", 
				"Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap hoc sinh muon tim: ");
		String k = sc.nextLine();
		
		int i;
		boolean check = false;
		
		for(i = 0; i < students.length; i++)
			if(students[i].equals(k))
			{
				System.out.print("Tim thay "+k+" o vi tri thu "+i);
				check = true;
				break;
			}
			
		if(!check)
			System.out.print("Khong Tim thay "+k);
		
	}
}
