package br.gov.caixa.sibar.sistemafieg.mapper.incluirBoleto;

import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Altera_boleto_multa_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Multa_Type;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.MultaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MultaTypeMapper {
    MultaTypeMapper INSTANCE = Mappers.getMapper(MultaTypeMapper.class);

    @Mappings({
            @Mapping(source = "data", target = "DATA"),
            @Mapping(source = "valor", target = "VALOR"),
            @Mapping(source = "percentual", target = "PERCENTUAL")
    })
    Multa_Type toModel(MultaDto source);

    @Mappings({
            @Mapping(source = "DATA", target = "data"),
            @Mapping(source = "VALOR", target = "valor"),
            @Mapping(source = "PERCENTUAL", target = "percentual")
    })
    MultaDto toDto(Multa_Type source);

    @Mappings({
            @Mapping(source = "data", target = "DATA"),
            @Mapping(source = "valor", target = "VALOR"),
            @Mapping(source = "percentual", target = "PERCENTUAL")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Multa_Type toModelCnpj(MultaDto source);

    @Mappings({
            @Mapping(source = "DATA", target = "data"),
            @Mapping(source = "VALOR", target = "valor"),
            @Mapping(source = "PERCENTUAL", target = "percentual")
    })
    MultaDto toDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Multa_Type source);



    /*************** ALTERAR **************/




    @Mappings({
            @Mapping(source = "data", target = "DATA"),
            @Mapping(source = "valor", target = "VALOR"),
            @Mapping(source = "percentual", target = "PERCENTUAL")
    })
    Altera_boleto_multa_Type toAlterarModel(MultaDto source);

    @Mappings({
            @Mapping(source = "DATA", target = "data"),
            @Mapping(source = "VALOR", target = "valor"),
            @Mapping(source = "PERCENTUAL", target = "percentual")
    })
    MultaDto toAlterarDto(Altera_boleto_multa_Type source);

    @Mappings({
            @Mapping(source = "data", target = "DATA"),
            @Mapping(source = "valor", target = "VALOR"),
            @Mapping(source = "percentual", target = "PERCENTUAL")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_multa_Type toAlterarModelCnpj(MultaDto source);

    @Mappings({
            @Mapping(source = "DATA", target = "data"),
            @Mapping(source = "VALOR", target = "valor"),
            @Mapping(source = "PERCENTUAL", target = "percentual")
    })
    MultaDto toAlterarDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_multa_Type source);

}
