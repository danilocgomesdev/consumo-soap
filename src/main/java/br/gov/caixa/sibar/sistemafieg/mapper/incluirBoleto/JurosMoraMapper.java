package br.gov.caixa.sibar.sistemafieg.mapper.incluirBoleto;

import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Altera_boleto_juros_mora_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Juros_mora_Type;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.JurosMoraDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {TituloEntradaTypeMapper.class})
public interface JurosMoraMapper {
    JurosMoraMapper INSTANCE = Mappers.getMapper(JurosMoraMapper.class);

    @Mappings({
            @Mapping(source = "valor", target = "VALOR"),
            @Mapping(source = "data", target = "DATA"),
            @Mapping(source = "tipo", target = "TIPO", ignore = true),
            @Mapping(source = "percentual", target = "PERCENTUAL")
    })
    Juros_mora_Type toModel(JurosMoraDto source);

    @Mappings({
            @Mapping(source = "VALOR", target = "valor"),
            @Mapping(source = "DATA", target = "data"),
            @Mapping(source = "TIPO", target = "tipo", ignore = true),
            @Mapping(source = "PERCENTUAL", target = "percentual")
    })
    JurosMoraDto toDto(Juros_mora_Type source);


    @Mappings({
            @Mapping(source = "valor", target = "VALOR"),
            @Mapping(source = "data", target = "DATA"),
            @Mapping(source = "tipo", target = "TIPO", ignore = true),
            @Mapping(source = "percentual", target = "PERCENTUAL")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Juros_mora_Type toModelCnpj(JurosMoraDto source);

    @Mappings({
            @Mapping(source = "VALOR", target = "valor"),
            @Mapping(source = "DATA", target = "data"),
            @Mapping(source = "TIPO", target = "tipo", ignore = true),
            @Mapping(source = "PERCENTUAL", target = "percentual")
    })
    JurosMoraDto toDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Juros_mora_Type source);

    /*********** ALTERAR ********/

    @Mappings({
            @Mapping(source = "valor", target = "VALOR"),
            @Mapping(source = "data", target = "DATA"),
            @Mapping(source = "tipo", target = "TIPO", ignore = true),
            @Mapping(source = "percentual", target = "PERCENTUAL")
    })
    Altera_boleto_juros_mora_Type toAlterarModel(JurosMoraDto source);

    @Mappings({
            @Mapping(source = "VALOR", target = "valor"),
            @Mapping(source = "DATA", target = "data"),
            @Mapping(source = "TIPO", target = "tipo", ignore = true),
            @Mapping(source = "PERCENTUAL", target = "percentual")
    })
    JurosMoraDto toAlterarDto(Altera_boleto_juros_mora_Type source);


    @Mappings({
            @Mapping(source = "valor", target = "VALOR"),
            @Mapping(source = "data", target = "DATA"),
            @Mapping(source = "tipo", target = "TIPO", ignore = true),
            @Mapping(source = "percentual", target = "PERCENTUAL")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_juros_mora_Type toAlterarModelCnpj(JurosMoraDto source);

    @Mappings({
            @Mapping(source = "VALOR", target = "valor"),
            @Mapping(source = "DATA", target = "data"),
            @Mapping(source = "TIPO", target = "tipo", ignore = true),
            @Mapping(source = "PERCENTUAL", target = "percentual")
    })
    JurosMoraDto toAlterarDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_juros_mora_Type source);

}
