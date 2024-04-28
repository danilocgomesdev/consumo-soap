package br.gov.caixa.sibar.sistemafieg.mapper.incluirBoleto;

import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Altera_boleto_desconto_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Desconto_Type;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.DescontoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DescontoTypeMapper {
    DescontoTypeMapper INSTANCE = Mappers.getMapper(DescontoTypeMapper.class);

    @Mappings({
            @Mapping(source = "valor", target = "VALOR"),
            @Mapping(source = "data", target = "DATA"),
            @Mapping(source = "tipo", target = "TIPO", ignore = true),
            @Mapping(source = "percentual", target = "PERCENTUAL")
    })
    Desconto_Type toModel(DescontoDto source);

    @Mappings({
            @Mapping(source = "VALOR", target = "valor"),
            @Mapping(source = "DATA", target = "data"),
            @Mapping(source = "TIPO", target = "tipo", ignore = true),
            @Mapping(source = "PERCENTUAL", target = "percentual")
    })
    DescontoDto toDto(Desconto_Type source);



    @Mappings({
            @Mapping(source = "valor", target = "VALOR"),
            @Mapping(source = "data", target = "DATA"),
            @Mapping(source = "tipo", target = "TIPO", ignore = true),
            @Mapping(source = "percentual", target = "PERCENTUAL")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Desconto_Type toModelCnpj(DescontoDto source);

    @Mappings({
            @Mapping(source = "VALOR", target = "valor"),
            @Mapping(source = "DATA", target = "data"),
            @Mapping(source = "TIPO", target = "tipo", ignore = true),
            @Mapping(source = "PERCENTUAL", target = "percentual")
    })
    DescontoDto toDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Desconto_Type source);


    /***************** ALTERARA **********/

    @Mappings({
            @Mapping(source = "valor", target = "VALOR"),
            @Mapping(source = "data", target = "DATA"),
            @Mapping(source = "percentual", target = "PERCENTUAL")
    })
    Altera_boleto_desconto_Type toAlterarModel(DescontoDto source);

    @Mappings({
            @Mapping(source = "VALOR", target = "valor"),
            @Mapping(source = "DATA", target = "data"),
            @Mapping(source = "PERCENTUAL", target = "percentual")
    })
    DescontoDto toAlterarDto(Altera_boleto_desconto_Type source);



    @Mappings({
            @Mapping(source = "valor", target = "VALOR"),
            @Mapping(source = "data", target = "DATA"),
            @Mapping(source = "percentual", target = "PERCENTUAL")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_desconto_Type toAlterarModelCnpj(DescontoDto source);

    @Mappings({
            @Mapping(source = "VALOR", target = "valor"),
            @Mapping(source = "DATA", target = "data"),
            @Mapping(source = "PERCENTUAL", target = "percentual")
    })
    DescontoDto toAlterarDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_desconto_Type source);


}
