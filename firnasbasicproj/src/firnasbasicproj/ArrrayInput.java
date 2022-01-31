package firnasbasicproj;
import java.util.Scanner;
public class ArrrayInput {
	public static void main(String[] args) {
		Scanner sanner = new Scanner(System.in);
		int[] array = new int[10];
		int sum = 0;
		System.out.println("Enter the elemens:");
		for(int i=0; i<10; i++)
		{
		array[i] = scanner.nextInt();
		}
		for (int num : array) {         
			sum = sum+num;              
		}
		System.out.println("Sum of array elements is:"+sum);
	}

}
