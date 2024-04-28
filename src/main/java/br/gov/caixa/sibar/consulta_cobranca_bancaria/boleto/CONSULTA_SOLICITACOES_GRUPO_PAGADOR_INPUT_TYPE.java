/**
 * CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE  implements java.io.Serializable {
    private int CODIGO_BENEFICIARIO;

    private java.util.Date DATA_INICIO;

    private java.util.Date DATA_FIM;

    private java.lang.String FLAG_SITUACAO;

    private int PAGINA;

    public CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE() {
    }

    public CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE(
           int CODIGO_BENEFICIARIO,
           java.util.Date DATA_INICIO,
           java.util.Date DATA_FIM,
           java.lang.String FLAG_SITUACAO,
           int PAGINA) {
           this.CODIGO_BENEFICIARIO = CODIGO_BENEFICIARIO;
           this.DATA_INICIO = DATA_INICIO;
           this.DATA_FIM = DATA_FIM;
           this.FLAG_SITUACAO = FLAG_SITUACAO;
           this.PAGINA = PAGINA;
    }


    /**
     * Gets the CODIGO_BENEFICIARIO value for this CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE.
     * 
     * @return CODIGO_BENEFICIARIO
     */
    public int getCODIGO_BENEFICIARIO() {
        return CODIGO_BENEFICIARIO;
    }


    /**
     * Sets the CODIGO_BENEFICIARIO value for this CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE.
     * 
     * @param CODIGO_BENEFICIARIO
     */
    public void setCODIGO_BENEFICIARIO(int CODIGO_BENEFICIARIO) {
        this.CODIGO_BENEFICIARIO = CODIGO_BENEFICIARIO;
    }


    /**
     * Gets the DATA_INICIO value for this CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE.
     * 
     * @return DATA_INICIO
     */
    public java.util.Date getDATA_INICIO() {
        return DATA_INICIO;
    }


    /**
     * Sets the DATA_INICIO value for this CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE.
     * 
     * @param DATA_INICIO
     */
    public void setDATA_INICIO(java.util.Date DATA_INICIO) {
        this.DATA_INICIO = DATA_INICIO;
    }


    /**
     * Gets the DATA_FIM value for this CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE.
     * 
     * @return DATA_FIM
     */
    public java.util.Date getDATA_FIM() {
        return DATA_FIM;
    }


    /**
     * Sets the DATA_FIM value for this CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE.
     * 
     * @param DATA_FIM
     */
    public void setDATA_FIM(java.util.Date DATA_FIM) {
        this.DATA_FIM = DATA_FIM;
    }


    /**
     * Gets the FLAG_SITUACAO value for this CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE.
     * 
     * @return FLAG_SITUACAO
     */
    public java.lang.String getFLAG_SITUACAO() {
        return FLAG_SITUACAO;
    }


    /**
     * Sets the FLAG_SITUACAO value for this CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE.
     * 
     * @param FLAG_SITUACAO
     */
    public void setFLAG_SITUACAO(java.lang.String FLAG_SITUACAO) {
        this.FLAG_SITUACAO = FLAG_SITUACAO;
    }


    /**
     * Gets the PAGINA value for this CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE.
     * 
     * @return PAGINA
     */
    public int getPAGINA() {
        return PAGINA;
    }


    /**
     * Sets the PAGINA value for this CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE.
     * 
     * @param PAGINA
     */
    public void setPAGINA(int PAGINA) {
        this.PAGINA = PAGINA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE)) return false;
        CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE other = (CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.CODIGO_BENEFICIARIO == other.getCODIGO_BENEFICIARIO() &&
            ((this.DATA_INICIO==null && other.getDATA_INICIO()==null) || 
             (this.DATA_INICIO!=null &&
              this.DATA_INICIO.equals(other.getDATA_INICIO()))) &&
            ((this.DATA_FIM==null && other.getDATA_FIM()==null) || 
             (this.DATA_FIM!=null &&
              this.DATA_FIM.equals(other.getDATA_FIM()))) &&
            ((this.FLAG_SITUACAO==null && other.getFLAG_SITUACAO()==null) || 
             (this.FLAG_SITUACAO!=null &&
              this.FLAG_SITUACAO.equals(other.getFLAG_SITUACAO()))) &&
            this.PAGINA == other.getPAGINA();
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
        _hashCode += getCODIGO_BENEFICIARIO();
        if (getDATA_INICIO() != null) {
            _hashCode += getDATA_INICIO().hashCode();
        }
        if (getDATA_FIM() != null) {
            _hashCode += getDATA_FIM().hashCode();
        }
        if (getFLAG_SITUACAO() != null) {
            _hashCode += getFLAG_SITUACAO().hashCode();
        }
        _hashCode += getPAGINA();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODIGO_BENEFICIARIO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CODIGO_BENEFICIARIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATA_INICIO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATA_INICIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATA_FIM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATA_FIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLAG_SITUACAO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FLAG_SITUACAO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAGINA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PAGINA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
