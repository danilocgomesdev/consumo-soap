package br.gov.caixa.sibar.sistemafieg.dto.consultaBoleto;

import java.util.Objects;

public class HeadBoletoConsultaDto {
    public HeadBoletoConsultaDto() {
    }

    private String autenticacao;
    private String usuarioServico;
    private String operacao;
    private String dataHora;
    private String versao;
    private String sistemaOrigem;

    public String getAutenticacao() {
        return autenticacao;
    }

    public void setAutenticacao(String autenticacao) {
        this.autenticacao = autenticacao;
    }

    public String getUsuarioServico() {
        return usuarioServico;
    }

    public void setUsuarioServico(String usuarioServico) {
        this.usuarioServico = usuarioServico;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getSistemaOrigem() {
        return sistemaOrigem;
    }

    public void setSistemaOrigem(String sistemaOrigem) {
        this.sistemaOrigem = sistemaOrigem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeadBoletoConsultaDto that = (HeadBoletoConsultaDto) o;
        return Objects.equals(autenticacao, that.autenticacao) &&
                Objects.equals(usuarioServico, that.usuarioServico) &&
                Objects.equals(operacao, that.operacao) &&
                Objects.equals(dataHora, that.dataHora) &&
                Objects.equals(versao, that.versao) &&
                Objects.equals(sistemaOrigem, that.sistemaOrigem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autenticacao, usuarioServico, operacao, dataHora, versao, sistemaOrigem);
    }

    @Override
    public String toString() {
        return "HeadBoletoConsultaDto{" +
                "autenticacao='" + autenticacao + '\'' +
                ", usuarioServico='" + usuarioServico + '\'' +
                ", operacao='" + operacao + '\'' +
                ", dataHora='" + dataHora + '\'' +
                ", versao='" + versao + '\'' +
                ", sistemaOrigem='" + sistemaOrigem + '\'' +
                '}';
    }
}
