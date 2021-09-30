package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int randNum;
        do {
            System.out.println("Please enter a number");
            int userNum = input.nextInt();
            if (userNum == 0){
                break;
            }
            randNum = (int) (Math.random() * userNum);
            System.out.println(randNum);
        }
        while (randNum != 0);


    }
}
