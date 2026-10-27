class Student{
    String name;
    float marks;
    int id;
    static int count = 0;

    Student(String name,float marks){
        this.name = name;
        this.marks = marks;
        id = ++count;
    }

    Student(){
        name = "Unknown";
        marks = 0;
        id = ++count;
    }

    void show(){
        System.out.println("Name of student :"+name);
        System.out.println("Marks of student : "+marks);
        System.out.println("Student id : " + id);
    }

    static void printcount(){
        System.out.println("Student created : " + count);
    }
}

public class J85 {

    public static void main(String[] args) {

        Student.printcount();
        
        Student s1 = new Student();
        s1.show();
        Student.printcount();

        Student s2 = new Student("Riya",85.6f);
        s2.show();
        Student.printcount();

        Student s3 = new Student("Priya",99.85f);
        s3.show();
        Student.printcount();
    }
    
}
// Name of student :Unknown
// Marks of student : 0.0
// Student id : 1
// Student created : 1
// Name of student :Riya
// Marks of student : 85.6
// Student id : 2
// Student created : 2
// Name of student :Priya
// Marks of student : 99.85
// Student id : 3
// Student created : 3