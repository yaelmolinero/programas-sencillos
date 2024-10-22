package ProgramasSencillos.ev2;

public class ProductoImpares {
  public static void main(String[] args) {
    int producto = 1;
    for (int i = 21; i < 30; i += 2) {
      if (i < 25)
        System.out.println(i + " * " + producto + " = " + (producto *= i));
      else
        System.out.println(i + "³ = " + Math.pow(i, 3));
    }
  }
}
