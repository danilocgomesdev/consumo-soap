package br.gov.caixa.sibar.sistemafieg.mapper.incluirBoleto;

import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Altera_boleto_entrada_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Inclui_boleto_entrada_Type;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.AlterarBoletoDto;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.IncluiBoletoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {TituloEntradaTypeMapper.class})
public interface AlterarBoletoEntradaTypeMapper {
    AlterarBoletoEntradaTypeMapper INSTANCE = Mappers.getMapper(AlterarBoletoEntradaTypeMapper.class);



    @Mappings({
            @Mapping(source = "TITULO", target = "tituloDtoObject"),
            @Mapping(source = "CODIGO_BENEFICIARIO", target = "codigoBeneficiario")
    })
    AlterarBoletoDto toDto(Altera_boleto_entrada_Type source);

    @Mappings({
            @Mapping(source = "codigoBeneficiario", target = "CODIGO_BENEFICIARIO"),
            @Mapping(source = "tituloDtoObject", target = "TITULO")
    })
    Altera_boleto_entrada_Type toModel(AlterarBoletoDto source);



    @Mappings({
            @Mapping(source = "codigoBeneficiario", target = "CODIGO_BENEFICIARIO"),
            @Mapping(source = "tituloDtoObject", target = "TITULO")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_entrada_Type toModelCnpj(AlterarBoletoDto source);


    @Mappings({
            @Mapping(source = "TITULO", target = "tituloDtoObject"),
            @Mapping(source = "CODIGO_BENEFICIARIO", target = "codigoBeneficiario")
    })
    AlterarBoletoDto toDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_entrada_Type source);


}
