package com.conversordefinitivo.definitivo;

public class CambioDeMoneda {
    private final ExchangeRateApi ExchangeRateApi;

    public CambioDeMoneda() {
        this.ExchangeRateApi = new ExchangeRateApi();
    }

    public String cambiarMoneda(int opcion, double cantidad){
        String monedaOrigen = "";
        String monedaDestino = "";
        String monedaFinal = "";

        switch(opcion){
            case 1:
                monedaFinal = "peso argentino.";
                monedaOrigen = "USD";
                monedaDestino = "ARS";
                break;
            case 2:
                monedaFinal = "de dolar.";
                monedaOrigen = "ARS";
                monedaDestino = "USD";
                break;
            case 3:
                monedaFinal = "real brasileño";
                monedaOrigen = "USD";
                monedaDestino = "BRL";
                break;
            case 4:
                monedaFinal = "de dolar.";
                monedaOrigen = "BRL";
                monedaDestino = "USD";
                break;
            case 5:
                monedaFinal = "peso colombiano.";
                monedaOrigen = "USD";
                monedaDestino = "COP";
                break;
            case 6:
                monedaFinal = "de dolar.";
                monedaOrigen = "COP";
                monedaDestino = "USD";
                break;
            case 7:
                System.out.println("Ha salido de la aplicacion. Gracias por usar el conversor de monedas.");
                break;
            default:
                System.out.println("La opcion seleccionada no es valida.");
                break;
        }

        double tasa = ExchangeRateApi.getExchangeRate(monedaOrigen, monedaDestino);
        double resultado = cantidad * tasa;
        return String.format("El valor de %.2f %s corresponde a %.2f %s", cantidad, monedaOrigen, resultado, monedaFinal);



    }


}
