/**
 * SOLICITACAO_GRUPO_PAGADOR_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class SOLICITACAO_GRUPO_PAGADOR_TYPE  implements java.io.Serializable {
    private java.util.Date DATA_SOLICITACAO;

    private short CODIGO_GRUPO;

    private java.lang.String NOME_GRUPO;

    private java.lang.String DESCRICAO_ESPECIE;

    private java.util.Date DATA_VENCIMENTO;

    private java.math.BigDecimal VALOR_TITULO;

    private java.lang.String SITUACAO;

    public SOLICITACAO_GRUPO_PAGADOR_TYPE() {
    }

    public SOLICITACAO_GRUPO_PAGADOR_TYPE(
           java.util.Date DATA_SOLICITACAO,
           short CODIGO_GRUPO,
           java.lang.String NOME_GRUPO,
           java.lang.String DESCRICAO_ESPECIE,
           java.util.Date DATA_VENCIMENTO,
           java.math.BigDecimal VALOR_TITULO,
           java.lang.String SITUACAO) {
           this.DATA_SOLICITACAO = DATA_SOLICITACAO;
           this.CODIGO_GRUPO = CODIGO_GRUPO;
           this.NOME_GRUPO = NOME_GRUPO;
           this.DESCRICAO_ESPECIE = DESCRICAO_ESPECIE;
           this.DATA_VENCIMENTO = DATA_VENCIMENTO;
           this.VALOR_TITULO = VALOR_TITULO;
           this.SITUACAO = SITUACAO;
    }


    /**
     * Gets the DATA_SOLICITACAO value for this SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @return DATA_SOLICITACAO
     */
    public java.util.Date getDATA_SOLICITACAO() {
        return DATA_SOLICITACAO;
    }


    /**
     * Sets the DATA_SOLICITACAO value for this SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @param DATA_SOLICITACAO
     */
    public void setDATA_SOLICITACAO(java.util.Date DATA_SOLICITACAO) {
        this.DATA_SOLICITACAO = DATA_SOLICITACAO;
    }


    /**
     * Gets the CODIGO_GRUPO value for this SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @return CODIGO_GRUPO
     */
    public short getCODIGO_GRUPO() {
        return CODIGO_GRUPO;
    }


    /**
     * Sets the CODIGO_GRUPO value for this SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @param CODIGO_GRUPO
     */
    public void setCODIGO_GRUPO(short CODIGO_GRUPO) {
        this.CODIGO_GRUPO = CODIGO_GRUPO;
    }


    /**
     * Gets the NOME_GRUPO value for this SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @return NOME_GRUPO
     */
    public java.lang.String getNOME_GRUPO() {
        return NOME_GRUPO;
    }


    /**
     * Sets the NOME_GRUPO value for this SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @param NOME_GRUPO
     */
    public void setNOME_GRUPO(java.lang.String NOME_GRUPO) {
        this.NOME_GRUPO = NOME_GRUPO;
    }


    /**
     * Gets the DESCRICAO_ESPECIE value for this SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @return DESCRICAO_ESPECIE
     */
    public java.lang.String getDESCRICAO_ESPECIE() {
        return DESCRICAO_ESPECIE;
    }


    /**
     * Sets the DESCRICAO_ESPECIE value for this SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @param DESCRICAO_ESPECIE
     */
    public void setDESCRICAO_ESPECIE(java.lang.String DESCRICAO_ESPECIE) {
        this.DESCRICAO_ESPECIE = DESCRICAO_ESPECIE;
    }


    /**
     * Gets the DATA_VENCIMENTO value for this SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @return DATA_VENCIMENTO
     */
    public java.util.Date getDATA_VENCIMENTO() {
        return DATA_VENCIMENTO;
    }


    /**
     * Sets the DATA_VENCIMENTO value for this SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @param DATA_VENCIMENTO
     */
    public void setDATA_VENCIMENTO(java.util.Date DATA_VENCIMENTO) {
        this.DATA_VENCIMENTO = DATA_VENCIMENTO;
    }


    /**
     * Gets the VALOR_TITULO value for this SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @return VALOR_TITULO
     */
    public java.math.BigDecimal getVALOR_TITULO() {
        return VALOR_TITULO;
    }


    /**
     * Sets the VALOR_TITULO value for this SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @param VALOR_TITULO
     */
    public void setVALOR_TITULO(java.math.BigDecimal VALOR_TITULO) {
        this.VALOR_TITULO = VALOR_TITULO;
    }


    /**
     * Gets the SITUACAO value for this SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @return SITUACAO
     */
    public java.lang.String getSITUACAO() {
        return SITUACAO;
    }


    /**
     * Sets the SITUACAO value for this SOLICITACAO_GRUPO_PAGADOR_TYPE.
     * 
     * @param SITUACAO
     */
    public void setSITUACAO(java.lang.String SITUACAO) {
        this.SITUACAO = SITUACAO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SOLICITACAO_GRUPO_PAGADOR_TYPE)) return false;
        SOLICITACAO_GRUPO_PAGADOR_TYPE other = (SOLICITACAO_GRUPO_PAGADOR_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DATA_SOLICITACAO==null && other.getDATA_SOLICITACAO()==null) || 
             (this.DATA_SOLICITACAO!=null &&
              this.DATA_SOLICITACAO.equals(other.getDATA_SOLICITACAO()))) &&
            this.CODIGO_GRUPO == other.getCODIGO_GRUPO() &&
            ((this.NOME_GRUPO==null && other.getNOME_GRUPO()==null) || 
             (this.NOME_GRUPO!=null &&
              this.NOME_GRUPO.equals(other.getNOME_GRUPO()))) &&
            ((this.DESCRICAO_ESPECIE==null && other.getDESCRICAO_ESPECIE()==null) || 
             (this.DESCRICAO_ESPECIE!=null &&
              this.DESCRICAO_ESPECIE.equals(other.getDESCRICAO_ESPECIE()))) &&
            ((this.DATA_VENCIMENTO==null && other.getDATA_VENCIMENTO()==null) || 
             (this.DATA_VENCIMENTO!=null &&
              this.DATA_VENCIMENTO.equals(other.getDATA_VENCIMENTO()))) &&
            ((this.VALOR_TITULO==null && other.getVALOR_TITULO()==null) || 
             (this.VALOR_TITULO!=null &&
              this.VALOR_TITULO.equals(other.getVALOR_TITULO()))) &&
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
        if (getDATA_SOLICITACAO() != null) {
            _hashCode += getDATA_SOLICITACAO().hashCode();
        }
        _hashCode += getCODIGO_GRUPO();
        if (getNOME_GRUPO() != null) {
            _hashCode += getNOME_GRUPO().hashCode();
        }
        if (getDESCRICAO_ESPECIE() != null) {
            _hashCode += getDESCRICAO_ESPECIE().hashCode();
        }
        if (getDATA_VENCIMENTO() != null) {
            _hashCode += getDATA_VENCIMENTO().hashCode();
        }
        if (getVALOR_TITULO() != null) {
            _hashCode += getVALOR_TITULO().hashCode();
        }
        if (getSITUACAO() != null) {
            _hashCode += getSITUACAO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SOLICITACAO_GRUPO_PAGADOR_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SOLICITACAO_GRUPO_PAGADOR_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATA_SOLICITACAO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATA_SOLICITACAO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODIGO_GRUPO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CODIGO_GRUPO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOME_GRUPO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NOME_GRUPO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCRICAO_ESPECIE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DESCRICAO_ESPECIE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
