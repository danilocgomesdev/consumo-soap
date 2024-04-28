package br.gov.caixa.sibar.sistemafieg.service;


import br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.*;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.DadosDto;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.DescontoDto;
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
public class IncluirBoletoPessoaJuridicaService {

    /**
     * Metodo para incluir boleto Para pessoa Juridica
     *
     * @param dto
     * @return
     */
    public Servico_saida_negocial_Type incluirBoletoPessoaJuridica(DadosDto dto) {
        try {
            Manutencao_cobranca_bancaria_ServiceLocator locator = new Manutencao_cobranca_bancaria_ServiceLocator();
            Manutencao_cobranca_bancaria_PortType stub = null;
            stub = locator.getmanutencao_cobranca_bancariaSOAP();

            Servico_entrada_negocial_Type params = new Servico_entrada_negocial_Type();
            AutenticacoService autenticacoService = new AutenticacoService();
            TituloDto tituloDtoObject = dto.getIncluiBoletoDtoObject().getTituloDtoObject();
            HEADER_BARRAMENTO_TYPE header = gerarHeader_barramento_typeParaInsert(
                    autenticacoService.gerarHash(
                            Integer.valueOf(
                                    dto.getIncluiBoletoDtoObject().getCodigoBeneficiario()),
                            autenticacoService.getDataConvertida(
                                    tituloDtoObject.getDataVencimento()
                                            .toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime()),
                            tituloDtoObject.getValor(),
                            new Long(tituloDtoObject.getNossoNumero()),
                            dto.getCpf_cnpj_head()
                    )
            );

            Dados_entrada_Type dados = getDadosToIncludeBoleto(dto);
            params.setHEADER(header);
            params.setDADOS(dados);
            Servico_saida_negocial_Type retorno = null;
            retorno = stub.INCLUI_BOLETO(params);
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
    gerarHeader_barramento_typeParaInsert(String autenticaoHash) {
        HEADER_BARRAMENTO_TYPE header = new HEADER_BARRAMENTO_TYPE();
        AutenticacoService autenticacoService = new AutenticacoService();
        header.setAUTENTICACAO(autenticaoHash);
        header.setVERSAO("1.2");
        header.setUSUARIO_SERVICO("SGCBS02P");
        header.setOPERACAO("INCLUI_BOLETO");
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
    private Dados_entrada_Type getDadosToIncludeBoleto(DadosDto dto) {
        UtilBody utilBody = new UtilBody();
        dto = utilBody.validacaoCaracteresEspeciaisDto(dto);

        if (dto != null && dto.getIncluiBoletoDtoObject() != null
                && dto.getIncluiBoletoDtoObject().getTituloDtoObject() != null
                && dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject() != null
                && dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getCnpj() != null
                && dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getCnpj().trim().equals("")) {
            dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().setCnpj(null);
        }
        if (dto != null && dto.getIncluiBoletoDtoObject() != null
                && dto.getIncluiBoletoDtoObject().getTituloDtoObject() != null
                && dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject() != null
                && dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getCpf() != null
                && dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getCpf().trim().equals("")) {
            dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().setCpf(null);
        }
        if (dto != null && dto.getIncluiBoletoDtoObject() != null
                && dto.getIncluiBoletoDtoObject().getTituloDtoObject() != null
                && dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject() != null
                && dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getEnderecoDto() != null
                && dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getEnderecoDto().getCep() != null
                && dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getEnderecoDto().getCep().trim().equals("")
                || dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getEnderecoDto().getCep().trim().length() != 8) {
            dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getEnderecoDto().setCep(null);
        }

//        change cnpj para remover mascar
        String cnpj = dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().getCnpj();
        dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject().setCnpj(utilBody.substitueCaracterEspeciaisCnpjCpf(cnpj));


        Dados_entrada_Type dadosEntradaType = DadosEntradaTypeMapper.INSTANCE.toModelCnpj(dto);

        String flagAceite = dto.getIncluiBoletoDtoObject().getTituloDtoObject().getFlagAceite();
        if (flagAceite.equals("S")) {
            dadosEntradaType.getINCLUI_BOLETO().getTITULO().setFLAG_ACEITE(Titulo_entrada_TypeFLAG_ACEITE.S);
        } else if (flagAceite.equals("N")) {
            dadosEntradaType.getINCLUI_BOLETO().getTITULO().setFLAG_ACEITE(Titulo_entrada_TypeFLAG_ACEITE.N);
        } else {
            return null;
        }

        String tipo = dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPagamentoDtoObject().getTipo();

        switch (tipo.toUpperCase()) {
            case "ACEITA_QUALQUER_VALOR":
                dadosEntradaType.getINCLUI_BOLETO().getTITULO().getPAGAMENTO().setTIPO(Pagamento_TypeTIPO.ACEITA_QUALQUER_VALOR);
                break;
            case "ACEITA_VALORES_ENTRE_MINIMO_MAXIMO":
                dadosEntradaType.getINCLUI_BOLETO().getTITULO().getPAGAMENTO().setTIPO(Pagamento_TypeTIPO.ACEITA_VALORES_ENTRE_MINIMO_MAXIMO);
                break;
            case "NAO_ACEITA_VALOR_DIVERGENTE":
                dadosEntradaType.getINCLUI_BOLETO().getTITULO().getPAGAMENTO().setTIPO(Pagamento_TypeTIPO.NAO_ACEITA_VALOR_DIVERGENTE);
                break;
            case "SOMENTE_VALOR_MINIMO":
                dadosEntradaType.getINCLUI_BOLETO().getTITULO().getPAGAMENTO().setTIPO(Pagamento_TypeTIPO.SOMENTE_VALOR_MINIMO);
                break;
            default:
                return null;
        }

        String tipoJurusMora = dto.getIncluiBoletoDtoObject().getTituloDtoObject().getJurosMoraDtoObject().getTipo();

        switch (tipoJurusMora.toUpperCase()) {
            case "VALOR_POR_DIA":
                dadosEntradaType.getINCLUI_BOLETO().getTITULO().getJUROS_MORA().setTIPO(Juros_mora_TypeTIPO.VALOR_POR_DIA);
                break;
            case "TAXA_MENSAL":
                dadosEntradaType.getINCLUI_BOLETO().getTITULO().getJUROS_MORA().setTIPO(Juros_mora_TypeTIPO.TAXA_MENSAL);
                break;
            case "ISENTO":
                dadosEntradaType.getINCLUI_BOLETO().getTITULO().getJUROS_MORA().setTIPO(Juros_mora_TypeTIPO.ISENTO);
                break;
            case "PERCENTUAL_DIA_CORRIDO":
                dadosEntradaType.getINCLUI_BOLETO().getTITULO().getJUROS_MORA().setTIPO(Juros_mora_TypeTIPO.PERCENTUAL_DIA_CORRIDO);
                break;
            case "PERCENTUAL_ANO_DIA_CORRIDO":
                dadosEntradaType.getINCLUI_BOLETO().getTITULO().getJUROS_MORA().setTIPO(Juros_mora_TypeTIPO.PERCENTUAL_ANO_DIA_CORRIDO);
                break;
            case "VALOR_DIA_UTIL":
                dadosEntradaType.getINCLUI_BOLETO().getTITULO().getJUROS_MORA().setTIPO(Juros_mora_TypeTIPO.VALOR_DIA_UTIL);
                break;
            case "PERCENTUAL_DIA_UTIL":
                dadosEntradaType.getINCLUI_BOLETO().getTITULO().getJUROS_MORA().setTIPO(Juros_mora_TypeTIPO.PERCENTUAL_DIA_UTIL);
                break;
            case "PERCENTUAL_MES_DIA_UTIL":
                dadosEntradaType.getINCLUI_BOLETO().getTITULO().getJUROS_MORA().setTIPO(Juros_mora_TypeTIPO.PERCENTUAL_MES_DIA_UTIL);
                break;
            case "PERCENTUAL_ANO_DIA_UTIL":
                dadosEntradaType.getINCLUI_BOLETO().getTITULO().getJUROS_MORA().setTIPO(Juros_mora_TypeTIPO.PERCENTUAL_ANO_DIA_UTIL);
                break;
            default:
                return null;
        }

        String acao = dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPosVencimentoDtoObject().getAcao();
        if (acao.toUpperCase().equals("PROTESTAR")) {
            dadosEntradaType.getINCLUI_BOLETO().getTITULO().getPOS_VENCIMENTO().setACAO(Pos_vencimento_TypeACAO.PROTESTAR);
        } else if (acao.toUpperCase().equals("DEVOLVER")) {
            dadosEntradaType.getINCLUI_BOLETO().getTITULO().getPOS_VENCIMENTO().setACAO(Pos_vencimento_TypeACAO.DEVOLVER);
        } else {
            return null;
        }

        DescontoDto[] descontoDtos = dto.getIncluiBoletoDtoObject().getTituloDtoObject().getDescontoDtoObject();
        Desconto_Type[] descontoTypes = dadosEntradaType.getINCLUI_BOLETO().getTITULO().getDESCONTOS();

        for (int i = 0; descontoDtos.length > i; i++) {
            switch (descontoDtos[i].getTipo().toUpperCase()) {
                case "ISENTO":
                    descontoTypes[i].setTIPO(Desconto_TypeTIPO.ISENTO);
                    break;
                case "VALOR_FIXO_ATE_DATA":
                    descontoTypes[i].setTIPO(Desconto_TypeTIPO.VALOR_FIXO_ATE_DATA);
                    break;
                case "PERCENTUAL_ATE_DATA":
                    descontoTypes[i].setTIPO(Desconto_TypeTIPO.PERCENTUAL_ATE_DATA);
                    break;
                case "VALOR_ANTECIPACAO_DIA_CORRIDO":
                    descontoTypes[i].setTIPO(Desconto_TypeTIPO.VALOR_ANTECIPACAO_DIA_UTIL);
                    break;
                case "VALOR_ANTECIPACAO_DIA_UTIL":
                    descontoTypes[i].setTIPO(Desconto_TypeTIPO.VALOR_ANTECIPACAO_DIA_UTIL);
                    break;
                case "PERCENTUAL_ANTECIPACAO_DIA_CORRIDO":
                    descontoTypes[i].setTIPO(Desconto_TypeTIPO.PERCENTUAL_ANTECIPACAO_DIA_CORRIDO);
                    break;
                case "PERCENTUAL_ANTECIPACAO_DIA_UTIL":
                    descontoTypes[i].setTIPO(Desconto_TypeTIPO.VALOR_ANTECIPACAO_DIA_UTIL);
                    break;
                default:
                    return null;
            }
        }

        String razao_social = dadosEntradaType.getINCLUI_BOLETO().getTITULO().getPAGADOR().getRAZAO_SOCIAL();
        if (razao_social.length() > 40 && razao_social != null) {
            dadosEntradaType.getINCLUI_BOLETO().getTITULO().getPAGADOR().setRAZAO_SOCIAL(razao_social.substring(0, 40));
        }


        Endereco_Type endereco = dadosEntradaType.getINCLUI_BOLETO().getTITULO().getPAGADOR().getENDERECO();
        if (endereco != null) {
            if (endereco.getLOGRADOURO().length() > 40 && endereco.getLOGRADOURO() != null) {
                dadosEntradaType.getINCLUI_BOLETO().getTITULO()
                        .getPAGADOR().getENDERECO()
                        .setLOGRADOURO(endereco.getLOGRADOURO().substring(0, 35));
            }
            if (endereco.getBAIRRO().length() > 15 && endereco.getBAIRRO() != null) {
                dadosEntradaType.getINCLUI_BOLETO().getTITULO()
                        .getPAGADOR().getENDERECO()
                        .setBAIRRO(endereco.getBAIRRO().substring(0, 10));
            }
            if (endereco.getCIDADE().length() > 15 && endereco.getCIDADE() != null) {
                dadosEntradaType.getINCLUI_BOLETO().getTITULO()
                        .getPAGADOR().getENDERECO()
                        .setCIDADE(endereco.getCIDADE().substring(0, 15));
            }
            if (endereco.getUF().length() > 2 && endereco.getUF() != null) {
                dadosEntradaType.getINCLUI_BOLETO().getTITULO()
                        .getPAGADOR().getENDERECO()
                        .setUF(endereco.getUF().substring(0, 2));
            }
        }


        // formatacao valor duas casa

        BigDecimal valorBigdecima = dadosEntradaType
                .getINCLUI_BOLETO().getTITULO()
                .getVALOR();
        BigDecimal valor = valorBigdecima.setScale(2, BigDecimal.ROUND_UP);
        dadosEntradaType
                .getINCLUI_BOLETO().getTITULO()
                .setVALOR(valor);

        return dadosEntradaType;
    }
}
