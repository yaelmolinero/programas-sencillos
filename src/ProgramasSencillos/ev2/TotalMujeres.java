package ProgramasSencillos.ev2;
import java.util.Scanner;

public class TotalMujeres {
  public static void main(String[] args) {
    int opcion = 0, total = 0, totalPersonas = 1;
    Scanner scanner = new Scanner(System.in);

    System.out.println("1. Hombre");
    System.out.println("2. Mujer");
    System.out.println("3. Salir");

    while (opcion != 3) {
      System.out.print("Opcion " + totalPersonas + ": ");

      opcion = scanner.nextInt();
      switch (opcion) {
        case 1: 
          totalPersonas++;
          break;
        case 2:
          total++;
          totalPersonas++;
          break;
        case 3: break;
      
        default:
          System.out.println("Opcion invalida!");
          break;
      }
    }
    scanner.close();
    System.out.println("Total de mujeres: " + total + " de " + --totalPersonas);
  }
}
