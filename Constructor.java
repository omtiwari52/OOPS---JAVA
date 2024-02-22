package OOPS;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();       // Non parameterized Constructor......whithout parameter......
        Student s2 = new Student("Om Tiwari");      // Parameterized Constructor......whith parameter......
        Student s3 = new Student(115);    // Parameterized Constructor......whith parameter......
        System.out.println(s3.roll);

        // Copy constructor 
        // Student s1 = new Student();
        // s1.name = "Tiwari ji";
        // s1.roll = 103;
        // s1.password = "abcd";
        // s1.marks[0] = 100;
        // s1.marks[1] = 90;
        // s1.marks[2] = 50;

        // Student s2 = new Student(s1);
        // s2.password = "xyz";
        // s1.marks[2] = 100;

        // for(int i = 0;i<3;i++){
        //     System.out.println(s2.marks[i]);
        // }
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];


    // Deep copy constructor......

    // Student(Student s1){          // Copy Constructor......copy properties of other object 
    //     marks = new int[3];      
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // Shallow Copy Constructor

    Student(Student s1){
        marks = new int [3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }

 // Non parameterized Constructor......whithout parameter.....

    Student(){           
        marks = new int[3];
        System.out.println("Constructor  is Called...");
    }
// Parameterized Constructor......whith parameter......

    Student(String name){        
        marks = new int[3];
        this.name = name;
    }

////

    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}


