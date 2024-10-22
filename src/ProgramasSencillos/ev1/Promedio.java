package ProgramasSencillos.ev1;

import java.util.Scanner;

public class Promedio {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Calificacion 1: ");
    float A = sc.nextFloat();
    System.out.print("Calificacion 2: ");
    float B = sc.nextFloat();
    System.out.print("Calificacion 3: ");
    float C = sc.nextFloat();

    sc.close();

    float promedio = (A + B + C) / 3;

    if (promedio > 6) {
      System.out.println("El estudiante aprobo con: " + promedio);
    } else {
      System.out.println("El estudiante reprobo con: " + promedio);
    }
  }
}
