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


// ```java
// // Method 2
// import java.util.Scanner;
// class Score 
// {
// 	int one, two, three, four, six, totalRunScored;

// 	public void totalScored(int one,int two,int three,int four,int six){
// 		this.totalRunScored = one + two + three + four + six;
// 		System.out.println(this.totalRunScored);
// 	}

// 	public static void main(String[] args) 
// 	{
// 		Score s = new Score();
// 		Scanner myInput = new Scanner(System.in);

// 		System.out.println("Enter ones");
// 		s.one = myInput.nextInt();

// 		System.out.println("Enter twos");
// 		s.two = myInput.nextInt();

// 		System.out.println("Enter three");
// 		s.three = myInput.nextInt();

// 		System.out.println("Enter four");
// 		s.four = myInput.nextInt();

// 		System.out.println("Enter six");
// 		s.six = myInput.nextInt();

// 		s.totalScored(s.one, s.two, s.three, s.four, s.six);
// 	}
// }
// ```