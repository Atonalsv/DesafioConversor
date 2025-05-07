import com.conversordemonedas.layout.Menu;

import java.util.Scanner;


public class Main extends Menu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean continuar = true;

        String monedaOrigen;
        String monedaDestino;


        while(continuar){
            System.out.println(menu);
            int entrada = input.nextInt();

            switch(entrada){
                case 1:
                    System.out.println("Se hara conversion de dolar a peso argentino.");
                    monedaOrigen = "USD";
                    monedaDestino = "ARS";
                    break;
                case 2:
                    System.out.println("Se hara conversion de peso Argentino a Dolar");
                    monedaOrigen = "ARS";
                    monedaDestino = "USD";
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("Ha salido de la aplicacion. Gracias por usar el conversor de monedas.");
                    continuar = false;
                    break;
                default:
                    System.out.println("La opcion seleccionada no es valida.");
                    break;
            }
        }








    }




}