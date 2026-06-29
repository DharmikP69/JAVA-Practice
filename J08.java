import java.util.Scanner;
public class J08 {
    public static void name(String name){
        System.out.println("Hello " + name + ". How are you ?");
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter yout name : ");
       String name = sc.nextLine();

       name(name);

       sc.close();
    }
}
