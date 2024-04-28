/**
 * SACADO_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class SACADO_TYPE  implements java.io.Serializable {
    private java.lang.Long CPF;

    private java.lang.Long CNPJ;

    private java.lang.String NOME;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.ENDERECO_TYPE ENDERECO;

    public SACADO_TYPE() {
    }

    public SACADO_TYPE(
           java.lang.Long CPF,
           java.lang.Long CNPJ,
           java.lang.String NOME,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.ENDERECO_TYPE ENDERECO) {
           this.CPF = CPF;
           this.CNPJ = CNPJ;
           this.NOME = NOME;
           this.ENDERECO = ENDERECO;
    }


    /**
     * Gets the CPF value for this SACADO_TYPE.
     * 
     * @return CPF
     */
    public java.lang.Long getCPF() {
        return CPF;
    }


    /**
     * Sets the CPF value for this SACADO_TYPE.
     * 
     * @param CPF
     */
    public void setCPF(java.lang.Long CPF) {
        this.CPF = CPF;
    }


    /**
     * Gets the CNPJ value for this SACADO_TYPE.
     * 
     * @return CNPJ
     */
    public java.lang.Long getCNPJ() {
        return CNPJ;
    }


    /**
     * Sets the CNPJ value for this SACADO_TYPE.
     * 
     * @param CNPJ
     */
    public void setCNPJ(java.lang.Long CNPJ) {
        this.CNPJ = CNPJ;
    }


    /**
     * Gets the NOME value for this SACADO_TYPE.
     * 
     * @return NOME
     */
    public java.lang.String getNOME() {
        return NOME;
    }


    /**
     * Sets the NOME value for this SACADO_TYPE.
     * 
     * @param NOME
     */
    public void setNOME(java.lang.String NOME) {
        this.NOME = NOME;
    }


    /**
     * Gets the ENDERECO value for this SACADO_TYPE.
     * 
     * @return ENDERECO
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.ENDERECO_TYPE getENDERECO() {
        return ENDERECO;
    }


    /**
     * Sets the ENDERECO value for this SACADO_TYPE.
     * 
     * @param ENDERECO
     */
    public void setENDERECO(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.ENDERECO_TYPE ENDERECO) {
        this.ENDERECO = ENDERECO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SACADO_TYPE)) return false;
        SACADO_TYPE other = (SACADO_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CPF==null && other.getCPF()==null) || 
             (this.CPF!=null &&
              this.CPF.equals(other.getCPF()))) &&
            ((this.CNPJ==null && other.getCNPJ()==null) || 
             (this.CNPJ!=null &&
              this.CNPJ.equals(other.getCNPJ()))) &&
            ((this.NOME==null && other.getNOME()==null) || 
             (this.NOME!=null &&
              this.NOME.equals(other.getNOME()))) &&
            ((this.ENDERECO==null && other.getENDERECO()==null) || 
             (this.ENDERECO!=null &&
              this.ENDERECO.equals(other.getENDERECO())));
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
        if (getCPF() != null) {
            _hashCode += getCPF().hashCode();
        }
        if (getCNPJ() != null) {
            _hashCode += getCNPJ().hashCode();
        }
        if (getNOME() != null) {
            _hashCode += getNOME().hashCode();
        }
        if (getENDERECO() != null) {
            _hashCode += getENDERECO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SACADO_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SACADO_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CPF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CNPJ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CNPJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NOME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENDERECO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ENDERECO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "ENDERECO_TYPE"));
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
