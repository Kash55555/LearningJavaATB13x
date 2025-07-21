package ex_01_javabasics;

import java.util.Scanner;
import java.util.Random;


public class number_game {
    public static void main(String[] args) {

        Random random = new Random();
        int numbertoguess = random.nextInt(100)+1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("put the number");

        int guess;
        int attempts=0;

        while(true){
            guess = scanner.nextInt();
            attempts++;

            if(guess < numbertoguess) {
                System.out.println("number too low");
            }else if(guess > numbertoguess)
                    System.out.println("number is too high");
                else{
                    System.out.println("you guessed it right "+ attempts+" attempts");
                    break;
                }
                }
            }
        }

