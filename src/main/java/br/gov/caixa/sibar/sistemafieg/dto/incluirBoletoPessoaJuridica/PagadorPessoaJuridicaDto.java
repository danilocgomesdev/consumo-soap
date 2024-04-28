package br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaJuridica;

public class PagadorPessoaJuridicaDto {
    private String cnpj;
    private String razaoSocial;
    private EnderecoPessoaJuridicaDto enderecoDto;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public EnderecoPessoaJuridicaDto getEnderecoDto() {
        return enderecoDto;
    }

    public void setEnderecoDto(EnderecoPessoaJuridicaDto enderecoDto) {
        this.enderecoDto = enderecoDto;
    }
}
