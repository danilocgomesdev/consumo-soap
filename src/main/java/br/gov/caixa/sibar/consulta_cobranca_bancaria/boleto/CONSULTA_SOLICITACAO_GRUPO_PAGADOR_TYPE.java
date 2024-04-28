/**
 * CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE  implements java.io.Serializable {
    private java.util.Date DATA_VENCIMENTO;

    private java.math.BigDecimal VALOR_TITULO;

    private short PRAZO_PROTESTO_DEVOLUCAO;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.DESCRICOES_TYPE DESCRICOES;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.COMPLEMENTARES_TYPE COMPLEMENTARES;

    private java.lang.String SITUACAO;

    public CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE() {
    }

    public CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE(
           java.util.Date DATA_VENCIMENTO,
           java.math.BigDecimal VALOR_TITULO,
           short PRAZO_PROTESTO_DEVOLUCAO,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.DESCRICOES_TYPE DESCRICOES,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.COMPLEMENTARES_TYPE COMPLEMENTARES,
           java.lang.String SITUACAO) {
           this.DATA_VENCIMENTO = DATA_VENCIMENTO;
           this.VALOR_TITULO = VALOR_TITULO;
           this.PRAZO_PROTESTO_DEVOLUCAO = PRAZO_PROTESTO_DEVOLUCAO;
           this.DESCRICOES = DESCRICOES;
           this.COMPLEMENTARES = COMPLEMENTARES;
           this.SITUACAO = SITUACAO;
    }


    /**
     * Gets the DATA_VENCIMENTO value for this CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @return DATA_VENCIMENTO
     */
    public java.util.Date getDATA_VENCIMENTO() {
        return DATA_VENCIMENTO;
    }


    /**
     * Sets the DATA_VENCIMENTO value for this CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @param DATA_VENCIMENTO
     */
    public void setDATA_VENCIMENTO(java.util.Date DATA_VENCIMENTO) {
        this.DATA_VENCIMENTO = DATA_VENCIMENTO;
    }


    /**
     * Gets the VALOR_TITULO value for this CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @return VALOR_TITULO
     */
    public java.math.BigDecimal getVALOR_TITULO() {
        return VALOR_TITULO;
    }


    /**
     * Sets the VALOR_TITULO value for this CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @param VALOR_TITULO
     */
    public void setVALOR_TITULO(java.math.BigDecimal VALOR_TITULO) {
        this.VALOR_TITULO = VALOR_TITULO;
    }


    /**
     * Gets the PRAZO_PROTESTO_DEVOLUCAO value for this CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @return PRAZO_PROTESTO_DEVOLUCAO
     */
    public short getPRAZO_PROTESTO_DEVOLUCAO() {
        return PRAZO_PROTESTO_DEVOLUCAO;
    }


    /**
     * Sets the PRAZO_PROTESTO_DEVOLUCAO value for this CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @param PRAZO_PROTESTO_DEVOLUCAO
     */
    public void setPRAZO_PROTESTO_DEVOLUCAO(short PRAZO_PROTESTO_DEVOLUCAO) {
        this.PRAZO_PROTESTO_DEVOLUCAO = PRAZO_PROTESTO_DEVOLUCAO;
    }


    /**
     * Gets the DESCRICOES value for this CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @return DESCRICOES
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.DESCRICOES_TYPE getDESCRICOES() {
        return DESCRICOES;
    }


    /**
     * Sets the DESCRICOES value for this CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @param DESCRICOES
     */
    public void setDESCRICOES(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.DESCRICOES_TYPE DESCRICOES) {
        this.DESCRICOES = DESCRICOES;
    }


    /**
     * Gets the COMPLEMENTARES value for this CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @return COMPLEMENTARES
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.COMPLEMENTARES_TYPE getCOMPLEMENTARES() {
        return COMPLEMENTARES;
    }


    /**
     * Sets the COMPLEMENTARES value for this CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @param COMPLEMENTARES
     */
    public void setCOMPLEMENTARES(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.COMPLEMENTARES_TYPE COMPLEMENTARES) {
        this.COMPLEMENTARES = COMPLEMENTARES;
    }


    /**
     * Gets the SITUACAO value for this CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @return SITUACAO
     */
    public java.lang.String getSITUACAO() {
        return SITUACAO;
    }


    /**
     * Sets the SITUACAO value for this CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @param SITUACAO
     */
    public void setSITUACAO(java.lang.String SITUACAO) {
        this.SITUACAO = SITUACAO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE)) return false;
        CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE other = (CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DATA_VENCIMENTO==null && other.getDATA_VENCIMENTO()==null) || 
             (this.DATA_VENCIMENTO!=null &&
              this.DATA_VENCIMENTO.equals(other.getDATA_VENCIMENTO()))) &&
            ((this.VALOR_TITULO==null && other.getVALOR_TITULO()==null) || 
             (this.VALOR_TITULO!=null &&
              this.VALOR_TITULO.equals(other.getVALOR_TITULO()))) &&
            this.PRAZO_PROTESTO_DEVOLUCAO == other.getPRAZO_PROTESTO_DEVOLUCAO() &&
            ((this.DESCRICOES==null && other.getDESCRICOES()==null) || 
             (this.DESCRICOES!=null &&
              this.DESCRICOES.equals(other.getDESCRICOES()))) &&
            ((this.COMPLEMENTARES==null && other.getCOMPLEMENTARES()==null) || 
             (this.COMPLEMENTARES!=null &&
              this.COMPLEMENTARES.equals(other.getCOMPLEMENTARES()))) &&
            ((this.SITUACAO==null && other.getSITUACAO()==null) || 
             (this.SITUACAO!=null &&
              this.SITUACAO.equals(other.getSITUACAO())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDATA_VENCIMENTO() != null) {
            _hashCode += getDATA_VENCIMENTO().hashCode();
        }
        if (getVALOR_TITULO() != null) {
            _hashCode += getVALOR_TITULO().hashCode();
        }
        _hashCode += getPRAZO_PROTESTO_DEVOLUCAO();
        if (getDESCRICOES() != null) {
            _hashCode += getDESCRICOES().hashCode();
        }
        if (getCOMPLEMENTARES() != null) {
            _hashCode += getCOMPLEMENTARES().hashCode();
        }
        if (getSITUACAO() != null) {
            _hashCode += getSITUACAO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATA_VENCIMENTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATA_VENCIMENTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALOR_TITULO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALOR_TITULO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRAZO_PROTESTO_DEVOLUCAO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PRAZO_PROTESTO_DEVOLUCAO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCRICOES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DESCRICOES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "DESCRICOES_TYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMPLEMENTARES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COMPLEMENTARES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "COMPLEMENTARES_TYPE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SITUACAO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SITUACAO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
