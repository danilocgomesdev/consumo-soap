package br.gov.caixa.sibar.sistemafieg.dto.consultaBoleto;

import java.util.Objects;

public class ConsultaBoletoEntradaTypedto {

    public ConsultaBoletoEntradaTypedto() {
    }

    private int codigoBeneficiario;
    private long nossoNumero;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsultaBoletoEntradaTypedto that = (ConsultaBoletoEntradaTypedto) o;
        return codigoBeneficiario == that.codigoBeneficiario &&
                nossoNumero == that.nossoNumero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoBeneficiario, nossoNumero);
    }

    @Override
    public String toString() {
        return "ConsultaBoletoEntradaTypedto{" +
                "codigoBeneficiario=" + codigoBeneficiario +
                ", nossoNumero=" + nossoNumero +
                '}';
    }
}
