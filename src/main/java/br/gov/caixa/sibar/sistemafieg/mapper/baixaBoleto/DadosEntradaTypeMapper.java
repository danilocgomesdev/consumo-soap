package br.gov.caixa.sibar.sistemafieg.mapper.baixaBoleto;

import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Dados_entrada_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Servico_entrada_negocial_Type;
import br.gov.caixa.sibar.sistemafieg.dto.baixaBoleto.DadosEntradaTypeDto;
import br.gov.caixa.sibar.sistemafieg.dto.baixaBoleto.ServicoEntradaNegocialTypeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {BaixaBoletoEntradaTypeMapper.class})
public interface DadosEntradaTypeMapper {
    DadosEntradaTypeMapper INSTANCE = Mappers.getMapper(DadosEntradaTypeMapper.class);

    @Mapping(source = "baixaBoletoEntradaTypeDto", target = "BAIXA_BOLETO")
    Dados_entrada_Type toModel(DadosEntradaTypeDto source);

    @Mapping(source = "BAIXA_BOLETO", target = "baixaBoletoEntradaTypeDto")
    DadosEntradaTypeDto toDto(Dados_entrada_Type source);

}
