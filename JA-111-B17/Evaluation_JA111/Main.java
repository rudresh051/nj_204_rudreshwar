import java.util.*;
class Main 
{
	String month;


	Main(String month){
		this.month = month;
	}


	public void printMonths(){
		if(month.equals("JAN")){
			System.out.println("This is the 1st Month of the Year January");
		}
		else{
			System.out.println("This is the 2st Month of the Year");
		}
	}

	public static void main(String[] args) 
	{

		System.out.println("Enter Month name");
		Scanner s1 = new Scanner(System.in);

		String userInput = s1.nextLine();
		System.out.println("userInput" + userInput);

		// now pass input to the constructor

		Main m1 = new Main(userInput);

		m1.printMonths();


	}
}
