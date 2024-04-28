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
public class DadosBoletoDto {
     private TITULO TITULO;

    private String CODIGO_BENEFICIARIO;

    public TITULO getTITULO ()
    {
        return TITULO;
    }

    public void setTITULO (TITULO TITULO)
    {
        this.TITULO = TITULO;
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
        return "ClassPojo [TITULO = "+TITULO+", CODIGO_BENEFICIARIO = "+CODIGO_BENEFICIARIO+"]";
    }
}
