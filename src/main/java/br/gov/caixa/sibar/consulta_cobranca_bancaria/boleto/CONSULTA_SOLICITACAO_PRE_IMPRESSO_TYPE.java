/**
 * CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE  implements java.io.Serializable {
    private long NOSSO_NUMERO;

    private short TIPO_ENTREGA;

    private int QUANTIDADE_BLOQUETO;

    private java.lang.String TIPO_COBRANCA;

    private java.lang.String SITUACAO;

    public CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE() {
    }

    public CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE(
           long NOSSO_NUMERO,
           short TIPO_ENTREGA,
           int QUANTIDADE_BLOQUETO,
           java.lang.String TIPO_COBRANCA,
           java.lang.String SITUACAO) {
           this.NOSSO_NUMERO = NOSSO_NUMERO;
           this.TIPO_ENTREGA = TIPO_ENTREGA;
           this.QUANTIDADE_BLOQUETO = QUANTIDADE_BLOQUETO;
           this.TIPO_COBRANCA = TIPO_COBRANCA;
           this.SITUACAO = SITUACAO;
    }


    /**
     * Gets the NOSSO_NUMERO value for this CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @return NOSSO_NUMERO
     */
    public long getNOSSO_NUMERO() {
        return NOSSO_NUMERO;
    }


    /**
     * Sets the NOSSO_NUMERO value for this CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @param NOSSO_NUMERO
     */
    public void setNOSSO_NUMERO(long NOSSO_NUMERO) {
        this.NOSSO_NUMERO = NOSSO_NUMERO;
    }


    /**
     * Gets the TIPO_ENTREGA value for this CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @return TIPO_ENTREGA
     */
    public short getTIPO_ENTREGA() {
        return TIPO_ENTREGA;
    }


    /**
     * Sets the TIPO_ENTREGA value for this CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @param TIPO_ENTREGA
     */
    public void setTIPO_ENTREGA(short TIPO_ENTREGA) {
        this.TIPO_ENTREGA = TIPO_ENTREGA;
    }


    /**
     * Gets the QUANTIDADE_BLOQUETO value for this CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @return QUANTIDADE_BLOQUETO
     */
    public int getQUANTIDADE_BLOQUETO() {
        return QUANTIDADE_BLOQUETO;
    }


    /**
     * Sets the QUANTIDADE_BLOQUETO value for this CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @param QUANTIDADE_BLOQUETO
     */
    public void setQUANTIDADE_BLOQUETO(int QUANTIDADE_BLOQUETO) {
        this.QUANTIDADE_BLOQUETO = QUANTIDADE_BLOQUETO;
    }


    /**
     * Gets the TIPO_COBRANCA value for this CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @return TIPO_COBRANCA
     */
    public java.lang.String getTIPO_COBRANCA() {
        return TIPO_COBRANCA;
    }


    /**
     * Sets the TIPO_COBRANCA value for this CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @param TIPO_COBRANCA
     */
    public void setTIPO_COBRANCA(java.lang.String TIPO_COBRANCA) {
        this.TIPO_COBRANCA = TIPO_COBRANCA;
    }


    /**
     * Gets the SITUACAO value for this CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @return SITUACAO
     */
    public java.lang.String getSITUACAO() {
        return SITUACAO;
    }


    /**
     * Sets the SITUACAO value for this CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE.
     * 
     * @param SITUACAO
     */
    public void setSITUACAO(java.lang.String SITUACAO) {
        this.SITUACAO = SITUACAO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE)) return false;
        CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE other = (CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.NOSSO_NUMERO == other.getNOSSO_NUMERO() &&
            this.TIPO_ENTREGA == other.getTIPO_ENTREGA() &&
            this.QUANTIDADE_BLOQUETO == other.getQUANTIDADE_BLOQUETO() &&
            ((this.TIPO_COBRANCA==null && other.getTIPO_COBRANCA()==null) || 
             (this.TIPO_COBRANCA!=null &&
              this.TIPO_COBRANCA.equals(other.getTIPO_COBRANCA()))) &&
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
        _hashCode += new Long(getNOSSO_NUMERO()).hashCode();
        _hashCode += getTIPO_ENTREGA();
        _hashCode += getQUANTIDADE_BLOQUETO();
        if (getTIPO_COBRANCA() != null) {
            _hashCode += getTIPO_COBRANCA().hashCode();
        }
        if (getSITUACAO() != null) {
            _hashCode += getSITUACAO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOSSO_NUMERO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NOSSO_NUMERO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIPO_ENTREGA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TIPO_ENTREGA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QUANTIDADE_BLOQUETO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QUANTIDADE_BLOQUETO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIPO_COBRANCA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TIPO_COBRANCA"));
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
