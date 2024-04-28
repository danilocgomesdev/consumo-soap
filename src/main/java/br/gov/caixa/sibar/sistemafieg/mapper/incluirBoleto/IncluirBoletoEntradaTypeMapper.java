package br.gov.caixa.sibar.sistemafieg.mapper.incluirBoleto;

import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Inclui_boleto_entrada_Type;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.IncluiBoletoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {TituloEntradaTypeMapper.class})
public interface IncluirBoletoEntradaTypeMapper {
    IncluirBoletoEntradaTypeMapper INSTANCE = Mappers.getMapper(IncluirBoletoEntradaTypeMapper.class);

    @Mappings({
            @Mapping(source = "codigoBeneficiario", target = "CODIGO_BENEFICIARIO"),
            @Mapping(source = "tituloDtoObject", target = "TITULO")
    })
    Inclui_boleto_entrada_Type toModel(IncluiBoletoDto source);

    @Mappings({
            @Mapping(source = "TITULO", target = "tituloDtoObject"),
            @Mapping(source = "CODIGO_BENEFICIARIO", target = "codigoBeneficiario")
    })
    IncluiBoletoDto toDto(Inclui_boleto_entrada_Type source);

    @Mappings({
            @Mapping(source = "codigoBeneficiario", target = "CODIGO_BENEFICIARIO"),
            @Mapping(source = "tituloDtoObject", target = "TITULO")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Inclui_boleto_entrada_Type toModelCnpj(IncluiBoletoDto source);

    @Mappings({
            @Mapping(source = "TITULO", target = "tituloDtoObject"),
            @Mapping(source = "CODIGO_BENEFICIARIO", target = "codigoBeneficiario")
    })
    IncluiBoletoDto toDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Inclui_boleto_entrada_Type source);


}
