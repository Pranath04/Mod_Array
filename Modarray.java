package modarray;

import java.util.Scanner;

public class Modarray{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int arraysize = scanner.nextInt();
		System.out.print("Enter the array element");
		int array[] = new int[arraysize];
		for(int i=0;i<arraysize;i++) {
			array[i] = scanner.nextInt();
			
		}
		System.out.print("Enter the number:");
		int B = scanner.nextInt();
		scanner.close();
		System.out.println(arraymod(array,arraysize,B));
	}
	public static int arraymod(int []array,int arraysize,int B) {
		int result =0;
		int pow = 1;
		for(int i=arraysize-1;i>=0;i--) {
			result =(result+(array[i]%B)*pow)%B;
			pow = (pow*10)%B;
			
		}
		return result;
	}
}