package firnasbasicproj;
//Dont run this program - just type and understanding hoe casing works

public class CastingExercise {
	public static void main(String[] args) {
		byte b=10;
		
		int i=b;// Will accept - automatic promotion
		
		byte c=i;//will not accept - because lower cannot be put in higher
		
		byte d=(byte)i;//Type casting it possible to store compatible types
		
		byte x=10;
		byte y=20;
		
		byte sum=x*y;//Error is thrown because when two bytes are used in a arithmetic operation ,the result will be integer
		
	}

}
