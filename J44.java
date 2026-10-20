

import java.util.Scanner;

public class J44 {

    private int top;
    private int size;
    private int[] arr;

    public J44(int size) {                 
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack is overflow!!");
            return;
        }
        top++;
        arr[top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("The Stack is underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The Stack is underflow, Nothing to display");
            return -1;
        }
        return arr[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack (top to bottom):");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        J44 s = new J44(sc.nextInt());     

        int choice;
        do {
            System.out.println("\n--- STACK MENU ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if empty");
            System.out.println("5. Check if full");
            System.out.println("6. Display");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    s.push(sc.nextInt());
                    break;
                case 2:
                    int popped = s.pop();
                    if (popped != -1) {
                        System.out.println("Popped: " + popped);
                    }
                    break;
                case 3:
                    int topValue = s.peek();
                    if (topValue != -1) {
                        System.out.println("Top element: " + topValue);
                    }
                    break;
                case 4:
                    System.out.println(s.isEmpty() ? "Stack is empty" : "Stack is not empty");
                    break;
                case 5:
                    System.out.println(s.isFull() ? "Stack is full" : "Stack is not full");
                    break;
                case 6:
                    s.display();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 7);

        sc.close();
    }
}