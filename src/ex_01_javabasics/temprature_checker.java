package ex_01_javabasics;
import java.util.Scanner;

public class temprature_checker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter temprature");

        int temprature = scanner.nextInt();

        if (temprature < 10) {
            System.out.println("it is cold");
        } else if (temprature <= 30) {
            System.out.println("it is moderate");
        } else {
            System.out.println("it is hot");
        }
    }
}

