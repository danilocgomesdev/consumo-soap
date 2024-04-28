package br.gov.caixa.sibar.sistemafieg.service;

import br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE;
import br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.*;
import br.gov.caixa.sibar.sistemafieg.dto.consultaBoleto.ConsultaBoletoDto;
import br.gov.caixa.sibar.sistemafieg.mapper.consultaBoleto.ConsultaBoletoMapper;
import br.gov.caixa.sibar.sistemafieg.model.ConsultaBoleto;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.time.LocalDateTime;

/**
 * Servico para consulta do boleto no WS da caixa
 *
 * @author Matheus Calaça
 */
public class ConsultaBoletoService {

    /**
     * Faz a busca no ws da caixa e retona os dados do boleto
     *
     * @param consultaBoletoDto
     * @return SERVICO_SAIDA_NEGOCIAL_TYPE
     */
    public SERVICO_SAIDA_NEGOCIAL_TYPE consultaBoleto(ConsultaBoletoDto consultaBoletoDto) {
        try {
            Consulta_Cobranca_Bancaria_Boleto_ServiceLocator locator =
                    new Consulta_Cobranca_Bancaria_Boleto_ServiceLocator();
            Consulta_Cobranca_Bancaria_Boleto_PortType stub = locator.getConsulta_Cobranca_Bancaria_BoletoSOAP();
            SERVICO_ENTRADA_NEGOCIAL_TYPE params = preencheOsDadosParaConsultaBolet(consultaBoletoDto);
            SERVICO_SAIDA_NEGOCIAL_TYPE retorno = null;
            retorno = stub.CONSULTA_BOLETO(params);
            return retorno;

        } catch (RemoteException | ServiceException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * preenche os dados de entrada para a consulta do WS da caixa
     *
     * @param consultaBoletoDto
     * @return
     */
    private SERVICO_ENTRADA_NEGOCIAL_TYPE preencheOsDadosParaConsultaBolet(ConsultaBoletoDto consultaBoletoDto) {
        ConsultaBoleto consultaBoleto = ConsultaBoletoMapper.INSTANCE.ToConsultaBoleto(consultaBoletoDto);

        AutenticacoService autenticacoService = new AutenticacoService();
        DADOS_ENTRADA_TYPE dados = consultaBoleto.getEntradaConsultaBoleto().getDADOS();
        String autenticaoHash = autenticacoService.gerarHash(
                dados.getCONSULTA_BOLETO().getCODIGO_BENEFICIARIO(),
                "00000000",
                "000000000000000",
                dados.getCONSULTA_BOLETO().getNOSSO_NUMERO(),
                consultaBoleto.getCpfCnpj()
        );


        HEADER_BARRAMENTO_TYPE header = gerarHeader_barramento_typeParaConsulta(autenticaoHash);

        return new SERVICO_ENTRADA_NEGOCIAL_TYPE(header, dados);
    }

    /**
     * gera os dados para o header da consulta do boleto
     *
     * @param autenticaoHash
     * @return HEADER_BARRAMENTO_TYPE
     */
    private HEADER_BARRAMENTO_TYPE gerarHeader_barramento_typeParaConsulta(String autenticaoHash) {
        HEADER_BARRAMENTO_TYPE header = new HEADER_BARRAMENTO_TYPE();
        AutenticacoService autenticacoService = new AutenticacoService();
        header.setAUTENTICACAO(autenticaoHash);
        header.setVERSAO("1.2");
        header.setUSUARIO_SERVICO("SGCBS02P");
        header.setOPERACAO("CONSULTA_BOLETO");
        header.setSISTEMA_ORIGEM("SIGCB");
        header.setDATA_HORA(autenticacoService.getDataConvertida(LocalDateTime.now()));
        return header;
    }


}
