package dio.springboot;

import com.google.gson.Gson;

public class ConversorJson {
    private Gson gson;
    public ViaCepResponse converter(String json ){
        ViaCepResponse response = gson.fromJson(json,ViaCepResponse.class);
        return response;
    }
}
