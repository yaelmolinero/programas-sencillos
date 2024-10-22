package ProgramasSencillos.ev2;
import java.util.Scanner;
import utils.PicoColors;

public class Password {
  public static void main(String[] args) {
    final String myPassword = "hola";
    int hombresTotales = 0;
    int mujeresTotales = 0;

    int intentosRestantes = 3;
    Boolean isAuthenticated = false;
    Scanner scanner = new Scanner(System.in);

    while (intentosRestantes > 0) {
      System.out.println("Ingrese su contraseña: ");
      String input = scanner.nextLine();

      if (input.equals(myPassword)) {
        isAuthenticated = true;
        System.out.println(PicoColors.green("Ha ingresado correctamente!"));
        break;
      } else {
        intentosRestantes--;
        System.out.println(PicoColors.red("Password incorrecta!"));
      }
    }

    if (isAuthenticated) {
      /* Pedir datos de 5 personas:
      - nombre
      - sexo
      - edad */
      for (int i = 0; i < 5; i++) {
        System.out.println("------------------------------");
        System.out.println("Datos de la persona " + (i + 1));
        System.out.print("Nombre: ");
        scanner.nextLine();
        System.out.print("Sexo (m/f): ");
        String sexo = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        if (sexo.toLowerCase().equals("m") && edad >= 18) hombresTotales++; 
        if (sexo.toLowerCase().equals("f") && edad >= 18) mujeresTotales++;
      }

      System.out.println(PicoColors.blue("Hombres mayores de edad: " + hombresTotales));
      System.out.println(PicoColors.magenta("Mujeres mayores de edad: " + mujeresTotales));
    } else {
      System.out.println(PicoColors.red("Has exedido el número de intentos."));
    }

    scanner.close();
  }
}
