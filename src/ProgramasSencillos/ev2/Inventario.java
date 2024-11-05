package ProgramasSencillos.ev2;
import java.util.Scanner;
import java.util.Arrays;
import utils.PicoColors;

public class Inventario {
  public static void main(String[] args) {
    final int CANTIDAD_INVENTARIO = 3;
    Scanner scanner = new Scanner(System.in);

    String[] clavesProductos = {"A100", "A110", "A120"};
    String[] productos = {"Escoba", "Limpiador", "Recogedor"};
    int[] cantidadInicial = {100, 80, 25};
    int[] inventarioActual = {75, 42, 11};

    System.out.println("---------- Gestion de Inventario ----------");
    while (true) {
      System.out.println("Claves de productos: " + Arrays.toString(clavesProductos));
      System.out.print(PicoColors.blue("Consultar producto (salir: 0): "));
      String opcion = scanner.next();

      if (opcion.equals("0"))
        break;

      int posicion = -1;
      for (int i = 0; i < CANTIDAD_INVENTARIO; i++) {
        if (opcion.equals(clavesProductos[i]))
          posicion = i;
      }

      if (posicion == -1)
        System.out.println(PicoColors.red("Opcion invalida!"));
      else {
        String clave = clavesProductos[posicion];
        String producto = productos[posicion];
        int inicial = cantidadInicial[posicion];
        int actual = inventarioActual[posicion];
        
        System.out.println("┌---------------------------------------┐");

        System.out.printf("|  %-8s %-8s %-8s %-8s  |\n", "Clave", "Producto", "Inicial", "Actual");
        System.out.printf("|  %-8s %-8s %-8d %-8d  |\n", clave, producto, inicial, actual);
        System.out.println("└---------------------------------------┘");

      }
    }

    scanner.close();
  }
}
