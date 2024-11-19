package ProgramasSencillos.ev3;
import java.util.Scanner;

public class Matriz {

  public static void main(String[] args) {
    int filas = 2, columnas = 2;
    int[][] matriz = new int[filas][columnas];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.printf("Número matriz[%d][%d]: ", i, j);
        matriz[i][j] = scanner.nextInt();
      }
    }
    scanner.close();

    System.out.println("----- Matriz -----");
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.print(matriz[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
