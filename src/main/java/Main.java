import br.gov.caixa.sibar.CONTROLE_NEGOCIAL_TYPE;
import br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE;
import br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.*;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.*;
import br.gov.caixa.sibar.sistemafieg.dto.consultaBoleto.ConsultaBoletoEntradaTypedto;
import br.gov.caixa.sibar.sistemafieg.dto.consultaBoleto.DadosBoletoConsultaDto;
import br.gov.caixa.sibar.sistemafieg.dto.consultaBoleto.EntradaConsultaBoletoDto;
import br.gov.caixa.sibar.sistemafieg.dto.consultaBoleto.HeadBoletoConsultaDto;
import br.gov.caixa.sibar.sistemafieg.mapper.consultaBoleto.EntradaConsultaBoletoMapper;

import javax.xml.rpc.ServiceException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.rmi.RemoteException;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Date;


public class Main {

    //     private static String CODIGO_DO_BENEFICIARIO = "0729041";
    private static Integer CODIGO_DO_BENEFICIARIO = new Integer("0729042");
    private static BigInteger NOSSO_NUMERO = new BigInteger("14208000000013368");

    //    private static String NOSSO_NUMERO_STRING = "14320000000000115";
    // private static String DATA_DE_VENCIMENTO = "00000000";
    private static String DATA_DE_VENCIMENTO = "03012019";
    private static String VALOR = "000000000000000";
    private static BigDecimal VALOR_TITULO = new BigDecimal("576.7500");
    //    private static String VALOR = "000000000001500";
    private static String CPF_OU_CNPJ_DO_BENEFICIARIO = "12884672000439";
    private static String NUMERO_DOCUMENTO = "6657320";

    private static String VERSAO = "1.2";
    // private static String STR_PARA_AUT = CODIGO_DO_BENEFICIARIO+NOSSO_NUMERO_STRING+DATA_DE_VENCIMENTO+VALOR+CPF_OU_CNPJ_DO_BENEFICIARIO;
    // private  static String  AUTENTICACAO = Boletos.DO_HASHB64(STR_PARA_AUT);
    private static String USUARIO_SERVICO = "SGCBS02P";
    private static String OPERACAO_CONSULTA_BOLETO = "CONSULTA_BOLETO";
    private static String ALTERA_BOLETO = "ALTERA_BOLETO";
    private static String INCLUIR_BOLETO = "INCLUI_BOLETO";
    private static String SISTEMA_ORIGEM = "SIGCB";
    private static String DATA_HORA = "20190110083429";

    private static String hash = "729042" + "14208000000031582"
                                 + "00000000" + "000000000000000" + "03786187000199";
//00012003787744
//12884672000439

    public static void main(String[] args) throws ServiceException {
//        teste();
        testeConsultaBoleto();
//        testeAlteracaoBoleto();
//        testeIncluirBoleto();
//		testeIncluirBoletoPessoaJurida();
    }


