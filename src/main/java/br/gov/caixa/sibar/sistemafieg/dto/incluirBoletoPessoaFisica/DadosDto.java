package br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica;

public class DadosDto {
    private IncluiBoletoDto incluiBoletoDtoObject;

    private AlterarBoletoDto aterarBoletoDtoObject;

    private String cpf_cnpj_head;

    public String getCpf_cnpj_head() {
        return cpf_cnpj_head;
    }

    public void setCpf_cnpj_head(String cpf_cnpj_head) {
        this.cpf_cnpj_head = cpf_cnpj_head;
    }

    public IncluiBoletoDto getIncluiBoletoDtoObject() {
        return incluiBoletoDtoObject;
    }

    public AlterarBoletoDto getAterarBoletoDtoObject() {
        return aterarBoletoDtoObject;
    }

    public void setAterarBoletoDtoObject(AlterarBoletoDto aterarBoletoDtoObject) {
        this.aterarBoletoDtoObject = aterarBoletoDtoObject;
    }

    public void setIncluiBoletoDtoObject(IncluiBoletoDto incluiBoletoDtoObject) {
        this.incluiBoletoDtoObject = incluiBoletoDtoObject;
    }
}
