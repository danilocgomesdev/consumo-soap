/**
 * DESCRICOES_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class DESCRICOES_TYPE  implements java.io.Serializable {
    private java.lang.String REGISTRO;

    private java.lang.String OBTER_ENVIO;

    private java.lang.String ENVIO;

    private java.lang.String OBTER_VALOR;

    private java.lang.String PROTESTO;

    private java.lang.String ESPECIE;

    private java.lang.String ACEITE;

    private java.lang.String ENDOSSO;

    public DESCRICOES_TYPE() {
    }

    public DESCRICOES_TYPE(
           java.lang.String REGISTRO,
           java.lang.String OBTER_ENVIO,
           java.lang.String ENVIO,
           java.lang.String OBTER_VALOR,
           java.lang.String PROTESTO,
           java.lang.String ESPECIE,
           java.lang.String ACEITE,
           java.lang.String ENDOSSO) {
           this.REGISTRO = REGISTRO;
           this.OBTER_ENVIO = OBTER_ENVIO;
           this.ENVIO = ENVIO;
           this.OBTER_VALOR = OBTER_VALOR;
           this.PROTESTO = PROTESTO;
           this.ESPECIE = ESPECIE;
           this.ACEITE = ACEITE;
           this.ENDOSSO = ENDOSSO;
    }


    /**
     * Gets the REGISTRO value for this DESCRICOES_TYPE.
     * 
     * @return REGISTRO
     */
    public java.lang.String getREGISTRO() {
        return REGISTRO;
    }


    /**
     * Sets the REGISTRO value for this DESCRICOES_TYPE.
     * 
     * @param REGISTRO
     */
    public void setREGISTRO(java.lang.String REGISTRO) {
        this.REGISTRO = REGISTRO;
    }


    /**
     * Gets the OBTER_ENVIO value for this DESCRICOES_TYPE.
     * 
     * @return OBTER_ENVIO
     */
    public java.lang.String getOBTER_ENVIO() {
        return OBTER_ENVIO;
    }


    /**
     * Sets the OBTER_ENVIO value for this DESCRICOES_TYPE.
     * 
     * @param OBTER_ENVIO
     */
    public void setOBTER_ENVIO(java.lang.String OBTER_ENVIO) {
        this.OBTER_ENVIO = OBTER_ENVIO;
    }


    /**
     * Gets the ENVIO value for this DESCRICOES_TYPE.
     * 
     * @return ENVIO
     */
    public java.lang.String getENVIO() {
        return ENVIO;
    }


    /**
     * Sets the ENVIO value for this DESCRICOES_TYPE.
     * 
     * @param ENVIO
     */
    public void setENVIO(java.lang.String ENVIO) {
        this.ENVIO = ENVIO;
    }


    /**
     * Gets the OBTER_VALOR value for this DESCRICOES_TYPE.
     * 
     * @return OBTER_VALOR
     */
    public java.lang.String getOBTER_VALOR() {
        return OBTER_VALOR;
    }


    /**
     * Sets the OBTER_VALOR value for this DESCRICOES_TYPE.
     * 
     * @param OBTER_VALOR
     */
    public void setOBTER_VALOR(java.lang.String OBTER_VALOR) {
        this.OBTER_VALOR = OBTER_VALOR;
    }


    /**
     * Gets the PROTESTO value for this DESCRICOES_TYPE.
     * 
     * @return PROTESTO
     */
    public java.lang.String getPROTESTO() {
        return PROTESTO;
    }


    /**
     * Sets the PROTESTO value for this DESCRICOES_TYPE.
     * 
     * @param PROTESTO
     */
    public void setPROTESTO(java.lang.String PROTESTO) {
        this.PROTESTO = PROTESTO;
    }


    /**
     * Gets the ESPECIE value for this DESCRICOES_TYPE.
     * 
     * @return ESPECIE
     */
    public java.lang.String getESPECIE() {
        return ESPECIE;
    }


    /**
     * Sets the ESPECIE value for this DESCRICOES_TYPE.
     * 
     * @param ESPECIE
     */
    public void setESPECIE(java.lang.String ESPECIE) {
        this.ESPECIE = ESPECIE;
    }


    /**
     * Gets the ACEITE value for this DESCRICOES_TYPE.
     * 
     * @return ACEITE
     */
    public java.lang.String getACEITE() {
        return ACEITE;
    }


    /**
     * Sets the ACEITE value for this DESCRICOES_TYPE.
     * 
     * @param ACEITE
     */
    public void setACEITE(java.lang.String ACEITE) {
        this.ACEITE = ACEITE;
    }


    /**
     * Gets the ENDOSSO value for this DESCRICOES_TYPE.
     * 
     * @return ENDOSSO
     */
    public java.lang.String getENDOSSO() {
        return ENDOSSO;
    }


    /**
     * Sets the ENDOSSO value for this DESCRICOES_TYPE.
     * 
     * @param ENDOSSO
     */
    public void setENDOSSO(java.lang.String ENDOSSO) {
        this.ENDOSSO = ENDOSSO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DESCRICOES_TYPE)) return false;
        DESCRICOES_TYPE other = (DESCRICOES_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.REGISTRO==null && other.getREGISTRO()==null) || 
             (this.REGISTRO!=null &&
              this.REGISTRO.equals(other.getREGISTRO()))) &&
            ((this.OBTER_ENVIO==null && other.getOBTER_ENVIO()==null) || 
             (this.OBTER_ENVIO!=null &&
              this.OBTER_ENVIO.equals(other.getOBTER_ENVIO()))) &&
            ((this.ENVIO==null && other.getENVIO()==null) || 
             (this.ENVIO!=null &&
              this.ENVIO.equals(other.getENVIO()))) &&
            ((this.OBTER_VALOR==null && other.getOBTER_VALOR()==null) || 
             (this.OBTER_VALOR!=null &&
              this.OBTER_VALOR.equals(other.getOBTER_VALOR()))) &&
            ((this.PROTESTO==null && other.getPROTESTO()==null) || 
             (this.PROTESTO!=null &&
              this.PROTESTO.equals(other.getPROTESTO()))) &&
            ((this.ESPECIE==null && other.getESPECIE()==null) || 
             (this.ESPECIE!=null &&
              this.ESPECIE.equals(other.getESPECIE()))) &&
            ((this.ACEITE==null && other.getACEITE()==null) || 
             (this.ACEITE!=null &&
              this.ACEITE.equals(other.getACEITE()))) &&
            ((this.ENDOSSO==null && other.getENDOSSO()==null) || 
             (this.ENDOSSO!=null &&
              this.ENDOSSO.equals(other.getENDOSSO())));
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
        if (getREGISTRO() != null) {
            _hashCode += getREGISTRO().hashCode();
        }
        if (getOBTER_ENVIO() != null) {
            _hashCode += getOBTER_ENVIO().hashCode();
        }
        if (getENVIO() != null) {
            _hashCode += getENVIO().hashCode();
        }
        if (getOBTER_VALOR() != null) {
            _hashCode += getOBTER_VALOR().hashCode();
        }
        if (getPROTESTO() != null) {
            _hashCode += getPROTESTO().hashCode();
        }
        if (getESPECIE() != null) {
            _hashCode += getESPECIE().hashCode();
        }
        if (getACEITE() != null) {
            _hashCode += getACEITE().hashCode();
        }
        if (getENDOSSO() != null) {
            _hashCode += getENDOSSO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DESCRICOES_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "DESCRICOES_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGISTRO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "REGISTRO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBTER_ENVIO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OBTER_ENVIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENVIO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ENVIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBTER_VALOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OBTER_VALOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PROTESTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PROTESTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESPECIE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ESPECIE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACEITE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ACEITE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENDOSSO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ENDOSSO"));
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
