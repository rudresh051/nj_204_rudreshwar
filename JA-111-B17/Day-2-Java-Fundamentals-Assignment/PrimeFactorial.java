import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;
class Factorial 
{

	static int number1;
	public static void main(String[] args) 
	{
		Factorial factorial = new Factorial();
		
		System.out.println("Enter the number");
		Scanner myInput = new Scanner(System.in);

		factorial.number1 = myInput.nextInt();
		System.out.println("number entered by user" + factorial.number1);

		ArrayList<Integer> factors = new ArrayList<>();

		for(int i=1;i<=number1;i++){
			if(factorial.number1%i==0){
			// put it in array
			factors.add(i);
			}
			else{
				continue;
			}
		}

		for(int navigator : factors){
			System.out.println(navigator);
		}
	
	}
}
