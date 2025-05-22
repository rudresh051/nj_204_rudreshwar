public class Student 
{

	private int roll;
	private String name;
	private int age;
	private int marks;

	// No argument constructor
	Student(){}

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
		this.age = age;
	}
	public void setMarks(int marks){
		this.marks = marks;
	}

	public static void main(String[] args) 
	{
		// object1
		Student stud1 = new Student();

		// object2
		Student stud2 = new Student();
	}
}
