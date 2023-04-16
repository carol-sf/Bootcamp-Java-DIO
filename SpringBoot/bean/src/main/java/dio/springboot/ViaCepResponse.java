package dio.springboot;

public class ViaCepResponse {
    private String cep;
    private String logadouro;
    private String localidade;
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getLogadouro() {
        return logadouro;
    }
    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    @Override
    public String toString() {
        return "ViaCepResponse [cep=" + cep + ", logadouro=" + logadouro + ", localidade=" + localidade + "]";
    }
}
