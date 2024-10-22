package ProgramasSencillos.ev1;

import java.util.Scanner;

public class Operaciones {
  public static void main(String[] args) {
    System.out.println("\u001b[32m1. Suma (+)\u001b[0m");
    System.out.println("\u001b[31m2. Resta (-)\u001b[0m");
    System.out.println("\u001b[34m3. Multiplicacion (x)\u001b[0m");
    System.out.println("\u001b[35m4. Division (/)\u001b[0m");
    System.out.println("5. Salir");

    System.out.print("\u001b[1mElige una opcion: \u001b[0m");
    Scanner scanner = new Scanner(System.in);
    int opcion = scanner.nextInt();

    if (opcion == 5) {
      System.out.println("Saliendo...");
      System.exit(0);
    } else if (opcion < 0 || opcion > 6) {
      System.out.print("\u001b[31mDebes elegir una opcion valida\u001b[0m");
      System.exit(1);
    }

    System.out.print("Ingresa un número: ");
    float num1 = scanner.nextFloat();

    System.out.print("Ingresa otro número: ");
    float num2 = scanner.nextFloat();

    scanner.close();
    switch (opcion) {
      // Suma
      case 1:
        if (num1 > 7) num1 = (float) Math.pow(num1, 3);
        System.out.println("El resultado de la suma es: " + (num1 + num2));
        break;
      // Resta
      case 2:
        if (num2 == 3) num2 = (float) Math.sqrt(num2);
        System.out.println("El resultado de la resta es: " + (num1 - num2));
        break;
      // Multiplicación
      case 3:
        if (num1 % 2 != 0) {
          System.out.println(num1 + " es impar");
          num1 = (num1 + 1) / 2;
        }
        if (num2 % 2 != 0) {
          System.out.println(num2 + " es impar");
          num2 = (num2 + 1) / 2;
        }
        System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
        break;
      // División
      case 4:
        if (num1 < num2) {
          System.out.println("El divisor es menor que el dividendo.");
          num1 = (float) Math.pow(num1, 3);
        }
        System.out.println("El resultado de la division es: " + (num1 / num2));
        break;
    }
  }
}
