package br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica;

import java.math.BigDecimal;
import java.util.Date;

public class DescontoDto {
    private Date data;

    private BigDecimal valor;

    private BigDecimal percentual;
    private String tipo;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getPercentual() {
        return percentual;
    }

    public void setPercentual(BigDecimal percentual) {
        this.percentual = percentual;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
