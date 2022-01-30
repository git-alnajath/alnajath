package firnasbasicproj;
//doubt 
public class SwapTwoNumbersExercise {
	public static void main(String[] args) {
		float first = 2.50f, seecond = 4.50f;
		
		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		//Value of first is assigned to first
		float temporary = first;
		
		//Value of second is assigned of first
		first = second;
		
		//value os temporary (which conains he initial value of first) is assigned to second
		second = temporary;
		
		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
	}

}
