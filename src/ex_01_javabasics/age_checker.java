package ex_01_javabasics;

import java.util.Scanner;

public class age_checker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the age");

        int age = scanner.nextInt();


        if (age < 18) {
            System.out.println("you are a minor");
        } else if (age < 65) {
            System.out.println("you are adult");
        } else {
            System.out.println("you are a senior citizen");
        }

    }
}