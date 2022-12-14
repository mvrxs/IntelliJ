package uf2practicas;

import java.util.Scanner;

public class BuclesIII {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        sc.useDelimiter("\n");
        int option;
        do {
            System.out.println("\n\n");
            System.out.println("--MENU SELECTOR--");
            System.out.println("-----------------");
            System.out.println("[1]- Exercise 01");
            System.out.println("[2]- Exercise 02");
            System.out.println("[3]- Exercise 03");
            System.out.println("[4]- Exercise 04");
            System.out.println("[5]- Exercise 05");
            System.out.println("[6]- Exercise 06");
            System.out.println("[7]- Exercise 07");
            System.out.println("[0]- Exit \n");

            System.out.print("Select an exercise: ");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    Ex1();
                    break;
//                case 2:
//                    Ex2();
//                    break;
//                case 3:
//                    Ex3();
//                    break;
//                case 4:
//                    Ex4();
//                    break;
//                case 5:
//                    Ex5();
//                    break;
//                case 6:
//                    Ex6();
//                    break;
//                case 7:
//                    Ex7();
//                    break;
                case 0:
                    System.out.println("Good Bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 0);

    }

    static void Ex1() {

        int number;
        System.out.println("\n");
        System.out.println("---------- EXERCISE 01 ----------\n");
        number = sc.nextInt();

    }
}
