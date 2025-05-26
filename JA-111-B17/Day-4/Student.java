public class Student 
{

	private int roll;
	private String name;
	private int age;
	private int marks;

	// No argument constructor
	Student(){
	}

	// Parameterized Constructor
	Student(int roll, String name, int age, int marks){
		this.roll = roll;
		this.name = name;
		setAge(age);
		setMarks(marks);
	}


	//public getters
	public int getRoll(){
		return roll;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int getMarks(){
		return marks;
	}

	// public setters
	public void setRoll(int roll){
		this.roll = roll;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		if(age > 18 && age < 60){
			this.age = age;
		}else{
			System.out.println("Invalid age");
		}
		
	}
	public void setMarks(int marks){
		if(marks > 0 && marks < 500){
				this.marks = marks;
		}else{
			System.out.println("Invalid Marks");
		}
	}

	public static void main(String[] args) 
	{
		// object1
		Student stud1 = new Student();
		stud1.setRoll(25);
		stud1.setName("abcd");
		stud1.setAge(22);
		stud1.setMarks(400);

		// object2
		Student stud2 = new Student(2, "efgh", 25, 480);

		System.out.println(stud1.getRoll() + " " + stud1.getName() + " " + stud1.getAge() + " " + stud1.getMarks());
		System.out.println(stud2.getRoll() + " " + stud2.getName() + " " + stud2.getAge() + " " + stud2.getMarks());
	}
}
