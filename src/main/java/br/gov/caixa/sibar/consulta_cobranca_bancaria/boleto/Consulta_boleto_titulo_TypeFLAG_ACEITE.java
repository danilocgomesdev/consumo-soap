/**
 * Consulta_boleto_titulo_TypeFLAG_ACEITE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

import java.util.Objects;

public class Consulta_boleto_titulo_TypeFLAG_ACEITE implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    public Consulta_boleto_titulo_TypeFLAG_ACEITE() {
    }

    // Constructor
    protected Consulta_boleto_titulo_TypeFLAG_ACEITE(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _S = "S";
    public static final java.lang.String _N = "N";
    public static final Consulta_boleto_titulo_TypeFLAG_ACEITE S = new Consulta_boleto_titulo_TypeFLAG_ACEITE(_S);
    public static final Consulta_boleto_titulo_TypeFLAG_ACEITE N = new Consulta_boleto_titulo_TypeFLAG_ACEITE(_N);
    public java.lang.String getValue() { return _value_;}
    public static Consulta_boleto_titulo_TypeFLAG_ACEITE fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Consulta_boleto_titulo_TypeFLAG_ACEITE enumeration = (Consulta_boleto_titulo_TypeFLAG_ACEITE)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Consulta_boleto_titulo_TypeFLAG_ACEITE fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }

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
        new org.apache.axis.description.TypeDesc(Consulta_boleto_titulo_TypeFLAG_ACEITE.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_titulo_Type>FLAG_ACEITE"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consulta_boleto_titulo_TypeFLAG_ACEITE that = (Consulta_boleto_titulo_TypeFLAG_ACEITE) o;
        return Objects.equals(_value_, that._value_);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_value_);
    }
}
