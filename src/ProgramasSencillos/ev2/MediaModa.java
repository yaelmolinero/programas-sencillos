package ProgramasSencillos.ev2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MediaModa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[10];
    Map<Integer, Integer> frecuencia = new HashMap<>();

    for (int i = 0; i < 10; i++) {
      System.out.printf("Numero %d: ", i + 1);
      int n = scanner.nextInt();
      numeros[i] = n;

      // Sumamos la frecuencia con la que se repite un número usando la estructura map, se puede ver como...
      // Key(numero): Value(veces repetido)
      // "4": 2
      // "11": 1
      // "6": 3
      frecuencia.put(n, frecuencia.getOrDefault(n, 0) + 1);
      scanner.nextLine();
    }
    scanner.close();

    int suma = 0, mayor = numeros[0], menor = numeros[0], moda = numeros[0];
    System.out.println("Números\tSuma");
    // Recorre los elementos del arreglo sin necesidad del indice
    for (int n: numeros) {
      System.out.printf("%d\t%d\n", n, suma += n);

      if (n > mayor)
        mayor = n;
      if (n < menor)
        menor = n;

      if (frecuencia.get(n) > frecuencia.get(moda))
        moda = n;
    }

    Arrays.sort(numeros);  // Ordenamos los numeros de forma acendente
    float promedio = (float) suma / 10;
    float mediana = (float)(numeros[4] + numeros[5]) / 2;
    
    System.out.println("------------------------------");
    System.out.println("Numeros: " + Arrays.toString(numeros));
    System.out.println("Suma: " + suma);
    System.out.println("Mayor: " + mayor);
    System.out.println("Menor: " + menor);
    System.out.println("Promedio: " + promedio);
    System.out.println("Mediana: " + mediana);
    System.out.println("Moda: " + moda);
  }
}
