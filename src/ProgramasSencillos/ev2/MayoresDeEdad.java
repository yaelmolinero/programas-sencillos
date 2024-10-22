package ProgramasSencillos.ev2;
import java.util.Scanner;

public class MayoresDeEdad {
  public static void main(String[] args) {
    byte total = 0;
    Scanner scanner = new Scanner(System.in);

    for (byte i = 0; i < 10; i++) {
      System.out.print("Ingresa tu edad: ");
      int edad = scanner.nextInt();
      if (edad >= 18)
        total++;
    }
    
    scanner.close();
    System.out.println("Personas mayores de edad: " + total);
  }
}
