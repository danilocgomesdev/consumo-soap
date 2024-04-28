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
public class JUROS_MORA
{
    private String TIPO;

    private String VALOR;

    public String getTIPO ()
    {
        return TIPO;
    }

    public void setTIPO (String TIPO)
    {
        this.TIPO = TIPO;
    }

    public String getVALOR ()
    {
        return VALOR;
    }

    public void setVALOR (String VALOR)
    {
        this.VALOR = VALOR;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [TIPO = "+TIPO+", VALOR = "+VALOR+"]";
    }
}