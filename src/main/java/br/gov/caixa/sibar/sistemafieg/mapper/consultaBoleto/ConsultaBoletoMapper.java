package br.gov.caixa.sibar.sistemafieg.mapper.consultaBoleto;

import br.gov.caixa.sibar.sistemafieg.dto.consultaBoleto.ConsultaBoletoDto;
import br.gov.caixa.sibar.sistemafieg.model.ConsultaBoleto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {EntradaConsultaBoletoMapper.class})
public interface ConsultaBoletoMapper {
    ConsultaBoletoMapper INSTANCE = Mappers.getMapper(ConsultaBoletoMapper.class);


    @Mappings({
            @Mapping(source = "cpfCnpj", target = "cpfCnpj"),
            @Mapping(source = "entradaConsultaBoletoDto", target = "entradaConsultaBoleto")
    })
    ConsultaBoleto ToConsultaBoleto(ConsultaBoletoDto source);

}
