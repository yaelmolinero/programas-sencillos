package ProgramasSencillos.ev2;

public class SerieCubica {
  public static void main(String[] args) {
    int sumaCubica = 0;
    boolean flag = true;
    for (int i  = 20; i <= 30; i++) {
      if (i <= 25)
        System.out.println(i);
      else {
        if (flag) {
          System.out.println("Cubo de n\tSuma cubica");
          flag = false;
        }
        int cuboDeN = (int) Math.pow(i, 3);
        System.out.print(i + "³ = " + cuboDeN);
        System.out.println("\t" + sumaCubica + " + " + cuboDeN + " = " + (sumaCubica += cuboDeN));
      }
    }
  }
}
