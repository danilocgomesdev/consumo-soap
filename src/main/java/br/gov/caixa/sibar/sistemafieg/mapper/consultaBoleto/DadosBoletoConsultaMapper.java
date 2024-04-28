package br.gov.caixa.sibar.sistemafieg.mapper.consultaBoleto;

import br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.DADOS_ENTRADA_TYPE;
import br.gov.caixa.sibar.sistemafieg.dto.consultaBoleto.DadosBoletoConsultaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = ConsultaBoletoEntradTypeMapper.class)
public interface DadosBoletoConsultaMapper {
    DadosBoletoConsultaMapper INSTANCE = Mappers.getMapper(DadosBoletoConsultaMapper.class);

    @Mapping(source = "consultaBoletoEntradaTypedto", target = "CONSULTA_BOLETO")
    DADOS_ENTRADA_TYPE ToDADOS_ENTRADA_TYPE(DadosBoletoConsultaDto source);

}
