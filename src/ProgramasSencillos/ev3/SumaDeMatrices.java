package ProgramasSencillos.ev3;
import java.util.Scanner;

public class SumaDeMatrices {
  public static void main(String[] args) {
    final int filas = 2, columnas = 3;
    int[][] matriz1 = new int[filas][columnas];
    int[][] matriz2 = new int[filas][columnas];
    int[][] matrizResultado = new int[filas][columnas];
    Scanner scanner = new Scanner(System.in);

    System.out.println("---------- Matriz 1 ----------");
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.printf("Numero [%d][%d]: ", i, j);
        matriz1[i][j] = scanner.nextInt();
      }
    }

    System.out.println("---------- Matriz 2 ----------");
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.printf("Numero [%d][%d]: ", i, j);
        matriz2[i][j] = scanner.nextInt();
      }
    }
    scanner.close();

    System.out.println("---------- Original ----------");
    System.out.printf("%-12s%-12s\n", "Matriz 1", "Matriz 2");
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.printf("%-3d ", matriz1[i][j]);
      }

      for (int j = 0; j < columnas; j++) {
        System.out.printf("%-3d ", matriz2[i][j]);
      }
      System.out.println();
    }

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        int numeroMatriz1 = matriz1[i][j], numeroMatriz2 = matriz2[i][j];

        if (numeroMatriz1 > 5 && numeroMatriz1 <= 10)
          matriz1[i][j] = (int) Math.pow(numeroMatriz1, 3);
        if (numeroMatriz2 > 5 && numeroMatriz2 <= 10)
          matriz2[i][j] = (int) Math.pow(numeroMatriz2, 3);

        matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
      }
    }

    System.out.println("---------- Modificada ----------");
    System.out.printf("%-12s%-12s\n", "Matriz 1", "Matriz 2");
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.printf("%-3d ", matriz1[i][j]);
      }

      for (int j = 0; j < columnas; j++) {
        System.out.printf("%-3d ", matriz2[i][j]);
      }
      System.out.println();
    }

    System.out.println("---------- Resultado ----------");
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.printf("%-3d ", matrizResultado[i][j]);
      }
      System.out.println();
    }
  }
}
