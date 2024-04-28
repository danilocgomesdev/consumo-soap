/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.dto;

/**
 *
 * @author martins.santos
 */
public class CONSULTA_BOLETO
{
    private String NOSSO_NUMERO;

    private String CODIGO_BENEFICIARIO;

    public String getNOSSO_NUMERO ()
    {
        return NOSSO_NUMERO;
    }

    public void setNOSSO_NUMERO (String NOSSO_NUMERO)
    {
        this.NOSSO_NUMERO = NOSSO_NUMERO;
    }

    public String getCODIGO_BENEFICIARIO ()
    {
        return CODIGO_BENEFICIARIO;
    }

    public void setCODIGO_BENEFICIARIO (String CODIGO_BENEFICIARIO)
    {
        this.CODIGO_BENEFICIARIO = CODIGO_BENEFICIARIO;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [NOSSO_NUMERO = "+NOSSO_NUMERO+", CODIGO_BENEFICIARIO = "+CODIGO_BENEFICIARIO+"]";
    }
}