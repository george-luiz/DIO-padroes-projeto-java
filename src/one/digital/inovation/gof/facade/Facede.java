package one.digital.inovation.gof.facade;

import subsistema1.cep.CepApi;
import subsistema1.crm.CrmService;

public class Facede {

    public void migrarCliente(String nome, String cep) {
         String cidade = CepApi.getInstacia().recuperarCidade(cep);
         String estado = CepApi.getInstacia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
