import java.util.Scanner;
class Score 
{
	int one;
	int two;
	int three;
	int four;
	int six;
	int runScored;

	public static void main(String[] args) 
	{
		// create object of Score class
		Score run = new Score();
		Scanner myInput = new Scanner(System.in);

		System.out.println("Enter the ones taken by batsman");
		run.one = Integer.parseInt(myInput.nextLine());
		System.out.println("ones: " + run.one);

		System.out.println("Enter the twos taken by batsman");
		run.two = Integer.parseInt(myInput.nextLine());
		System.out.println("twos: " + run.two);

		System.out.println("Enter the threes taken by batsman");
		run.three = Integer.parseInt(myInput.nextLine());
		System.out.println("threes: " + run.three);

		System.out.println("Enter the fours hit by batsman");
		run.four = Integer.parseInt(myInput.nextLine());
		System.out.println("fours: " + run.four);

		System.out.println("Enter the sixes hit by batsman");
		run.six = Integer.parseInt(myInput.nextLine());
		System.out.println("six: " + run.six);

		run.runScored = run.one + run.two*2 + run.three*3 + run.four*4 + run.six*6;
		System.out.println(run.runScored);

		
		
	}
}
