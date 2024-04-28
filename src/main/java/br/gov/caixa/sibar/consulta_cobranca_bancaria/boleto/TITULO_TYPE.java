/**
 * TITULO_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class TITULO_TYPE  implements java.io.Serializable {
    private java.lang.String LINHA_DIGITAVEL;

    private java.util.Date DATA_VENCIMENTO;

    private java.lang.String SIGLA_MODALIDADE;

    private long NOSSO_NUMERO;

    private short DV_NOSSO_NUMERO;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.MOEDA_TYPE MOEDA;

    private java.lang.String NUMERO_DOCUMENTO;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.ACEITE_TYPE ACEITE;

    private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.ESPECIE_TYPE ESPECIE;

    private java.util.Date DATA_DOCUMENTO;

    private java.util.Date DATA_PROCESSAMENTO;

    private java.lang.String CODIGO_BARRAS;

    private java.math.BigDecimal VALOR;

    public TITULO_TYPE() {
    }

    public TITULO_TYPE(
           java.lang.String LINHA_DIGITAVEL,
           java.util.Date DATA_VENCIMENTO,
           java.lang.String SIGLA_MODALIDADE,
           long NOSSO_NUMERO,
           short DV_NOSSO_NUMERO,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.MOEDA_TYPE MOEDA,
           java.lang.String NUMERO_DOCUMENTO,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.ACEITE_TYPE ACEITE,
           br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.ESPECIE_TYPE ESPECIE,
           java.util.Date DATA_DOCUMENTO,
           java.util.Date DATA_PROCESSAMENTO,
           java.lang.String CODIGO_BARRAS,
           java.math.BigDecimal VALOR) {
           this.LINHA_DIGITAVEL = LINHA_DIGITAVEL;
           this.DATA_VENCIMENTO = DATA_VENCIMENTO;
           this.SIGLA_MODALIDADE = SIGLA_MODALIDADE;
           this.NOSSO_NUMERO = NOSSO_NUMERO;
           this.DV_NOSSO_NUMERO = DV_NOSSO_NUMERO;
           this.MOEDA = MOEDA;
           this.NUMERO_DOCUMENTO = NUMERO_DOCUMENTO;
           this.ACEITE = ACEITE;
           this.ESPECIE = ESPECIE;
           this.DATA_DOCUMENTO = DATA_DOCUMENTO;
           this.DATA_PROCESSAMENTO = DATA_PROCESSAMENTO;
           this.CODIGO_BARRAS = CODIGO_BARRAS;
           this.VALOR = VALOR;
    }


    /**
     * Gets the LINHA_DIGITAVEL value for this TITULO_TYPE.
     * 
     * @return LINHA_DIGITAVEL
     */
    public java.lang.String getLINHA_DIGITAVEL() {
        return LINHA_DIGITAVEL;
    }


    /**
     * Sets the LINHA_DIGITAVEL value for this TITULO_TYPE.
     * 
     * @param LINHA_DIGITAVEL
     */
    public void setLINHA_DIGITAVEL(java.lang.String LINHA_DIGITAVEL) {
        this.LINHA_DIGITAVEL = LINHA_DIGITAVEL;
    }


    /**
     * Gets the DATA_VENCIMENTO value for this TITULO_TYPE.
     * 
     * @return DATA_VENCIMENTO
     */
    public java.util.Date getDATA_VENCIMENTO() {
        return DATA_VENCIMENTO;
    }


    /**
     * Sets the DATA_VENCIMENTO value for this TITULO_TYPE.
     * 
     * @param DATA_VENCIMENTO
     */
    public void setDATA_VENCIMENTO(java.util.Date DATA_VENCIMENTO) {
        this.DATA_VENCIMENTO = DATA_VENCIMENTO;
    }


    /**
     * Gets the SIGLA_MODALIDADE value for this TITULO_TYPE.
     * 
     * @return SIGLA_MODALIDADE
     */
    public java.lang.String getSIGLA_MODALIDADE() {
        return SIGLA_MODALIDADE;
    }


    /**
     * Sets the SIGLA_MODALIDADE value for this TITULO_TYPE.
     * 
     * @param SIGLA_MODALIDADE
     */
    public void setSIGLA_MODALIDADE(java.lang.String SIGLA_MODALIDADE) {
        this.SIGLA_MODALIDADE = SIGLA_MODALIDADE;
    }


    /**
     * Gets the NOSSO_NUMERO value for this TITULO_TYPE.
     * 
     * @return NOSSO_NUMERO
     */
    public long getNOSSO_NUMERO() {
        return NOSSO_NUMERO;
    }


    /**
     * Sets the NOSSO_NUMERO value for this TITULO_TYPE.
     * 
     * @param NOSSO_NUMERO
     */
    public void setNOSSO_NUMERO(long NOSSO_NUMERO) {
        this.NOSSO_NUMERO = NOSSO_NUMERO;
    }


    /**
     * Gets the DV_NOSSO_NUMERO value for this TITULO_TYPE.
     * 
     * @return DV_NOSSO_NUMERO
     */
    public short getDV_NOSSO_NUMERO() {
        return DV_NOSSO_NUMERO;
    }


    /**
     * Sets the DV_NOSSO_NUMERO value for this TITULO_TYPE.
     * 
     * @param DV_NOSSO_NUMERO
     */
    public void setDV_NOSSO_NUMERO(short DV_NOSSO_NUMERO) {
        this.DV_NOSSO_NUMERO = DV_NOSSO_NUMERO;
    }


    /**
     * Gets the MOEDA value for this TITULO_TYPE.
     * 
     * @return MOEDA
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.MOEDA_TYPE getMOEDA() {
        return MOEDA;
    }


    /**
     * Sets the MOEDA value for this TITULO_TYPE.
     * 
     * @param MOEDA
     */
    public void setMOEDA(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.MOEDA_TYPE MOEDA) {
        this.MOEDA = MOEDA;
    }


    /**
     * Gets the NUMERO_DOCUMENTO value for this TITULO_TYPE.
     * 
     * @return NUMERO_DOCUMENTO
     */
    public java.lang.String getNUMERO_DOCUMENTO() {
        return NUMERO_DOCUMENTO;
    }


    /**
     * Sets the NUMERO_DOCUMENTO value for this TITULO_TYPE.
     * 
     * @param NUMERO_DOCUMENTO
     */
    public void setNUMERO_DOCUMENTO(java.lang.String NUMERO_DOCUMENTO) {
        this.NUMERO_DOCUMENTO = NUMERO_DOCUMENTO;
    }


    /**
     * Gets the ACEITE value for this TITULO_TYPE.
     * 
     * @return ACEITE
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.ACEITE_TYPE getACEITE() {
        return ACEITE;
    }


    /**
     * Sets the ACEITE value for this TITULO_TYPE.
     * 
     * @param ACEITE
     */
    public void setACEITE(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.ACEITE_TYPE ACEITE) {
        this.ACEITE = ACEITE;
    }


    /**
     * Gets the ESPECIE value for this TITULO_TYPE.
     * 
     * @return ESPECIE
     */
    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.ESPECIE_TYPE getESPECIE() {
        return ESPECIE;
    }


    /**
     * Sets the ESPECIE value for this TITULO_TYPE.
     * 
     * @param ESPECIE
     */
    public void setESPECIE(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.ESPECIE_TYPE ESPECIE) {
        this.ESPECIE = ESPECIE;
    }


    /**
     * Gets the DATA_DOCUMENTO value for this TITULO_TYPE.
     * 
     * @return DATA_DOCUMENTO
     */
    public java.util.Date getDATA_DOCUMENTO() {
        return DATA_DOCUMENTO;
    }


    /**
     * Sets the DATA_DOCUMENTO value for this TITULO_TYPE.
     * 
     * @param DATA_DOCUMENTO
     */
    public void setDATA_DOCUMENTO(java.util.Date DATA_DOCUMENTO) {
        this.DATA_DOCUMENTO = DATA_DOCUMENTO;
    }


    /**
     * Gets the DATA_PROCESSAMENTO value for this TITULO_TYPE.
     * 
     * @return DATA_PROCESSAMENTO
     */
    public java.util.Date getDATA_PROCESSAMENTO() {
        return DATA_PROCESSAMENTO;
    }


    /**
     * Sets the DATA_PROCESSAMENTO value for this TITULO_TYPE.
     * 
     * @param DATA_PROCESSAMENTO
     */
    public void setDATA_PROCESSAMENTO(java.util.Date DATA_PROCESSAMENTO) {
        this.DATA_PROCESSAMENTO = DATA_PROCESSAMENTO;
    }


    /**
     * Gets the CODIGO_BARRAS value for this TITULO_TYPE.
     * 
     * @return CODIGO_BARRAS
     */
    public java.lang.String getCODIGO_BARRAS() {
        return CODIGO_BARRAS;
    }


    /**
     * Sets the CODIGO_BARRAS value for this TITULO_TYPE.
     * 
     * @param CODIGO_BARRAS
     */
    public void setCODIGO_BARRAS(java.lang.String CODIGO_BARRAS) {
        this.CODIGO_BARRAS = CODIGO_BARRAS;
    }


    /**
     * Gets the VALOR value for this TITULO_TYPE.
     * 
     * @return VALOR
     */
    public java.math.BigDecimal getVALOR() {
        return VALOR;
    }


    /**
     * Sets the VALOR value for this TITULO_TYPE.
     * 
     * @param VALOR
     */
    public void setVALOR(java.math.BigDecimal VALOR) {
        this.VALOR = VALOR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TITULO_TYPE)) return false;
        TITULO_TYPE other = (TITULO_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.LINHA_DIGITAVEL==null && other.getLINHA_DIGITAVEL()==null) || 
             (this.LINHA_DIGITAVEL!=null &&
              this.LINHA_DIGITAVEL.equals(other.getLINHA_DIGITAVEL()))) &&
            ((this.DATA_VENCIMENTO==null && other.getDATA_VENCIMENTO()==null) || 
             (this.DATA_VENCIMENTO!=null &&
              this.DATA_VENCIMENTO.equals(other.getDATA_VENCIMENTO()))) &&
            ((this.SIGLA_MODALIDADE==null && other.getSIGLA_MODALIDADE()==null) || 
             (this.SIGLA_MODALIDADE!=null &&
              this.SIGLA_MODALIDADE.equals(other.getSIGLA_MODALIDADE()))) &&
            this.NOSSO_NUMERO == other.getNOSSO_NUMERO() &&
            this.DV_NOSSO_NUMERO == other.getDV_NOSSO_NUMERO() &&
            ((this.MOEDA==null && other.getMOEDA()==null) || 
             (this.MOEDA!=null &&
              this.MOEDA.equals(other.getMOEDA()))) &&
            ((this.NUMERO_DOCUMENTO==null && other.getNUMERO_DOCUMENTO()==null) || 
             (this.NUMERO_DOCUMENTO!=null &&
              this.NUMERO_DOCUMENTO.equals(other.getNUMERO_DOCUMENTO()))) &&
            ((this.ACEITE==null && other.getACEITE()==null) || 
             (this.ACEITE!=null &&
              this.ACEITE.equals(other.getACEITE()))) &&
            ((this.ESPECIE==null && other.getESPECIE()==null) || 
             (this.ESPECIE!=null &&
              this.ESPECIE.equals(other.getESPECIE()))) &&
            ((this.DATA_DOCUMENTO==null && other.getDATA_DOCUMENTO()==null) || 
             (this.DATA_DOCUMENTO!=null &&
              this.DATA_DOCUMENTO.equals(other.getDATA_DOCUMENTO()))) &&
            ((this.DATA_PROCESSAMENTO==null && other.getDATA_PROCESSAMENTO()==null) || 
             (this.DATA_PROCESSAMENTO!=null &&
              this.DATA_PROCESSAMENTO.equals(other.getDATA_PROCESSAMENTO()))) &&
            ((this.CODIGO_BARRAS==null && other.getCODIGO_BARRAS()==null) || 
             (this.CODIGO_BARRAS!=null &&
              this.CODIGO_BARRAS.equals(other.getCODIGO_BARRAS()))) &&
            ((this.VALOR==null && other.getVALOR()==null) || 
             (this.VALOR!=null &&
              this.VALOR.equals(other.getVALOR())));
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
        if (getLINHA_DIGITAVEL() != null) {
            _hashCode += getLINHA_DIGITAVEL().hashCode();
        }
        if (getDATA_VENCIMENTO() != null) {
            _hashCode += getDATA_VENCIMENTO().hashCode();
        }
        if (getSIGLA_MODALIDADE() != null) {
            _hashCode += getSIGLA_MODALIDADE().hashCode();
        }
        _hashCode += new Long(getNOSSO_NUMERO()).hashCode();
        _hashCode += getDV_NOSSO_NUMERO();
        if (getMOEDA() != null) {
            _hashCode += getMOEDA().hashCode();
        }
        if (getNUMERO_DOCUMENTO() != null) {
            _hashCode += getNUMERO_DOCUMENTO().hashCode();
        }
        if (getACEITE() != null) {
            _hashCode += getACEITE().hashCode();
        }
        if (getESPECIE() != null) {
            _hashCode += getESPECIE().hashCode();
        }
        if (getDATA_DOCUMENTO() != null) {
            _hashCode += getDATA_DOCUMENTO().hashCode();
        }
        if (getDATA_PROCESSAMENTO() != null) {
            _hashCode += getDATA_PROCESSAMENTO().hashCode();
        }
        if (getCODIGO_BARRAS() != null) {
            _hashCode += getCODIGO_BARRAS().hashCode();
        }
        if (getVALOR() != null) {
            _hashCode += getVALOR().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TITULO_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "TITULO_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LINHA_DIGITAVEL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LINHA_DIGITAVEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATA_VENCIMENTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATA_VENCIMENTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIGLA_MODALIDADE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SIGLA_MODALIDADE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOSSO_NUMERO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NOSSO_NUMERO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DV_NOSSO_NUMERO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DV_NOSSO_NUMERO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MOEDA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MOEDA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "MOEDA_TYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NUMERO_DOCUMENTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NUMERO_DOCUMENTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACEITE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ACEITE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "ACEITE_TYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESPECIE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ESPECIE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "ESPECIE_TYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATA_DOCUMENTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATA_DOCUMENTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATA_PROCESSAMENTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATA_PROCESSAMENTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODIGO_BARRAS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CODIGO_BARRAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALOR"));
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
