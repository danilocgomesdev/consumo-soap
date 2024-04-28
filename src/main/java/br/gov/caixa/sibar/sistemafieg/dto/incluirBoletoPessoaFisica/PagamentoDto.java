package br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica;

public class PagamentoDto {
    private String quantidadePermitidas;
    private String tipo;
    private String valorMinimo;
    private String valorMaximo;

    public String getQuantidadePermitidas() {
        return quantidadePermitidas;
    }

    public void setQuantidadePermitidas(String quantidadePermitidas) {
        this.quantidadePermitidas = quantidadePermitidas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(String valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public String getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(String valorMaximo) {
        this.valorMaximo = valorMaximo;
    }
}
