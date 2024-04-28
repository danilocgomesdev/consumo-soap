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
public class RECIBO_PAGADOR
{
    private MENSAGENS MENSAGENS;

    public MENSAGENS getMENSAGENS ()
    {
        return MENSAGENS;
    }

    public void setMENSAGENS (MENSAGENS MENSAGENS)
    {
        this.MENSAGENS = MENSAGENS;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [MENSAGENS = "+MENSAGENS+"]";
    }
}

