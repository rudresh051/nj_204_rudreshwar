class Lion 
{
	String name;
	boolean isHungry;
	int age;
	static int totalDeaths=0;

	
	public static void printKillings(){
		System.out.println("Total killings by lions in jungle = "+totalDeaths);
	}

	public void thinking(String name, boolean isHungry, int age){
		if(isHungry == false){
			System.out.println(name + " is sleeping");
		}
		else if(isHungry == true && age>12){
			totalDeaths = totalDeaths + 2;
			System.out.println(name + " has eaten two animals");
		}
		else if(isHungry == true && age <=12 && age>=2){
			totalDeaths = totalDeaths + 1;
			System.out.println(name + " has eaten one animal");
		}
		else if(isHungry == true && age<=2){
			System.out.println(name + " is calling Mom");
		}
	}



	public static void main(String[] args) 
	{
		Lion lion1 = new Lion();
		Lion lion2 = new Lion();
		Lion lion3 = new Lion();

		lion3.thinking("lion3",false,1);
		lion2.thinking("lion2",true,20);
		lion1.thinking("lino1",true, 10);
		printKillings();

	}
}
