package ProgramasSencillos.ev3;
import java.util.Scanner;

public class Proyecto2 {
  public static void main(String[] args) {
    final int ALUMNOS = 8;
    String[] nombreAlumnos = new String[ALUMNOS];
    float[][] calificaciones = new float[ALUMNOS][5];
    Scanner scanner = new Scanner(System.in);

    String continuar;
    do {
      for (int i = 0; i < ALUMNOS; i++) {
        System.out.printf("--------------- Alumno %d ---------------\n", i + 1);

        System.out.print("Nombre del alumno: ");
        nombreAlumnos[i] = scanner.nextLine();
        calificaciones[i][0] = i;

        System.out.print("Calificacion parcial 1: ");
        calificaciones[i][1] = scanner.nextFloat();
      
        System.out.print("Calificacion parcial 2: ");
        calificaciones[i][2] = scanner.nextFloat();

        System.out.print("Calificacion parcial 3: ");
        calificaciones[i][3] = scanner.nextFloat();

        float promedio = (calificaciones[i][1] + calificaciones[i][2] + calificaciones[i][3]) / 3; 
        calificaciones[i][4] = promedio; 

        scanner.nextLine();
      }
      int reprobadosP1 = 0,reprobadosP2 = 0,reprobadosP3 = 0, aprobados = 0;
      int acreditados10 = 0, acreditados6A7 = 0, acreditados7A8 = 0, acreditados8A9 = 0, acreditados9A10 = 0;

      System.out.println("---------------------------------------------");
      System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Alumno", "Parcial 1", "Parcial 2", "Parcial 3", "Final");
      for(int i=0; i< ALUMNOS;i++){ 
        float calP1 = calificaciones[i][1], calP2 = calificaciones[i][2], calP3 = calificaciones[i][3];
        float calFinal = calificaciones[i][4];

        System.out.printf("%-10s %-10.2f %-10.2f %-10.2f %-10.2f %s\n", nombreAlumnos[i], calP1, calP2, calP3, calFinal, calFinal >= 9 && calFinal < 10 ? "Felicidades": "");

        if (calP1 < 6) reprobadosP1++;
        if (calP2 < 6) reprobadosP2++;
        if (calP3 < 6) reprobadosP3++;

        if (calFinal >= 6) aprobados++;
        if (calFinal == 10.0) acreditados10++;
        if (calFinal >= 6 && calFinal < 7) acreditados6A7++;
        if (calFinal >= 7 && calFinal < 8) acreditados7A8++;
        if (calFinal >= 8 && calFinal < 9) acreditados8A9++;
        if (calFinal >= 9 && calFinal < 10) acreditados9A10++;
      }
      System.out.println("---------------------------------------------");


      System.out.println("Alumnos reprobados en el parcial 1: " + reprobadosP1);
      System.out.println("Alumnos reprobados en el parcial 2: " + reprobadosP2);
      System.out.println("Alumnos reprobados en el parcial 3: " + reprobadosP3);

      System.out.println("Total de alumnos aprobados: " + aprobados);
      System.out.println("Aprobados con 10: " + acreditados10);

      System.out.println("Aprobados entre 6 y 6.9: " + acreditados6A7);
      if (acreditados6A7 > 5) System.out.println("Los alumnos deben tomar un curso de regularizacion.");
      System.out.println("Aprobados entre 7 y 7.9: " + acreditados7A8);
      System.out.println("Aprobados entre 8 y 8.9: " + acreditados8A9);
      System.out.println("Aprobados entre 9 y 9.9: " + acreditados9A10);

      System.out.print("Quieres continuar? (s/n): ");
      continuar = scanner.next();
    } while(continuar.equals("s"));

    scanner.close();
  }
}
