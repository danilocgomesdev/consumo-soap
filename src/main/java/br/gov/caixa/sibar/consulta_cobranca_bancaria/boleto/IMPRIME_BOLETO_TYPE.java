/**
 * IMPRIME_BOLETO_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class IMPRIME_BOLETO_TYPE  implements java.io.Serializable {
    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CEDENTE_TYPE CEDENTE;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SACADO_TYPE SACADO;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SACADOR_TYPE SACADOR;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.TITULO_TYPE TITULO;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.VALOR_TYPE VALOR;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.MENSAGEM_TYPE[] MENSAGENS;

    public IMPRIME_BOLETO_TYPE() {
    }

    public IMPRIME_BOLETO_TYPE(
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CEDENTE_TYPE CEDENTE,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SACADO_TYPE SACADO,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SACADOR_TYPE SACADOR,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.TITULO_TYPE TITULO,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.VALOR_TYPE VALOR,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.MENSAGEM_TYPE[] MENSAGENS) {
           this.CEDENTE = CEDENTE;
           this.SACADO = SACADO;
           this.SACADOR = SACADOR;
           this.TITULO = TITULO;
           this.VALOR = VALOR;
           this.MENSAGENS = MENSAGENS;
    }


    /**
     * Gets the CEDENTE value for this IMPRIME_BOLETO_TYPE.
     * 
     * @return CEDENTE
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CEDENTE_TYPE getCEDENTE() {
        return CEDENTE;
    }


    /**
     * Sets the CEDENTE value for this IMPRIME_BOLETO_TYPE.
     * 
     * @param CEDENTE
     */
    public void setCEDENTE(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CEDENTE_TYPE CEDENTE) {
        this.CEDENTE = CEDENTE;
    }


    /**
     * Gets the SACADO value for this IMPRIME_BOLETO_TYPE.
     * 
     * @return SACADO
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SACADO_TYPE getSACADO() {
        return SACADO;
    }


    /**
     * Sets the SACADO value for this IMPRIME_BOLETO_TYPE.
     * 
     * @param SACADO
     */
    public void setSACADO(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SACADO_TYPE SACADO) {
        this.SACADO = SACADO;
    }


    /**
     * Gets the SACADOR value for this IMPRIME_BOLETO_TYPE.
     * 
     * @return SACADOR
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SACADOR_TYPE getSACADOR() {
        return SACADOR;
    }


    /**
     * Sets the SACADOR value for this IMPRIME_BOLETO_TYPE.
     * 
     * @param SACADOR
     */
    public void setSACADOR(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SACADOR_TYPE SACADOR) {
        this.SACADOR = SACADOR;
    }


    /**
     * Gets the TITULO value for this IMPRIME_BOLETO_TYPE.
     * 
     * @return TITULO
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.TITULO_TYPE getTITULO() {
        return TITULO;
    }


    /**
     * Sets the TITULO value for this IMPRIME_BOLETO_TYPE.
     * 
     * @param TITULO
     */
    public void setTITULO(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.TITULO_TYPE TITULO) {
        this.TITULO = TITULO;
    }


    /**
     * Gets the VALOR value for this IMPRIME_BOLETO_TYPE.
     * 
     * @return VALOR
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.VALOR_TYPE getVALOR() {
        return VALOR;
    }


    /**
     * Sets the VALOR value for this IMPRIME_BOLETO_TYPE.
     * 
     * @param VALOR
     */
    public void setVALOR(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.VALOR_TYPE VALOR) {
        this.VALOR = VALOR;
    }


    /**
     * Gets the MENSAGENS value for this IMPRIME_BOLETO_TYPE.
     * 
     * @return MENSAGENS
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.MENSAGEM_TYPE[] getMENSAGENS() {
        return MENSAGENS;
    }


    /**
     * Sets the MENSAGENS value for this IMPRIME_BOLETO_TYPE.
     * 
     * @param MENSAGENS
     */
    public void setMENSAGENS(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.MENSAGEM_TYPE[] MENSAGENS) {
        this.MENSAGENS = MENSAGENS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IMPRIME_BOLETO_TYPE)) return false;
        IMPRIME_BOLETO_TYPE other = (IMPRIME_BOLETO_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CEDENTE==null && other.getCEDENTE()==null) || 
             (this.CEDENTE!=null &&
              this.CEDENTE.equals(other.getCEDENTE()))) &&
            ((this.SACADO==null && other.getSACADO()==null) || 
             (this.SACADO!=null &&
              this.SACADO.equals(other.getSACADO()))) &&
            ((this.SACADOR==null && other.getSACADOR()==null) || 
             (this.SACADOR!=null &&
              this.SACADOR.equals(other.getSACADOR()))) &&
            ((this.TITULO==null && other.getTITULO()==null) || 
             (this.TITULO!=null &&
              this.TITULO.equals(other.getTITULO()))) &&
            ((this.VALOR==null && other.getVALOR()==null) || 
             (this.VALOR!=null &&
              this.VALOR.equals(other.getVALOR()))) &&
            ((this.MENSAGENS==null && other.getMENSAGENS()==null) || 
             (this.MENSAGENS!=null &&
              java.util.Arrays.equals(this.MENSAGENS, other.getMENSAGENS())));
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
        if (getCEDENTE() != null) {
            _hashCode += getCEDENTE().hashCode();
        }
        if (getSACADO() != null) {
            _hashCode += getSACADO().hashCode();
        }
        if (getSACADOR() != null) {
            _hashCode += getSACADOR().hashCode();
        }
        if (getTITULO() != null) {
            _hashCode += getTITULO().hashCode();
        }
        if (getVALOR() != null) {
            _hashCode += getVALOR().hashCode();
        }
        if (getMENSAGENS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMENSAGENS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMENSAGENS(), i);
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
        new org.apache.axis.description.TypeDesc(IMPRIME_BOLETO_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "IMPRIME_BOLETO_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CEDENTE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CEDENTE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CEDENTE_TYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SACADO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SACADO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SACADO_TYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SACADOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SACADOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SACADOR_TYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TITULO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TITULO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "TITULO_TYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "VALOR_TYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MENSAGENS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MENSAGENS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "MENSAGEM_TYPE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "MENSAGEM"));
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
