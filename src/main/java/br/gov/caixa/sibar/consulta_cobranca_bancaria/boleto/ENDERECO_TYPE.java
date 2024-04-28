/**
 * ENDERECO_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class ENDERECO_TYPE  implements java.io.Serializable {
    private java.lang.String LOGRADOURO;

    private java.lang.String NUMERO;

    private java.lang.String COMPLEMENTO;

    private java.lang.String BAIRRO;

    private java.lang.String MUNICIPIO;

    private java.lang.String UF;

    private int CEP;

    public ENDERECO_TYPE() {
    }

    public ENDERECO_TYPE(
           java.lang.String LOGRADOURO,
           java.lang.String NUMERO,
           java.lang.String COMPLEMENTO,
           java.lang.String BAIRRO,
           java.lang.String MUNICIPIO,
           java.lang.String UF,
           int CEP) {
           this.LOGRADOURO = LOGRADOURO;
           this.NUMERO = NUMERO;
           this.COMPLEMENTO = COMPLEMENTO;
           this.BAIRRO = BAIRRO;
           this.MUNICIPIO = MUNICIPIO;
           this.UF = UF;
           this.CEP = CEP;
    }


    /**
     * Gets the LOGRADOURO value for this ENDERECO_TYPE.
     * 
     * @return LOGRADOURO
     */
    public java.lang.String getLOGRADOURO() {
        return LOGRADOURO;
    }


    /**
     * Sets the LOGRADOURO value for this ENDERECO_TYPE.
     * 
     * @param LOGRADOURO
     */
    public void setLOGRADOURO(java.lang.String LOGRADOURO) {
        this.LOGRADOURO = LOGRADOURO;
    }


    /**
     * Gets the NUMERO value for this ENDERECO_TYPE.
     * 
     * @return NUMERO
     */
    public java.lang.String getNUMERO() {
        return NUMERO;
    }


    /**
     * Sets the NUMERO value for this ENDERECO_TYPE.
     * 
     * @param NUMERO
     */
    public void setNUMERO(java.lang.String NUMERO) {
        this.NUMERO = NUMERO;
    }


    /**
     * Gets the COMPLEMENTO value for this ENDERECO_TYPE.
     * 
     * @return COMPLEMENTO
     */
    public java.lang.String getCOMPLEMENTO() {
        return COMPLEMENTO;
    }


    /**
     * Sets the COMPLEMENTO value for this ENDERECO_TYPE.
     * 
     * @param COMPLEMENTO
     */
    public void setCOMPLEMENTO(java.lang.String COMPLEMENTO) {
        this.COMPLEMENTO = COMPLEMENTO;
    }


    /**
     * Gets the BAIRRO value for this ENDERECO_TYPE.
     * 
     * @return BAIRRO
     */
    public java.lang.String getBAIRRO() {
        return BAIRRO;
    }


    /**
     * Sets the BAIRRO value for this ENDERECO_TYPE.
     * 
     * @param BAIRRO
     */
    public void setBAIRRO(java.lang.String BAIRRO) {
        this.BAIRRO = BAIRRO;
    }


    /**
     * Gets the MUNICIPIO value for this ENDERECO_TYPE.
     * 
     * @return MUNICIPIO
     */
    public java.lang.String getMUNICIPIO() {
        return MUNICIPIO;
    }


    /**
     * Sets the MUNICIPIO value for this ENDERECO_TYPE.
     * 
     * @param MUNICIPIO
     */
    public void setMUNICIPIO(java.lang.String MUNICIPIO) {
        this.MUNICIPIO = MUNICIPIO;
    }


    /**
     * Gets the UF value for this ENDERECO_TYPE.
     * 
     * @return UF
     */
    public java.lang.String getUF() {
        return UF;
    }


    /**
     * Sets the UF value for this ENDERECO_TYPE.
     * 
     * @param UF
     */
    public void setUF(java.lang.String UF) {
        this.UF = UF;
    }


    /**
     * Gets the CEP value for this ENDERECO_TYPE.
     * 
     * @return CEP
     */
    public int getCEP() {
        return CEP;
    }


    /**
     * Sets the CEP value for this ENDERECO_TYPE.
     * 
     * @param CEP
     */
    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ENDERECO_TYPE)) return false;
        ENDERECO_TYPE other = (ENDERECO_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.LOGRADOURO==null && other.getLOGRADOURO()==null) || 
             (this.LOGRADOURO!=null &&
              this.LOGRADOURO.equals(other.getLOGRADOURO()))) &&
            ((this.NUMERO==null && other.getNUMERO()==null) || 
             (this.NUMERO!=null &&
              this.NUMERO.equals(other.getNUMERO()))) &&
            ((this.COMPLEMENTO==null && other.getCOMPLEMENTO()==null) || 
             (this.COMPLEMENTO!=null &&
              this.COMPLEMENTO.equals(other.getCOMPLEMENTO()))) &&
            ((this.BAIRRO==null && other.getBAIRRO()==null) || 
             (this.BAIRRO!=null &&
              this.BAIRRO.equals(other.getBAIRRO()))) &&
            ((this.MUNICIPIO==null && other.getMUNICIPIO()==null) || 
             (this.MUNICIPIO!=null &&
              this.MUNICIPIO.equals(other.getMUNICIPIO()))) &&
            ((this.UF==null && other.getUF()==null) || 
             (this.UF!=null &&
              this.UF.equals(other.getUF()))) &&
            this.CEP == other.getCEP();
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
        if (getLOGRADOURO() != null) {
            _hashCode += getLOGRADOURO().hashCode();
        }
        if (getNUMERO() != null) {
            _hashCode += getNUMERO().hashCode();
        }
        if (getCOMPLEMENTO() != null) {
            _hashCode += getCOMPLEMENTO().hashCode();
        }
        if (getBAIRRO() != null) {
            _hashCode += getBAIRRO().hashCode();
        }
        if (getMUNICIPIO() != null) {
            _hashCode += getMUNICIPIO().hashCode();
        }
        if (getUF() != null) {
            _hashCode += getUF().hashCode();
        }
        _hashCode += getCEP();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ENDERECO_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "ENDERECO_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOGRADOURO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LOGRADOURO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NUMERO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NUMERO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMPLEMENTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COMPLEMENTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BAIRRO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BAIRRO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MUNICIPIO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MUNICIPIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CEP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CEP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
