package ProgramasSencillos.ev2;

public class ForPares {
  public static void main(String[] args) {
    int suma = 0;
    for (int i = 2; i <= 10; i += 2) {
      System.out.println(i);
      suma += i;
    }
    System.out.println("La suma de los números pares es: " + suma);
  }
}
