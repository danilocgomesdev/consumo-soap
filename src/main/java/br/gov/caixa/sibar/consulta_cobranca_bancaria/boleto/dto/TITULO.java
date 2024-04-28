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
 
         
public class TITULO
{
    private String VALOR_ABATIMENTO;

    private RECIBO_PAGADOR RECIBO_PAGADOR;

    private String DATA_EMISSAO;

    private FICHA_COMPENSACAO FICHA_COMPENSACAO;

    private JUROS_MORA JUROS_MORA;

    private String TIPO_ESPECIE;

    private String CODIGO_MOEDA;

    private String NOSSO_NUMERO;

    private PAGADOR PAGADOR;

    private PAGAMENTO PAGAMENTO;

    private String NUMERO_DOCUMENTO;

    private POS_VENCIMENTO POS_VENCIMENTO;

    private String FLAG_ACEITE;

    private String DATA_VENCIMENTO;

    private String VALOR;

    public String getVALOR_ABATIMENTO ()
    {
        return VALOR_ABATIMENTO;
    }

    public void setVALOR_ABATIMENTO (String VALOR_ABATIMENTO)
    {
        this.VALOR_ABATIMENTO = VALOR_ABATIMENTO;
    }

    public RECIBO_PAGADOR getRECIBO_PAGADOR ()
    {
        return RECIBO_PAGADOR;
    }

    public void setRECIBO_PAGADOR (RECIBO_PAGADOR RECIBO_PAGADOR)
    {
        this.RECIBO_PAGADOR = RECIBO_PAGADOR;
    }

    public String getDATA_EMISSAO ()
    {
        return DATA_EMISSAO;
    }

    public void setDATA_EMISSAO (String DATA_EMISSAO)
    {
        this.DATA_EMISSAO = DATA_EMISSAO;
    }

    public FICHA_COMPENSACAO getFICHA_COMPENSACAO ()
    {
        return FICHA_COMPENSACAO;
    }

    public void setFICHA_COMPENSACAO (FICHA_COMPENSACAO FICHA_COMPENSACAO)
    {
        this.FICHA_COMPENSACAO = FICHA_COMPENSACAO;
    }

    public JUROS_MORA getJUROS_MORA ()
    {
        return JUROS_MORA;
    }

    public void setJUROS_MORA (JUROS_MORA JUROS_MORA)
    {
        this.JUROS_MORA = JUROS_MORA;
    }

    public String getTIPO_ESPECIE ()
    {
        return TIPO_ESPECIE;
    }

    public void setTIPO_ESPECIE (String TIPO_ESPECIE)
    {
        this.TIPO_ESPECIE = TIPO_ESPECIE;
    }

    public String getCODIGO_MOEDA ()
    {
        return CODIGO_MOEDA;
    }

    public void setCODIGO_MOEDA (String CODIGO_MOEDA)
    {
        this.CODIGO_MOEDA = CODIGO_MOEDA;
    }

    public String getNOSSO_NUMERO ()
    {
        return NOSSO_NUMERO;
    }

    public void setNOSSO_NUMERO (String NOSSO_NUMERO)
    {
        this.NOSSO_NUMERO = NOSSO_NUMERO;
    }

    public PAGADOR getPAGADOR ()
    {
        return PAGADOR;
    }

    public void setPAGADOR (PAGADOR PAGADOR)
    {
        this.PAGADOR = PAGADOR;
    }

    public PAGAMENTO getPAGAMENTO ()
    {
        return PAGAMENTO;
    }

    public void setPAGAMENTO (PAGAMENTO PAGAMENTO)
    {
        this.PAGAMENTO = PAGAMENTO;
    }

    public String getNUMERO_DOCUMENTO ()
    {
        return NUMERO_DOCUMENTO;
    }

    public void setNUMERO_DOCUMENTO (String NUMERO_DOCUMENTO)
    {
        this.NUMERO_DOCUMENTO = NUMERO_DOCUMENTO;
    }

    public POS_VENCIMENTO getPOS_VENCIMENTO ()
    {
        return POS_VENCIMENTO;
    }

    public void setPOS_VENCIMENTO (POS_VENCIMENTO POS_VENCIMENTO)
    {
        this.POS_VENCIMENTO = POS_VENCIMENTO;
    }

    public String getFLAG_ACEITE ()
    {
        return FLAG_ACEITE;
    }

    public void setFLAG_ACEITE (String FLAG_ACEITE)
    {
        this.FLAG_ACEITE = FLAG_ACEITE;
    }

    public String getDATA_VENCIMENTO ()
    {
        return DATA_VENCIMENTO;
    }

    public void setDATA_VENCIMENTO (String DATA_VENCIMENTO)
    {
        this.DATA_VENCIMENTO = DATA_VENCIMENTO;
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
        return "ClassPojo [VALOR_ABATIMENTO = "+VALOR_ABATIMENTO+", RECIBO_PAGADOR = "+RECIBO_PAGADOR+", DATA_EMISSAO = "+DATA_EMISSAO+", FICHA_COMPENSACAO = "+FICHA_COMPENSACAO+", JUROS_MORA = "+JUROS_MORA+", TIPO_ESPECIE = "+TIPO_ESPECIE+", CODIGO_MOEDA = "+CODIGO_MOEDA+", NOSSO_NUMERO = "+NOSSO_NUMERO+", PAGADOR = "+PAGADOR+", PAGAMENTO = "+PAGAMENTO+", NUMERO_DOCUMENTO = "+NUMERO_DOCUMENTO+", POS_VENCIMENTO = "+POS_VENCIMENTO+", FLAG_ACEITE = "+FLAG_ACEITE+", DATA_VENCIMENTO = "+DATA_VENCIMENTO+", VALOR = "+VALOR+"]";
    }
}
			
			
