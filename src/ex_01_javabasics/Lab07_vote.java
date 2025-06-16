package ex_01_javabasics;

public class Lab07_vote {
    public static void main(String[] args) {

        int age = 50;

        if(age >= 18){
            if(age < 65)
            System.out.println("can vote");
        }else {
            System.out.println("can not vote");
        }

        if(age >= 65){
            System.out.println("Very old citizens can not vote");
        }
    }
}
