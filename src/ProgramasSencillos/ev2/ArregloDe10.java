package ProgramasSencillos.ev2;
import java.util.Scanner;

public class ArregloDe10 {
  public static void main(String[] args) {
    final int CAPACIDAD = 10;
    int[] array = new int[CAPACIDAD];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < CAPACIDAD; i++) {
      System.out.printf("Numero %d: ", i + 1);
      int numero = scanner.nextInt();
      array[i] = numero;
      
      scanner.nextLine();
    }
    scanner.close();

    // Imprimir el array y obtener mayor, menor y suma
    int suma = 0, mayor = array[0], menor = array[0];
    System.out.println("Numero\tSuma");
    for (int i = 0; i < CAPACIDAD; i++) {
      System.out.printf("%d\t%d\n", array[i], suma += array[i]);

      if (array[i] > mayor) mayor = array[i];
      if (array[i] < menor) menor = array[i];
    }

    System.out.println("------------------------------");
    System.out.println("Suma de todos los números: " + suma);
    System.out.println("La media de los números es: " + ((float) suma / (float) CAPACIDAD));
    System.out.println("El número más grande es: " + mayor);
    System.out.println("El número más pequeño es: " + menor);
  }
}
