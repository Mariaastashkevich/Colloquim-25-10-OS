package com.example.task1;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
    }

    public static void main(String[] args) throws NegativeValueException {
        //launch();
        while(true) {
            System.out.println("Make your decision: ");
            System.out.println("Enter 1 to choose Fibonacci Task, ");
            System.out.println("Enter 2 to choose Palindrome Task, ");
            System.out.println("Enter 3 to choose Linked List Task, ");
            Scanner in = new Scanner(System.in);
            int decision = in.nextInt();
            switch (decision) {
                case (1):
                    Fibonacci fibonacci = new Fibonacci();
                    System.out.println("Enter N: ");
                    int n = in.nextInt();
                    fibonacci.calculate(n);
                    System.out.println("Fibonacci sequence for number " + n + " : ");
                    for (long x : fibonacci.getFibSequence()) {
                        System.out.println(x + " ");
                    }
                    break;
                case (2):
                    System.out.println("Enter your number: ");
                    long num = in.nextLong();
                    IsPalindrome palindrome = new IsPalindrome();
                    if (palindrome.isPalindrome(num)) {
                        System.out.println("Your number is Palindrome!");
                    } else {
                        System.out.println("Your number isn't Palindrome!");
                    }
                    break;
                case (3):
                    System.out.println("Enter number of nodes: ");
                    int size = in.nextInt();
                    SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
                    for (int i = 0; i < size; i++) {
                        System.out.println("Enter number to insert: ");
                        int next = in.nextInt();
                        list.insert(next);
                    }
                    System.out.println("Here is iterative deployment of Linked List: ");
                    list.print();
                    break;
                default:
                    System.out.println("Make sure, that your decision equals to : 1, 2 or 3");
            }
            System.out.println("One task more? (Type YES to continue or NO to break)");
            String answer = in.next();
            if(answer.equalsIgnoreCase("No")) break;
        }
//            LinkedList myList = new LinkedList(null);
//            LinkedList.insert(myList, 12);
//            LinkedList.insert(myList, 1);
//            LinkedList.insert(myList, 672);
//            LinkedList.insert(myList, 89);
//            LinkedList.insert(myList, 5);
//            LinkedList.print(myList);
            System.exit(0);
    }
}