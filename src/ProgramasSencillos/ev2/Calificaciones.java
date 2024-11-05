package ProgramasSencillos.ev2;
import java.util.Scanner;
import utils.PicoColors;

public class Calificaciones {
  public static void main(String[] args) {
    final int MATERIAS = 5;
    float promedio = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nombre del alumno: ");
    String alumno = scanner.nextLine();

    String[] materias = new String[MATERIAS];
    float[] calificaciones = new float[MATERIAS];

    float calfMayor = 0;
    for (int i = 0; i < MATERIAS; i++) {
      System.out.print("Materia " + (i+1) + ": ");
      materias[i] = scanner.nextLine();

      System.out.print("Calificacion " + (i+1) + ": ");
      float calf = scanner.nextFloat();

      scanner.nextLine();
      calificaciones[i] = calf;
      promedio += calf;
      if (calf > calfMayor)
        calfMayor = calf;
    }
    scanner.close();

    System.out.println("--------------------");
    System.out.println("Boleta del alumno: " + alumno);
    System.out.println(PicoColors.magenta("Calificaciones") + "\t" + PicoColors.yellow("Materias"));
    for (int i = 0; i < MATERIAS; i++) {
      System.out.println(PicoColors.magenta(Float.toString(calificaciones[i])) + "\t" + PicoColors.yellow(materias[i]));
    }

    promedio = (float) promedio / MATERIAS;
    System.out.println(PicoColors.cyan("El promedio del alumno es: " + promedio));
    System.out.println(PicoColors.blue("La calificacion más alta es de: " + calfMayor));
    System.out.println("--------------------");
    if (promedio > 6) 
      System.out.println(PicoColors.green("El alumno aprobo!"));
    else
      System.out.println(PicoColors.red("El alumno reprobo :("));
  }
}
