/**
 * MENSAGEM_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class MENSAGEM_TYPE  implements java.io.Serializable {
    private java.lang.String TIPO;

    private java.lang.String DESCRICAO;

    public MENSAGEM_TYPE() {
    }

    public MENSAGEM_TYPE(
           java.lang.String TIPO,
           java.lang.String DESCRICAO) {
           this.TIPO = TIPO;
           this.DESCRICAO = DESCRICAO;
    }


    /**
     * Gets the TIPO value for this MENSAGEM_TYPE.
     * 
     * @return TIPO
     */
    public java.lang.String getTIPO() {
        return TIPO;
    }


    /**
     * Sets the TIPO value for this MENSAGEM_TYPE.
     * 
     * @param TIPO
     */
    public void setTIPO(java.lang.String TIPO) {
        this.TIPO = TIPO;
    }


    /**
     * Gets the DESCRICAO value for this MENSAGEM_TYPE.
     * 
     * @return DESCRICAO
     */
    public java.lang.String getDESCRICAO() {
        return DESCRICAO;
    }


    /**
     * Sets the DESCRICAO value for this MENSAGEM_TYPE.
     * 
     * @param DESCRICAO
     */
    public void setDESCRICAO(java.lang.String DESCRICAO) {
        this.DESCRICAO = DESCRICAO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MENSAGEM_TYPE)) return false;
        MENSAGEM_TYPE other = (MENSAGEM_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TIPO==null && other.getTIPO()==null) || 
             (this.TIPO!=null &&
              this.TIPO.equals(other.getTIPO()))) &&
            ((this.DESCRICAO==null && other.getDESCRICAO()==null) || 
             (this.DESCRICAO!=null &&
              this.DESCRICAO.equals(other.getDESCRICAO())));
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
        if (getTIPO() != null) {
            _hashCode += getTIPO().hashCode();
        }
        if (getDESCRICAO() != null) {
            _hashCode += getDESCRICAO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MENSAGEM_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "MENSAGEM_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIPO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TIPO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCRICAO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DESCRICAO"));
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
