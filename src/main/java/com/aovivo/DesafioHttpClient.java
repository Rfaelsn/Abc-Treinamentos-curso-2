package com.aovivo;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DesafioHttpClient {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://www.google.com"))
                .GET()
                .build();

        HttpResponse<String> httpResponse = client.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.body());
        Thread.sleep(3000);
    }


}
