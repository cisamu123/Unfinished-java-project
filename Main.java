package com.packages;
import java.util.Scanner;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        byte procent = 100;
        byte whiletest1 = 0;
        byte whiletest2 = 100;
        //boolean completed = whiletest1<whiletest2;
        String complete = "You completed!";
        byte userproc = 0;
        Toolkit toolkit;
        Timer timer;
        String Shop = "Shop";
        String Game = "Game";
        String Bonus = "Bonus";
        String Apple = "Apple";
        String Water = "Water";
        byte balance = 0;
        System.out.print("Mini-Game");
        System.out.print("Select Bonus or Shop or Game?");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str == Shop) {
            balance++;
            balance++;
            balance++;
            balance++;
            balance++;
            System.out.print("What do you like to buy? Apple or Water");
            Scanner input = new Scanner(System.in);
            String inpit = scan.nextLine();
            if (inpit == Apple) {
                balance--;
                System.out.print("Nice! You buy a apple!");
            }
            if (inpit == Water) {
                balance--;
                System.out.print("Nice! You buy a water!");
            }
        }
        if (str == Bonus) {
            balance++;
            balance++;
            balance++;
            balance++;
            balance++;
            System.out.print("Your balance is " + balance + " Coins");
        }

        if (str == Game) {


            while (whiletest1 < whiletest2) {
                whiletest1++;
                userproc++;

                System.out.print("Your progress " + userproc + "\n");
                if (userproc == procent) {
                    //completed = true;
                    System.out.print(complete);

                }

            }

        }
    }
}
