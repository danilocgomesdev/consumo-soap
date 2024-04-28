/**
 * SOLICITACAO_PRE_IMPRESSO_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class SOLICITACAO_PRE_IMPRESSO_TYPE  implements java.io.Serializable {
    private java.util.Date DATA_SOLICITACAO;

    private long QUANTIDADE_BOLETOS;

    private long NOSSO_NUMERO_INICIAL;

    private java.lang.String DESCRICAO_TIPO_ENTREGA;

    private java.lang.String DESCRICAO_TIPO_BOLETO;

    private java.lang.String SITUACAO;

    public SOLICITACAO_PRE_IMPRESSO_TYPE() {
    }

    public SOLICITACAO_PRE_IMPRESSO_TYPE(
           java.util.Date DATA_SOLICITACAO,
           long QUANTIDADE_BOLETOS,
           long NOSSO_NUMERO_INICIAL,
           java.lang.String DESCRICAO_TIPO_ENTREGA,
           java.lang.String DESCRICAO_TIPO_BOLETO,
           java.lang.String SITUACAO) {
           this.DATA_SOLICITACAO = DATA_SOLICITACAO;
           this.QUANTIDADE_BOLETOS = QUANTIDADE_BOLETOS;
           this.NOSSO_NUMERO_INICIAL = NOSSO_NUMERO_INICIAL;
           this.DESCRICAO_TIPO_ENTREGA = DESCRICAO_TIPO_ENTREGA;
           this.DESCRICAO_TIPO_BOLETO = DESCRICAO_TIPO_BOLETO;
           this.SITUACAO = SITUACAO;
    }


    /**
     * Gets the DATA_SOLICITACAO value for this SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @return DATA_SOLICITACAO
     */
    public java.util.Date getDATA_SOLICITACAO() {
        return DATA_SOLICITACAO;
    }


    /**
     * Sets the DATA_SOLICITACAO value for this SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @param DATA_SOLICITACAO
     */
    public void setDATA_SOLICITACAO(java.util.Date DATA_SOLICITACAO) {
        this.DATA_SOLICITACAO = DATA_SOLICITACAO;
    }


    /**
     * Gets the QUANTIDADE_BOLETOS value for this SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @return QUANTIDADE_BOLETOS
     */
    public long getQUANTIDADE_BOLETOS() {
        return QUANTIDADE_BOLETOS;
    }


    /**
     * Sets the QUANTIDADE_BOLETOS value for this SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @param QUANTIDADE_BOLETOS
     */
    public void setQUANTIDADE_BOLETOS(long QUANTIDADE_BOLETOS) {
        this.QUANTIDADE_BOLETOS = QUANTIDADE_BOLETOS;
    }


    /**
     * Gets the NOSSO_NUMERO_INICIAL value for this SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @return NOSSO_NUMERO_INICIAL
     */
    public long getNOSSO_NUMERO_INICIAL() {
        return NOSSO_NUMERO_INICIAL;
    }


    /**
     * Sets the NOSSO_NUMERO_INICIAL value for this SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @param NOSSO_NUMERO_INICIAL
     */
    public void setNOSSO_NUMERO_INICIAL(long NOSSO_NUMERO_INICIAL) {
        this.NOSSO_NUMERO_INICIAL = NOSSO_NUMERO_INICIAL;
    }


    /**
     * Gets the DESCRICAO_TIPO_ENTREGA value for this SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @return DESCRICAO_TIPO_ENTREGA
     */
    public java.lang.String getDESCRICAO_TIPO_ENTREGA() {
        return DESCRICAO_TIPO_ENTREGA;
    }


    /**
     * Sets the DESCRICAO_TIPO_ENTREGA value for this SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @param DESCRICAO_TIPO_ENTREGA
     */
    public void setDESCRICAO_TIPO_ENTREGA(java.lang.String DESCRICAO_TIPO_ENTREGA) {
        this.DESCRICAO_TIPO_ENTREGA = DESCRICAO_TIPO_ENTREGA;
    }


    /**
     * Gets the DESCRICAO_TIPO_BOLETO value for this SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @return DESCRICAO_TIPO_BOLETO
     */
    public java.lang.String getDESCRICAO_TIPO_BOLETO() {
        return DESCRICAO_TIPO_BOLETO;
    }


    /**
     * Sets the DESCRICAO_TIPO_BOLETO value for this SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @param DESCRICAO_TIPO_BOLETO
     */
    public void setDESCRICAO_TIPO_BOLETO(java.lang.String DESCRICAO_TIPO_BOLETO) {
        this.DESCRICAO_TIPO_BOLETO = DESCRICAO_TIPO_BOLETO;
    }


    /**
     * Gets the SITUACAO value for this SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @return SITUACAO
     */
    public java.lang.String getSITUACAO() {
        return SITUACAO;
    }


    /**
     * Sets the SITUACAO value for this SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @param SITUACAO
     */
    public void setSITUACAO(java.lang.String SITUACAO) {
        this.SITUACAO = SITUACAO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SOLICITACAO_PRE_IMPRESSO_TYPE)) return false;
        SOLICITACAO_PRE_IMPRESSO_TYPE other = (SOLICITACAO_PRE_IMPRESSO_TYPE) obj;
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
            this.QUANTIDADE_BOLETOS == other.getQUANTIDADE_BOLETOS() &&
            this.NOSSO_NUMERO_INICIAL == other.getNOSSO_NUMERO_INICIAL() &&
            ((this.DESCRICAO_TIPO_ENTREGA==null && other.getDESCRICAO_TIPO_ENTREGA()==null) || 
             (this.DESCRICAO_TIPO_ENTREGA!=null &&
              this.DESCRICAO_TIPO_ENTREGA.equals(other.getDESCRICAO_TIPO_ENTREGA()))) &&
            ((this.DESCRICAO_TIPO_BOLETO==null && other.getDESCRICAO_TIPO_BOLETO()==null) || 
             (this.DESCRICAO_TIPO_BOLETO!=null &&
              this.DESCRICAO_TIPO_BOLETO.equals(other.getDESCRICAO_TIPO_BOLETO()))) &&
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
        _hashCode += new Long(getQUANTIDADE_BOLETOS()).hashCode();
        _hashCode += new Long(getNOSSO_NUMERO_INICIAL()).hashCode();
        if (getDESCRICAO_TIPO_ENTREGA() != null) {
            _hashCode += getDESCRICAO_TIPO_ENTREGA().hashCode();
        }
        if (getDESCRICAO_TIPO_BOLETO() != null) {
            _hashCode += getDESCRICAO_TIPO_BOLETO().hashCode();
        }
        if (getSITUACAO() != null) {
            _hashCode += getSITUACAO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SOLICITACAO_PRE_IMPRESSO_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SOLICITACAO_PRE_IMPRESSO_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATA_SOLICITACAO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATA_SOLICITACAO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QUANTIDADE_BOLETOS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QUANTIDADE_BOLETOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOSSO_NUMERO_INICIAL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NOSSO_NUMERO_INICIAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCRICAO_TIPO_ENTREGA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DESCRICAO_TIPO_ENTREGA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCRICAO_TIPO_BOLETO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DESCRICAO_TIPO_BOLETO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
