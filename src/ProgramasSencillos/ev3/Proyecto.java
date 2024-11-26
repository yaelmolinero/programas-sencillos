package ProgramasSencillos.ev3;
import java.util.Scanner;

public class Proyecto {
  public static void main(String[] args) {
    final int CANTIDAD_PRODUCTOS = 10;
    int[][] tabla = new int[CANTIDAD_PRODUCTOS][4];
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ventas del día:");
    
    for (int i = 0; i < CANTIDAD_PRODUCTOS; i++) {
      System.out.println("--------------- Producto " + (i + 1) + " ---------------");
      System.out.print("Precio de la venta: $");
      int precio = scanner.nextInt();

      System.out.print("Cantidad vendida: ");
      int cantidad = scanner.nextInt();
      scanner.nextLine();

      tabla[i][0] = precio;  // Llenamos el precio en la tabla
      tabla[i][1] = cantidad;    // Llenamos la cantidad en la tabla
      
      int incentivoBruto = precio;
      // Opcion del 5%
      if (incentivoBruto > 700 && incentivoBruto <= 1300) {
        int incentivo = (incentivoBruto * 5) / 100;
        tabla[i][2]=incentivo;
        tabla[i][3] = 5;
      }
      else if (incentivoBruto>1300&&incentivoBruto<=1700){
        int incentivo=(incentivoBruto*10)/100;
        tabla[i][2]=incentivo;
        tabla[i][3] = 10;
      }
      else if (incentivoBruto>1700&&incentivoBruto<=2000){
        int incentivo=(incentivoBruto*15)/ 100;
        tabla[i][2]=incentivo;
        tabla[i][3] = 15;
      }
    }

    scanner.close();

    int ventaMayor = tabla[0][0], ventaMenor = tabla[0][0];
    int incentivoMayor = tabla[0][2], incentivoMenor = tabla[0][2];
    int totalIncentivos5 = 0, totalIncentivos10 = 0, totalIncentivos15 = 0;

    System.out.println("----------------------------------------");
    System.out.printf("%-8s %-8s %-10s %-8s\n", "Precio", "Cantidad", "Incentivos", "Porcentaje");
    
    for (int i = 0; i < CANTIDAD_PRODUCTOS; i++) {
      System.out.printf("%-8d %-8d %-10d %-8d\n", tabla[i][0], tabla[i][1], tabla[i][2], tabla[i][3]);

      int precioVenta = tabla[i][0], incentivoActual = tabla[i][2], porcentajeIncentivo = tabla[i][3];
      if (incentivoMenor == 0 && incentivoActual != 0)
        incentivoMenor = incentivoActual;

      // Calcula el precio mayor
      if (precioVenta > ventaMayor)
        ventaMayor = precioVenta;

      // Calcula el precio menor
      if (precioVenta < ventaMenor)
        ventaMenor = precioVenta;
        
      // Calcula el incentivo mayor
      if (incentivoActual > incentivoMayor)
        incentivoMayor = incentivoActual;
      
      // Calcula el incentivo menor
      if (incentivoActual < incentivoMenor && incentivoActual != 0)
        incentivoMenor = incentivoActual;

      // Suma todos los incentivos que sean del 5%
      if (porcentajeIncentivo == 5)
        totalIncentivos5 += incentivoActual;
       
      // Suma todos los incentivos que sean del 10%
      if (porcentajeIncentivo == 10)
        totalIncentivos10+=incentivoActual;

      // Suma todos los incentivos que sean del 15%
      if(porcentajeIncentivo == 15)
        totalIncentivos15+=incentivoActual;

    }
    System.out.println("----------------------------------------");

    System.out.println("Venta mayor: " + ventaMayor);
    System.out.println("Venta menor: " + ventaMenor);
    System.out.println("Incentivo mayor: " + incentivoMayor);
    System.out.println("Incentivo menor: "+ incentivoMenor);
    System.out.println("Total de incentivos 5%: " + totalIncentivos5);
    System.out.println("Total de incentivos 10%: " + totalIncentivos10);
    System.out.println("Total de incentivos 15%: " + totalIncentivos15);
  }
}
