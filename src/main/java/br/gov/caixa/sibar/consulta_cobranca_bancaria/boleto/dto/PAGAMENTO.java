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
public class PAGAMENTO
{
    private String TIPO;

    private String QUANTIDADE_PERMITIDA;

    private String VALOR_MINIMO;

    private String VALOR_MAXIMO;

    public String getTIPO ()
    {
        return TIPO;
    }

    public void setTIPO (String TIPO)
    {
        this.TIPO = TIPO;
    }

    public String getQUANTIDADE_PERMITIDA ()
    {
        return QUANTIDADE_PERMITIDA;
    }

    public void setQUANTIDADE_PERMITIDA (String QUANTIDADE_PERMITIDA)
    {
        this.QUANTIDADE_PERMITIDA = QUANTIDADE_PERMITIDA;
    }

    public String getVALOR_MINIMO ()
    {
        return VALOR_MINIMO;
    }

    public void setVALOR_MINIMO (String VALOR_MINIMO)
    {
        this.VALOR_MINIMO = VALOR_MINIMO;
    }

    public String getVALOR_MAXIMO ()
    {
        return VALOR_MAXIMO;
    }

    public void setVALOR_MAXIMO (String VALOR_MAXIMO)
    {
        this.VALOR_MAXIMO = VALOR_MAXIMO;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [TIPO = "+TIPO+", QUANTIDADE_PERMITIDA = "+QUANTIDADE_PERMITIDA+", VALOR_MINIMO = "+VALOR_MINIMO+", VALOR_MAXIMO = "+VALOR_MAXIMO+"]";
    }
}