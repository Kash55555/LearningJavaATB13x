package ex_01_javabasics;

import java.util.Scanner;

public class Grade_checker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("marks");

        int marks = scanner.nextInt();

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade c");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        }else if(marks >= 0) {
            System.out.println("Grade f");
        }else{
            System.out.println("invalid input");

        }
    }
}
