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
public class POS_VENCIMENTO
{
    private String ACAO;

    private String NUMERO_DIAS;

    public String getACAO ()
    {
        return ACAO;
    }

    public void setACAO (String ACAO)
    {
        this.ACAO = ACAO;
    }

    public String getNUMERO_DIAS ()
    {
        return NUMERO_DIAS;
    }

    public void setNUMERO_DIAS (String NUMERO_DIAS)
    {
        this.NUMERO_DIAS = NUMERO_DIAS;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ACAO = "+ACAO+", NUMERO_DIAS = "+NUMERO_DIAS+"]";
    }
}