package ProgramasSencillos.ev2;
import java.util.Scanner;
import utils.PicoColors;

public class Ticket {
  public static void main(String[] args) {
    final int CANTIDAD = 5;

    int[] cantidadProductos = new int[4];
    float[] precios = {20, 25, 14, 22};
    String[] productos = {"Doritos", "Gansito", "Coca-Cola", "Sabritas"};

    Scanner scanner = new Scanner(System.in);
    int contador = 0;
    System.out.println("1. " + productos[0] + "\t$" + precios[0]);
    System.out.println("2. " + productos[1] + "\t$" + precios[1]);
    System.out.println("3. " + productos[2] + "\t$" + precios[2]);
    System.out.println("4. " + productos[3] + "\t$" + precios[3]);
    do {
      System.out.print(PicoColors.blue("Opcion " + (contador+1) + ": "));
      int opcion = scanner.nextInt();

      if (opcion == 1) {
        cantidadProductos[0] += 1;
      } else if (opcion == 2) {
        cantidadProductos[1] += 1;
      } else if (opcion == 3) {
        cantidadProductos[2] += 1;
      } else if (opcion == 4) {
        cantidadProductos[3] += 1;
      } else {
        System.out.println(PicoColors.red("Opcion invalida!"));
        continue;
      }

      contador++;
    } while(contador < CANTIDAD);

    // TICKET
    System.out.println("--------------------");
    System.out.println("Tienda de Don Chuy");
    System.out.println("Producto\tPrecio\tCantidad");
    float total = 0;
    for (int i = 0; i < cantidadProductos.length; i++) {
      if (cantidadProductos[i] > 0) {
        System.out.println(productos[i] + "\t\t$" + precios[i] + "\t" + cantidadProductos[i]);
        total = total + (precios[i] * cantidadProductos[i]);
      }
    }

    System.out.println(PicoColors.green("El total a pagar es: $" + total));
    
    while (true) {
      System.out.print("Pagar con: $");
      float pago = scanner.nextFloat();

      if (pago >= total) {
        System.out.println(PicoColors.magenta("Su cambio es: $" + (float) (pago - total)));
        scanner.close();
        break;
      } else {
        System.out.println(PicoColors.red("No puede pagar menos del total a pagar!"));
      }
    }
  }
}
