/**
 * Servico_entrada_negocial_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica;

public class Servico_entrada_negocial_Type  extends br.gov.caixa.sibar.SERVICO_ENTRADA_TYPE  implements java.io.Serializable {
    private br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Dados_entrada_Type DADOS;

    public Servico_entrada_negocial_Type() {
    }

    public Servico_entrada_negocial_Type(
           br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE HEADER,
           br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Dados_entrada_Type DADOS) {
        super(
            HEADER);
        this.DADOS = DADOS;
    }


    /**
     * Gets the DADOS value for this Servico_entrada_negocial_Type.
     * 
     * @return DADOS
     */
    public br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Dados_entrada_Type getDADOS() {
        return DADOS;
    }


    /**
     * Sets the DADOS value for this Servico_entrada_negocial_Type.
     * 
     * @param DADOS
     */
    public void setDADOS(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Dados_entrada_Type DADOS) {
        this.DADOS = DADOS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Servico_entrada_negocial_Type)) return false;
        Servico_entrada_negocial_Type other = (Servico_entrada_negocial_Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.DADOS==null && other.getDADOS()==null) || 
             (this.DADOS!=null &&
              this.DADOS.equals(other.getDADOS())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDADOS() != null) {
            _hashCode += getDADOS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Servico_entrada_negocial_Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "servico_entrada_negocial_Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DADOS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DADOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", "dados_entrada_Type"));
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
