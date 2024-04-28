package br.gov.caixa.sibar.sistemafieg.service;

import br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Manutencao_cobranca_bancaria_PortType;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Manutencao_cobranca_bancaria_ServiceLocator;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Servico_entrada_negocial_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Servico_saida_negocial_Type;
import br.gov.caixa.sibar.sistemafieg.dto.baixaBoleto.BaixaBoletoEntradaTypeDto;
import br.gov.caixa.sibar.sistemafieg.dto.baixaBoleto.ServicoEntradaNegocialTypeDto;
import br.gov.caixa.sibar.sistemafieg.mapper.baixaBoleto.ServicoEntradaNegocialTypeMapper;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.time.LocalDateTime;

/**
 * Servico para fazer a baixa do boleto no WS da caixa
 *
 * @author Matheus Calaça
 */
public class BaixaBoletoService {

    /**
     * Faz a Baixa no ws da caixa
     *
     * @param servicoEntradaNegocialTypeDto
     * @return Servico_saida_negocial_Type
     */
    public Servico_saida_negocial_Type baixaBoleto(ServicoEntradaNegocialTypeDto servicoEntradaNegocialTypeDto) {
        try {
            Manutencao_cobranca_bancaria_ServiceLocator locator =
                    new Manutencao_cobranca_bancaria_ServiceLocator();
            Manutencao_cobranca_bancaria_PortType stub = locator.getmanutencao_cobranca_bancariaSOAP();
            Servico_entrada_negocial_Type params = preencheOsDadosParaBaixaBoleto(servicoEntradaNegocialTypeDto);
            Servico_saida_negocial_Type retorno = null;
            retorno = stub.BAIXA_BOLETO(params);
            return retorno;

        } catch (RemoteException | ServiceException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * preenche os dados de entrada para a consulta do WS da caixa
     *
     * @param servicoEntradaNegocialTypeDto
     * @returnServico_entrada_negocial_Type
     */
    private Servico_entrada_negocial_Type preencheOsDadosParaBaixaBoleto(ServicoEntradaNegocialTypeDto servicoEntradaNegocialTypeDto) {
        Servico_entrada_negocial_Type servico_entrada_negocial_type = ServicoEntradaNegocialTypeMapper.INSTANCE.toModel(servicoEntradaNegocialTypeDto);

        AutenticacoService autenticacoService = new AutenticacoService();
        BaixaBoletoEntradaTypeDto baixaBoletoEntradaTypeDto = servicoEntradaNegocialTypeDto.getDados()
                .getBaixaBoletoEntradaTypeDto();
        String autenticaoHash = autenticacoService.gerarHash(
                baixaBoletoEntradaTypeDto.getCodigoBeneficiario(),
                "00000000",
                "000000000000000",
                baixaBoletoEntradaTypeDto.getNossoNumero(),
                baixaBoletoEntradaTypeDto.getCpfCnpj()
        );


        HEADER_BARRAMENTO_TYPE header = gerarHeader_barramento_typeParaConsulta(autenticaoHash);

        return new Servico_entrada_negocial_Type(header, servico_entrada_negocial_type.getDADOS());
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
        header.setOPERACAO("BAIXA_BOLETO");
        header.setSISTEMA_ORIGEM("SIGCB");
        header.setDATA_HORA(autenticacoService.getDataConvertida(LocalDateTime.now()));
        return header;
    }


}
