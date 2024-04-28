package br.gov.caixa.sibar.sistemafieg.dto.consultaBoleto;

public class ConsultaBoletoDto {

    private EntradaConsultaBoletoDto entradaConsultaBoletoDto;
    private String cpfCnpj;

    public EntradaConsultaBoletoDto getEntradaConsultaBoletoDto() {
        return entradaConsultaBoletoDto;
    }

    public void setEntradaConsultaBoletoDto(EntradaConsultaBoletoDto entradaConsultaBoletoDto) {
        this.entradaConsultaBoletoDto = entradaConsultaBoletoDto;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
}
