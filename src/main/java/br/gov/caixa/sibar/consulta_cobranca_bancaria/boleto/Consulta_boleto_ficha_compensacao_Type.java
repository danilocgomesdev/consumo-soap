/**
 * Consulta_boleto_ficha_compensacao_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class Consulta_boleto_ficha_compensacao_Type  implements java.io.Serializable {
    private java.lang.String[] MENSAGENS;

    public Consulta_boleto_ficha_compensacao_Type() {
    }

    public Consulta_boleto_ficha_compensacao_Type(
           java.lang.String[] MENSAGENS) {
           this.MENSAGENS = MENSAGENS;
    }


    /**
     * Gets the MENSAGENS value for this Consulta_boleto_ficha_compensacao_Type.
     * 
     * @return MENSAGENS
     */
    public java.lang.String[] getMENSAGENS() {
        return MENSAGENS;
    }


    /**
     * Sets the MENSAGENS value for this Consulta_boleto_ficha_compensacao_Type.
     * 
     * @param MENSAGENS
     */
    public void setMENSAGENS(java.lang.String[] MENSAGENS) {
        this.MENSAGENS = MENSAGENS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Consulta_boleto_ficha_compensacao_Type)) return false;
        Consulta_boleto_ficha_compensacao_Type other = (Consulta_boleto_ficha_compensacao_Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MENSAGENS==null && other.getMENSAGENS()==null) || 
             (this.MENSAGENS!=null &&
              java.util.Arrays.equals(this.MENSAGENS, other.getMENSAGENS())));
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
        if (getMENSAGENS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMENSAGENS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMENSAGENS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Consulta_boleto_ficha_compensacao_Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_ficha_compensacao_Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MENSAGENS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MENSAGENS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_mensagens_ficha_compensacao_Type>MENSAGEM"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "MENSAGEM"));
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
