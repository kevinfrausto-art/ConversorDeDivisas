package com.CalculadoraDeDivisas.Conversor;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConvertidorDeDivisas {
    private static final String API_KEY ="1a1cf84cf3a060d6e5e47db2";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa divisa de origen(Ejemplo USD):");
        String dIvisaOrigen = scanner.next().toUpperCase();

        System.out.println("Ingresa la divisa  a convertir (ejemplo: EUR)");
        String divisaDestino = scanner.next().toUpperCase();

        System.out.println("ingresa la cantidad a convertir: ");
        double monto = scanner.nextDouble();

        String urlString = BASE_URL + dIvisaOrigen + "/" + divisaDestino;


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlString))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();
        if (jsonResponse.get("result").getAsString().equals("success")){
            double tasaDeConversion = jsonResponse.get("conversion_rate").getAsDouble();
            double montoConvertido = monto * tasaDeConversion;

            System.out.println("tasa de conversion: " + tasaDeConversion);
            System.out.println("cantidad convertida: " + montoConvertido + " " + divisaDestino);

        }else{
            System.out.println("Error en la conversión. Verifica los códigos de moneda.");
        }




    }


}
