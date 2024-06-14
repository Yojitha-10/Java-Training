package day3assignments;
import java.util.Arrays;
import java.util.Scanner;
public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner scanner = new Scanner(System.in); 
	        System.out.println("Enter the elements of the array (separated by spaces):");
			int n=scanner.nextInt();
			int arr[]=new int[n];  
	        System.out.println("Enter the elements of the array (separated by spaces):");
	        for(int i=0;i<n;i++) {
	        	arr[i]=scanner.nextInt();
	        }
	        Arrays.sort(arr);
	        System.out.println(arr[arr.length-1]);
	}

}
