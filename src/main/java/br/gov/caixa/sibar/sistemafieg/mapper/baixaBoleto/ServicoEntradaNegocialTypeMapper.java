package br.gov.caixa.sibar.sistemafieg.mapper.baixaBoleto;

import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Servico_entrada_negocial_Type;
import br.gov.caixa.sibar.sistemafieg.dto.baixaBoleto.ServicoEntradaNegocialTypeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {DadosEntradaTypeMapper.class})
public interface ServicoEntradaNegocialTypeMapper {
    ServicoEntradaNegocialTypeMapper INSTANCE = Mappers.getMapper(ServicoEntradaNegocialTypeMapper.class);

    @Mapping(source = "dados", target = "DADOS")
    Servico_entrada_negocial_Type toModel(ServicoEntradaNegocialTypeDto source);

    @Mapping(source = "DADOS", target = "dados")
    ServicoEntradaNegocialTypeDto toDto(Servico_entrada_negocial_Type source);

}
