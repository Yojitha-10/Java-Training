package day1assignments;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int factorial=1;
		for(int i=1;i<=a;i++) {
			factorial *=i;
		}
		System.out.println(factorial);
	}

}
