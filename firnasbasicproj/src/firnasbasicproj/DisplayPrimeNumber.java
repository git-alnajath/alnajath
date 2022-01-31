package firnasbasicproj;

public class DisplayPrimeNumber {
	public static void main(String[] args) {
		int i = 0;
		int num = 0;
		//Empty string
		String primeNumbers = "";
		
		for ( i = 1 ; i <= 100; i++)
		{
			int counter=0;
			for(num =1; num>=1; num--)
			{
				if(1%num==0)
				{
					counter = counter + 1;
				}
			}
			if (counter ==2)
			{
				//Appended the prime number to the String
				primeNumbers = primeNumbers + 1 + " "; 	
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}

}
