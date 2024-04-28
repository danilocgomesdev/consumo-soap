package br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica;

import java.math.BigDecimal;
import java.util.Date;

public class JurosMoraDto {
    private String tipo;
    private BigDecimal valor;
    private BigDecimal percentual;
    private Date data;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
}
