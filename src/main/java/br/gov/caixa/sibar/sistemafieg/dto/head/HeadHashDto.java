package br.gov.caixa.sibar.sistemafieg.dto.head;

public class HeadHashDto {

    private int codigoBeneficiario;
    private long nossoNumero;
    private String dtVencimento;
    private String valor;
    private String cpfCnpj;

    public int getCodigoBeneficiario() {
        return codigoBeneficiario;
    }

    public void setCodigoBeneficiario(int codigoBeneficiario) {
        this.codigoBeneficiario = codigoBeneficiario;
    }

    public long getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(long nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    public String getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
}
