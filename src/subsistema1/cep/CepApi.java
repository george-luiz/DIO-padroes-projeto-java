package subsistema1.cep;

public class CepApi {

    private static CepApi instacia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstacia() {
        return instacia;
    }

    public String recuperarCidade(String cep) {
        return "Araraquara";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }

}
