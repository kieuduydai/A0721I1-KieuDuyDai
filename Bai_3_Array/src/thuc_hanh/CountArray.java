package thuc_hanh;
import java.util.Scanner;

public class CountArray {
	
	public static void main(String[] args) {
		System.out.println("The Application to count the number of students pass.");

        int size;
        int[] array;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size does not exceed 30");
        } while (size > 30);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\nThe number of students passing the exam is " + count);
    }
	}


