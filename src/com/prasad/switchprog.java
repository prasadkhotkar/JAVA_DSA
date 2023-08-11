package com.prasad;

import java.util.Scanner;

public class switchprog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit=sc.next();
//        switch (fruit)
//        {
//            case "mango":
//                System.out.println("king of fruit");
//                break;
//            case "orange":
//                System.out.println("rounded fruit");
//                break;
//            default:
//                System.out.println("inavalid fruit");
//        }

//            new syntax
        
        switch (fruit) {
            case "mango" -> System.out.println("king of fruit");
            case "orange" -> System.out.println("rounded fruit");
            default -> System.out.println("inavalid fruit");
        }

    }
}
