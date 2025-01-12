package ProgramasSencillos.ev3;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Fechas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escribe tu fecha de nacimiento.");
    System.out.print("Día (DD): ");
    int day = scanner.nextInt();

    System.out.print("Mes (MM): ");
    int month = scanner.nextInt();

    System.out.print("Año (AAAA): ");
    int year = scanner.nextInt();

    scanner.close();

    LocalDate birthday = LocalDate.of(year, month, day);
    LocalDate todayDate = LocalDate.now();
    int edad = Period.between(birthday, todayDate).getYears();
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM");

    if (birthday.format(formatter).equals(todayDate.format(formatter))) {
      System.out.println("¡Feliz cumpleaños!");
      System.out.printf("Hoy cumples %d años!", edad);
    } else {
      System.out.printf("Tienes %d años.", edad);
    }
  }
}
