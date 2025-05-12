package com.conversordefinitivo.definitivo;

import java.io.IOException;
import java.util.Scanner;

import static com.conversordefinitivo.definitivo.Menu.menu;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while(continuar){
            System.out.println(menu);
            int opcion = scanner.nextInt();

            if(opcion == 7){
                System.out.println("Ha salido de la aplicacion. Gracias por usar el conversor de monedas.");
                break;
            } else if (opcion > 7){
                System.out.println("Selecciona una opcion valida.");
            } else {
                System.out.print("Ingresa el valor que deseas convertir: ");
                double cantidad = scanner.nextDouble();
                CambioDeMoneda convertir = new CambioDeMoneda();
                String resultado = convertir.cambiarMoneda(opcion, cantidad);
                System.out.println(resultado);

            }
        }





    }
}
