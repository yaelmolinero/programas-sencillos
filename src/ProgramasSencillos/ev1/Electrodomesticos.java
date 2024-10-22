package ProgramasSencillos.ev1;

import java.util.Scanner;
import utils.PicoColors;

public class Electrodomesticos {
  public static void main(String[] args) {
    int opcion, cantidad = 0;
    float precioProducto = 0, totalPagar = 0;
    String producto = "N/A", modelo = "N/A";

    // Mostras las opciones
    System.out.println("Bienvenido a la tienda de electrodomesticos.");
    System.out.println(PicoColors.blue("1. Esrufas $11,915.60"));
    System.out.println(PicoColors.magenta("2. Lavadoras $17,768.00"));
    System.out.println(PicoColors.yellow("3. Licuadoras $4,670.30"));
    System.out.println(PicoColors.red("4. Salir"));

    // Eligir una opcion
    System.out.print("Eliga una opcion: ");
    Scanner scanner = new Scanner((System.in));
    opcion = scanner.nextInt();
    System.out.flush();

    if (opcion == 4) {
      System.out.println("Saliendo...");
      System.exit(0);
    }

    switch (opcion) {
      case 1:
        precioProducto = 11915.6f;
        producto = "Estufa";
        System.out.println("Eliga entre los modelos: ");
        System.out.println(PicoColors.blue("1. Samsung NE59M4320SS/AA"));
        System.out.println(PicoColors.magenta("2. Mabe EM5040BAIN0"));
        System.out.println(PicoColors.yellow("3. Whirlpool WFE505W0JZ"));
        System.out.println(PicoColors.cyan("4. LG LSG4513ST"));
        System.out.print("Opcion: ");
        int opcionModelo1 = scanner.nextInt();

        if (opcionModelo1 == 1) modelo = "Samsung NE59M4320SS/AA";
        else if (opcionModelo1 == 2) modelo = "Mabe EM5040BAIN0";
        else if (opcionModelo1 == 3) modelo = "Whirlpool WFE505W0JZ";
        else if (opcionModelo1 == 4) modelo = "LG LSG4513ST";

        break;
      case 2:
        precioProducto = 17768f;
        producto = "Lavadora";
        System.out.println("Eliga entre los modelos: ");
        System.out.println(PicoColors.blue("1. Samsung WA50R5400AW"));
        System.out.println(PicoColors.magenta("2. LG WM4000HWA"));
        System.out.println(PicoColors.yellow("3. Whirlpool WTW5000DW"));
        System.out.println(PicoColors.cyan("4. Mabe LMA79104CBAB0"));
        System.out.print("Opcion: ");
        int opcionModelo2 = scanner.nextInt();

        if (opcionModelo2 == 1) modelo = "Samsung WA50R5400AW";
        else if (opcionModelo2 == 2) modelo = "LG WM4000HWA";
        else if (opcionModelo2 == 3) modelo = "Whirlpool WTW5000DW";
        else if (opcionModelo2 == 4) modelo = "Mabe LMA79104CBAB0";

        break;
      case 3:
        precioProducto = 4670.3f;
        producto = "Licuadora";
        System.out.println("Eliga entre los modelos: ");
        System.out.println(PicoColors.blue("1. Oster BLSTPB-WBL"));
        System.out.println(PicoColors.magenta("2. Nutribullet Pro 900:"));
        System.out.println(PicoColors.yellow("3. Hamilton Beach Power Elite"));
        System.out.println(PicoColors.cyan("4. Vitamix 5200"));
        System.out.print("Opcion: ");
        int opcionModelo3 = scanner.nextInt();

        if (opcionModelo3 == 1) modelo = "Oster BLSTPB-WBL";
        else if (opcionModelo3 == 2) modelo = "Nutribullet Pro 900:";
        else if (opcionModelo3 == 3) modelo = "Hamilton Beach Power Elite";
        else if (opcionModelo3 == 4) modelo = "Vitamix 5200";

        break;

      default:
        System.out.println("Opcion invalida!");
        System.exit(1);
        break;
    }
    System.out.print("Cantidad: ");
    cantidad = scanner.nextInt();
    scanner.close();

    totalPagar = precioProducto * cantidad;
    System.out.println("------------------------------");
    System.out.println("Nombre del producto: " + producto);
    System.out.println("Modelo: " + modelo);
    if (cantidad > 2) {
      float descuento = (totalPagar * 15) / 100;
      System.out.println("Precio sin descuento: $" + totalPagar);
      System.out.println("Descuento: $" + descuento);
      System.out.println("Total a pagar: $"  + (totalPagar - descuento));

    } else {
      System.out.println("Precio: $" + precioProducto);
      System.out.println("Cantidad: " + cantidad);
      System.out.println("Total a pagar: $" + totalPagar);
    }
    System.out.println("------------------------------");
  }
}
