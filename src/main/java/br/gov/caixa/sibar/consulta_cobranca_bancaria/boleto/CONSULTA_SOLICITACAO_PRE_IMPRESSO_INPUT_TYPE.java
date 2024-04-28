/**
 * CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE  implements java.io.Serializable {
    private int CODIGO_BENEFICIARIO;

    private java.util.Date DATA_SOLICITACAO;

    private short TIPO_BLOQUETO;

    public CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE() {
    }

    public CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE(
           int CODIGO_BENEFICIARIO,
           java.util.Date DATA_SOLICITACAO,
           short TIPO_BLOQUETO) {
           this.CODIGO_BENEFICIARIO = CODIGO_BENEFICIARIO;
           this.DATA_SOLICITACAO = DATA_SOLICITACAO;
           this.TIPO_BLOQUETO = TIPO_BLOQUETO;
    }


    /**
     * Gets the CODIGO_BENEFICIARIO value for this CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE.
     * 
     * @return CODIGO_BENEFICIARIO
     */
    public int getCODIGO_BENEFICIARIO() {
        return CODIGO_BENEFICIARIO;
    }


    /**
     * Sets the CODIGO_BENEFICIARIO value for this CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE.
     * 
     * @param CODIGO_BENEFICIARIO
     */
    public void setCODIGO_BENEFICIARIO(int CODIGO_BENEFICIARIO) {
        this.CODIGO_BENEFICIARIO = CODIGO_BENEFICIARIO;
    }


    /**
     * Gets the DATA_SOLICITACAO value for this CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE.
     * 
     * @return DATA_SOLICITACAO
     */
    public java.util.Date getDATA_SOLICITACAO() {
        return DATA_SOLICITACAO;
    }


    /**
     * Sets the DATA_SOLICITACAO value for this CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE.
     * 
     * @param DATA_SOLICITACAO
     */
    public void setDATA_SOLICITACAO(java.util.Date DATA_SOLICITACAO) {
        this.DATA_SOLICITACAO = DATA_SOLICITACAO;
    }


    /**
     * Gets the TIPO_BLOQUETO value for this CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE.
     * 
     * @return TIPO_BLOQUETO
     */
    public short getTIPO_BLOQUETO() {
        return TIPO_BLOQUETO;
    }


    /**
     * Sets the TIPO_BLOQUETO value for this CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE.
     * 
     * @param TIPO_BLOQUETO
     */
    public void setTIPO_BLOQUETO(short TIPO_BLOQUETO) {
        this.TIPO_BLOQUETO = TIPO_BLOQUETO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE)) return false;
        CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE other = (CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.CODIGO_BENEFICIARIO == other.getCODIGO_BENEFICIARIO() &&
            ((this.DATA_SOLICITACAO==null && other.getDATA_SOLICITACAO()==null) || 
             (this.DATA_SOLICITACAO!=null &&
              this.DATA_SOLICITACAO.equals(other.getDATA_SOLICITACAO()))) &&
            this.TIPO_BLOQUETO == other.getTIPO_BLOQUETO();
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
        _hashCode += getCODIGO_BENEFICIARIO();
        if (getDATA_SOLICITACAO() != null) {
            _hashCode += getDATA_SOLICITACAO().hashCode();
        }
        _hashCode += getTIPO_BLOQUETO();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODIGO_BENEFICIARIO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CODIGO_BENEFICIARIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATA_SOLICITACAO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATA_SOLICITACAO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIPO_BLOQUETO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TIPO_BLOQUETO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
