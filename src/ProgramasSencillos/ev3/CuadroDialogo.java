package ProgramasSencillos.ev3;
import javax.swing.JOptionPane;

public class CuadroDialogo {
  public static void main(String[] args) {
    String nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
    System.out.printf("Hola %s!", nombre);
  }
}
