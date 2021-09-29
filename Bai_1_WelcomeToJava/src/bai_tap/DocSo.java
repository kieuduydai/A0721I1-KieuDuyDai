package bai_tap;
import java.util.Scanner;

public class DocSo {
	final static String[] ONES = {" "," ONE"," TWO"," THREE"," FOUR"," FIVE"," SIX",
			" SEVEN"," EIGHT"," NINE"," TEN"," ELEVEN"," TWELVE"," THIRTEEN",
			" FOURTEEN"," FIFTEEEN"," SEVENTEEN"," EIGHTTEEN"," NINETEEN"};
	final static String[] TENS = {" "," "," TWENTY"," THIRTY"," FORTY"," FIFTY"," SIXTY",
			" SEVENTY"," EIGHTY"," NINETY",};
	
	public static void readNumber(int num, String value) {
		System.out.print(num > 19 ? TENS[num / 10] + " " + ONES[num % 10] : ONES[num]);
		System.out.print(num >  0 ? value : " ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so:");
		int num = Integer.parseInt(sc.nextLine());
		readNumber((num / 100) % 10 , " HUNDRED AND");
		readNumber(num % 100, "");
}
}