/**
 * IMPRIME_BOLETO_INPUT_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class IMPRIME_BOLETO_INPUT_TYPE  implements java.io.Serializable {
    private int CODIGO_BENEFICIARIO;

    private long NOSSO_NUMERO;

    private java.lang.String LINHA_DIGITAVEL;

    public IMPRIME_BOLETO_INPUT_TYPE() {
    }

    public IMPRIME_BOLETO_INPUT_TYPE(
           int CODIGO_BENEFICIARIO,
           long NOSSO_NUMERO,
           java.lang.String LINHA_DIGITAVEL) {
           this.CODIGO_BENEFICIARIO = CODIGO_BENEFICIARIO;
           this.NOSSO_NUMERO = NOSSO_NUMERO;
           this.LINHA_DIGITAVEL = LINHA_DIGITAVEL;
    }


    /**
     * Gets the CODIGO_BENEFICIARIO value for this IMPRIME_BOLETO_INPUT_TYPE.
     * 
     * @return CODIGO_BENEFICIARIO
     */
    public int getCODIGO_BENEFICIARIO() {
        return CODIGO_BENEFICIARIO;
    }


    /**
     * Sets the CODIGO_BENEFICIARIO value for this IMPRIME_BOLETO_INPUT_TYPE.
     * 
     * @param CODIGO_BENEFICIARIO
     */
    public void setCODIGO_BENEFICIARIO(int CODIGO_BENEFICIARIO) {
        this.CODIGO_BENEFICIARIO = CODIGO_BENEFICIARIO;
    }


    /**
     * Gets the NOSSO_NUMERO value for this IMPRIME_BOLETO_INPUT_TYPE.
     * 
     * @return NOSSO_NUMERO
     */
    public long getNOSSO_NUMERO() {
        return NOSSO_NUMERO;
    }


    /**
     * Sets the NOSSO_NUMERO value for this IMPRIME_BOLETO_INPUT_TYPE.
     * 
     * @param NOSSO_NUMERO
     */
    public void setNOSSO_NUMERO(long NOSSO_NUMERO) {
        this.NOSSO_NUMERO = NOSSO_NUMERO;
    }


    /**
     * Gets the LINHA_DIGITAVEL value for this IMPRIME_BOLETO_INPUT_TYPE.
     * 
     * @return LINHA_DIGITAVEL
     */
    public java.lang.String getLINHA_DIGITAVEL() {
        return LINHA_DIGITAVEL;
    }


    /**
     * Sets the LINHA_DIGITAVEL value for this IMPRIME_BOLETO_INPUT_TYPE.
     * 
     * @param LINHA_DIGITAVEL
     */
    public void setLINHA_DIGITAVEL(java.lang.String LINHA_DIGITAVEL) {
        this.LINHA_DIGITAVEL = LINHA_DIGITAVEL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IMPRIME_BOLETO_INPUT_TYPE)) return false;
        IMPRIME_BOLETO_INPUT_TYPE other = (IMPRIME_BOLETO_INPUT_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.CODIGO_BENEFICIARIO == other.getCODIGO_BENEFICIARIO() &&
            this.NOSSO_NUMERO == other.getNOSSO_NUMERO() &&
            ((this.LINHA_DIGITAVEL==null && other.getLINHA_DIGITAVEL()==null) || 
             (this.LINHA_DIGITAVEL!=null &&
              this.LINHA_DIGITAVEL.equals(other.getLINHA_DIGITAVEL())));
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
        _hashCode += new Long(getNOSSO_NUMERO()).hashCode();
        if (getLINHA_DIGITAVEL() != null) {
            _hashCode += getLINHA_DIGITAVEL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IMPRIME_BOLETO_INPUT_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "IMPRIME_BOLETO_INPUT_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODIGO_BENEFICIARIO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CODIGO_BENEFICIARIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOSSO_NUMERO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NOSSO_NUMERO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LINHA_DIGITAVEL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LINHA_DIGITAVEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
