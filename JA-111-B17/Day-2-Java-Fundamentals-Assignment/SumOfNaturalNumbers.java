import java.util.Scanner;
class NaturalNumbers 
{
	int sum;
	public static void main(String[] args) 
	{

		NaturalNumbers nm1 = new NaturalNumbers();
		System.out.println("Enter the natural number");
		Scanner myinput = new Scanner(System.in);

		int n = myinput.nextInt();
		nm1.sum = n*(n+1)/2;
		System.out.println(nm1.sum);
	}
}
