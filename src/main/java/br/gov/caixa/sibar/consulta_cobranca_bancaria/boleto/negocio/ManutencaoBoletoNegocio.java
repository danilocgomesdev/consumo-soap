/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.negocio;

import br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.dto.CONSULTA_BOLETO;
import br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.dto.DadosBoletoDto;

/**
 *
 * @author martins.santos
 */
public interface ManutencaoBoletoNegocio {
    String incluirBoleto(DadosBoletoDto dadosBoleto);
    String alterarBoleto(DadosBoletoDto dadosBoleto);
    String consultaBoleto(CONSULTA_BOLETO consultaBoleto);
    boolean baixarBoleto(DadosBoletoDto dadosBoleto);
}
