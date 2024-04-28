package br.gov.caixa.sibar.sistemafieg.mapper.consultaBoleto;

import br.gov.caixa.sibar.HEADER_BARRAMENTO_TYPE;
import br.gov.caixa.sibar.sistemafieg.dto.consultaBoleto.HeadBoletoConsultaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper()
public interface HeadConsultaBoletoMapper {
    HeadConsultaBoletoMapper INSTANCE = Mappers.getMapper(HeadConsultaBoletoMapper.class);


    @Mappings({
            @Mapping(source = "versao", target = "VERSAO"),
            @Mapping(source = "usuarioServico", target = "USUARIO_SERVICO"),
            @Mapping(source = "operacao", target = "OPERACAO"),
            @Mapping(source = "autenticacao", target = "AUTENTICACAO"),
            @Mapping(source = "dataHora", target = "DATA_HORA"),
            @Mapping(source = "sistemaOrigem", target = "SISTEMA_ORIGEM")
    })
    HEADER_BARRAMENTO_TYPE ToHEADER_BARRAMENTO_TYPE(HeadBoletoConsultaDto source);

}