    private static void testeConsultaBoleto() throws ServiceException {
        Consulta_Cobranca_Bancaria_Boleto_ServiceLocator locator = new Consulta_Cobranca_Bancaria_Boleto_ServiceLocator();
        Consulta_Cobranca_Bancaria_Boleto_PortType stub = locator.getConsulta_Cobranca_Bancaria_BoletoSOAP();
        SERVICO_ENTRADA_NEGOCIAL_TYPE params = new SERVICO_ENTRADA_NEGOCIAL_TYPE();
        HEADER_BARRAMENTO_TYPE header = new HEADER_BARRAMENTO_TYPE();
        DADOS_ENTRADA_TYPE dados = new DADOS_ENTRADA_TYPE();
        Consulta_boleto_entrada_Type consulta = new Consulta_boleto_entrada_Type();
        consulta.setCODIGO_BENEFICIARIO(new Integer("729042"));
        consulta.setNOSSO_NUMERO(new Long("14208000000031582"));

        dados.setCONSULTA_BOLETO(consulta);

        header.setAUTENTICACAO(DO_HASHB64(hash));
        header.setUSUARIO_SERVICO("SGCBS02P");
        header.setOPERACAO("CONSULTA_BOLETO");
        header.setDATA_HORA("20190110083429");
        header.setVERSAO("1.2");
        header.setSISTEMA_ORIGEM("SIGCB");


        params.setHEADER(header);
        params.setDADOS(dados);

        SERVICO_SAIDA_NEGOCIAL_TYPE retorno = null;

        try {
            retorno = stub.CONSULTA_BOLETO(params);
//            retorno.getDADOS().getCONSULTA_BOLETO()
            CONTROLE_NEGOCIAL_TYPE[] controle_negocial = retorno.getDADOS().getCONTROLE_NEGOCIAL();
            for (CONTROLE_NEGOCIAL_TYPE cnt : controle_negocial) {
                System.out.println(cnt.getMENSAGENS().getRETORNO());
            }
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    private static void testeAlteracaoBoleto() throws ServiceException {
        Manutencao_cobranca_bancaria_ServiceLocator locator = new Manutencao_cobranca_bancaria_ServiceLocator();
        Manutencao_cobranca_bancaria_PortType stub = locator.getmanutencao_cobranca_bancariaSOAP();

        Servico_entrada_negocial_Type params = new Servico_entrada_negocial_Type();
        br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE header = new br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE();
        Dados_entrada_Type dados = new Dados_entrada_Type();


        header.setAUTENTICACAO(DO_HASHB64(hash));
        header.setUSUARIO_SERVICO(USUARIO_SERVICO);
        header.setOPERACAO(ALTERA_BOLETO);
        header.setDATA_HORA(DATA_HORA);
        header.setVERSAO(VERSAO);
        header.setSISTEMA_ORIGEM(SISTEMA_ORIGEM);


        Altera_boleto_entrada_Type alteraBoleto = new Altera_boleto_entrada_Type();

        alteraBoleto.setCODIGO_BENEFICIARIO(CODIGO_DO_BENEFICIARIO);

        Altera_boleto_titulo_entrada_Type alteraBoletoTituloEntrada = new Altera_boleto_titulo_entrada_Type();


        alteraBoletoTituloEntrada.setDATA_VENCIMENTO(new Date());
        alteraBoletoTituloEntrada.setNOSSO_NUMERO(NOSSO_NUMERO.longValue());
        alteraBoletoTituloEntrada.setNUMERO_DOCUMENTO(NUMERO_DOCUMENTO);
        alteraBoletoTituloEntrada.setVALOR(VALOR_TITULO);
        alteraBoletoTituloEntrada.setTIPO_ESPECIE(new Short("02"));
        alteraBoletoTituloEntrada.setFLAG_ACEITE(Altera_boleto_titulo_entrada_TypeFLAG_ACEITE.S);

        Juros_mora_Type jurosMora = new Juros_mora_Type();
        jurosMora.setTIPO(Juros_mora_TypeTIPO.VALOR_POR_DIA);
        jurosMora.setVALOR(new BigDecimal("0.50"));
        Altera_boleto_juros_mora_Type alteraJurosMOra = new Altera_boleto_juros_mora_Type();
        alteraJurosMOra.setTIPO(Altera_boleto_juros_mora_TypeTIPO.VALOR_POR_DIA);
        alteraJurosMOra.setVALOR(new BigDecimal("0.50"));
        alteraBoletoTituloEntrada.setJUROS_MORA(alteraJurosMOra);
        alteraBoletoTituloEntrada.setVALOR_ABATIMENTO(BigDecimal.ZERO);


        Altera_boleto_pos_vencimento_Type posVencimento = new Altera_boleto_pos_vencimento_Type();
        posVencimento.setNUMERO_DIAS(new Short("120"));
        posVencimento.setACAO(Altera_boleto_pos_vencimento_TypeACAO.DEVOLVER);

        alteraBoletoTituloEntrada.setPOS_VENCIMENTO(posVencimento);

        Altera_boleto_pagador_Type alteraPagador = new Altera_boleto_pagador_Type();
        alteraPagador.setNOME("RODRIGO MATIAS");


        Altera_boleto_endereco_Type alteraEndereco = new Altera_boleto_endereco_Type();
        alteraEndereco.setBAIRRO("JARDIM GOIAS");
        alteraEndereco.setLOGRADOURO("AV. H");
        alteraEndereco.setCIDADE("GOIANIA");
        alteraEndereco.setUF("GO");
        alteraEndereco.setCEP(74810070);
        alteraPagador.setENDERECO(alteraEndereco);

        alteraBoletoTituloEntrada.setPAGADOR(alteraPagador);

        Altera_boleto_ficha_compensacao_Type alterafichaCompensacao = new Altera_boleto_ficha_compensacao_Type();

        String mensagem[] = {"TESTE DE INCLUSAO WEBSERVICE 1", "TESTE DE INCLUSAO WEBSERVICE 2"};
        alterafichaCompensacao.setMENSAGENS(mensagem);

        alteraBoletoTituloEntrada.setFICHA_COMPENSACAO(alterafichaCompensacao);


        Altera_boleto_recibo_pagador_Type alteraBoletoReciboPagador = new Altera_boleto_recibo_pagador_Type();
        String mensagemReciboPagador[] = {"TESTE DE INCLUSAO WS MSG PAG 1", "TESTE DE INCLUSAO WS MSG PAG 2"};

        alteraBoletoReciboPagador.setMENSAGENS(mensagemReciboPagador);

        alteraBoletoTituloEntrada.setRECIBO_PAGADOR(alteraBoletoReciboPagador);

        Altera_boleto_pagamento_Type alteraPagamento = new Altera_boleto_pagamento_Type();

        alteraPagamento.setTIPO(Altera_boleto_pagamento_TypeTIPO.NAO_ACEITA_VALOR_DIVERGENTE);
        alteraPagamento.setQUANTIDADE_PERMITIDA(new Short("01"));
        alteraPagamento.setVALOR_MINIMO(BigDecimal.ZERO);
        alteraPagamento.setVALOR_MAXIMO(BigDecimal.ZERO);
        alteraBoletoTituloEntrada.setPAGAMENTO(alteraPagamento);


        alteraBoleto.setTITULO(alteraBoletoTituloEntrada);
        dados.setALTERA_BOLETO(alteraBoleto);

        params.setHEADER(header);


        params.setDADOS(dados);

        Servico_saida_negocial_Type retorno = null;

        try {
            retorno = stub.ALTERA_BOLETO(params);

            System.out.println(retorno);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    private static void testeIncluirBoleto() throws ServiceException {
        Manutencao_cobranca_bancaria_ServiceLocator locator = new Manutencao_cobranca_bancaria_ServiceLocator();
        Manutencao_cobranca_bancaria_PortType stub = locator.getmanutencao_cobranca_bancariaSOAP();

        Servico_entrada_negocial_Type params = new Servico_entrada_negocial_Type();
        br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE header = new br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE();
        Dados_entrada_Type dados = new Dados_entrada_Type();


        header.setAUTENTICACAO(DO_HASHB64(hash));
        header.setUSUARIO_SERVICO(USUARIO_SERVICO);
        header.setOPERACAO(INCLUIR_BOLETO);
        header.setDATA_HORA(DATA_HORA);
        header.setVERSAO(VERSAO);
        header.setSISTEMA_ORIGEM(SISTEMA_ORIGEM);


        Inclui_boleto_entrada_Type incluirBoleto = new Inclui_boleto_entrada_Type();

        incluirBoleto.setCODIGO_BENEFICIARIO(CODIGO_DO_BENEFICIARIO);

        Titulo_entrada_Type incluiBoletoTituloEntrada = new Titulo_entrada_Type();
        incluiBoletoTituloEntrada.setNOSSO_NUMERO(NOSSO_NUMERO.longValue());
        incluiBoletoTituloEntrada.setNUMERO_DOCUMENTO(NUMERO_DOCUMENTO);
        incluiBoletoTituloEntrada.setDATA_VENCIMENTO(new Date());
        incluiBoletoTituloEntrada.setVALOR(VALOR_TITULO);
        incluiBoletoTituloEntrada.setTIPO_ESPECIE(new Short("02"));
        incluiBoletoTituloEntrada.setFLAG_ACEITE(Titulo_entrada_TypeFLAG_ACEITE.S);
        incluiBoletoTituloEntrada.setDATA_EMISSAO(new Date());
        incluiBoletoTituloEntrada.setCODIGO_MOEDA(new Short("09"));

        Juros_mora_Type jurosMora = new Juros_mora_Type();
        jurosMora.setTIPO(Juros_mora_TypeTIPO.VALOR_POR_DIA);
        jurosMora.setVALOR(new BigDecimal("0.50"));
        incluiBoletoTituloEntrada.setJUROS_MORA(jurosMora);


        incluiBoletoTituloEntrada.setVALOR_ABATIMENTO(BigDecimal.ZERO);


        Pos_vencimento_Type posVencimento = new Pos_vencimento_Type();
        posVencimento.setNUMERO_DIAS(new Short("120"));
        posVencimento.setACAO(Pos_vencimento_TypeACAO.DEVOLVER);
        incluiBoletoTituloEntrada.setPOS_VENCIMENTO(posVencimento);


        Pagador_Type pagador_Type = new Pagador_Type();
        pagador_Type.setNOME("RODRIGO MATIAS");
        pagador_Type.setCPF(new Long("82795479168"));

	   /* pagador_Type.setCNPJ(new Long("11111111111111"));
	    pagador_Type.setRAZAO_SOCIAL(null);*/


        Endereco_Type endereco_Type = new Endereco_Type();
        endereco_Type.setBAIRRO("JARDIM GOIAS");
        endereco_Type.setLOGRADOURO("AV. H");
        endereco_Type.setCIDADE("GOIANIA");
        endereco_Type.setUF("GO");
        endereco_Type.setCEP(74810070);


        pagador_Type.setENDERECO(endereco_Type);
        incluiBoletoTituloEntrada.setPAGADOR(pagador_Type);


        Ficha_compensacao_Type ficha_compensacao_Type = new Ficha_compensacao_Type();
        String mensagem[] = {"TESTE DE INCLUSAO WEBSERVICE 1", "TESTE DE INCLUSAO WEBSERVICE 2"};
        ficha_compensacao_Type.setMENSAGENS(mensagem);
        incluiBoletoTituloEntrada.setFICHA_COMPENSACAO(ficha_compensacao_Type);


        Recibo_pagador_Type recibo_pagador_Type = new Recibo_pagador_Type();
        String mensagemReciboPagador[] = {"TESTE DE INCLUSAO WS MSG PAG 1", "TESTE DE INCLUSAO WS MSG PAG 2"};
        recibo_pagador_Type.setMENSAGENS(mensagemReciboPagador);

        incluiBoletoTituloEntrada.setRECIBO_PAGADOR(recibo_pagador_Type);

        Pagamento_Type pagamento_Type = new Pagamento_Type();

        pagamento_Type.setTIPO(Pagamento_TypeTIPO.NAO_ACEITA_VALOR_DIVERGENTE);
        pagamento_Type.setQUANTIDADE_PERMITIDA(new Short("01"));
        pagamento_Type.setVALOR_MINIMO(BigDecimal.ZERO);
        pagamento_Type.setVALOR_MAXIMO(BigDecimal.ZERO);


        incluirBoleto.setTITULO(incluiBoletoTituloEntrada);
        dados.setINCLUI_BOLETO(incluirBoleto);

        params.setHEADER(header);


        params.setDADOS(dados);

        Servico_saida_negocial_Type retorno = null;

        try {
            retorno = stub.INCLUI_BOLETO(params);

            System.out.println(retorno.getDADOS().getEXCECAO());
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void testeIncluirBoletoPessoaJurida() throws ServiceException {
        br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Manutencao_cobranca_bancaria_ServiceLocator locator = new br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Manutencao_cobranca_bancaria_ServiceLocator();
        br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Manutencao_cobranca_bancaria_PortType stub = locator.getmanutencao_cobranca_bancariaSOAP();

        br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Servico_entrada_negocial_Type params = new br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Servico_entrada_negocial_Type();
        br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE header = new br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE();
        br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Dados_entrada_Type dados = new br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Dados_entrada_Type();


        header.setAUTENTICACAO(DO_HASHB64(hash));
        header.setUSUARIO_SERVICO(USUARIO_SERVICO);
        header.setOPERACAO(INCLUIR_BOLETO);
        header.setDATA_HORA(DATA_HORA);
        header.setVERSAO(VERSAO);
        header.setSISTEMA_ORIGEM(SISTEMA_ORIGEM);


        br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Inclui_boleto_entrada_Type incluirBoleto = new br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Inclui_boleto_entrada_Type();

        incluirBoleto.setCODIGO_BENEFICIARIO(CODIGO_DO_BENEFICIARIO);

        br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Titulo_entrada_Type incluiBoletoTituloEntrada = new br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Titulo_entrada_Type();
        incluiBoletoTituloEntrada.setNOSSO_NUMERO(NOSSO_NUMERO.longValue());
        incluiBoletoTituloEntrada.setNUMERO_DOCUMENTO(NUMERO_DOCUMENTO);
        incluiBoletoTituloEntrada.setDATA_VENCIMENTO(new Date());
        incluiBoletoTituloEntrada.setVALOR(VALOR_TITULO);
        incluiBoletoTituloEntrada.setTIPO_ESPECIE(new Short("02"));
        incluiBoletoTituloEntrada.setFLAG_ACEITE(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Titulo_entrada_TypeFLAG_ACEITE.S);
        incluiBoletoTituloEntrada.setDATA_EMISSAO(new Date());
        incluiBoletoTituloEntrada.setCODIGO_MOEDA(new Short("09"));

        br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Juros_mora_Type jurosMora = new br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Juros_mora_Type();
        jurosMora.setTIPO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Juros_mora_TypeTIPO.VALOR_POR_DIA);
        jurosMora.setVALOR(new BigDecimal("0.50"));
        incluiBoletoTituloEntrada.setJUROS_MORA(jurosMora);


        incluiBoletoTituloEntrada.setVALOR_ABATIMENTO(BigDecimal.ZERO);


        br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Pos_vencimento_Type posVencimento = new br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Pos_vencimento_Type();
        posVencimento.setNUMERO_DIAS(new Short("120"));
        posVencimento.setACAO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Pos_vencimento_TypeACAO.DEVOLVER);
        incluiBoletoTituloEntrada.setPOS_VENCIMENTO(posVencimento);


        br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Pagador_Type pagador_Type = new br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Pagador_Type();

        pagador_Type.setCNPJ(new Long("11111111111111"));
        pagador_Type.setRAZAO_SOCIAL("teste");


        br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Endereco_Type endereco_Type = new br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Endereco_Type();
        endereco_Type.setBAIRRO("JARDIM GOIAS");
        endereco_Type.setLOGRADOURO("AV. H");
        endereco_Type.setCIDADE("GOIANIA");
        endereco_Type.setUF("GO");
        endereco_Type.setCEP(74810070);


        pagador_Type.setENDERECO(endereco_Type);
        incluiBoletoTituloEntrada.setPAGADOR(pagador_Type);


        br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Ficha_compensacao_Type ficha_compensacao_Type = new br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Ficha_compensacao_Type();
        String mensagem[] = {"TESTE DE INCLUSAO WEBSERVICE 1", "TESTE DE INCLUSAO WEBSERVICE 2"};
        ficha_compensacao_Type.setMENSAGENS(mensagem);
        incluiBoletoTituloEntrada.setFICHA_COMPENSACAO(ficha_compensacao_Type);


        br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Recibo_pagador_Type recibo_pagador_Type = new br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Recibo_pagador_Type();
        String mensagemReciboPagador[] = {"TESTE DE INCLUSAO WS MSG PAG 1", "TESTE DE INCLUSAO WS MSG PAG 2"};
        recibo_pagador_Type.setMENSAGENS(mensagemReciboPagador);

        incluiBoletoTituloEntrada.setRECIBO_PAGADOR(recibo_pagador_Type);

        //Pagamento_Type pagamento_Type = new Pagamento_Type();
        br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Pagamento_Type pagamento_Type = new br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Pagamento_Type();

		/*		pagamento_Type.setTIPO(Pagamento_TypeTIPO.NAO_ACEITA_VALOR_DIVERGENTE);
		pagamento_Type.setQUANTIDADE_PERMITIDA(new Short("01"));
		pagamento_Type.setVALOR_MINIMO(BigDecimal.ZERO);
		pagamento_Type.setVALOR_MAXIMO(BigDecimal.ZERO);
		incluiBoletoTituloEntrada.setPAGAMENTO(pagamento_Type);*/
        pagamento_Type.setTIPO(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Pagamento_TypeTIPO.NAO_ACEITA_VALOR_DIVERGENTE);
        pagamento_Type.setQUANTIDADE_PERMITIDA(new Short("01"));
        pagamento_Type.setVALOR_MINIMO(BigDecimal.ZERO);
        pagamento_Type.setVALOR_MAXIMO(BigDecimal.ZERO);
        incluiBoletoTituloEntrada.setPAGAMENTO(pagamento_Type);


        incluirBoleto.setTITULO(incluiBoletoTituloEntrada);
        dados.setINCLUI_BOLETO(incluirBoleto);

        params.setHEADER(header);


        params.setDADOS(dados);

        br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Servico_saida_negocial_Type retorno = null;

        try {
            retorno = stub.INCLUI_BOLETO(params);

            System.out.println(retorno.getDADOS().getEXCECAO());
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void teste() {

        EntradaConsultaBoletoDto dto = new EntradaConsultaBoletoDto();
        DadosBoletoConsultaDto dadosBoletoConsultaDto = new DadosBoletoConsultaDto();
        ConsultaBoletoEntradaTypedto consultaBoletoEntradaTypedto = new ConsultaBoletoEntradaTypedto();
        consultaBoletoEntradaTypedto.setCodigoBeneficiario(46546);
        consultaBoletoEntradaTypedto.setNossoNumero(new Long(4545));
        dadosBoletoConsultaDto.setConsultaBoletoEntradaTypedto(consultaBoletoEntradaTypedto);
        dto.setDadosBoletoConsultaDto(dadosBoletoConsultaDto);
        HeadBoletoConsultaDto headBoletoConsultaDto = new HeadBoletoConsultaDto();
        headBoletoConsultaDto.setAutenticacao("121");
        headBoletoConsultaDto.setDataHora("454545");
        headBoletoConsultaDto.setOperacao("hjhkhk");
        headBoletoConsultaDto.setSistemaOrigem("46");
        headBoletoConsultaDto.setUsuarioServico("45454");
        headBoletoConsultaDto.setVersao("1212");
        SERVICO_ENTRADA_NEGOCIAL_TYPE servico_entrada_negocial_type = EntradaConsultaBoletoMapper.INSTANCE.
                toSERVICO_ENTRADA_NEGOCIAL_TYPE(dto);

    }

    public static String DO_HASHB64(String DADOS) {
        MessageDigest MD;
        byte[] HASH;
        try {
            MD = MessageDigest.getInstance("SHA-256");
            HASH = MD.digest(DADOS.getBytes("ISO8859-1"));
            return Base64.getEncoder().encodeToString(HASH);
        } catch (Exception EX) {
            return null;
        }
    }
}
