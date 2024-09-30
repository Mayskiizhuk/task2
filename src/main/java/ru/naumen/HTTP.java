package ru.naumen;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;

public class HTTP {
    public HTTP () {
        try {
            // Создаем экземпляр HttpClient
            HttpClient client = HttpClient.newHttpClient();

            // Создаем отправляемый GET-запрос
            System.out.println("Отправляем GET запрос с .headers(\"Accept\", \"text\") ");
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(java.net.URI.create("https://httpbin.org/anything"))
                    .GET()
                    .headers("Accept", "text") //
                    .build();

            // Отправляем запрос и получаем ответ
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Выводим значение поля "Accept" из заголовков ответа
//            System.out.println(response.body());
//            System.out.println(response.headers().map().get("Accept"));

            JSONObject jsonResponse = new JSONObject(response.body());
            String acceptHeader = jsonResponse.getJSONObject("headers").getString("Accept");

            // Выводим строку "Accept": "text"
            System.out.println("Выводим значение поля \"Accept\" ");
            System.out.println("\"Accept\": \"" + acceptHeader + "\"");

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }


}

