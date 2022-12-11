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

        int primerDia = 0;
        int segundoDia = 0;
        int primeraHora = 0;
        int segundaHora = 0;
        String primerDiaString;
        String segundoDiaString;
        String nombrePrimerDia = "";
        String nombreSegundoDia = "";
        boolean datosCorrectos = true;

        // Recogida de datos ////////////////////////////////////////////

        do {
            System.out.println("\nPor favor, introduzca la primera hora.");

            boolean diaCorrecto;

            // Primer día /////////////////////////////////////////////////
            do {

                diaCorrecto = true;

                System.out.print("Día: ");
                primerDiaString = System.console().readLine();

                switch (primerDiaString) {
                    case "lunes":
                    case "1":
                        primerDia = 1;
                        nombrePrimerDia = "lunes";
                        break;
                    case "martes":
                    case "2":
                        primerDia = 2;
                        nombrePrimerDia = "martes";
                        break;
                    case "miércoles":
                    case "3":
                        primerDia = 3;
                        nombrePrimerDia = "miercoles";
                        break;
                    case "jueves":
                    case "4":
                        primerDia = 4;
                        nombrePrimerDia = "jueves";
                        break;
                    case "viernes":
                    case "5":
                        primerDia = 5;
                        nombrePrimerDia = "viernes";
                        break;
                    case "sábado":
                    case "6":
                        primerDia = 6;
                        nombrePrimerDia = "sábado";
                        break;
                    case "domingo":
                    case "7":
                        primerDia = 7;
                        nombrePrimerDia = "domingo";
                        break;
                    default:
                        diaCorrecto = false;
                }

                if (!diaCorrecto) {
                    System.out.println("No se ha introducido correctamente el día de la semana.");
                    System.out.print("Los días válidos son: lunes, martes, miércoles, ");
                    System.out.println("jueves, viernes, sábado y domingo.");
                }

            } while (!diaCorrecto);

            // Primera hora ///////////////////////////////////////////////

            boolean horaCorrecta;

            do {
                horaCorrecta = true;
                System.out.print("Hora: ");
                primeraHora = Integer.parseInt(System.console().readLine());
                if ((primeraHora < 0) || (primeraHora > 23)) {
                    System.out.println("No se ha introducido correctamente la hora del día.");
                    System.out.println("Las horas válidas están entre 0 y 23.");
                    horaCorrecta = false;
                }
            } while (!horaCorrecta);

            System.out.println("Por favor, introduzca la segunda hora.");

            // Segundo día ////////////////////////////////////////////////
            do {

                datosCorrectos = true;

                diaCorrecto = true;

                System.out.print("Día: ");
                segundoDiaString = System.console().readLine();

                switch (segundoDiaString) {
                    case "lunes":
                    case "1":
                        segundoDia = 1;
                        nombreSegundoDia = "lunes";
                        break;
                    case "martes":
                    case "2":
                        segundoDia = 2;
                        nombreSegundoDia = "martes";
                        break;
                    case "miércoles":
                    case "3":
                        segundoDia = 3;
                        nombreSegundoDia = "miércoles";
                        break;
                    case "jueves":
                    case "4":
                        segundoDia = 4;
                        nombreSegundoDia = "jueves";
                        break;
                    case "viernes":
                    case "5":
                        segundoDia = 5;
                        nombreSegundoDia = "viernes";
                        break;
                    case "sábado":
                    case "6":
                        segundoDia = 6;
                        nombreSegundoDia = "sábado";
                        break;
                    case "domingo":
                    case "7":
                        segundoDia = 7;
                        nombreSegundoDia = "domingo";
                        break;
                    default:
                        segundoDia = 0;
                }

                if (!diaCorrecto) {
                    System.out.println("No se ha introducido correctamente el día de la semana.");
                    System.out.print("Los días válidos son: lunes, martes, miércoles, ");
                    System.out.println("jueves, viernes, sábado y domingo.");
                }

            } while (!diaCorrecto);

            // Comprueba que el segundo día sea posterior al primero //////
            if (segundoDia <= primerDia) {
                System.out.println("El segundo día debe ser posterior al primero.");
                datosCorrectos = false;
            }

            // Segunda hora ///////////////////////////////////////////////
            if (datosCorrectos) {
                do {
                    horaCorrecta = true;
                    System.out.print("Hora: ");
                    segundaHora = Integer.parseInt(System.console().readLine());
                    if ((segundaHora < 0) || (segundaHora > 23)) {
                        System.out.println("No se ha introducido correctamente la hora del día.");
                        System.out.println("Las horas válidas están entre 0 y 23.");
                        horaCorrecta = false;
                    }
                } while (!horaCorrecta);

            }

        } while (!datosCorrectos);
        // Fin de la recogida de datos /////////////

        System.out.print("Entre las " + primeraHora + ":00h del " + nombrePrimerDia);
        System.out.print(" y las " + segundaHora + ":00h del " + nombreSegundoDia);
        System.out.println(" hay " + (((segundoDia * 24) + segundaHora) - ((primerDia * 24) + primeraHora)) + " hora/s.");
    }
}




