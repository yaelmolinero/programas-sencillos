package ProgramasSencillos.ev2;
import java.util.Scanner;

public class TablaDeN {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Calcular la tabla del: ");
    int n = scanner.nextInt();
    scanner.close();

    for (int i = 1; i <= 10; i++) {
      System.out.println(n + "*" + i + "=" + (n * i));
    }
  }
}
