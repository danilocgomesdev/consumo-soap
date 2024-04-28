package br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica;

public class PagadorDto {
    private String cpf;
    private String nome;
    private EnderecoDto enderecoDto;

    private String cnpj;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnderecoDto getEnderecoDto() {
        return enderecoDto;
    }

    public void setEnderecoDto(EnderecoDto enderecoDto) {
        this.enderecoDto = enderecoDto;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
