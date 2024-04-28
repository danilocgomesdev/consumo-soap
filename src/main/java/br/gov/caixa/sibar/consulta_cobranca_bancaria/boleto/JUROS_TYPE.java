/**
 * JUROS_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class JUROS_TYPE  implements java.io.Serializable {
    private short TIPO;

    private java.math.BigDecimal VALOR;

    public JUROS_TYPE() {
    }

    public JUROS_TYPE(
           short TIPO,
           java.math.BigDecimal VALOR) {
           this.TIPO = TIPO;
           this.VALOR = VALOR;
    }


    /**
     * Gets the TIPO value for this JUROS_TYPE.
     * 
     * @return TIPO
     */
    public short getTIPO() {
        return TIPO;
    }


    /**
     * Sets the TIPO value for this JUROS_TYPE.
     * 
     * @param TIPO
     */
    public void setTIPO(short TIPO) {
        this.TIPO = TIPO;
    }


    /**
     * Gets the VALOR value for this JUROS_TYPE.
     * 
     * @return VALOR
     */
    public java.math.BigDecimal getVALOR() {
        return VALOR;
    }


    /**
     * Sets the VALOR value for this JUROS_TYPE.
     * 
     * @param VALOR
     */
    public void setVALOR(java.math.BigDecimal VALOR) {
        this.VALOR = VALOR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JUROS_TYPE)) return false;
        JUROS_TYPE other = (JUROS_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.TIPO == other.getTIPO() &&
            ((this.VALOR==null && other.getVALOR()==null) || 
             (this.VALOR!=null &&
              this.VALOR.equals(other.getVALOR())));
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
        _hashCode += getTIPO();
        if (getVALOR() != null) {
            _hashCode += getVALOR().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JUROS_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "JUROS_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIPO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TIPO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALOR"));
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
