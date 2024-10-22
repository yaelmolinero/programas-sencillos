package ProgramasSencillos.ev2;

import java.util.Scanner;
import utils.PicoColors;

public class Jubilacion {
  public static void main(String[] args) {
    int hombresTotales = 0;
    int mujeresTotales = 0;

    Scanner scanner = new Scanner(System.in);

    /*
     * Pedir datos de 7 personas:
     * - nombre
     * - sexo
     * - edad
     * - años de servicio
     */
    for (int i = 0; i < 5; i++) {
      System.out.println("------------------------------");
      System.out.println("Datos de la persona " + (i + 1));

      System.out.print("Nombre: ");
      scanner.nextLine();

      System.out.print("Sexo (m/f): ");
      String sexo = scanner.nextLine();

      System.out.print("Edad: ");
      int edad = scanner.nextInt();

      System.out.print("Años de servicio: ");
      int years = scanner.nextInt();

      if (sexo.toLowerCase().equals("m") && edad >= 18 && years > 25)
        hombresTotales++;
      if (sexo.toLowerCase().equals("f") && edad >= 18 && years > 25)
        mujeresTotales++;
    }

    System.out.println(PicoColors.blue("Hombres que se pueden jubilar: " + hombresTotales));
    System.out.println(PicoColors.magenta("Mujeres que se pueden jubilar: " + mujeresTotales));

    scanner.close();
  }
}
