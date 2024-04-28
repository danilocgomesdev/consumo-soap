package br.gov.caixa.sibar.sistemafieg.dto.baixaBoleto;

public class BaixaBoletoEntradaTypeDto {

    private int codigoBeneficiario;

    private long nossoNumero;

    private String cpfCnpj;

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

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
}
