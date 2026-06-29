import java.util.Scanner;

public class J35 {

    // Node Class
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Linked List Class
    static class LinkedList {

        private Node head;

        // Insert at Beginning
        void insertAtBeginning(int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;

            System.out.println("Node inserted at beginning.");
        }

        // Insert at End
        void insertAtEnd(int val) {

            Node newNode = new Node(val);

            if (head == null) {
                head = newNode;
                System.out.println("Node inserted at end.");
                return;
            }

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;

            System.out.println("Node inserted at end.");
        }

        // Insert at Position
        void insertAtPosition(int val, int pos) {

            if (pos <= 1) {
                Node newNode = new Node(val);
                newNode.next = head;
                head = newNode;
                System.out.println("Node inserted at position " + pos);
                // We can call thius function also insertAtBeginning(val);
                return;
            }

            Node newNode = new Node(val);
            Node temp = head;

            for (int i = 1; temp != null && i < pos - 1; i++) {
                temp = temp.next;
            }

            if (temp == null) {
                System.out.println("Invalid Position.");
                return;
            }

            newNode.next = temp.next;
            temp.next = newNode;

            System.out.println("Node inserted at position " + pos);
        }

        // Delete at Beginning
        void deleteAtBeginning() {

            if (head == null) {
                System.out.println("List is Empty.");
                return;
            }

            head = head.next;

            System.out.println("First node deleted.");
        }

        // Delete at End
        void deleteAtEnd() {

            if (head == null) {
                System.out.println("List is Empty.");
                return;
            }

            if (head.next == null) {
                head = null;
                System.out.println("Last node deleted.");
                return;
            }

            Node temp = head;

            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;

            System.out.println("Last node deleted.");
        }

        // Delete at Position
        void deleteAtPosition(int pos) {

            if (head == null) {
                System.out.println("List is Empty.");
                return;
            }

            if (pos == 1) {
                head = head.next; 
                System.out.println("Node deleted from position " + pos);
                //We can call this function also deleteAtBeginning();
                return;
            }

            Node temp = head;

            for (int i = 1; temp != null && i < pos - 1; i++) {
                temp = temp.next;
            }

            if (temp == null || temp.next == null) {
                System.out.println("Invalid Position.");
                return;
            }

            temp.next = temp.next.next;

            System.out.println("Node deleted from position " + pos);
        }

        // Display
        void display() {

            if (head == null) {
                System.out.println("Linked List is Empty.");
                return;
            }

            Node temp = head;

            System.out.print("Linked List: ");

            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }

            System.out.println("NULL");
        }
    }

    // Accepts any integer
    public static int getValidInteger(Scanner sc, String message) {

        while (true) {

            System.out.print(message);

            if (sc.hasNextInt()) {
                return sc.nextInt();
            }

            System.out.println("Invalid input! Please enter an integer.");
            sc.next(); // Remove invalid input
        }
    }

    // Accepts only 1-8
    public static int getValidChoice(Scanner sc) {

        while (true) {

            int choice = getValidInteger(sc, "Enter Choice (1-8): ");

            if (choice >= 1 && choice <= 8) {
                return choice;
            }

            System.out.println("Choice must be between 1 and 8.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int choice, value, pos;

        do {

            System.out.println("\n========= LINKED LIST MENU =========");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete at Beginning");
            System.out.println("5. Delete at End");
            System.out.println("6. Delete at Position");
            System.out.println("7. Display");
            System.out.println("8. Exit");

            choice = getValidChoice(sc);

            switch (choice) {

                case 1:
                    value = getValidInteger(sc, "Enter Value: ");
                    list.insertAtBeginning(value);
                    break;

                case 2:
                    value = getValidInteger(sc, "Enter Value: ");
                    list.insertAtEnd(value);
                    break;

                case 3:
                    value = getValidInteger(sc, "Enter Value: ");
                    pos = getValidInteger(sc, "Enter Position: ");
                    list.insertAtPosition(value, pos);
                    break;

                case 4:
                    list.deleteAtBeginning();
                    break;

                case 5:
                    list.deleteAtEnd();
                    break;

                case 6:
                    pos = getValidInteger(sc, "Enter Position: ");
                    list.deleteAtPosition(pos);
                    break;

                case 7:
                    list.display();
                    break;

                case 8:
                    System.out.println("Program Ended.");
                    break;
            }

        } while (choice != 8);

        sc.close();
    }
}