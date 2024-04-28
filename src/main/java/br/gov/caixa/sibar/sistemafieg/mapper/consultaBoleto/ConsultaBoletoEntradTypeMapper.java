package br.gov.caixa.sibar.sistemafieg.mapper.consultaBoleto;

import br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_boleto_entrada_Type;
import br.gov.caixa.sibar.sistemafieg.dto.consultaBoleto.ConsultaBoletoEntradaTypedto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ConsultaBoletoEntradTypeMapper {
    ConsultaBoletoEntradTypeMapper INSTANCE = Mappers.getMapper(ConsultaBoletoEntradTypeMapper.class);
    @Mappings({
            @Mapping(source = "codigoBeneficiario", target = "CODIGO_BENEFICIARIO"),
            @Mapping(source = "nossoNumero", target = "NOSSO_NUMERO")
    })
    Consulta_boleto_entrada_Type ToDADOS_ENTRADA_TYPE(ConsultaBoletoEntradaTypedto source);

}
