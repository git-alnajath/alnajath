package firnasbasicproj;

import java.util.Scanner;

public class AreaaOfCircle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the radius: ");
		/*we are storing the entered radius in double
		 * because a user can enter radius in decimals
		 */
		double radius = scanner.nextDouble();
		//Area = PI*radius*radius
		double area = Math.PI * (radius*radius);
		System.out.println("The circumference of the circle is:"+circumference);
		 		/*running without(+circumferene) 
		 		 *  we putting (+radius) insead of circuference is running 
		 		 */
	}
}
