package ProgramasSencillos.ev2;

import java.util.Scanner;
import utils.PicoColors;

public class Conversiones {
  public static void main(String[] args) {
    System.out.println(PicoColors.green("1. Peso -> Dolares"));
    System.out.println(PicoColors.yellow("2. Dolares -> Pesos"));
    System.out.println(PicoColors.red("3. Pesos -> Jens"));
    System.out.println(PicoColors.magenta("4. Jens -> Pesos"));
    System.out.println("5. Salir");

    Scanner scanner = new Scanner(System.in);
    System.out.print("Opción: "); 
    int opcion = scanner.nextInt();

    if (opcion == 5) {
      System.out.println("Saliendo...");
      scanner.close();
      System.exit(0);
    }

    float cantidad = 0;
    switch (opcion) {
      case 1:
        System.out.print(PicoColors.yellow("Ingrese la cantidad (MXN): "));
        cantidad = scanner.nextFloat();
        System.out.println("Cantidad recibida: " + (cantidad * 0.05) + " USD");
        break;
      case 2:
        System.out.print(PicoColors.green("Ingrese la cantidad (USD): "));
        cantidad = scanner.nextFloat();
        if (cantidad > 10) {
          float comision = (3 * cantidad) / 100;
          System.out.println("3% de comisión -------- " + comision);
          System.out.println("Dolares recibidos ----- " + (cantidad * 19 - comision));
        } else {
          System.out.println("Cantidad recibida: " + (cantidad * 19) + " MXN");
        }
        break;
      case 3:
        System.out.print(PicoColors.yellow("Ingrese la cantidad (MXN): "));
        cantidad = scanner.nextFloat();
        System.out.println("Cantidad recibida: " + (cantidad * 7.6) + " JPY");
        break;
      case 4:
        System.out.print(PicoColors.red("Ingrese la cantidad (JPY): "));
        cantidad = scanner.nextFloat();
        System.out.println("Cantidad recibida: " + (cantidad * 0.13) + " MXN");
        break;
    
      default:
        System.out.println(PicoColors.red("Opcion invalida!"));
        break;
    }
    
    scanner.close();
  }
}
