package thuc_hanh;

public class MinMethod {
	public static int minValue(int[] a){
		int i,min = a[0];
		for(i = 1; i < a.length; i++)
			if(min > a[i]) 
				min = a[i];
		return min;
	}
	public static void main(String[] args) {
		  int []arr = {4, 12, 7, 8, 1, 6, 9};
		  System.out.println("The smallest element in the array is: " + minValue(arr));
		}
}
