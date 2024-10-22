package ProgramasSencillos.ev2;

import java.util.Scanner;
import utils.PicoColors;

public class SumaMayor30 {
  public static void main(String[] args) {
    int suma = 0, numeroSobrepaso = 0;
    Scanner scanner = new Scanner(System.in);

    for (int i = 1; i <= 5; i++) {
      System.out.print("Número " + i + ": ");
      int n = scanner.nextInt();
      suma += n;
      if (suma > 30 && numeroSobrepaso == 0)
        numeroSobrepaso = n;
    }
    System.out.println(PicoColors.magenta("Suma de todos los números: " + suma));
    if (numeroSobrepaso != 0)
      System.out.println(numeroSobrepaso + " fue el número que sobre paso la suma de 30");

    scanner.close();
  }
}
