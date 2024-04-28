package br.gov.caixa.sibar.sistemafieg.service;


import br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.*;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.DadosDto;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.TituloDto;
import br.gov.caixa.sibar.sistemafieg.mapper.incluirBoleto.DadosEntradaTypeMapper;
import br.gov.caixa.sibar.util.UtilBody;

import javax.xml.rpc.ServiceException;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Servico para Incluir do boleto no WS da caixa Pessoa fisica
 *
 * @author Matheus Calaça
 */
public class AlteraBoletoPessoaFisicaService {

    /**
     * Metodo para incluir boleto Para pessoa fisica
     *
     * @param dto
     * @return
     */
    public Servico_saida_negocial_Type alterarBoletoPessoaFisica(DadosDto dto) {
        try {
            Manutencao_cobranca_bancaria_ServiceLocator locator = new Manutencao_cobranca_bancaria_ServiceLocator();
            Manutencao_cobranca_bancaria_PortType stub = locator.getmanutencao_cobranca_bancariaSOAP();

            Servico_entrada_negocial_Type params = new Servico_entrada_negocial_Type();
            AutenticacoService autenticacoService = new AutenticacoService();
            TituloDto tituloDtoObject = dto.getAterarBoletoDtoObject().getTituloDtoObject();
            HEADER_BARRAMENTO_TYPE header = gerarHeader_barramento_typeParaAlterar(
                    autenticacoService.gerarHash(
                            Integer.valueOf(
                                    dto.getAterarBoletoDtoObject().getCodigoBeneficiario()),
                            autenticacoService.getDataConvertida(
                                    tituloDtoObject.getDataVencimento()
                                            .toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime()),
                            tituloDtoObject.getValor(),
                            new Long(tituloDtoObject.getNossoNumero()),
                            dto.getCpf_cnpj_head()
                    )
            );

            Dados_entrada_Type dados = getDadosToAlterarBoleto(dto);
            params.setHEADER(header);
            params.setDADOS(dados);
            Servico_saida_negocial_Type retorno = null;
            retorno = stub.ALTERA_BOLETO(params);
            return retorno;
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * preenche os dados para o cabeçario
     *
     * @param autenticaoHash
     * @return
     */
    private HEADER_BARRAMENTO_TYPE
    gerarHeader_barramento_typeParaAlterar(String autenticaoHash) {
        HEADER_BARRAMENTO_TYPE header = new HEADER_BARRAMENTO_TYPE();
        AutenticacoService autenticacoService = new AutenticacoService();
        header.setAUTENTICACAO(autenticaoHash);
        header.setVERSAO("1.2");
        header.setUSUARIO_SERVICO("SGCBS02P");
        header.setOPERACAO("ALTERA_BOLETO");
        header.setSISTEMA_ORIGEM("SIGCB");
        header.setDATA_HORA(autenticacoService.getDataConvertida(LocalDateTime.now()));
        return header;
    }

    /**
     * preenche os dados do boleto para CPF
     *
     * @param dto
     * @return
     */
    private Dados_entrada_Type getDadosToAlterarBoleto(DadosDto dto) {

        UtilBody utilBody = new UtilBody();
        dto = utilBody.validacaoCaracteresEspeciaisDto(dto);

        if (dto != null && dto.getAterarBoletoDtoObject() != null
                && dto.getAterarBoletoDtoObject().getTituloDtoObject() != null
                && dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject() != null
                && dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getCnpj() != null
                && dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getCnpj().trim().equals("")) {
            dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().setCnpj(null);
        }
        if (dto != null && dto.getAterarBoletoDtoObject() != null
                && dto.getAterarBoletoDtoObject().getTituloDtoObject() != null
                && dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject() != null
                && dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getCpf() != null
                && dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getCpf().trim().equals("")) {
            dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().setCpf(null);
        }
        if (dto != null && dto.getAterarBoletoDtoObject() != null
                && dto.getAterarBoletoDtoObject().getTituloDtoObject() != null
                && dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject() != null
                && dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getEnderecoDto() != null
                && dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getEnderecoDto().getCep() != null
                && dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getEnderecoDto().getCep().trim().equals("")
                || dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getEnderecoDto().getCep().trim().length() != 8) {
            dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getEnderecoDto().setCep(null);
        }

        //        change cnpj e cpf para remover mascar
        String cpf = dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getCpf();
        if (cpf != null) {
            dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().setCpf(utilBody.substitueCaracterEspeciaisCnpjCpf(cpf));
        }
        String cnpj = dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getCnpj();
        if (cnpj != null) {
            dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().setCnpj(utilBody.substitueCaracterEspeciaisCnpjCpf(cnpj));
        }


        Dados_entrada_Type dadosEntradaType = DadosEntradaTypeMapper.INSTANCE.toModel(dto);

        String flagAceite = dto.getAterarBoletoDtoObject().getTituloDtoObject().getFlagAceite();
        if (flagAceite.equals("S")) {
            dadosEntradaType.getALTERA_BOLETO().getTITULO().setFLAG_ACEITE(Altera_boleto_titulo_entrada_TypeFLAG_ACEITE.S);
        } else if (flagAceite.equals("N")) {
            dadosEntradaType.getALTERA_BOLETO().getTITULO().setFLAG_ACEITE(Altera_boleto_titulo_entrada_TypeFLAG_ACEITE.N);
        } else {
            return null;
        }

        String tipo = dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagamentoDtoObject().getTipo();

        switch (tipo.toUpperCase()) {
            case "ACEITA_QUALQUER_VALOR":
                dadosEntradaType.getALTERA_BOLETO().getTITULO().getPAGAMENTO().setTIPO(Altera_boleto_pagamento_TypeTIPO.ACEITA_QUALQUER_VALOR);
                break;
            case "ACEITA_VALORES_ENTRE_MINIMO_MAXIMO":
                dadosEntradaType.getALTERA_BOLETO().getTITULO().getPAGAMENTO().setTIPO(Altera_boleto_pagamento_TypeTIPO.ACEITA_VALORES_ENTRE_MINIMO_MAXIMO);
                break;
            case "NAO_ACEITA_VALOR_DIVERGENTE":
                dadosEntradaType.getALTERA_BOLETO().getTITULO().getPAGAMENTO().setTIPO(Altera_boleto_pagamento_TypeTIPO.NAO_ACEITA_VALOR_DIVERGENTE);
                break;
            case "SOMENTE_VALOR_MINIMO":
                dadosEntradaType.getALTERA_BOLETO().getTITULO().getPAGAMENTO().setTIPO(Altera_boleto_pagamento_TypeTIPO.SOMENTE_VALOR_MINIMO);
                break;
            default:
                return null;
        }

        String tipoJurusMora = dto.getAterarBoletoDtoObject().getTituloDtoObject().getJurosMoraDtoObject().getTipo();

        switch (tipoJurusMora.toUpperCase()) {
            case "VALOR_POR_DIA":
                dadosEntradaType.getALTERA_BOLETO().getTITULO().getJUROS_MORA().setTIPO(Altera_boleto_juros_mora_TypeTIPO.VALOR_POR_DIA);
                break;
            case "TAXA_MENSAL":
                dadosEntradaType.getALTERA_BOLETO().getTITULO().getJUROS_MORA().setTIPO(Altera_boleto_juros_mora_TypeTIPO.TAXA_MENSAL);
                break;
            case "ISENTO":
                dadosEntradaType.getALTERA_BOLETO().getTITULO().getJUROS_MORA().setTIPO(Altera_boleto_juros_mora_TypeTIPO.ISENTO);
                break;
            case "PERCENTUAL_DIA_CORRIDO":
                dadosEntradaType.getALTERA_BOLETO().getTITULO().getJUROS_MORA().setTIPO(Altera_boleto_juros_mora_TypeTIPO.PERCENTUAL_DIA_CORRIDO);
                break;
            case "PERCENTUAL_ANO_DIA_CORRIDO":
                dadosEntradaType.getALTERA_BOLETO().getTITULO().getJUROS_MORA().setTIPO(Altera_boleto_juros_mora_TypeTIPO.PERCENTUAL_ANO_DIA_CORRIDO);
                break;
            case "VALOR_DIA_UTIL":
                dadosEntradaType.getALTERA_BOLETO().getTITULO().getJUROS_MORA().setTIPO(Altera_boleto_juros_mora_TypeTIPO.VALOR_DIA_UTIL);
                break;
            case "PERCENTUAL_DIA_UTIL":
                dadosEntradaType.getALTERA_BOLETO().getTITULO().getJUROS_MORA().setTIPO(Altera_boleto_juros_mora_TypeTIPO.PERCENTUAL_DIA_UTIL);
                break;
            case "PERCENTUAL_MES_DIA_UTIL":
                dadosEntradaType.getALTERA_BOLETO().getTITULO().getJUROS_MORA().setTIPO(Altera_boleto_juros_mora_TypeTIPO.PERCENTUAL_MES_DIA_UTIL);
                break;
            case "PERCENTUAL_ANO_DIA_UTIL":
                dadosEntradaType.getALTERA_BOLETO().getTITULO().getJUROS_MORA().setTIPO(Altera_boleto_juros_mora_TypeTIPO.PERCENTUAL_ANO_DIA_UTIL);
                break;
            default:
                return null;
        }

        String acao = dto.getAterarBoletoDtoObject().getTituloDtoObject().getPosVencimentoDtoObject().getAcao();
        if (acao.toUpperCase().equals("PROTESTAR")) {
            dadosEntradaType.getALTERA_BOLETO().getTITULO().getPOS_VENCIMENTO().setACAO(Altera_boleto_pos_vencimento_TypeACAO.PROTESTAR);
        } else if (acao.toUpperCase().equals("DEVOLVER")) {
            dadosEntradaType.getALTERA_BOLETO().getTITULO().getPOS_VENCIMENTO()
                    .setACAO(Altera_boleto_pos_vencimento_TypeACAO.DEVOLVER);
        } else {
            return null;
        }

//        DescontoDto[] descontoDtos = dto.getAterarBoletoDtoObject()().getTituloDtoObject().getDescontoDtoObject();
//        Altera_boleto_desconto_Type[] descontoTypes = dadosEntradaType.getALTERA_BOLETO().getTITULO().getDESCONTOS();
//
//        for(int i = 0 ;descontoDtos.length > i; i++ ) {
//            switch (descontoDtos[i].getTipo().toUpperCase()) {
//                case "ISENTO":
//                    descontoTypes[i].setTIPO(Desconto_TypeTIPO.ISENTO);
//                    break;
//                case "VALOR_FIXO_ATE_DATA":
//                    descontoTypes[i].setTIPO(Desconto_TypeTIPO.VALOR_FIXO_ATE_DATA);
//                    break;
//                case "PERCENTUAL_ATE_DATA":
//                    descontoTypes[i].setTIPO(Desconto_TypeTIPO.PERCENTUAL_ATE_DATA);
//                    break;
//                case "VALOR_ANTECIPACAO_DIA_CORRIDO":
//                    descontoTypes[i].setTIPO(Desconto_TypeTIPO.VALOR_ANTECIPACAO_DIA_UTIL);
//                    break;
//                case "VALOR_ANTECIPACAO_DIA_UTIL":
//                    descontoTypes[i].setTIPO(Desconto_TypeTIPO.VALOR_ANTECIPACAO_DIA_UTIL);
//                    break;
//                case "PERCENTUAL_ANTECIPACAO_DIA_CORRIDO":
//                    descontoTypes[i].setTIPO(Desconto_TypeTIPO.PERCENTUAL_ANTECIPACAO_DIA_CORRIDO);
//                    break;
//                case "PERCENTUAL_ANTECIPACAO_DIA_UTIL":
//                    descontoTypes[i].setTIPO(Desconto_TypeTIPO.VALOR_ANTECIPACAO_DIA_UTIL);
//                    break;
//                default:
//                    return null;
//            }
//        }

        String nome = dadosEntradaType.getALTERA_BOLETO().getTITULO().getPAGADOR().getNOME();
        if (nome.length() > 40 && nome != null) {
            dadosEntradaType.getALTERA_BOLETO().getTITULO().getPAGADOR().setNOME(nome.substring(0, 40));
        }

        Altera_boleto_endereco_Type endereco = dadosEntradaType.getALTERA_BOLETO().getTITULO().getPAGADOR().getENDERECO();
        if (endereco != null) {
            if (endereco.getLOGRADOURO().length() > 40 && endereco.getLOGRADOURO() != null) {
                dadosEntradaType.getALTERA_BOLETO().getTITULO()
                        .getPAGADOR().getENDERECO()
                        .setLOGRADOURO(endereco.getLOGRADOURO().substring(0, 40));
            }
            if (endereco.getBAIRRO().length() > 15 && endereco.getBAIRRO() != null) {
                dadosEntradaType.getALTERA_BOLETO().getTITULO()
                        .getPAGADOR().getENDERECO()
                        .setBAIRRO(endereco.getBAIRRO().substring(0, 15));
            }
            if (endereco.getCIDADE().length() > 15 && endereco.getCIDADE() != null) {
                dadosEntradaType.getALTERA_BOLETO().getTITULO()
                        .getPAGADOR().getENDERECO()
                        .setCIDADE(endereco.getCIDADE().substring(0, 15));
            }
            if (endereco.getUF().length() > 2 && endereco.getUF() != null) {
                dadosEntradaType.getALTERA_BOLETO().getTITULO()
                        .getPAGADOR().getENDERECO()
                        .setUF(endereco.getUF().substring(0, 2));
            }
        }


        // formatacao valor duas casa

        BigDecimal valorBigdecima = dadosEntradaType
                .getALTERA_BOLETO().getTITULO()
                .getVALOR();
        BigDecimal valor = valorBigdecima.setScale(2, BigDecimal.ROUND_UP);
        dadosEntradaType
                .getALTERA_BOLETO().getTITULO()
                .setVALOR(valor);

        return dadosEntradaType;
    }
}
