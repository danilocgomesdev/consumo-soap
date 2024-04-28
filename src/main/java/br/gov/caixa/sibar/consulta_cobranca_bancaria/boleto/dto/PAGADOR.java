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
public class PAGADOR
{
    private String CPF;

    private ENDERECO ENDERECO;

    private String NOME;

    public String getCPF ()
    {
        return CPF;
    }

    public void setCPF (String CPF)
    {
        this.CPF = CPF;
    }

    public ENDERECO getENDERECO ()
    {
        return ENDERECO;
    }

    public void setENDERECO (ENDERECO ENDERECO)
    {
        this.ENDERECO = ENDERECO;
    }

    public String getNOME ()
    {
        return NOME;
    }

    public void setNOME (String NOME)
    {
        this.NOME = NOME;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CPF = "+CPF+", ENDERECO = "+ENDERECO+", NOME = "+NOME+"]";
    }
}