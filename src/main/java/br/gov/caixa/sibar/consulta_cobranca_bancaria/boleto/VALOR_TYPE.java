/**
 * VALOR_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class VALOR_TYPE  implements java.io.Serializable {
    private java.math.BigDecimal DESCONTO_ABATIMENTO;

    private java.math.BigDecimal MULTA_JUROS;

    private java.math.BigDecimal JUROS;

    private java.math.BigDecimal IOF;

    private java.math.BigDecimal MULTA;

    private java.math.BigDecimal DESCONTO;

    private java.math.BigDecimal ABATIMENTO;

    private java.math.BigDecimal CALCULADO;

    private java.math.BigDecimal COBRADO;

    public VALOR_TYPE() {
    }

    public VALOR_TYPE(
           java.math.BigDecimal DESCONTO_ABATIMENTO,
           java.math.BigDecimal MULTA_JUROS,
           java.math.BigDecimal JUROS,
           java.math.BigDecimal IOF,
           java.math.BigDecimal MULTA,
           java.math.BigDecimal DESCONTO,
           java.math.BigDecimal ABATIMENTO,
           java.math.BigDecimal CALCULADO,
           java.math.BigDecimal COBRADO) {
           this.DESCONTO_ABATIMENTO = DESCONTO_ABATIMENTO;
           this.MULTA_JUROS = MULTA_JUROS;
           this.JUROS = JUROS;
           this.IOF = IOF;
           this.MULTA = MULTA;
           this.DESCONTO = DESCONTO;
           this.ABATIMENTO = ABATIMENTO;
           this.CALCULADO = CALCULADO;
           this.COBRADO = COBRADO;
    }


    /**
     * Gets the DESCONTO_ABATIMENTO value for this VALOR_TYPE.
     * 
     * @return DESCONTO_ABATIMENTO
     */
    public java.math.BigDecimal getDESCONTO_ABATIMENTO() {
        return DESCONTO_ABATIMENTO;
    }


    /**
     * Sets the DESCONTO_ABATIMENTO value for this VALOR_TYPE.
     * 
     * @param DESCONTO_ABATIMENTO
     */
    public void setDESCONTO_ABATIMENTO(java.math.BigDecimal DESCONTO_ABATIMENTO) {
        this.DESCONTO_ABATIMENTO = DESCONTO_ABATIMENTO;
    }


    /**
     * Gets the MULTA_JUROS value for this VALOR_TYPE.
     * 
     * @return MULTA_JUROS
     */
    public java.math.BigDecimal getMULTA_JUROS() {
        return MULTA_JUROS;
    }


    /**
     * Sets the MULTA_JUROS value for this VALOR_TYPE.
     * 
     * @param MULTA_JUROS
     */
    public void setMULTA_JUROS(java.math.BigDecimal MULTA_JUROS) {
        this.MULTA_JUROS = MULTA_JUROS;
    }


    /**
     * Gets the JUROS value for this VALOR_TYPE.
     * 
     * @return JUROS
     */
    public java.math.BigDecimal getJUROS() {
        return JUROS;
    }


    /**
     * Sets the JUROS value for this VALOR_TYPE.
     * 
     * @param JUROS
     */
    public void setJUROS(java.math.BigDecimal JUROS) {
        this.JUROS = JUROS;
    }


    /**
     * Gets the IOF value for this VALOR_TYPE.
     * 
     * @return IOF
     */
    public java.math.BigDecimal getIOF() {
        return IOF;
    }


    /**
     * Sets the IOF value for this VALOR_TYPE.
     * 
     * @param IOF
     */
    public void setIOF(java.math.BigDecimal IOF) {
        this.IOF = IOF;
    }


    /**
     * Gets the MULTA value for this VALOR_TYPE.
     * 
     * @return MULTA
     */
    public java.math.BigDecimal getMULTA() {
        return MULTA;
    }


    /**
     * Sets the MULTA value for this VALOR_TYPE.
     * 
     * @param MULTA
     */
    public void setMULTA(java.math.BigDecimal MULTA) {
        this.MULTA = MULTA;
    }


    /**
     * Gets the DESCONTO value for this VALOR_TYPE.
     * 
     * @return DESCONTO
     */
    public java.math.BigDecimal getDESCONTO() {
        return DESCONTO;
    }


    /**
     * Sets the DESCONTO value for this VALOR_TYPE.
     * 
     * @param DESCONTO
     */
    public void setDESCONTO(java.math.BigDecimal DESCONTO) {
        this.DESCONTO = DESCONTO;
    }


    /**
     * Gets the ABATIMENTO value for this VALOR_TYPE.
     * 
     * @return ABATIMENTO
     */
    public java.math.BigDecimal getABATIMENTO() {
        return ABATIMENTO;
    }


    /**
     * Sets the ABATIMENTO value for this VALOR_TYPE.
     * 
     * @param ABATIMENTO
     */
    public void setABATIMENTO(java.math.BigDecimal ABATIMENTO) {
        this.ABATIMENTO = ABATIMENTO;
    }


    /**
     * Gets the CALCULADO value for this VALOR_TYPE.
     * 
     * @return CALCULADO
     */
    public java.math.BigDecimal getCALCULADO() {
        return CALCULADO;
    }


    /**
     * Sets the CALCULADO value for this VALOR_TYPE.
     * 
     * @param CALCULADO
     */
    public void setCALCULADO(java.math.BigDecimal CALCULADO) {
        this.CALCULADO = CALCULADO;
    }


    /**
     * Gets the COBRADO value for this VALOR_TYPE.
     * 
     * @return COBRADO
     */
    public java.math.BigDecimal getCOBRADO() {
        return COBRADO;
    }


    /**
     * Sets the COBRADO value for this VALOR_TYPE.
     * 
     * @param COBRADO
     */
    public void setCOBRADO(java.math.BigDecimal COBRADO) {
        this.COBRADO = COBRADO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VALOR_TYPE)) return false;
        VALOR_TYPE other = (VALOR_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DESCONTO_ABATIMENTO==null && other.getDESCONTO_ABATIMENTO()==null) || 
             (this.DESCONTO_ABATIMENTO!=null &&
              this.DESCONTO_ABATIMENTO.equals(other.getDESCONTO_ABATIMENTO()))) &&
            ((this.MULTA_JUROS==null && other.getMULTA_JUROS()==null) || 
             (this.MULTA_JUROS!=null &&
              this.MULTA_JUROS.equals(other.getMULTA_JUROS()))) &&
            ((this.JUROS==null && other.getJUROS()==null) || 
             (this.JUROS!=null &&
              this.JUROS.equals(other.getJUROS()))) &&
            ((this.IOF==null && other.getIOF()==null) || 
             (this.IOF!=null &&
              this.IOF.equals(other.getIOF()))) &&
            ((this.MULTA==null && other.getMULTA()==null) || 
             (this.MULTA!=null &&
              this.MULTA.equals(other.getMULTA()))) &&
            ((this.DESCONTO==null && other.getDESCONTO()==null) || 
             (this.DESCONTO!=null &&
              this.DESCONTO.equals(other.getDESCONTO()))) &&
            ((this.ABATIMENTO==null && other.getABATIMENTO()==null) || 
             (this.ABATIMENTO!=null &&
              this.ABATIMENTO.equals(other.getABATIMENTO()))) &&
            ((this.CALCULADO==null && other.getCALCULADO()==null) || 
             (this.CALCULADO!=null &&
              this.CALCULADO.equals(other.getCALCULADO()))) &&
            ((this.COBRADO==null && other.getCOBRADO()==null) || 
             (this.COBRADO!=null &&
              this.COBRADO.equals(other.getCOBRADO())));
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
        if (getDESCONTO_ABATIMENTO() != null) {
            _hashCode += getDESCONTO_ABATIMENTO().hashCode();
        }
        if (getMULTA_JUROS() != null) {
            _hashCode += getMULTA_JUROS().hashCode();
        }
        if (getJUROS() != null) {
            _hashCode += getJUROS().hashCode();
        }
        if (getIOF() != null) {
            _hashCode += getIOF().hashCode();
        }
        if (getMULTA() != null) {
            _hashCode += getMULTA().hashCode();
        }
        if (getDESCONTO() != null) {
            _hashCode += getDESCONTO().hashCode();
        }
        if (getABATIMENTO() != null) {
            _hashCode += getABATIMENTO().hashCode();
        }
        if (getCALCULADO() != null) {
            _hashCode += getCALCULADO().hashCode();
        }
        if (getCOBRADO() != null) {
            _hashCode += getCOBRADO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VALOR_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "VALOR_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCONTO_ABATIMENTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DESCONTO_ABATIMENTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MULTA_JUROS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MULTA_JUROS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JUROS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JUROS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IOF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IOF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MULTA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MULTA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCONTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DESCONTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ABATIMENTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ABATIMENTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALCULADO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CALCULADO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COBRADO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COBRADO"));
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
