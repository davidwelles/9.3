package com.tts;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String someString = input.next();
        System.out.println("hello " + someString);
        String startOver;
        System.out.println("Would you like to continue to the interactive portion: (Y,N) ");
        String anotherString = input.next().toLowerCase();
        if(anotherString.equals("y")) {
            do {
                System.out.println("what is your favorite pet: ");
                String petString = input.next();

                System.out.println("What is the age of your Pet: ");
                int petAge = input.nextInt();

                System.out.println("what is your lucky number (between 1-65): ");
                int luckyNumber = input.nextInt();

                System.out.println("Do they have a favorite quarterback?  If so what is their jersey number? ");
                int jerseyNum = input.nextInt();

                System.out.println("What is two-digit model year of their car? ");
                int carModel = input.nextInt();

                System.out.println("What is the name of your favorite actor: ");
                String actor = input.next();

                System.out.println("Enter a random number between 1 and 50: ");
                int randomNumber = input.nextInt();

                Random random = new Random();
                int x = random.nextInt(75);

                int ballOne = jerseyNum + x;
                if (ballOne > 75) {
                    ballOne -= 75;
                }else if(ballOne < 1){
                    ballOne += 75;
                }


                int ballTwo = (int) petString.charAt(1);
                if (ballTwo > 65){
                    ballTwo -= 65;
                }else if(ballTwo < 1){
                ballTwo += 65;
            }

                int ballThree = luckyNumber + carModel;
                if ( ballThree > 65){
                    ballThree -= 65;
                }else if(ballThree < 1){
                    ballThree += 65;
                }

                int ballFour = 42;

                int ballFive = carModel + petAge;
                if (ballFive >65){
                    ballFive -= 65;
                }else if(ballFive < 1){
                    ballFive += 65;
                }

                int ballSix = jerseyNum + petAge + randomNumber;
                if (ballSix > 65){
                    ballSix -= 65;
                }else if(ballSix < 1){
                    ballSix += 65;
                }

                System.out.println("\nLottery numbers are:" + ballTwo + ", "  + ballThree + ", " + ballFour + ", " + ballFive + ", " + ballSix + ", " +"Magic Ball:" + ballOne);
                System.out.println("\nIf you like to answer questions to generate another set of numbers,(y/n)? ");
               startOver = input.next();

            } while(startOver.equals("y"));
        }
            System.out.println("Please return later to complete the survey!");

    }
}
