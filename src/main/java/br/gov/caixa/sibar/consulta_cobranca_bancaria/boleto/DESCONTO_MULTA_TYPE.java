/**
 * DESCONTO_MULTA_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class DESCONTO_MULTA_TYPE  implements java.io.Serializable {
    private java.math.BigDecimal PERCENTUAL;

    private java.math.BigDecimal VALOR;

    private java.lang.Short PRAZO;

    private java.util.Date DATA;

    public DESCONTO_MULTA_TYPE() {
    }

    public DESCONTO_MULTA_TYPE(
           java.math.BigDecimal PERCENTUAL,
           java.math.BigDecimal VALOR,
           java.lang.Short PRAZO,
           java.util.Date DATA) {
           this.PERCENTUAL = PERCENTUAL;
           this.VALOR = VALOR;
           this.PRAZO = PRAZO;
           this.DATA = DATA;
    }


    /**
     * Gets the PERCENTUAL value for this DESCONTO_MULTA_TYPE.
     * 
     * @return PERCENTUAL
     */
    public java.math.BigDecimal getPERCENTUAL() {
        return PERCENTUAL;
    }


    /**
     * Sets the PERCENTUAL value for this DESCONTO_MULTA_TYPE.
     * 
     * @param PERCENTUAL
     */
    public void setPERCENTUAL(java.math.BigDecimal PERCENTUAL) {
        this.PERCENTUAL = PERCENTUAL;
    }


    /**
     * Gets the VALOR value for this DESCONTO_MULTA_TYPE.
     * 
     * @return VALOR
     */
    public java.math.BigDecimal getVALOR() {
        return VALOR;
    }


    /**
     * Sets the VALOR value for this DESCONTO_MULTA_TYPE.
     * 
     * @param VALOR
     */
    public void setVALOR(java.math.BigDecimal VALOR) {
        this.VALOR = VALOR;
    }


    /**
     * Gets the PRAZO value for this DESCONTO_MULTA_TYPE.
     * 
     * @return PRAZO
     */
    public java.lang.Short getPRAZO() {
        return PRAZO;
    }


    /**
     * Sets the PRAZO value for this DESCONTO_MULTA_TYPE.
     * 
     * @param PRAZO
     */
    public void setPRAZO(java.lang.Short PRAZO) {
        this.PRAZO = PRAZO;
    }


    /**
     * Gets the DATA value for this DESCONTO_MULTA_TYPE.
     * 
     * @return DATA
     */
    public java.util.Date getDATA() {
        return DATA;
    }


    /**
     * Sets the DATA value for this DESCONTO_MULTA_TYPE.
     * 
     * @param DATA
     */
    public void setDATA(java.util.Date DATA) {
        this.DATA = DATA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DESCONTO_MULTA_TYPE)) return false;
        DESCONTO_MULTA_TYPE other = (DESCONTO_MULTA_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PERCENTUAL==null && other.getPERCENTUAL()==null) || 
             (this.PERCENTUAL!=null &&
              this.PERCENTUAL.equals(other.getPERCENTUAL()))) &&
            ((this.VALOR==null && other.getVALOR()==null) || 
             (this.VALOR!=null &&
              this.VALOR.equals(other.getVALOR()))) &&
            ((this.PRAZO==null && other.getPRAZO()==null) || 
             (this.PRAZO!=null &&
              this.PRAZO.equals(other.getPRAZO()))) &&
            ((this.DATA==null && other.getDATA()==null) || 
             (this.DATA!=null &&
              this.DATA.equals(other.getDATA())));
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
        if (getPERCENTUAL() != null) {
            _hashCode += getPERCENTUAL().hashCode();
        }
        if (getVALOR() != null) {
            _hashCode += getVALOR().hashCode();
        }
        if (getPRAZO() != null) {
            _hashCode += getPRAZO().hashCode();
        }
        if (getDATA() != null) {
            _hashCode += getDATA().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DESCONTO_MULTA_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "DESCONTO_MULTA_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERCENTUAL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PERCENTUAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRAZO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PRAZO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
