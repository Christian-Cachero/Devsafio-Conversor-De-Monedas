import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ObtenerConversion {

    public Resultado datosMoneda(String base, String objetivo, double monto){

        URI URL = URI.create("https://v6.exchangerate-api.com/v6/apy-key/pair/"
                +base+"/"+objetivo+"/"+monto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URL)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Resultado.class);
        }
        catch (Exception e){
            throw new RuntimeException(e.getMessage());
            //System.out.println(e.getMessage());
        }
    }
}
