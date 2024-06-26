/**
 * Pagamento_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica;

public class Pagamento_Type  implements java.io.Serializable {
    private short QUANTIDADE_PERMITIDA;

    private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Pagamento_TypeTIPO TIPO;

    private java.math.BigDecimal VALOR_MINIMO;

    private java.math.BigDecimal VALOR_MAXIMO;

    public Pagamento_Type() {
    }

    public Pagamento_Type(
           short QUANTIDADE_PERMITIDA,
           br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Pagamento_TypeTIPO TIPO,
           java.math.BigDecimal VALOR_MINIMO,
           java.math.BigDecimal VALOR_MAXIMO) {
           this.QUANTIDADE_PERMITIDA = QUANTIDADE_PERMITIDA;
           this.TIPO = TIPO;
           this.VALOR_MINIMO = VALOR_MINIMO;
           this.VALOR_MAXIMO = VALOR_MAXIMO;
    }


    /**
     * Gets the QUANTIDADE_PERMITIDA value for this Pagamento_Type.
     * 
     * @return QUANTIDADE_PERMITIDA
     */
    public short getQUANTIDADE_PERMITIDA() {
        return QUANTIDADE_PERMITIDA;
    }


    /**
     * Sets the QUANTIDADE_PERMITIDA value for this Pagamento_Type.
     * 
     * @param QUANTIDADE_PERMITIDA
     */
    public void setQUANTIDADE_PERMITIDA(short QUANTIDADE_PERMITIDA) {
        this.QUANTIDADE_PERMITIDA = QUANTIDADE_PERMITIDA;
    }


    /**
     * Gets the TIPO value for this Pagamento_Type.
     * 
     * @return TIPO
     */
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Pagamento_TypeTIPO getTIPO() {
        return TIPO;
    }


    /**
     * Sets the TIPO value for this Pagamento_Type.
     * 
     * @param TIPO
     */
    public void setTIPO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Pagamento_TypeTIPO TIPO) {
        this.TIPO = TIPO;
    }


    /**
     * Gets the VALOR_MINIMO value for this Pagamento_Type.
     * 
     * @return VALOR_MINIMO
     */
    public java.math.BigDecimal getVALOR_MINIMO() {
        return VALOR_MINIMO;
    }


    /**
     * Sets the VALOR_MINIMO value for this Pagamento_Type.
     * 
     * @param VALOR_MINIMO
     */
    public void setVALOR_MINIMO(java.math.BigDecimal VALOR_MINIMO) {
        this.VALOR_MINIMO = VALOR_MINIMO;
    }


    /**
     * Gets the VALOR_MAXIMO value for this Pagamento_Type.
     * 
     * @return VALOR_MAXIMO
     */
    public java.math.BigDecimal getVALOR_MAXIMO() {
        return VALOR_MAXIMO;
    }


    /**
     * Sets the VALOR_MAXIMO value for this Pagamento_Type.
     * 
     * @param VALOR_MAXIMO
     */
    public void setVALOR_MAXIMO(java.math.BigDecimal VALOR_MAXIMO) {
        this.VALOR_MAXIMO = VALOR_MAXIMO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pagamento_Type)) return false;
        Pagamento_Type other = (Pagamento_Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.QUANTIDADE_PERMITIDA == other.getQUANTIDADE_PERMITIDA() &&
            ((this.TIPO==null && other.getTIPO()==null) || 
             (this.TIPO!=null &&
              this.TIPO.equals(other.getTIPO()))) &&
            ((this.VALOR_MINIMO==null && other.getVALOR_MINIMO()==null) || 
             (this.VALOR_MINIMO!=null &&
              this.VALOR_MINIMO.equals(other.getVALOR_MINIMO()))) &&
            ((this.VALOR_MAXIMO==null && other.getVALOR_MAXIMO()==null) || 
             (this.VALOR_MAXIMO!=null &&
              this.VALOR_MAXIMO.equals(other.getVALOR_MAXIMO())));
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
        _hashCode += getQUANTIDADE_PERMITIDA();
        if (getTIPO() != null) {
            _hashCode += getTIPO().hashCode();
        }
        if (getVALOR_MINIMO() != null) {
            _hashCode += getVALOR_MINIMO().hashCode();
        }
        if (getVALOR_MAXIMO() != null) {
            _hashCode += getVALOR_MAXIMO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pagamento_Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "pagamento_Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QUANTIDADE_PERMITIDA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QUANTIDADE_PERMITIDA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIPO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TIPO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", ">pagamento_Type>TIPO"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALOR_MINIMO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALOR_MINIMO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALOR_MAXIMO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALOR_MAXIMO"));
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
