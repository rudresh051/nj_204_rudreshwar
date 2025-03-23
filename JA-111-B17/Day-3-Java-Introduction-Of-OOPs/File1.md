# What is the difference between the static and the non-static variables of a class explain it with an example?
In Java (or most object-oriented programming languages), **static** and **non-static** variables behave differently in terms of memory allocation, accessibility, and how they belong to a class or instance. 

### 🔹 **Static Variables** 
- Belong to the **class** rather than any specific instance (object).
- Shared among all objects of the class (i.e., a single copy is created at the class level).
- Declared using the `static` keyword.
- Memory is allocated only **once** when the class is loaded.
- Can be accessed using the class name (`ClassName.variableName`).

### 🔹 **Non-Static (Instance) Variables**
- Belong to an **instance** of a class.
- Each object of the class gets its own separate copy.
- Memory is allocated **every time** an object is created.
- Accessed using the **object reference** (`objectName.variableName`).

---

### 📌 **Example: Static vs. Non-Static Variables**
```java
class Student {
    // Static variable (common to all students)
    static String schoolName = "Greenwood High";

    // Non-static (Instance) variables (unique for each student)
    String studentName;
    int age;

    // Constructor
    Student(String name, int age) {
        this.studentName = name;
        this.age = age;
    }

    // Display details
    void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("School: " + schoolName);
        System.out.println("---------------------");
    }
}

public class StaticExample {
    public static void main(String[] args) {
        // Creating first student object
        Student s1 = new Student("Alice", 15);
        // Creating second student object
        Student s2 = new Student("Bob", 16);

        // Display details of both students
        s1.display();
        s2.display();

        // Changing the static variable using class name
        Student.schoolName = "Sunrise Academy";

        System.out.println("After changing the static variable:\n");

        // Display details again to see the change
        s1.display();
        s2.display();
    }
}
```

---

### 📌 **Output:**
```
Student Name: Alice
Age: 15
School: Greenwood High
---------------------
Student Name: Bob
Age: 16
School: Greenwood High
---------------------
After changing the static variable:

Student Name: Alice
Age: 15
School: Sunrise Academy
---------------------
Student Name: Bob
Age: 16
School: Sunrise Academy
---------------------
```

---

### 🔹 **Key Observations**
1. **Static Variable (`schoolName`)**
   - Initially set to `"Greenwood High"`, and both students see this value.
   - When changed to `"Sunrise Academy"`, it reflects in both objects (because it's shared among all instances).

2. **Non-Static Variables (`studentName`, `age`)**
   - Each student object has its own copy.
   - Changing values in one object **does not** affect the other.

---

### **Summary Table**
| Feature        | Static Variable (`static`) | Non-Static Variable (Instance) |
|--------------|-------------------|----------------------|
| Memory Allocation | Once (Class Level) | Separate for each object |
| Belongs to | Class | Instance (Object) |
| Accessed Using | `ClassName.variableName` | `objectName.variableName` |
| Shared Among Objects | ✅ Yes | ❌ No |
| Changes Affect All Instances | ✅ Yes | ❌ No |
