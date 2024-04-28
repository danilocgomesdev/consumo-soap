package br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaJuridica;

public class IncluiBoletoPessoaJuridicaDto {
    private TituloPessoaJuridicaDto tituloDtoObject;
    private String codigoBeneficiario;

    public TituloPessoaJuridicaDto getTituloDtoObject() {
        return tituloDtoObject;
    }

    public void setTituloDtoObject(TituloPessoaJuridicaDto tituloDtoObject) {
        this.tituloDtoObject = tituloDtoObject;
    }

    public String getCodigoBeneficiario() {
        return codigoBeneficiario;
    }

    public void setCodigoBeneficiario(String codigoBeneficiario) {
        this.codigoBeneficiario = codigoBeneficiario;
    }
}
