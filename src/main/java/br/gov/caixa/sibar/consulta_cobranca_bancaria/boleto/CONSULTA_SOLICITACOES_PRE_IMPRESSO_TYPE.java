/**
 * CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE  implements java.io.Serializable {
    private int QUANTIDADE_PAGINAS;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SOLICITACAO_PRE_IMPRESSO_TYPE[] SOLICITACOES;

    public CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE() {
    }

    public CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE(
           int QUANTIDADE_PAGINAS,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SOLICITACAO_PRE_IMPRESSO_TYPE[] SOLICITACOES) {
           this.QUANTIDADE_PAGINAS = QUANTIDADE_PAGINAS;
           this.SOLICITACOES = SOLICITACOES;
    }


    /**
     * Gets the QUANTIDADE_PAGINAS value for this CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE.
     * 
     * @return QUANTIDADE_PAGINAS
     */
    public int getQUANTIDADE_PAGINAS() {
        return QUANTIDADE_PAGINAS;
    }


    /**
     * Sets the QUANTIDADE_PAGINAS value for this CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE.
     * 
     * @param QUANTIDADE_PAGINAS
     */
    public void setQUANTIDADE_PAGINAS(int QUANTIDADE_PAGINAS) {
        this.QUANTIDADE_PAGINAS = QUANTIDADE_PAGINAS;
    }


    /**
     * Gets the SOLICITACOES value for this CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE.
     * 
     * @return SOLICITACOES
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SOLICITACAO_PRE_IMPRESSO_TYPE[] getSOLICITACOES() {
        return SOLICITACOES;
    }


    /**
     * Sets the SOLICITACOES value for this CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE.
     * 
     * @param SOLICITACOES
     */
    public void setSOLICITACOES(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SOLICITACAO_PRE_IMPRESSO_TYPE[] SOLICITACOES) {
        this.SOLICITACOES = SOLICITACOES;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE)) return false;
        CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE other = (CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.QUANTIDADE_PAGINAS == other.getQUANTIDADE_PAGINAS() &&
            ((this.SOLICITACOES==null && other.getSOLICITACOES()==null) || 
             (this.SOLICITACOES!=null &&
              java.util.Arrays.equals(this.SOLICITACOES, other.getSOLICITACOES())));
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
        _hashCode += getQUANTIDADE_PAGINAS();
        if (getSOLICITACOES() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSOLICITACOES());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSOLICITACOES(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QUANTIDADE_PAGINAS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QUANTIDADE_PAGINAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SOLICITACOES");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SOLICITACOES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SOLICITACAO_PRE_IMPRESSO_TYPE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "SOLICITACAO"));
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
