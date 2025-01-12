package ProgramasSencillos.ev3;
import java.util.Scanner;

public class Fracciones {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Suma de fracciones");
    System.out.println("---------- Fraccion 1 ----------");
    System.out.print("Numerador: ");
    int num1 = scanner.nextInt();
    System.out.print("Denominador: ");
    int den1 = scanner.nextInt();

    System.out.println("---------- Fraccion 2 ----------");
    System.out.print("Numerador: ");
    int num2 = scanner.nextInt();
    System.out.print("Denominador: ");
    int den2 = scanner.nextInt();

    scanner.close();
    if (den1 == 0 || den2 == 0) return;

    int resNum, resDen;

    if (den1 == den2) {
      resNum = num1 + num2;
      resDen = den1;
    }

    else {
      resNum = (num1 * den2) + (num2 * den1);
      resDen = den1 * den2;
    }
    
    while (true) {
      int div = 0;
      if (resNum % 2 == 0 && resDen % 2 == 0) div = 2;
      else if (resNum % 3 == 0 && resDen % 3 == 0) div = 3;

      if (div != 0) {
        resNum /= div;
        resDen /= div;
      } else {
        break;
      }
    }

    System.out.printf("Resultado: %d/%d", resNum, resDen);
  }
}
