class Employee {
    protected String name;
    protected double baseSalary;

    Employee(String name, double baseSalary){
        System.out.println("Employee constructors.");

        this.name = name;
        this.baseSalary = baseSalary;

    }

    double getSalary(){
        return baseSalary;
    }
}

class Manager extends Employee{

    private double bonus;

    Manager(String name, double baseSalary, double bonus){
        super(name, baseSalary); //If this delete then compliler says cannot identify name and baseSalary
        this.bonus = bonus;
        System.out.println("Manager constructor.");
    }

    @Override 
    double getSalary(){
        return super.getSalary() + bonus; //getsalary() for manager is basesalary from the super + bonus
    }

    void show(){
        System.out.println("Name of manager : " + name);
    }
}

public class J0120{
    public static void main(String[] args) {
        Manager m1 = new Manager("Asha", 50000, 10000);//First will be employee second will be manager 

        System.out.println("Salary is : " + m1.getSalary());
        m1.show();
    }
}
//Output : 
// Employee constructors.
// Manager constructor.
// Salary is : 60000.0
// Name of manager : Asha