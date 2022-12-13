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
                case 2:
                    Ex2();
                    break;
                case 3:
                    Ex3();
                    break;
                case 4:
                    Ex4();
                    break;
                case 5:
                    Ex5();
                    break;
                case 6:
                    Ex6();
                    break;
               case 7:
                   Ex7();
                    break;
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
        int num1 = 0;
        int num2 = 1;
        int sum1 = 0;

        System.out.println("\n");
        System.out.println("---------- EXERCISE 01 ----------\n");
        System.out.print("insert a number to calculate the Fibonnacci: ");
        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i == 1) {
                System.out.print(num1 + ", ");
            } else if (i == 2) {
                System.out.print(num2 + ", ");
            } else {
                System.out.print((num1 + num2) + ", ");
                sum1 = num2;
                num2 += num1;
                num1 = sum1;

            }
        }
    }

    static void Ex2() {

        int rows;
        String character;

        System.out.println("\n");
        System.out.println("---------- EXERCISE 01 ----------\n");
        System.out.print("insert the number of rows for our pyramid: ");
        rows = sc.nextInt();
        System.out.print("insert the character for form our pyramid: ");
        character = sc.next();

        int bottom = 1;
        int length = 1;
        int spaces = rows - 1;

        while (bottom <= rows) {

            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= length; i++) {
                System.out.print(character);
            }
            System.out.println();

            bottom++;
            spaces--;
            length += 2;
        }
    }

    static void Ex3() {

        int number;
        int total = 0;
        int sumOdd = 0;
        int totalOdd = 0;
        int maxEven = 0;

        System.out.println("\n");
        System.out.println("---------- EXERCISE 03 ----------\n");
        System.out.println("insert a number negative to finish whenever you want: ");

        do {
            number = sc.nextInt();
            if (number >= 0) {
                total++;
                if ((number % 2) == 1) {
                    sumOdd += number;
                    totalOdd++;
                } else {
                    if (number > maxEven)
                        maxEven = number;
                }
            }
        } while (number >= 0);
        System.out.println("You've introduced a total of " + total + " positive numbers");
        System.out.println("The average of odd numbers: " + (sumOdd / totalOdd));
        System.out.println("The max of even numbers: " + maxEven);
    }

    static void Ex4() {

        int number;
        int reverse = 0;

        System.out.println("\n");
        System.out.println("---------- EXERCISE 04 ----------\n");
        System.out.print("insert a number to show it reversed: ");
        number = sc.nextInt();

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("The reversed number is: " + reverse);
    }

    static void Ex5() {

        int number;
        double factorial = 1;

        System.out.println("\n");
        System.out.println("---------- EXERCISE 05 ----------\n");
        System.out.print("insert an integer to calculate factorial: ");
        number = sc.nextInt();

        for (int i = number; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    static void Ex6() {

        System.out.println("\n");
        System.out.println("---------- EXERCISE 06 ----------\n");

        int firstDay = 0;
        int secondDay = 0;
        int firstHour = 0;
        int secondHour = 0;
        String firstDays;
        String secondDays;
        String nameDay1 = "";
        String nameDay2 = "";
        boolean Correct = true;


        do {
            //System.out.print("Insert first hour: ");
            //firstHour= sc.nextInt();
            boolean okDay;

            do {

                okDay = true;

                System.out.print("Insert the first day: ");
                firstDays = sc.next();

                switch (firstDays) {
                    case "monday":
                    case "1":
                        firstDay = 1;
                        nameDay1 = "monday";
                        break;
                    case "tuesday":
                    case "2":
                        firstDay = 2;
                        nameDay1 = "tuesday";
                        break;
                    case "wednesday":
                    case "3":
                        firstDay = 3;
                        nameDay1 = "wednesday";
                        break;
                    case "thursday":
                    case "4":
                        firstDay = 4;
                        nameDay1 = "thursday";
                        break;
                    case "friday":
                    case "5":
                        firstDay = 5;
                        nameDay1 = "friday";
                        break;
                    case "saturday":
                    case "6":
                        firstDay = 6;
                        nameDay1 = "saturday";
                        break;
                    case "sunday":
                    case "7":
                        firstDay = 7;
                        nameDay1 = "sunday";
                        break;
                    default:
                        okDay = false;
                }

                if (!okDay) {
                    System.out.println("[ERROR] Insert a day of the week");
                }

            } while (!okDay);

            boolean correctHour;

            do {
                correctHour = true;
                System.out.print("Insert the first hour: ");
                firstHour = sc.nextInt();
                if ((firstHour < 0) || (firstHour > 23)) {
                    System.out.println("[ERROR] Insert an hour of the day between 0 to 23");
                    correctHour = false;
                }
            } while (!correctHour);

            do {

                Correct = true;

                okDay = true;

                System.out.print("Insert the second day: ");
                secondDays = sc.next();

                switch (secondDays) {
                    case "monday":
                    case "1":
                        secondDay = 1;
                        nameDay2 = "monday";
                        break;
                    case "tuesday":
                    case "2":
                        secondDay = 2;
                        nameDay2 = "tuesday";
                        break;
                    case "wednesday":
                    case "3":
                        secondDay = 3;
                        nameDay2 = "wednesday";
                        break;
                    case "thursday":
                    case "4":
                        secondDay = 4;
                        nameDay2 = "thursday";
                        break;
                    case "friday":
                    case "5":
                        secondDay = 5;
                        nameDay2 = "friday";
                        break;
                    case "saturday":
                    case "6":
                        secondDay = 6;
                        nameDay2 = "saturday";
                        break;
                    case "sunday":
                    case "7":
                        secondDay = 7;
                        nameDay2 = "sunday";
                        break;
                    default:
                        secondDay = 0;
                }

                if (!okDay) {
                    System.out.println("[ERROR] Insert a day of the week");
                }

            } while (!okDay);

            if (secondDay <= firstDay) {
                System.out.println("Second day must be later than first");
                Correct = false;
            }

            if (Correct) {
                do {
                    correctHour = true;
                    System.out.print("Hour: ");
                    secondHour = sc.nextInt();
                    if ((secondHour < 0) || (secondHour > 23)) {
                        System.out.println("[ERROR] Insert an hour of the day between 0 to 23");
                        correctHour = false;
                    }
                } while (!correctHour);

            }

        } while (!Correct);
        System.out.print("Between " + firstHour + ":00h from " + nameDay1 + " and  " + secondHour + ":00h to " + nameDay2 + " are " + (((secondDay * 24) + secondHour) - ((firstDay * 24) + firstHour)) + " hours");
    }

    static void Ex7(){

        int number;

        System.out.println("\n");
        System.out.println("---------- EXERCISE 07 ----------\n");
        System.out.println("Insert the value for print L: ");
        number = sc.nextInt();

        for(int i=0;i<number;i++)
        {
            for(int j=0;j<number;j++)
            {
                if(i>=0&&i<number-1&&j==0||i==number-1&&j>0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}




