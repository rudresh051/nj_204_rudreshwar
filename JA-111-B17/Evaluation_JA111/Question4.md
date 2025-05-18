| Aspect                   | **Static Variable**                                         | **Non-Static Variable**                   |
| ------------------------ | ----------------------------------------------------------- | ----------------------------------------- |
| **Belongs to**           | Class                                                       | Object (instance)                         |
| **Memory Allocation**    | Only once, when the class is loaded                         | Every time a new object is created        |
| **Accessed by**          | Class name or object reference                              | Only through object reference             |
| **Shared among objects** | ✅ Yes (same copy for all objects)                           | ❌ No (each object gets its own copy)      |
| **Example use case**     | Count number of objects created, global counters, constants | Object-specific data like name, age, etc. |
| **Declaration syntax**   | `static int count;`                                         | `int age;`                                |
| **Lifecycle**            | Exists as long as the class is loaded                       | Exists as long as the object exists       |

---

### ✅ Example:

```java
class Student {
    static int totalStudents = 0; // static variable
    String name;                  // non-static variable

    Student(String name) {
        this.name = name;
        totalStudents++; // shared counter
    }

    void show() {
        System.out.println(name + " | Total Students: " + totalStudents);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Amit");
        Student s2 = new Student("Riya");

        s1.show(); // Amit | Total Students: 2
        s2.show(); // Riya | Total Students: 2
    }
}
```
