package edu.luis_guzman.reto1.ui.CLI;
import java.util.Scanner;

public class CLI {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menú de opciones:");
        System.out.println("A. Cálculo de masa corporal (índice de masa corporal)");
        System.out.println("B. Cálculo de masa corporal magra");
        System.out.println("C. Cálculo de metabolismo basal (gasto energético basal)");
        System.out.print("Elija una opción (A/B/C): ");
        String opcion = scanner.nextLine();

        switch (opcion.toUpperCase()) {
            case "A":
                double pesoA, estaturaA;
                System.out.print("Ingrese el peso en kg: ");
                pesoA = scanner.nextDouble();
                System.out.print("Ingrese la estatura en cm: ");
                estaturaA = scanner.nextDouble();
                double imc = CalcularMasaCorporal.calcularIMC(pesoA, estaturaA);
                System.out.println("IMC calculado: " + imc);
                System.out.println("Interpretación del IMC: " + CalcularMasaCorporal.interpretarIMC(imc));
                break;
            case "B":
                double pesoB, estaturaB;
                String sexoB;
                System.out.print("Ingrese el peso en kg: ");
                pesoB = scanner.nextDouble();
                System.out.print("Ingrese la estatura en cm: ");
                estaturaB = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer del scanner
                System.out.print("Ingrese el sexo del paciente (Mujer/Hombre): ");
                sexoB = scanner.nextLine();
                double masaMagra = CalcularMasaCorporal.calcularMasaCorporalMagra(pesoB, estaturaB, sexoB);
                System.out.println("Masa corporal magra calculada: " + masaMagra + " kg");
                break;
            case "C":
                double pesoC, estaturaC;
                int edadC;
                String sexoC;
                System.out.print("Ingrese el peso en kg: ");
                pesoC = scanner.nextDouble();
                System.out.print("Ingrese la estatura en cm: ");
                estaturaC = scanner.nextDouble();
                System.out.print("Ingrese la edad del paciente: ");
                edadC = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del scanner
                System.out.print("Ingrese el sexo del paciente (Mujer/Hombre): ");
                sexoC = scanner.nextLine();
                double geb = CalcularMasaCorporal.calcularMetabolismoBasal(pesoC, estaturaC, edadC, sexoC);
                System.out.println("Metabolismo basal calculado: " + geb + " cal/día");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        scanner.close();
    }
}
