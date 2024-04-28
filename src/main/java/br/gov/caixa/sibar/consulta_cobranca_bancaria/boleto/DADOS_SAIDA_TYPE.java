/**
 * DADOS_SAIDA_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class DADOS_SAIDA_TYPE  extends br.gov.caixa.sibar.DADOS_SAIDA_TYPE  implements java.io.Serializable {
    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE CONSULTA_SOLICITACAO_GRUPO_PAGADOR;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE CONSULTA_SOLICITACAO_PRE_IMPRESSO;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACOES_GRUPO_PAGADOR_TYPE CONSULTA_SOLICITACOES_GRUPO_PAGADOR;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE CONSULTA_SOLICITACOES_PRE_IMPRESSO;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.IMPRIME_BOLETO_TYPE IMPRIME_BOLETO;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_saida_Type CONSULTA_BOLETO;

    public DADOS_SAIDA_TYPE() {
    }

    public DADOS_SAIDA_TYPE(
           br.gov.caixa.sibar.CONTROLE_NEGOCIAL_TYPE[] CONTROLE_NEGOCIAL,
           java.lang.String EXCECAO,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE CONSULTA_SOLICITACAO_GRUPO_PAGADOR,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE CONSULTA_SOLICITACAO_PRE_IMPRESSO,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACOES_GRUPO_PAGADOR_TYPE CONSULTA_SOLICITACOES_GRUPO_PAGADOR,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE CONSULTA_SOLICITACOES_PRE_IMPRESSO,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.IMPRIME_BOLETO_TYPE IMPRIME_BOLETO,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_saida_Type CONSULTA_BOLETO) {
        super(
            CONTROLE_NEGOCIAL,
            EXCECAO);
        this.CONSULTA_SOLICITACAO_GRUPO_PAGADOR = CONSULTA_SOLICITACAO_GRUPO_PAGADOR;
        this.CONSULTA_SOLICITACAO_PRE_IMPRESSO = CONSULTA_SOLICITACAO_PRE_IMPRESSO;
        this.CONSULTA_SOLICITACOES_GRUPO_PAGADOR = CONSULTA_SOLICITACOES_GRUPO_PAGADOR;
        this.CONSULTA_SOLICITACOES_PRE_IMPRESSO = CONSULTA_SOLICITACOES_PRE_IMPRESSO;
        this.IMPRIME_BOLETO = IMPRIME_BOLETO;
        this.CONSULTA_BOLETO = CONSULTA_BOLETO;
    }


    /**
     * Gets the CONSULTA_SOLICITACAO_GRUPO_PAGADOR value for this DADOS_SAIDA_TYPE.
     * 
     * @return CONSULTA_SOLICITACAO_GRUPO_PAGADOR
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE getCONSULTA_SOLICITACAO_GRUPO_PAGADOR() {
        return CONSULTA_SOLICITACAO_GRUPO_PAGADOR;
    }


    /**
     * Sets the CONSULTA_SOLICITACAO_GRUPO_PAGADOR value for this DADOS_SAIDA_TYPE.
     * 
     * @param CONSULTA_SOLICITACAO_GRUPO_PAGADOR
     */
    public void setCONSULTA_SOLICITACAO_GRUPO_PAGADOR(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE CONSULTA_SOLICITACAO_GRUPO_PAGADOR) {
        this.CONSULTA_SOLICITACAO_GRUPO_PAGADOR = CONSULTA_SOLICITACAO_GRUPO_PAGADOR;
    }


    /**
     * Gets the CONSULTA_SOLICITACAO_PRE_IMPRESSO value for this DADOS_SAIDA_TYPE.
     * 
     * @return CONSULTA_SOLICITACAO_PRE_IMPRESSO
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE getCONSULTA_SOLICITACAO_PRE_IMPRESSO() {
        return CONSULTA_SOLICITACAO_PRE_IMPRESSO;
    }


    /**
     * Sets the CONSULTA_SOLICITACAO_PRE_IMPRESSO value for this DADOS_SAIDA_TYPE.
     * 
     * @param CONSULTA_SOLICITACAO_PRE_IMPRESSO
     */
    public void setCONSULTA_SOLICITACAO_PRE_IMPRESSO(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE CONSULTA_SOLICITACAO_PRE_IMPRESSO) {
        this.CONSULTA_SOLICITACAO_PRE_IMPRESSO = CONSULTA_SOLICITACAO_PRE_IMPRESSO;
    }


    /**
     * Gets the CONSULTA_SOLICITACOES_GRUPO_PAGADOR value for this DADOS_SAIDA_TYPE.
     * 
     * @return CONSULTA_SOLICITACOES_GRUPO_PAGADOR
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACOES_GRUPO_PAGADOR_TYPE getCONSULTA_SOLICITACOES_GRUPO_PAGADOR() {
        return CONSULTA_SOLICITACOES_GRUPO_PAGADOR;
    }


    /**
     * Sets the CONSULTA_SOLICITACOES_GRUPO_PAGADOR value for this DADOS_SAIDA_TYPE.
     * 
     * @param CONSULTA_SOLICITACOES_GRUPO_PAGADOR
     */
    public void setCONSULTA_SOLICITACOES_GRUPO_PAGADOR(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACOES_GRUPO_PAGADOR_TYPE CONSULTA_SOLICITACOES_GRUPO_PAGADOR) {
        this.CONSULTA_SOLICITACOES_GRUPO_PAGADOR = CONSULTA_SOLICITACOES_GRUPO_PAGADOR;
    }


    /**
     * Gets the CONSULTA_SOLICITACOES_PRE_IMPRESSO value for this DADOS_SAIDA_TYPE.
     * 
     * @return CONSULTA_SOLICITACOES_PRE_IMPRESSO
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE getCONSULTA_SOLICITACOES_PRE_IMPRESSO() {
        return CONSULTA_SOLICITACOES_PRE_IMPRESSO;
    }


    /**
     * Sets the CONSULTA_SOLICITACOES_PRE_IMPRESSO value for this DADOS_SAIDA_TYPE.
     * 
     * @param CONSULTA_SOLICITACOES_PRE_IMPRESSO
     */
    public void setCONSULTA_SOLICITACOES_PRE_IMPRESSO(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE CONSULTA_SOLICITACOES_PRE_IMPRESSO) {
        this.CONSULTA_SOLICITACOES_PRE_IMPRESSO = CONSULTA_SOLICITACOES_PRE_IMPRESSO;
    }


    /**
     * Gets the IMPRIME_BOLETO value for this DADOS_SAIDA_TYPE.
     * 
     * @return IMPRIME_BOLETO
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.IMPRIME_BOLETO_TYPE getIMPRIME_BOLETO() {
        return IMPRIME_BOLETO;
    }


    /**
     * Sets the IMPRIME_BOLETO value for this DADOS_SAIDA_TYPE.
     * 
     * @param IMPRIME_BOLETO
     */
    public void setIMPRIME_BOLETO(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.IMPRIME_BOLETO_TYPE IMPRIME_BOLETO) {
        this.IMPRIME_BOLETO = IMPRIME_BOLETO;
    }


    /**
     * Gets the CONSULTA_BOLETO value for this DADOS_SAIDA_TYPE.
     * 
     * @return CONSULTA_BOLETO
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_saida_Type getCONSULTA_BOLETO() {
        return CONSULTA_BOLETO;
    }


    /**
     * Sets the CONSULTA_BOLETO value for this DADOS_SAIDA_TYPE.
     * 
     * @param CONSULTA_BOLETO
     */
    public void setCONSULTA_BOLETO(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_saida_Type CONSULTA_BOLETO) {
        this.CONSULTA_BOLETO = CONSULTA_BOLETO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DADOS_SAIDA_TYPE)) return false;
        DADOS_SAIDA_TYPE other = (DADOS_SAIDA_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.CONSULTA_SOLICITACAO_GRUPO_PAGADOR==null && other.getCONSULTA_SOLICITACAO_GRUPO_PAGADOR()==null) || 
             (this.CONSULTA_SOLICITACAO_GRUPO_PAGADOR!=null &&
              this.CONSULTA_SOLICITACAO_GRUPO_PAGADOR.equals(other.getCONSULTA_SOLICITACAO_GRUPO_PAGADOR()))) &&
            ((this.CONSULTA_SOLICITACAO_PRE_IMPRESSO==null && other.getCONSULTA_SOLICITACAO_PRE_IMPRESSO()==null) || 
             (this.CONSULTA_SOLICITACAO_PRE_IMPRESSO!=null &&
              this.CONSULTA_SOLICITACAO_PRE_IMPRESSO.equals(other.getCONSULTA_SOLICITACAO_PRE_IMPRESSO()))) &&
            ((this.CONSULTA_SOLICITACOES_GRUPO_PAGADOR==null && other.getCONSULTA_SOLICITACOES_GRUPO_PAGADOR()==null) || 
             (this.CONSULTA_SOLICITACOES_GRUPO_PAGADOR!=null &&
              this.CONSULTA_SOLICITACOES_GRUPO_PAGADOR.equals(other.getCONSULTA_SOLICITACOES_GRUPO_PAGADOR()))) &&
            ((this.CONSULTA_SOLICITACOES_PRE_IMPRESSO==null && other.getCONSULTA_SOLICITACOES_PRE_IMPRESSO()==null) || 
             (this.CONSULTA_SOLICITACOES_PRE_IMPRESSO!=null &&
              this.CONSULTA_SOLICITACOES_PRE_IMPRESSO.equals(other.getCONSULTA_SOLICITACOES_PRE_IMPRESSO()))) &&
            ((this.IMPRIME_BOLETO==null && other.getIMPRIME_BOLETO()==null) || 
             (this.IMPRIME_BOLETO!=null &&
              this.IMPRIME_BOLETO.equals(other.getIMPRIME_BOLETO()))) &&
            ((this.CONSULTA_BOLETO==null && other.getCONSULTA_BOLETO()==null) || 
             (this.CONSULTA_BOLETO!=null &&
              this.CONSULTA_BOLETO.equals(other.getCONSULTA_BOLETO())));
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
        if (getCONSULTA_SOLICITACAO_GRUPO_PAGADOR() != null) {
            _hashCode += getCONSULTA_SOLICITACAO_GRUPO_PAGADOR().hashCode();
        }
        if (getCONSULTA_SOLICITACAO_PRE_IMPRESSO() != null) {
            _hashCode += getCONSULTA_SOLICITACAO_PRE_IMPRESSO().hashCode();
        }
        if (getCONSULTA_SOLICITACOES_GRUPO_PAGADOR() != null) {
            _hashCode += getCONSULTA_SOLICITACOES_GRUPO_PAGADOR().hashCode();
        }
        if (getCONSULTA_SOLICITACOES_PRE_IMPRESSO() != null) {
            _hashCode += getCONSULTA_SOLICITACOES_PRE_IMPRESSO().hashCode();
        }
        if (getIMPRIME_BOLETO() != null) {
            _hashCode += getIMPRIME_BOLETO().hashCode();
        }
        if (getCONSULTA_BOLETO() != null) {
            _hashCode += getCONSULTA_BOLETO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DADOS_SAIDA_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "DADOS_SAIDA_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONSULTA_SOLICITACAO_GRUPO_PAGADOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONSULTA_SOLICITACAO_GRUPO_PAGADOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONSULTA_SOLICITACAO_PRE_IMPRESSO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONSULTA_SOLICITACAO_PRE_IMPRESSO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONSULTA_SOLICITACOES_GRUPO_PAGADOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONSULTA_SOLICITACOES_GRUPO_PAGADOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CONSULTA_SOLICITACOES_GRUPO_PAGADOR_TYPE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONSULTA_SOLICITACOES_PRE_IMPRESSO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONSULTA_SOLICITACOES_PRE_IMPRESSO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMPRIME_BOLETO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IMPRIME_BOLETO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "IMPRIME_BOLETO_TYPE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONSULTA_BOLETO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CONSULTA_BOLETO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_saida_Type"));
        elemField.setMinOccurs(0);
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
