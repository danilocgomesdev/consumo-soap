/**
 * COMPLEMENTARES_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class COMPLEMENTARES_TYPE  implements java.io.Serializable {
    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.DESCONTO_MULTA_TYPE[] DESCONTOS;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.DESCONTO_MULTA_TYPE MULTA;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.JUROS_TYPE JUROS;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.IMPOSTOS_TYPE IMPOSTOS;

    public COMPLEMENTARES_TYPE() {
    }

    public COMPLEMENTARES_TYPE(
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.DESCONTO_MULTA_TYPE[] DESCONTOS,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.DESCONTO_MULTA_TYPE MULTA,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.JUROS_TYPE JUROS,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.IMPOSTOS_TYPE IMPOSTOS) {
           this.DESCONTOS = DESCONTOS;
           this.MULTA = MULTA;
           this.JUROS = JUROS;
           this.IMPOSTOS = IMPOSTOS;
    }


    /**
     * Gets the DESCONTOS value for this COMPLEMENTARES_TYPE.
     * 
     * @return DESCONTOS
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.DESCONTO_MULTA_TYPE[] getDESCONTOS() {
        return DESCONTOS;
    }


    /**
     * Sets the DESCONTOS value for this COMPLEMENTARES_TYPE.
     * 
     * @param DESCONTOS
     */
    public void setDESCONTOS(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.DESCONTO_MULTA_TYPE[] DESCONTOS) {
        this.DESCONTOS = DESCONTOS;
    }


    /**
     * Gets the MULTA value for this COMPLEMENTARES_TYPE.
     * 
     * @return MULTA
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.DESCONTO_MULTA_TYPE getMULTA() {
        return MULTA;
    }


    /**
     * Sets the MULTA value for this COMPLEMENTARES_TYPE.
     * 
     * @param MULTA
     */
    public void setMULTA(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.DESCONTO_MULTA_TYPE MULTA) {
        this.MULTA = MULTA;
    }


    /**
     * Gets the JUROS value for this COMPLEMENTARES_TYPE.
     * 
     * @return JUROS
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.JUROS_TYPE getJUROS() {
        return JUROS;
    }


    /**
     * Sets the JUROS value for this COMPLEMENTARES_TYPE.
     * 
     * @param JUROS
     */
    public void setJUROS(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.JUROS_TYPE JUROS) {
        this.JUROS = JUROS;
    }


    /**
     * Gets the IMPOSTOS value for this COMPLEMENTARES_TYPE.
     * 
     * @return IMPOSTOS
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.IMPOSTOS_TYPE getIMPOSTOS() {
        return IMPOSTOS;
    }


    /**
     * Sets the IMPOSTOS value for this COMPLEMENTARES_TYPE.
     * 
     * @param IMPOSTOS
     */
    public void setIMPOSTOS(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.IMPOSTOS_TYPE IMPOSTOS) {
        this.IMPOSTOS = IMPOSTOS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof COMPLEMENTARES_TYPE)) return false;
        COMPLEMENTARES_TYPE other = (COMPLEMENTARES_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DESCONTOS==null && other.getDESCONTOS()==null) || 
             (this.DESCONTOS!=null &&
              java.util.Arrays.equals(this.DESCONTOS, other.getDESCONTOS()))) &&
            ((this.MULTA==null && other.getMULTA()==null) || 
             (this.MULTA!=null &&
              this.MULTA.equals(other.getMULTA()))) &&
            ((this.JUROS==null && other.getJUROS()==null) || 
             (this.JUROS!=null &&
              this.JUROS.equals(other.getJUROS()))) &&
            ((this.IMPOSTOS==null && other.getIMPOSTOS()==null) || 
             (this.IMPOSTOS!=null &&
              this.IMPOSTOS.equals(other.getIMPOSTOS())));
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
        if (getDESCONTOS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDESCONTOS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDESCONTOS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMULTA() != null) {
            _hashCode += getMULTA().hashCode();
        }
        if (getJUROS() != null) {
            _hashCode += getJUROS().hashCode();
        }
        if (getIMPOSTOS() != null) {
            _hashCode += getIMPOSTOS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(COMPLEMENTARES_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "COMPLEMENTARES_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCONTOS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DESCONTOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "DESCONTO_MULTA_TYPE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "DESCONTO"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MULTA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MULTA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "DESCONTO_MULTA_TYPE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JUROS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JUROS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "JUROS_TYPE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMPOSTOS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IMPOSTOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "IMPOSTOS_TYPE"));
        elemField.setMinOccurs(0);
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
