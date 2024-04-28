package br.gov.caixa.sibar.sistemafieg.dto.consultaBoleto;

import java.util.Objects;

public class DadosBoletoConsultaDto {

    public DadosBoletoConsultaDto() {
    }

    private ConsultaBoletoEntradaTypedto consultaBoletoEntradaTypedto;

    public ConsultaBoletoEntradaTypedto getConsultaBoletoEntradaTypedto() {
        return consultaBoletoEntradaTypedto;
    }

    public void setConsultaBoletoEntradaTypedto(ConsultaBoletoEntradaTypedto consultaBoletoEntradaTypedto) {
        this.consultaBoletoEntradaTypedto = consultaBoletoEntradaTypedto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DadosBoletoConsultaDto that = (DadosBoletoConsultaDto) o;
        return Objects.equals(consultaBoletoEntradaTypedto, that.consultaBoletoEntradaTypedto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consultaBoletoEntradaTypedto);
    }

    @Override
    public String toString() {
        return "DadosBoletoConsultaDto{" +
                "consultaBoletoEntradaTypedto=" + consultaBoletoEntradaTypedto +
                '}';
    }
}
