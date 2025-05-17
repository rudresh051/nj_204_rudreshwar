// Create a class Student with 3 instance variables:
// roll: int
// name: String
// marks: int
// Create a non-static method inside the Student class:
// displayStudentDetails: void

// inside the above method print all the details of the student in the following format:

// Roll is :

// Name is :

// Marks is :

// From the main method of the Student class create 2 Student class objects and sets the 
// proper details to both objects and call the above displayStudentDetails method on the both student objects.



class Student 
{
	int roll;
	String name;
	int marks;

	public Student(int roll, String name, int marks){
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	} 

	public void displayStudentDetails(){
		System.out.println("Roll is" + " " + roll);
		System.out.println("Name is :" + " " + name);
		System.out.println("Marks is" + " " + marks);

	}

	public static void main(String[] args) 
	{
		Student s1 = new Student(1,"Rudresh",99);
		Student s2 = new Student(2,"Rudra",98);

		s1.displayStudentDetails();
		s2.displayStudentDetails();

        s1 = null;
		s2 = null;
	}
}
