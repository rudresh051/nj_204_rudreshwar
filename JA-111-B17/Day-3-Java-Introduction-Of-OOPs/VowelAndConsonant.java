import java.util.*;

class VowelAndConsonant 
{
	String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
	
	public void acceptCharacters(String value){
		if(value.equalsIgnoreCase("a") || value.equalsIgnoreCase("e") || value.equalsIgnoreCase("i") || value.equalsIgnoreCase("o") || value.equalsIgnoreCase("u")){
			System.out.println("You entered a vowel");
		}
		else if (consonants.contains(value) ){
			System.out.println("You entered a consonant");
		}
		else{
			System.out.println("invalid character");
		}
	
	}


	public static void main(String[] args) 
	{
		VowelAndConsonant vc = new VowelAndConsonant();

		Scanner myInput = new Scanner(System.in);
		System.out.println("Enter an alphabet");
		String s1 = myInput.nextLine();
		System.out.println("You entered the alphabet" + " " + s1);
		vc.acceptCharacters(s1);

		System.out.println("Enter an alphabet");
		String s2 = myInput.nextLine();
		System.out.println("You entered the alphabet" + " " + s2);
		vc.acceptCharacters(s2);

		System.out.println("Enter an alphabet");
		String s3 = myInput.nextLine();
		System.out.println("You entered the alphabet" + " " + s3);
		vc.acceptCharacters(s3);


	}
}
