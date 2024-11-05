package ProgramasSencillos.ev2;
import java.util.Scanner;

public class Jugadores {
  String nombre;
  String equipo;
  int goles = 0;
  int faltas = 0;
  int tarjetas = 0;
  int sueldo = 0;

  // Constructor
  Jugadores(String nombre, String equipo) {
    this.nombre = nombre;
    this.equipo = equipo;
  }

  public static void main(String[] args) {
      final int NUMERO_JUGADORES = 5;
      Scanner scanner = new Scanner(System.in);
      Jugadores[] jugadores = new Jugadores[NUMERO_JUGADORES];

      System.out.println("---------- Estadisticas de los jugadores ----------");
      for (int i = 0; i < NUMERO_JUGADORES; i++) {
        System.out.println("Jugador " + (i + 1) + " --------------------");
        System.out.print("├─ Nombre del jugador: ");
        String nombre = scanner.nextLine();

        System.out.print("├─ Equipo: ");
        String equipo = scanner.nextLine();

        System.out.print("├─ Numero de goles: ");
        int goles = scanner.nextInt();

        System.out.print("├─ Faltas cometidas: ");
        int faltas = scanner.nextInt();

        System.out.print("└─ Tarjetas recibidas: ");
        int tarjetas = scanner.nextInt();

        Jugadores nuevoJugador = new Jugadores(nombre, equipo);
        nuevoJugador.goles = goles;
        nuevoJugador.faltas = faltas;
        nuevoJugador.tarjetas = tarjetas;

        if (goles >= 1 && goles <= 2)
          nuevoJugador.sueldo = 5000;
        else if (goles >= 3 && goles <= 6)
          nuevoJugador.sueldo = 7000;
        else if (goles >= 7 && goles <= 10)
          nuevoJugador.sueldo = 10000;
        else if (goles > 10)
          nuevoJugador.sueldo = 15000;

        jugadores[i] = nuevoJugador;
        scanner.nextLine();
      }

      scanner.close();

      // IMPRIMIR LOS JUGADORES
      Jugadores maximoGoleador = jugadores[0];
      Jugadores menosFaltas = jugadores[0];
      
      System.out.println("\n--------------------------------------------------------------------------------");
      System.out.printf("  %-10s\t%-10s\t%-8s\t%-8s\t%-8s\t$%-8s\n", 
      "Jugador", "Equipo", "No Goles", "No Faltas", "No Tarjetas", "Salario");

      for (int i = 0; i < NUMERO_JUGADORES; i++) {
        Jugadores current = jugadores[i];

        System.out.printf("%d %-10s\t%-10s\t%-8d\t%-8d\t%-8d\t$%-8d\n", i, current.nombre,
          current.equipo, current.goles, current.faltas, current.tarjetas, current.sueldo);

        // maximo goleador
        if (current.goles > maximoGoleador.goles)
          maximoGoleador = current;

        // menos faltas
        if (current.faltas < menosFaltas.faltas)
          menosFaltas = current;
      }
      System.out.println("--------------------------------------------------------------------------------\n");

      System.out.println(maximoGoleador.nombre + " fue el maximo goleador" + "(" + maximoGoleador.goles + ")");
      System.out.println(menosFaltas.nombre + " fue el jugador que cometio menos faltas" + "(" + menosFaltas.faltas + ")");
  }
}
