package ProgramasSencillos.ev2;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysEjercicio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] nombres = new String[5];
    int[] edades = new int[5];
    double[] pesos = new double[5];

    for (int i = 0; i < 5; i++) {
      System.out.print("Nombre " + (i+1) + ": ");
      nombres[i] = scanner.nextLine();
      System.out.print("Edad " + (i+1) + ": ");
      edades[i] = scanner.nextInt();
      System.out.print("Peso " + (i+1) + " (kg): ");
      pesos[i] = scanner.nextDouble();
      scanner.nextLine();
    }
    scanner.close();

    System.out.println("Nombres.");
    System.out.println(Arrays.toString(nombres));
    System.out.println("Edades.");
    System.out.println(Arrays.toString(edades));
    System.out.println("Pesos.");
    System.out.println(Arrays.toString(pesos));
  }
}
