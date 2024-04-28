/**
 * MOEDA_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class MOEDA_TYPE  implements java.io.Serializable {
    private short CODIGO;

    private java.lang.String SIGLA;

    private java.lang.String DESCRICAO;

    public MOEDA_TYPE() {
    }

    public MOEDA_TYPE(
           short CODIGO,
           java.lang.String SIGLA,
           java.lang.String DESCRICAO) {
           this.CODIGO = CODIGO;
           this.SIGLA = SIGLA;
           this.DESCRICAO = DESCRICAO;
    }


    /**
     * Gets the CODIGO value for this MOEDA_TYPE.
     * 
     * @return CODIGO
     */
    public short getCODIGO() {
        return CODIGO;
    }


    /**
     * Sets the CODIGO value for this MOEDA_TYPE.
     * 
     * @param CODIGO
     */
    public void setCODIGO(short CODIGO) {
        this.CODIGO = CODIGO;
    }


    /**
     * Gets the SIGLA value for this MOEDA_TYPE.
     * 
     * @return SIGLA
     */
    public java.lang.String getSIGLA() {
        return SIGLA;
    }


    /**
     * Sets the SIGLA value for this MOEDA_TYPE.
     * 
     * @param SIGLA
     */
    public void setSIGLA(java.lang.String SIGLA) {
        this.SIGLA = SIGLA;
    }


    /**
     * Gets the DESCRICAO value for this MOEDA_TYPE.
     * 
     * @return DESCRICAO
     */
    public java.lang.String getDESCRICAO() {
        return DESCRICAO;
    }


    /**
     * Sets the DESCRICAO value for this MOEDA_TYPE.
     * 
     * @param DESCRICAO
     */
    public void setDESCRICAO(java.lang.String DESCRICAO) {
        this.DESCRICAO = DESCRICAO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MOEDA_TYPE)) return false;
        MOEDA_TYPE other = (MOEDA_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.CODIGO == other.getCODIGO() &&
            ((this.SIGLA==null && other.getSIGLA()==null) || 
             (this.SIGLA!=null &&
              this.SIGLA.equals(other.getSIGLA()))) &&
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
        _hashCode += getCODIGO();
        if (getSIGLA() != null) {
            _hashCode += getSIGLA().hashCode();
        }
        if (getDESCRICAO() != null) {
            _hashCode += getDESCRICAO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MOEDA_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "MOEDA_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODIGO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CODIGO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIGLA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SIGLA"));
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
