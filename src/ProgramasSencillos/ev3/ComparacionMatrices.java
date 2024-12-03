package ProgramasSencillos.ev3;
import java.util.Scanner;
import java.util.Arrays;

public class ComparacionMatrices {
  public static void main(String[] args) {
    final int size = 2;
    int[][] matriz1 = new int[size][size];
    int[][] matriz2 = new int[size][size];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.printf("Matriz 1 [%d][%d]: ", i, j);
        matriz1[i][j] = scanner.nextInt();
      }
    }

    for(int i =0;i< size; i++){
      for(int j=0;j < size ;j++){
        System.out.printf("Matriz2 [%d] [%d]:",i,j);
        matriz2[i][j]=scanner.nextInt(); 
      }
    }
    scanner.close();

    int[][] numerosMayores = new int[size][size];
    int[][] numerosMenores = new int[size][size];

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        int num1 = matriz1[i][j], num2 = matriz2[i][j];

        if (num1 == num2)
          System.out.printf("%d es igual a %d\n", num1, num2);

        if (num1 >= num2) {
          numerosMayores[i][j] = num1;
          numerosMenores[i][j] = num2;
        }
        else {
          numerosMayores[i][j] = num2;
          numerosMenores[i][j] = num1;
        }
      }
    }

    System.out.println("Numeros mayores: " + Arrays.deepToString(numerosMayores));
    System.out.println("Numeros menores: " + Arrays.deepToString(numerosMenores));
  }
}
