package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Would you (1) like to enter an RBG triplet, (2) hexadecimal,(3) enter an HTML code, or (4) exit?");
        Scanner kbReader = new Scanner (System.in);
        int opt = kbReader.nextInt();
        if(opt==1){

            System.out.println("Enter Red");
            int red = kbReader.nextInt();
            System.out.println("Enter Green");
            int green = kbReader.nextInt();
            System.out.println("Enter Blue");
            int blue = kbReader.nextInt();
        }
        else if(opt==2){
            System.out.println("Enter Hexadecimal");
            int hex = kbReader.nextInt();
        }
        else if(opt==3){
            System.out.println("Enter HTML");
            String html = kbReader.next();
        }
        else if(opt==4){

        }

    }
}
