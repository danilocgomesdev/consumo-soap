/**
 * Pagamento_TypeTIPO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica;

public class Pagamento_TypeTIPO implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Pagamento_TypeTIPO(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ACEITA_QUALQUER_VALOR = "ACEITA_QUALQUER_VALOR";
    public static final java.lang.String _ACEITA_VALORES_ENTRE_MINIMO_MAXIMO = "ACEITA_VALORES_ENTRE_MINIMO_MAXIMO";
    public static final java.lang.String _NAO_ACEITA_VALOR_DIVERGENTE = "NAO_ACEITA_VALOR_DIVERGENTE";
    public static final java.lang.String _SOMENTE_VALOR_MINIMO = "SOMENTE_VALOR_MINIMO";
    public static final Pagamento_TypeTIPO ACEITA_QUALQUER_VALOR = new Pagamento_TypeTIPO(_ACEITA_QUALQUER_VALOR);
    public static final Pagamento_TypeTIPO ACEITA_VALORES_ENTRE_MINIMO_MAXIMO = new Pagamento_TypeTIPO(_ACEITA_VALORES_ENTRE_MINIMO_MAXIMO);
    public static final Pagamento_TypeTIPO NAO_ACEITA_VALOR_DIVERGENTE = new Pagamento_TypeTIPO(_NAO_ACEITA_VALOR_DIVERGENTE);
    public static final Pagamento_TypeTIPO SOMENTE_VALOR_MINIMO = new Pagamento_TypeTIPO(_SOMENTE_VALOR_MINIMO);
    public java.lang.String getValue() { return _value_;}
    public static Pagamento_TypeTIPO fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Pagamento_TypeTIPO enumeration = (Pagamento_TypeTIPO)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Pagamento_TypeTIPO fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Pagamento_TypeTIPO.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/manutencao_cobranca_bancaria/boleto/externo", ">pagamento_Type>TIPO"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
