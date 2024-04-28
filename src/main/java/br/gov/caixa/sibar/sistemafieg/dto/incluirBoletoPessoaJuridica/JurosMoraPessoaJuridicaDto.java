package br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaJuridica;

import java.math.BigDecimal;
import java.util.Date;

public class JurosMoraPessoaJuridicaDto {
    private String tipo;
    private BigDecimal valor;
    private BigDecimal Percentual;
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
        return Percentual;
    }

    public void setPercentual(BigDecimal percentual) {
        Percentual = percentual;
    }
}
