package firnasbasicproj;
import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the width of Trinagle:");
		double base = scanner.nextDouble();
		
		System.out.println("Enter the height of Triangle:");
		double height = scanner.nextDouble();
		
		//Area = (width*height)/2
		double area = (base*height)/2;
		System.out.println("Area of Triangle is:"+area);
	}

}
