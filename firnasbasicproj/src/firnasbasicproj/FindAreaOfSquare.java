package firnasbasicproj;
import java.util.Scanner;
public class FindAreaOfSquare {
	public static void main(String[] args) {
		System.out.println("Ener side of Square");
		//capture the user's input
		Scanner scanner = new Scanner(System.in);
		//Storing the capture value in a varaible
		double side =scanner.nextDouble();
		//Area of square = side*side
		double area = side*side;
		System.out.println("Area of square is:"+area);
	}

}
