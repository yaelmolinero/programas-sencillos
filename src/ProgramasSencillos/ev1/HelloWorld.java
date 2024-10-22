package ProgramasSencillos.ev1;

import utils.PicoColors;

public class HelloWorld {
  public static void main(String[] args) {
    // System.out.println("\u001b[34m" + "Hola mundo!" + "\u001b[0m");
    System.out.println(PicoColors.blue("Hola Mundo"));
  }
}
