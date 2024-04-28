/**
 * Consulta_Cobranca_Bancaria_BoletoSOAPStub.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

import org.apache.axis.AxisProperties;

public class Consulta_Cobranca_Bancaria_BoletoSOAPStub extends org.apache.axis.client.Stub implements br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_Cobranca_Bancaria_Boleto_PortType {
    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    public Consulta_Cobranca_Bancaria_BoletoSOAPStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public Consulta_Cobranca_Bancaria_BoletoSOAPStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public Consulta_Cobranca_Bancaria_BoletoSOAPStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.2");
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private static void _initOperationDesc1() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CONSULTA_BOLETO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SERVICO_ENTRADA"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SERVICO_ENTRADA_NEGOCIAL_TYPE"), br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SERVICO_ENTRADA_NEGOCIAL_TYPE.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SERVICO_SAIDA_NEGOCIAL_TYPE"));
        oper.setReturnClass(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SERVICO_SAIDA_NEGOCIAL_TYPE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SERVICO_SAIDA"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    private void addBindings0() {
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">ACEITE_TYPE>DESCRICAO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">ACEITE_TYPE>TIPO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CEDENTE_TYPE>AGENCIA_VINCULACAO");
        cachedSerQNames.add(qName);
        cls = short.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CEDENTE_TYPE>CNPJ");
        cachedSerQNames.add(qName);
        cls = long.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CEDENTE_TYPE>CPF");
        cachedSerQNames.add(qName);
        cls = long.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CEDENTE_TYPE>NOME");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CEDENTE_TYPE>NUMERO");
        cachedSerQNames.add(qName);
        cls = int.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_endereco_Type>BAIRRO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_endereco_Type>CEP");
        cachedSerQNames.add(qName);
        cls = int.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_endereco_Type>CIDADE");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_endereco_Type>LOGRADOURO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_endereco_Type>UF");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_entrada_Type>CODIGO_BENEFICIARIO");
        cachedSerQNames.add(qName);
        cls = int.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_entrada_Type>NOSSO_NUMERO");
        cachedSerQNames.add(qName);
        cls = long.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_juros_mora_Type>TIPO");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_juros_mora_TypeTIPO.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_mensagens_ficha_compensacao_Type>MENSAGEM");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_mensagens_recibo_pagador_Type>MENSAGEM");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_pagador_Type>NOME");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_pagador_Type>RAZAO_SOCIAL");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_pagamento_Type>QUANTIDADE_PERMITIDA");
        cachedSerQNames.add(qName);
        cls = short.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_pagamento_Type>TIPO");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_pagamento_TypeTIPO.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_pos_vencimento_Type>ACAO");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_pos_vencimento_TypeACAO.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_pos_vencimento_Type>NUMERO_DIAS");
        cachedSerQNames.add(qName);
        cls = short.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_sacador_avalista_Type>NOME");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_sacador_avalista_Type>RAZAO_SOCIAL");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_saida_Type>FLAG_REGISTRO");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_saida_TypeFLAG_REGISTRO.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_titulo_Type>CODIGO_BARRAS");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_titulo_Type>CODIGO_MOEDA");
        cachedSerQNames.add(qName);
        cls = short.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_titulo_Type>FLAG_ACEITE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_titulo_TypeFLAG_ACEITE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_titulo_Type>IDENTIFICACAO_EMPRESA");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_titulo_Type>LINHA_DIGITAVEL");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_titulo_Type>NUMERO_DOCUMENTO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_titulo_Type>TIPO_ESPECIE");
        cachedSerQNames.add(qName);
        cls = short.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_titulo_Type>URL");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACAO_GRUPO_PAGADOR_INPUT_TYPE>CODIGO_BENEFICIARIO");
        cachedSerQNames.add(qName);
        cls = int.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACAO_GRUPO_PAGADOR_INPUT_TYPE>CODIGO_GRUPO");
        cachedSerQNames.add(qName);
        cls = short.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE>PRAZO_PROTESTO_DEVOLUCAO");
        cachedSerQNames.add(qName);
        cls = short.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE>SITUACAO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE>VALOR_TITULO");
        cachedSerQNames.add(qName);
        cls = java.math.BigDecimal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE>CODIGO_BENEFICIARIO");
        cachedSerQNames.add(qName);
        cls = int.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE>TIPO_BLOQUETO");
        cachedSerQNames.add(qName);
        cls = short.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE>NOSSO_NUMERO");
        cachedSerQNames.add(qName);
        cls = long.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE>QUANTIDADE_BLOQUETO");
        cachedSerQNames.add(qName);
        cls = int.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE>SITUACAO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE>TIPO_COBRANCA");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE>TIPO_ENTREGA");
        cachedSerQNames.add(qName);
        cls = short.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE>CODIGO_BENEFICIARIO");
        cachedSerQNames.add(qName);
        cls = int.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE>FLAG_SITUACAO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE>PAGINA");
        cachedSerQNames.add(qName);
        cls = int.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACOES_GRUPO_PAGADOR_TYPE>QUANTIDADE_PAGINAS");
        cachedSerQNames.add(qName);
        cls = int.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACOES_PRE_IMPRESSO_INPUT_TYPE>CODIGO_BENEFICIARIO");
        cachedSerQNames.add(qName);
        cls = int.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACOES_PRE_IMPRESSO_INPUT_TYPE>FLAG_SITUACAO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACOES_PRE_IMPRESSO_INPUT_TYPE>PAGINA");
        cachedSerQNames.add(qName);
        cls = int.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACOES_PRE_IMPRESSO_INPUT_TYPE>TIPO_BOLETO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE>QUANTIDADE_PAGINAS");
        cachedSerQNames.add(qName);
        cls = int.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">DESCONTO_MULTA_TYPE>PERCENTUAL");
        cachedSerQNames.add(qName);
        cls = java.math.BigDecimal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">DESCONTO_MULTA_TYPE>PRAZO");
        cachedSerQNames.add(qName);
        cls = short.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">DESCONTO_MULTA_TYPE>VALOR");
        cachedSerQNames.add(qName);
        cls = java.math.BigDecimal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">DESCRICOES_TYPE>ACEITE");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">DESCRICOES_TYPE>ENDOSSO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">DESCRICOES_TYPE>ENVIO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">DESCRICOES_TYPE>ESPECIE");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">DESCRICOES_TYPE>OBTER_ENVIO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">DESCRICOES_TYPE>OBTER_VALOR");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">DESCRICOES_TYPE>PROTESTO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">DESCRICOES_TYPE>REGISTRO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">ENDERECO_TYPE>BAIRRO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">ENDERECO_TYPE>CEP");
        cachedSerQNames.add(qName);
        cls = int.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">ENDERECO_TYPE>COMPLEMENTO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">ENDERECO_TYPE>LOGRADOURO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">ENDERECO_TYPE>MUNICIPIO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">ENDERECO_TYPE>NUMERO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">ENDERECO_TYPE>UF");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">ESPECIE_TYPE>DESCRICAO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">ESPECIE_TYPE>TIPO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">IMPOSTOS_TYPE>VALOR_IOF");
        cachedSerQNames.add(qName);
        cls = java.math.BigDecimal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">IMPRIME_BOLETO_INPUT_TYPE>CODIGO_BENEFICIARIO");
        cachedSerQNames.add(qName);
        cls = int.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">IMPRIME_BOLETO_INPUT_TYPE>LINHA_DIGITAVEL");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">IMPRIME_BOLETO_INPUT_TYPE>NOSSO_NUMERO");
        cachedSerQNames.add(qName);
        cls = long.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">JUROS_TYPE>TIPO");
        cachedSerQNames.add(qName);
        cls = short.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">JUROS_TYPE>VALOR");
        cachedSerQNames.add(qName);
        cls = java.math.BigDecimal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">MENSAGEM_TYPE>DESCRICAO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">MENSAGEM_TYPE>TIPO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">MOEDA_TYPE>CODIGO");
        cachedSerQNames.add(qName);
        cls = short.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">MOEDA_TYPE>DESCRICAO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">MOEDA_TYPE>SIGLA");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">SACADO_TYPE>CNPJ");
        cachedSerQNames.add(qName);
        cls = long.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">SACADO_TYPE>CPF");
        cachedSerQNames.add(qName);
        cls = long.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">SACADO_TYPE>NOME");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">SACADOR_TYPE>CNPJ");
        cachedSerQNames.add(qName);
        cls = long.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">SACADOR_TYPE>CPF");
        cachedSerQNames.add(qName);
        cls = long.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">SACADOR_TYPE>NOME");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">SOLICITACAO_GRUPO_PAGADOR_TYPE>CODIGO_GRUPO");
        cachedSerQNames.add(qName);
        cls = short.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">SOLICITACAO_GRUPO_PAGADOR_TYPE>DESCRICAO_ESPECIE");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">SOLICITACAO_GRUPO_PAGADOR_TYPE>NOME_GRUPO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">SOLICITACAO_GRUPO_PAGADOR_TYPE>SITUACAO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">SOLICITACAO_GRUPO_PAGADOR_TYPE>VALOR_TITULO");
        cachedSerQNames.add(qName);
        cls = java.math.BigDecimal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">SOLICITACAO_PRE_IMPRESSO_TYPE>DESCRICAO_TIPO_BOLETO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">SOLICITACAO_PRE_IMPRESSO_TYPE>DESCRICAO_TIPO_ENTREGA");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">SOLICITACAO_PRE_IMPRESSO_TYPE>NOSSO_NUMERO_INICIAL");
        cachedSerQNames.add(qName);
        cls = long.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }

    private void addBindings1() {
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">SOLICITACAO_PRE_IMPRESSO_TYPE>QUANTIDADE_BOLETOS");
        cachedSerQNames.add(qName);
        cls = long.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">SOLICITACAO_PRE_IMPRESSO_TYPE>SITUACAO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">TITULO_TYPE>CODIGO_BARRAS");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">TITULO_TYPE>DV_NOSSO_NUMERO");
        cachedSerQNames.add(qName);
        cls = short.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">TITULO_TYPE>LINHA_DIGITAVEL");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">TITULO_TYPE>NOSSO_NUMERO");
        cachedSerQNames.add(qName);
        cls = long.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">TITULO_TYPE>NUMERO_DOCUMENTO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">TITULO_TYPE>SIGLA_MODALIDADE");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">TITULO_TYPE>VALOR");
        cachedSerQNames.add(qName);
        cls = java.math.BigDecimal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">VALOR_TYPE>ABATIMENTO");
        cachedSerQNames.add(qName);
        cls = java.math.BigDecimal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">VALOR_TYPE>CALCULADO");
        cachedSerQNames.add(qName);
        cls = java.math.BigDecimal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">VALOR_TYPE>COBRADO");
        cachedSerQNames.add(qName);
        cls = java.math.BigDecimal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">VALOR_TYPE>DESCONTO");
        cachedSerQNames.add(qName);
        cls = java.math.BigDecimal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">VALOR_TYPE>DESCONTO_ABATIMENTO");
        cachedSerQNames.add(qName);
        cls = java.math.BigDecimal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">VALOR_TYPE>IOF");
        cachedSerQNames.add(qName);
        cls = java.math.BigDecimal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">VALOR_TYPE>JUROS");
        cachedSerQNames.add(qName);
        cls = java.math.BigDecimal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">VALOR_TYPE>MULTA");
        cachedSerQNames.add(qName);
        cls = java.math.BigDecimal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">VALOR_TYPE>MULTA_JUROS");
        cachedSerQNames.add(qName);
        cls = java.math.BigDecimal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "ACEITE_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.ACEITE_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CEDENTE_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CEDENTE_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "cnpj_Type");
        cachedSerQNames.add(qName);
        cls = long.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "COMPLEMENTARES_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.COMPLEMENTARES_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_desconto_Type");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_desconto_Type.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_descontos_Type");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_desconto_Type[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_desconto_Type");
        qName2 = new javax.xml.namespace.QName("", "DESCONTO");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_endereco_Type");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_endereco_Type.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_entrada_Type");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_entrada_Type.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_ficha_compensacao_Type");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_ficha_compensacao_Type.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_juros_mora_Type");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_juros_mora_Type.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_mensagens_ficha_compensacao_Type");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_mensagens_ficha_compensacao_Type>MENSAGEM");
        qName2 = new javax.xml.namespace.QName("", "MENSAGEM");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_mensagens_recibo_pagador_Type");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", ">consulta_boleto_mensagens_recibo_pagador_Type>MENSAGEM");
        qName2 = new javax.xml.namespace.QName("", "MENSAGEM");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_multa_Type");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_multa_Type.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_pagador_Type");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_pagador_Type.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_pagamento_Type");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_pagamento_Type.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_pos_vencimento_Type");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_pos_vencimento_Type.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_recibo_pagador_Type");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_recibo_pagador_Type.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_sacador_avalista_Type");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_sacador_avalista_Type.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_saida_Type");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_saida_Type.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "consulta_boleto_titulo_Type");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_titulo_Type.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CONSULTA_SOLICITACAO_GRUPO_PAGADOR_INPUT_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACAO_GRUPO_PAGADOR_INPUT_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACAO_GRUPO_PAGADOR_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACAO_PRE_IMPRESSO_INPUT_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACAO_PRE_IMPRESSO_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACOES_GRUPO_PAGADOR_INPUT_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CONSULTA_SOLICITACOES_GRUPO_PAGADOR_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACOES_GRUPO_PAGADOR_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CONSULTA_SOLICITACOES_PRE_IMPRESSO_INPUT_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACOES_PRE_IMPRESSO_INPUT_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.CONSULTA_SOLICITACOES_PRE_IMPRESSO_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "cpf_Type");
        cachedSerQNames.add(qName);
        cls = long.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "DADOS_ENTRADA_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.DADOS_ENTRADA_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "DADOS_SAIDA_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.DADOS_SAIDA_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "DESCONTO_MULTA_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.DESCONTO_MULTA_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "DESCONTOS_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.DESCONTO_MULTA_TYPE[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "DESCONTO_MULTA_TYPE");
        qName2 = new javax.xml.namespace.QName("", "DESCONTO");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "DESCRICOES_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.DESCRICOES_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "ENDERECO_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.ENDERECO_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "ESPECIE_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.ESPECIE_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "IMPOSTOS_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.IMPOSTOS_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "IMPRIME_BOLETO_INPUT_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.IMPRIME_BOLETO_INPUT_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "IMPRIME_BOLETO_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.IMPRIME_BOLETO_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "JUROS_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.JUROS_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "MENSAGEM_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.MENSAGEM_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "MENSAGENS_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.MENSAGEM_TYPE[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "MENSAGEM_TYPE");
        qName2 = new javax.xml.namespace.QName("", "MENSAGEM");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "MOEDA_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.MOEDA_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "percentual_Type");
        cachedSerQNames.add(qName);
        cls = java.math.BigDecimal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SACADO_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SACADO_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SACADOR_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SACADOR_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SERVICO_ENTRADA_NEGOCIAL_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SERVICO_ENTRADA_NEGOCIAL_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SERVICO_SAIDA_NEGOCIAL_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SERVICO_SAIDA_NEGOCIAL_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SOLICITACAO_GRUPO_PAGADOR_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SOLICITACAO_GRUPO_PAGADOR_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SOLICITACAO_PRE_IMPRESSO_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SOLICITACAO_PRE_IMPRESSO_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SOLICITACOES_GRUPO_PAGADOR_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SOLICITACAO_GRUPO_PAGADOR_TYPE[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SOLICITACAO_GRUPO_PAGADOR_TYPE");
        qName2 = new javax.xml.namespace.QName("", "SOLICITACAO");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SOLICITACOES_PRE_IMPRESSO_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SOLICITACAO_PRE_IMPRESSO_TYPE[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "SOLICITACAO_PRE_IMPRESSO_TYPE");
        qName2 = new javax.xml.namespace.QName("", "SOLICITACAO");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "TITULO_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.TITULO_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "VALOR_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.VALOR_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "valor_Type");
        cachedSerQNames.add(qName);
        cls = java.math.BigDecimal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", ">CONTROLE_NEGOCIAL_TYPE>COD_RETORNO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", ">CONTROLE_NEGOCIAL_TYPE>MSG_RETORNO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", ">CONTROLE_NEGOCIAL_TYPE>ORIGEM_RETORNO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", ">DADOS_SAIDA_TYPE>EXCECAO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", ">HEADER_BARRAMENTO_TYPE>AUTENTICACAO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", ">HEADER_BARRAMENTO_TYPE>DATA_HORA");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", ">HEADER_BARRAMENTO_TYPE>ID_PROCESSO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", ">HEADER_BARRAMENTO_TYPE>IDENTIFICADOR_ORIGEM");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", ">HEADER_BARRAMENTO_TYPE>INDICE");
        cachedSerQNames.add(qName);
        cls = int.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", ">HEADER_BARRAMENTO_TYPE>OPERACAO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", ">HEADER_BARRAMENTO_TYPE>SISTEMA_ORIGEM");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", ">HEADER_BARRAMENTO_TYPE>UNIDADE");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", ">HEADER_BARRAMENTO_TYPE>USUARIO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", ">HEADER_BARRAMENTO_TYPE>USUARIO_SERVICO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", ">HEADER_BARRAMENTO_TYPE>VERSAO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", ">SERVICO_SAIDA_TYPE>COD_RETORNO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", ">SERVICO_SAIDA_TYPE>MSG_RETORNO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", ">SERVICO_SAIDA_TYPE>ORIGEM_RETORNO");
        cachedSerQNames.add(qName);
        cls = java.lang.String.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
        cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", "CONTROLE_NEGOCIAL_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.CONTROLE_NEGOCIAL_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", "DADOS_SAIDA_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.DADOS_SAIDA_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", "HEADER_BARRAMENTO_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", "mensagens_controle_negocial_Type");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.Mensagens_controle_negocial_Type.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", "SERVICO_ENTRADA_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.SERVICO_ENTRADA_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://caixa.gov.br/sibar", "SERVICO_SAIDA_TYPE");
        cachedSerQNames.add(qName);
        cls = br.gov.caixa.sibar.SERVICO_SAIDA_TYPE.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                    cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        } else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                    cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        } catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }


    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SERVICO_SAIDA_NEGOCIAL_TYPE CONSULTA_BOLETO(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SERVICO_ENTRADA_NEGOCIAL_TYPE parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();

//        SSLContext sCtxt = SSLContext.getInstance("SSL");
//        sCtxt.init(null, new TrustManager[]{new EasyTrustManager()}, new java.security.SecureRandom());

        AxisProperties.setProperty("axis.socketSecureFactory",
                "br.gov.caixa.sibar.sistemafieg.service.ssl.IgnoreSSL");
//        URL url = IgnoreSSL.__getWsdlLocation("https://barramento.caixa.gov.br/sibar/ConsultaCobrancaBancaria/Boleto");
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto/NewOperation");
//        _call.setTargetEndpointAddress(url);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CONSULTA_BOLETO"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SERVICO_SAIDA_NEGOCIAL_TYPE) _resp;
                } catch (java.lang.Exception _exception) {
                    return (br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SERVICO_SAIDA_NEGOCIAL_TYPE) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SERVICO_SAIDA_NEGOCIAL_TYPE.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

}
