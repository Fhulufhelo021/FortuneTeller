package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pick a lucky number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();

        if(inputNumber > 5){
            System.out.println("You are stronger but doubt your ability");

        }else{
            System.out.println("You have strong interpersonal skills and you going to make it in life");
        }
    }
}