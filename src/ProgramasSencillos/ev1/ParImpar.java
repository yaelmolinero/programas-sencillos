package ProgramasSencillos.ev1;

import java.util.Scanner;

public class ParImpar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("\u001b[34mIngrese un numero: \u001b[0m");
    int n = sc.nextInt();

    sc.close();

    if (n % 2 == 0) {
      System.out.println("El numero es par");
    } else {
      System.out.println("El numero es impar");
    }
  }
}
