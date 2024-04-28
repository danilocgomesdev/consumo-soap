package br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica;

public class IncluiBoletoDto {
    private TituloDto tituloDtoObject;
    private String codigoBeneficiario;

    public TituloDto getTituloDtoObject() {
        return tituloDtoObject;
    }

    public void setTituloDtoObject(TituloDto tituloDtoObject) {
        this.tituloDtoObject = tituloDtoObject;
    }

    public String getCodigoBeneficiario() {
        return codigoBeneficiario;
    }

    public void setCodigoBeneficiario(String codigoBeneficiario) {
        this.codigoBeneficiario = codigoBeneficiario;
    }
}
