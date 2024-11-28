package ProgramasSencillos.ev3;  // importamos el paquete del proyecto java
import java.util.Scanner;  // Importamos el scanner para recibir entradas por teclado

public class Proyecto {  // Creamos la clase para la app
  public static void main(String[] args) {  // Es la funcion donde va el codigo
    final int CANTIDAD_PRODUCTOS = 10;  // Definimos la cantidad de productos
    int[][] tabla = new int[CANTIDAD_PRODUCTOS][4]; // Creamos la tabla que contendra toda la informacion
    Scanner scanner = new Scanner(System.in); // Iniciamos el scanner

    String continuar;  // Variable para decidir si continua el programa
    do {
      System.out.println("Ventas del día:");
      // Iniciamos el ciclo para llenar la tabla
      for (int i = 0; i < CANTIDAD_PRODUCTOS; i++) {
        System.out.println("--------------- Producto " + (i + 1) + " ---------------");
        System.out.print("Precio de la venta: $");
        int precio = scanner.nextInt();  // Guardamos el precio que ingrese el usuario

        System.out.print("Cantidad vendida: ");
        int cantidad = scanner.nextInt();  // Guardamos la cantidad que ingrese el usuario
        scanner.nextLine();  // Limpiamos el buffer del scanner

        tabla[i][0] = precio;  // Llenamos el precio en la tabla
        tabla[i][1] = cantidad;    // Llenamos la cantidad en la tabla
        
        int incentivoBruto = precio;
        // Opcion del 5%
        if (incentivoBruto > 700 && incentivoBruto <= 1300) {
          int incentivo = (incentivoBruto * 5) / 100; // Calcula el incentivo
          tabla[i][2] = incentivo;  // Guardamos el incentivo
          tabla[i][3] = 5;  // Guardamos el porcentaje del incentivo
        }
        // Opcion del 10%
        else if (incentivoBruto>1300&&incentivoBruto<=1700){
          int incentivo=(incentivoBruto*10)/100;  // Calcula el incentivo
          tabla[i][2]=incentivo;  // Guardamos el incentivo
          tabla[i][3] = 10;  // Guardamos el porcentaje del incentivo
        }
        // Opcion del 15%
        else if (incentivoBruto>1700&&incentivoBruto<=2000){
          int incentivo=(incentivoBruto*15)/ 100;  // Calcula el incentivo
          tabla[i][2]=incentivo;  // Guardamos el incentivo
          tabla[i][3] = 15;  // Guardamos el porcentaje del incentivo
        }
      }

      // Declaramos como mayor y menor el primer precio en la tabla
      int ventaMayor = tabla[0][0], ventaMenor = tabla[0][0];
      // Declaramos como mayor y menor el primer incentivo en la tabla
      int incentivoMayor = tabla[0][2], incentivoMenor = tabla[0][2];
      // Iniciamos en 0 las variables que contaran el total por incentivo
      int totalIncentivos5 = 0, totalIncentivos10 = 0, totalIncentivos15 = 0;

      System.out.println("----------------------------------------");
      // Imprimimos el encabezado de la tabla
      System.out.printf("%-8s %-8s %-10s %-8s\n", "Precio", "Cantidad", "Incentivos", "Porcentaje");
      
      // Ciclo para imprimir los datos de la tabla
      for (int i = 0; i < CANTIDAD_PRODUCTOS; i++) {
        // Imprimimos los valores de la tabla
        System.out.printf("%-8d %-8d %-10d %-8d\n", tabla[i][0], tabla[i][1], tabla[i][2], tabla[i][3]);

        // Variables del mayor, menor de precio y venta por ciclo
        int precioVenta = tabla[i][0], incentivoActual = tabla[i][2], porcentajeIncentivo = tabla[i][3];
        // El incentivo menor tiene que ser diferente de 0
        if (incentivoMenor == 0 && incentivoActual != 0) incentivoMenor = incentivoActual;

        if (precioVenta > ventaMayor)  // Calcula el precio mayor
          ventaMayor = precioVenta;  // Asigna el nuevo precio mayor

        if (precioVenta < ventaMenor)  // Calcula el precio menor
          ventaMenor = precioVenta;  // Asigna el nuevo precio menor
          
        if (incentivoActual > incentivoMayor)  // Calcula el incentivo mayor
          incentivoMayor = incentivoActual;  // Asigna el nuevo incentivo mayor
        
        if (incentivoActual < incentivoMenor && incentivoActual != 0)  // Calcula el incentivo menor diferente de 0
          incentivoMenor = incentivoActual;  // Asigna el nuevo incentivo menor

        // Suma todos los incentivos que sean del 5%
        if (porcentajeIncentivo == 5) totalIncentivos5++;
        
        // Suma todos los incentivos que sean del 10%
        if (porcentajeIncentivo == 10) totalIncentivos10++;

        // Suma todos los incentivos que sean del 15%
        if(porcentajeIncentivo == 15) totalIncentivos15++;

      }
      System.out.println("----------------------------------------");

      System.out.println("Venta mayor: " + ventaMayor); // Imprime la venta mayor
      System.out.println("Venta menor: " + ventaMenor);  // Imprime la venta menor
      System.out.println("Incentivo mayor: " + incentivoMayor);  // Imprime el incentivo mayor
      System.out.println("Incentivo menor: "+ incentivoMenor);  // Imprime el incentivo menor
      System.out.println("Total de incentivos 5%: " + totalIncentivos5);  // Imprime el total de incentivos del 5%
      System.out.println("Total de incentivos 10%: " + totalIncentivos10);  // Imprime el total de incentivos del 10%
      System.out.println("Total de incentivos 15%: " + totalIncentivos15);  // Imprime el total de incentivos del 15%

      System.out.print("Quieres continuar (y/n): ");  // Pregunta al usuario si quiere continuar 
      continuar = scanner.nextLine();  // Guarda lo que ingrese el usuario
    } while (continuar.equals("y"));  // Comprueba si la opcion es para continuar

    scanner.close();  // Cierra el scanner
  }
}
