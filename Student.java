/**
 * Student
 */
class Student{
    private String name;
    private double marks ;

    public void setName(String nameOfStudent){
        name = nameOfStudent;
    }

    public void setMarks(double marksOfStudent){
        if (marksOfStudent < 0 || marksOfStudent > 100) {
            System.out.println("Invalid marks.");
        } else {
            marks = marksOfStudent;
        }
    }

    public void show(){
        System.out.println("Name : " + name);
        System.out.println("Marks is : " + marks);
    }

}