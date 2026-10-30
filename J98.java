class Student{
    private String name;
    private double marks ;

    public void setName(String nameOfStudent){
        name = nameOfStudent;
    }

    public void setMarks(double marksOfStudent){
        if (marksOfStudent < 0 || marksOfStudent > 100) {
            System.out.println("Invalid marks.");
            return;
        } else {
            marks = marksOfStudent;
        }
    }

    public void show(){
        System.out.println("Name : " + name);
        System.out.println("Marks is : " + marks);
        return;
    }

}
public class J98 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();


        s1.setName("Riya");
        s1.setMarks(85);
        s1.show();

        s2.setName("Priya");
        s1.setMarks(-10);
        s1.show();

        s3.setName("kriya");
        s1.setMarks(150);
        s1.show();

        
    }
}
