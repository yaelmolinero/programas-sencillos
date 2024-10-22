package ProgramasSencillos.ev1;

import java.util.Scanner;

public class Switch {

  public static void main(String[] args) {
    int opcion;

    System.out.println("1. Hola");
    System.out.println("2. Día 1");
    System.out.println("3. Salir");

    Scanner scanner = new Scanner(System.in);
    System.out.print("\u001b[34mElige una opcion: \u001b[0m");
    opcion = scanner.nextInt();

    scanner.close();

    switch (opcion) {
      case 1:
        System.out.print("Hola");
        break;
      case 2:
        System.out.print("Día 1");
        break;
      case 3:
        System.out.print("Hasta pronto");
        System.exit(0);
        break;
      
      default:
        System.out.print("\u001b[31mDebes elegir una opcion valida\u001b[0m");
        break;
    }
  }
}
