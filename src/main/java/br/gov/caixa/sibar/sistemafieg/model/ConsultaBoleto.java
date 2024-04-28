package br.gov.caixa.sibar.sistemafieg.model;

import br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SERVICO_ENTRADA_NEGOCIAL_TYPE;

public class ConsultaBoleto {
    private SERVICO_ENTRADA_NEGOCIAL_TYPE entradaConsultaBoleto;
    private String cpfCnpj;

    public SERVICO_ENTRADA_NEGOCIAL_TYPE getEntradaConsultaBoleto() {
        return entradaConsultaBoleto;
    }

    public void setEntradaConsultaBoleto(SERVICO_ENTRADA_NEGOCIAL_TYPE entradaConsultaBoleto) {
        this.entradaConsultaBoleto = entradaConsultaBoleto;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
}
