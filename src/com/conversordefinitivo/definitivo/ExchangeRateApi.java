package com.conversordefinitivo.definitivo;

import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static java.lang.String.valueOf;

public class ExchangeRateApi {
    private static final String direccion = "https://v6.exchangerate-api.com/v6/e42d4884f22d2cccf33e584f/latest";
    private final Gson gson;
    private final HttpClient client;

    public ExchangeRateApi() {
        this.client = HttpClient.newHttpClient();
        this.gson = new Gson();
    }

    public double getExchangeRate(String monedaOrigen, String monedaDestino) {
        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/e42d4884f22d2cccf33e584f/latest/"+monedaOrigen))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject rates = json.getAsJsonObject("conversion_rates");

            double cambio = rates.get(monedaDestino).getAsDouble();
            return cambio;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
