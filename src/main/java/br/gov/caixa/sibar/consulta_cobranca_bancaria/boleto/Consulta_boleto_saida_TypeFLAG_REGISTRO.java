/**
 * Consulta_boleto_saida_TypeFLAG_REGISTRO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class Consulta_boleto_saida_TypeFLAG_REGISTRO implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    public Consulta_boleto_saida_TypeFLAG_REGISTRO() {
    }

    // Constructor
    protected Consulta_boleto_saida_TypeFLAG_REGISTRO(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _S = "S";
    public static final java.lang.String _N = "N";
    public static final Consulta_boleto_saida_TypeFLAG_REGISTRO S = new Consulta_boleto_saida_TypeFLAG_REGISTRO(_S);
    public static final Consulta_boleto_saida_TypeFLAG_REGISTRO N = new Consulta_boleto_saida_TypeFLAG_REGISTRO(_N);
    public java.lang.String getValue() { return _value_;}
    public static Consulta_boleto_saida_TypeFLAG_REGISTRO fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Consulta_boleto_saida_TypeFLAG_REGISTRO enumeration = (Consulta_boleto_saida_TypeFLAG_REGISTRO)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Consulta_boleto_saida_TypeFLAG_REGISTRO fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Consulta_boleto_saida_TypeFLAG_REGISTRO.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_saida_Type>FLAG_REGISTRO"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
