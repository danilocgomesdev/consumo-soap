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
public class ENDERECO
{
    private String BAIRRO;

    private String CEP;

    private String LOGRADOURO;

    private String CIDADE;

    private String UF;

    public String getBAIRRO ()
    {
        return BAIRRO;
    }

    public void setBAIRRO (String BAIRRO)
    {
        this.BAIRRO = BAIRRO;
    }

    public String getCEP ()
    {
        return CEP;
    }

    public void setCEP (String CEP)
    {
        this.CEP = CEP;
    }

    public String getLOGRADOURO ()
    {
        return LOGRADOURO;
    }

    public void setLOGRADOURO (String LOGRADOURO)
    {
        this.LOGRADOURO = LOGRADOURO;
    }

    public String getCIDADE ()
    {
        return CIDADE;
    }

    public void setCIDADE (String CIDADE)
    {
        this.CIDADE = CIDADE;
    }

    public String getUF ()
    {
        return UF;
    }

    public void setUF (String UF)
    {
        this.UF = UF;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [BAIRRO = "+BAIRRO+", CEP = "+CEP+", LOGRADOURO = "+LOGRADOURO+", CIDADE = "+CIDADE+", UF = "+UF+"]";
    }
}
	