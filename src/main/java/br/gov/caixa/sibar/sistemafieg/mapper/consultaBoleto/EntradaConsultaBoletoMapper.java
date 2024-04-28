package br.gov.caixa.sibar.sistemafieg.mapper.consultaBoleto;

import br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SERVICO_ENTRADA_NEGOCIAL_TYPE;
import br.gov.caixa.sibar.sistemafieg.dto.consultaBoleto.EntradaConsultaBoletoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {HeadConsultaBoletoMapper.class, DadosBoletoConsultaMapper.class})
public interface EntradaConsultaBoletoMapper {
    EntradaConsultaBoletoMapper INSTANCE = Mappers.getMapper(EntradaConsultaBoletoMapper.class);

    @Mappings({
//            @Mapping(source = "headBoletoConsultaDto", target = "HEADER"),
            @Mapping(source = "dadosBoletoConsultaDto", target = "DADOS")
    })
    SERVICO_ENTRADA_NEGOCIAL_TYPE toSERVICO_ENTRADA_NEGOCIAL_TYPE(EntradaConsultaBoletoDto source);

    @Mappings({
            @Mapping(source = "DADOS", target = "dadosBoletoConsultaDto")
//            @Mapping(source = "HEADER", target = "headBoletoConsultaDto"),
    })
    EntradaConsultaBoletoDto toDto(SERVICO_ENTRADA_NEGOCIAL_TYPE source);

}
