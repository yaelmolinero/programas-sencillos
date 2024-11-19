package ProgramasSencillos.ev3;
import java.util.Scanner;
import utils.PicoColors;

public class DivisionMatrizes {
  public static void main(String[] args) {
    int filas = 3, columnas = 3;
    float[][] matriz1 = new float[filas][columnas];
    float[][] matriz2 = new float[filas][columnas];
    Scanner scanner = new Scanner(System.in);

    System.out.println("----- Matriz 1 -----");
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.printf(PicoColors.magenta("Número matriz1[%d][%d]: "), i, j);
        matriz1[i][j] = scanner.nextFloat();
      }
    }

    System.out.println("----- Matriz 2 -----");
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.printf(PicoColors.blue("Número matriz2[%d][%d]: "), i, j);
        matriz2[i][j] = scanner.nextFloat();
      }
    }

    scanner.close();

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        String imprimir = matriz2[i][j] != 0 ? Float.toString(matriz1[i][j] / matriz2[i][j]) : "Infinity";
        System.out.print(imprimir + "\t");
      }
      System.out.println();
    }
  }
}
