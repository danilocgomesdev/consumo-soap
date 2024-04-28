package br.gov.caixa.sibar.sistemafieg.mapper.baixaBoleto;

import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Baixa_boleto_entrada_Type;
import br.gov.caixa.sibar.sistemafieg.dto.baixaBoleto.BaixaBoletoEntradaTypeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BaixaBoletoEntradaTypeMapper {
    BaixaBoletoEntradaTypeMapper INSTANCE = Mappers.getMapper(BaixaBoletoEntradaTypeMapper.class);

    @Mappings({
            @Mapping(source = "codigoBeneficiario", target = "CODIGO_BENEFICIARIO"),
            @Mapping(source = "nossoNumero", target = "NOSSO_NUMERO")
    })
    Baixa_boleto_entrada_Type toModel(BaixaBoletoEntradaTypeDto source);

    @Mappings({
            @Mapping(source = "CODIGO_BENEFICIARIO", target = "codigoBeneficiario"),
            @Mapping(source = "NOSSO_NUMERO", target = "nossoNumero")
    })
    BaixaBoletoEntradaTypeDto toDto(Baixa_boleto_entrada_Type source);

}
