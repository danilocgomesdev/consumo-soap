package br.gov.caixa.sibar.sistemafieg.dto.consultaBoleto;

import java.util.Objects;

public class EntradaConsultaBoletoDto {
    public EntradaConsultaBoletoDto() {
    }

    //    private HeadBoletoConsultaDto headBoletoConsultaDto;
    private DadosBoletoConsultaDto dadosBoletoConsultaDto;

//    public HeadBoletoConsultaDto getHeadBoletoConsultaDto() {
//        return headBoletoConsultaDto;
//    }
//
//    public void setHeadBoletoConsultaDto(HeadBoletoConsultaDto headBoletoConsultaDto) {
//        this.headBoletoConsultaDto = headBoletoConsultaDto;
//    }

    public DadosBoletoConsultaDto getDadosBoletoConsultaDto() {
        return dadosBoletoConsultaDto;
    }

    public void setDadosBoletoConsultaDto(DadosBoletoConsultaDto dadosBoletoConsultaDto) {
        this.dadosBoletoConsultaDto = dadosBoletoConsultaDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntradaConsultaBoletoDto that = (EntradaConsultaBoletoDto) o;
        return Objects.equals(dadosBoletoConsultaDto, that.dadosBoletoConsultaDto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dadosBoletoConsultaDto);
    }

    @Override
    public String toString() {
        return "EntradaConsultaBoletoDto{" +
                "dadosBoletoConsultaDto=" + dadosBoletoConsultaDto +
                '}';
    }
}
