/**
 * Consulta_boleto_saida_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class Consulta_boleto_saida_Type  implements java.io.Serializable {
    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_titulo_Type TITULO;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_saida_TypeFLAG_REGISTRO FLAG_REGISTRO;

    public Consulta_boleto_saida_Type() {
    }

    public Consulta_boleto_saida_Type(
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_titulo_Type TITULO,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_saida_TypeFLAG_REGISTRO FLAG_REGISTRO) {
           this.TITULO = TITULO;
           this.FLAG_REGISTRO = FLAG_REGISTRO;
    }


    /**
     * Gets the TITULO value for this Consulta_boleto_saida_Type.
     * 
     * @return TITULO
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_titulo_Type getTITULO() {
        return TITULO;
    }


    /**
     * Sets the TITULO value for this Consulta_boleto_saida_Type.
     * 
     * @param TITULO
     */
    public void setTITULO(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_titulo_Type TITULO) {
        this.TITULO = TITULO;
    }


    /**
     * Gets the FLAG_REGISTRO value for this Consulta_boleto_saida_Type.
     * 
     * @return FLAG_REGISTRO
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_saida_TypeFLAG_REGISTRO getFLAG_REGISTRO() {
        return FLAG_REGISTRO;
    }


    /**
     * Sets the FLAG_REGISTRO value for this Consulta_boleto_saida_Type.
     * 
     * @param FLAG_REGISTRO
     */
    public void setFLAG_REGISTRO(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_saida_TypeFLAG_REGISTRO FLAG_REGISTRO) {
        this.FLAG_REGISTRO = FLAG_REGISTRO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Consulta_boleto_saida_Type)) return false;
        Consulta_boleto_saida_Type other = (Consulta_boleto_saida_Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TITULO==null && other.getTITULO()==null) || 
             (this.TITULO!=null &&
              this.TITULO.equals(other.getTITULO()))) &&
            ((this.FLAG_REGISTRO==null && other.getFLAG_REGISTRO()==null) || 
             (this.FLAG_REGISTRO!=null &&
              this.FLAG_REGISTRO.equals(other.getFLAG_REGISTRO())));
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
        if (getTITULO() != null) {
            _hashCode += getTITULO().hashCode();
        }
        if (getFLAG_REGISTRO() != null) {
            _hashCode += getFLAG_REGISTRO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Consulta_boleto_saida_Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_saida_Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TITULO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TITULO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_titulo_Type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLAG_REGISTRO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FLAG_REGISTRO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_saida_Type>FLAG_REGISTRO"));
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
