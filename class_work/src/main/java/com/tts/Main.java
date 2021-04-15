package com.tts;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void printShirtSize(char shirt) {
        String msg = "";
        switch(shirt) {
            case 's':
                msg= "Shirt is small";
                break;
            case 'm':
                msg= "Shirt is medium";
                break;
            case 'l':
                msg= "Shirt is large";
                break;
            case 'x':
                msg= "Shirt is Xtra large";
                break;
            default:
                msg= "Unknown shirt size";
                break;
        }
        System.out.println(msg);
    }
    public static void checkId (boolean validId,int age, boolean buyingAlc) {
        // the first if statements checks for a valid id
        if (validId) {
            System.out.println("Valid ID presented");
            //  check  to see if customer is at least 21
            //  and they are buying alcohol
            if ((age>=21) && buyingAlc) {
                System.out.println("Customer legal to purchase alcohol!");
            } else {
                System.out.println("No  alcohol for you!");
            }
        } else {
            System.out.println("Error: invalid ID!");
        }
    }
    public static void main(String[] args) {
        boolean myBool = true;
        if(myBool){
            System.out.println("Hello from a conditional!");
        }
        int count = 30;
        if(count > 20) {
            String msg = "count is large!";
//            System.out.println(msg);
            if(count > 40) {
                msg = msg + "\ncount is VERY large!";
            }
            System.out.println(msg);
        }
        checkId(true,  24,  true);
        int myInt = 30;
        if (myInt > 20) System.out.println("This is from a  one-liner if statement");
        int bigInt = 54;
        if(bigInt > 80) {
            System.out.println("That number is really big");
        } else if (bigInt > 60) {
            System.out.println("That number is fairly big");
        } else if (bigInt > 30) {
            System.out.println("That number is alright...");
        } else {
            System.out.println("That number is kinda small...");
        }
        printShirtSize('m');
        for(int i = 0; i < 5; i++) {
            System.out.println("Loop number: "+ i + "\nI am in a for loop!");
        }
        for (int i = 20; i > 1; i--) {
            System.out.println("Counting down!" + i);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number!");
        int inputNumber = scanner.nextInt();

        List<Integer> myList =  new ArrayList<>();
        myList.add(1);
        myList.add(432);
        myList.add(321);
        myList.add(inputNumber);
        for(Integer element : myList) {
            System.out.println("This is my element: " +  element);

            Scanner user = new Scanner(System.in);
            char character = 'c';

            do {
                System.out.println("Enter another char command or q to quit: ");

                character = user.next().charAt(0);
            } while(character != 'q' || character != 'Q');

            System.out.println("Quit command entered!");
        }
    }
}