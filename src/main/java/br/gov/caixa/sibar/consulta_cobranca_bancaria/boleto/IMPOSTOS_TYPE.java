/**
 * IMPOSTOS_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class IMPOSTOS_TYPE  implements java.io.Serializable {
    private java.math.BigDecimal VALOR_IOF;

    public IMPOSTOS_TYPE() {
    }

    public IMPOSTOS_TYPE(
           java.math.BigDecimal VALOR_IOF) {
           this.VALOR_IOF = VALOR_IOF;
    }


    /**
     * Gets the VALOR_IOF value for this IMPOSTOS_TYPE.
     * 
     * @return VALOR_IOF
     */
    public java.math.BigDecimal getVALOR_IOF() {
        return VALOR_IOF;
    }


    /**
     * Sets the VALOR_IOF value for this IMPOSTOS_TYPE.
     * 
     * @param VALOR_IOF
     */
    public void setVALOR_IOF(java.math.BigDecimal VALOR_IOF) {
        this.VALOR_IOF = VALOR_IOF;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IMPOSTOS_TYPE)) return false;
        IMPOSTOS_TYPE other = (IMPOSTOS_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VALOR_IOF==null && other.getVALOR_IOF()==null) || 
             (this.VALOR_IOF!=null &&
              this.VALOR_IOF.equals(other.getVALOR_IOF())));
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
        if (getVALOR_IOF() != null) {
            _hashCode += getVALOR_IOF().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IMPOSTOS_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "IMPOSTOS_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALOR_IOF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALOR_IOF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
