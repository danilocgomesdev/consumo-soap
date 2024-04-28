package br.gov.caixa.sibar.sistemafieg.mapper.incluirBoleto;

import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Altera_boleto_pagamento_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Pagamento_Type;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.PagamentoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PagamentoTypeMapper {
    PagamentoTypeMapper INSTANCE = Mappers.getMapper(PagamentoTypeMapper.class);

    @Mappings({
            @Mapping(source = "tipo", target = "TIPO", ignore = true),
            @Mapping(source = "quantidadePermitidas", target = "QUANTIDADE_PERMITIDA"),
            @Mapping(source = "valorMaximo", target = "VALOR_MAXIMO"),
            @Mapping(source = "valorMinimo", target = "VALOR_MINIMO")
    })
    Pagamento_Type toModel(PagamentoDto source);

    @Mappings({
            @Mapping(source = "TIPO", target = "tipo", ignore = true),
            @Mapping(source = "QUANTIDADE_PERMITIDA", target = "quantidadePermitidas"),
            @Mapping(source = "VALOR_MAXIMO", target = "valorMaximo"),
            @Mapping(source = "VALOR_MINIMO", target = "valorMinimo")
    })
    PagamentoDto toDto(Pagamento_Type source);


    @Mappings({
            @Mapping(source = "tipo", target = "TIPO", ignore = true),
            @Mapping(source = "quantidadePermitidas", target = "QUANTIDADE_PERMITIDA"),
            @Mapping(source = "valorMaximo", target = "VALOR_MAXIMO"),
            @Mapping(source = "valorMinimo", target = "VALOR_MINIMO")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Pagamento_Type toModelCnpj(PagamentoDto source);

    @Mappings({
            @Mapping(source = "TIPO", target = "tipo", ignore = true),
            @Mapping(source = "QUANTIDADE_PERMITIDA", target = "quantidadePermitidas"),
            @Mapping(source = "VALOR_MAXIMO", target = "valorMaximo"),
            @Mapping(source = "VALOR_MINIMO", target = "valorMinimo")
    })
    PagamentoDto toDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Pagamento_Type source);


    /************ LATERAR *************/



    @Mappings({
            @Mapping(source = "tipo", target = "TIPO", ignore = true),
            @Mapping(source = "quantidadePermitidas", target = "QUANTIDADE_PERMITIDA"),
            @Mapping(source = "valorMaximo", target = "VALOR_MAXIMO"),
            @Mapping(source = "valorMinimo", target = "VALOR_MINIMO")
    })
    Altera_boleto_pagamento_Type toAlterarModel(PagamentoDto source);

    @Mappings({
            @Mapping(source = "TIPO", target = "tipo", ignore = true),
            @Mapping(source = "QUANTIDADE_PERMITIDA", target = "quantidadePermitidas"),
            @Mapping(source = "VALOR_MAXIMO", target = "valorMaximo"),
            @Mapping(source = "VALOR_MINIMO", target = "valorMinimo")
    })
    PagamentoDto toAlterarDto(Altera_boleto_pagamento_Type source);


    @Mappings({
            @Mapping(source = "tipo", target = "TIPO", ignore = true),
            @Mapping(source = "quantidadePermitidas", target = "QUANTIDADE_PERMITIDA"),
            @Mapping(source = "valorMaximo", target = "VALOR_MAXIMO"),
            @Mapping(source = "valorMinimo", target = "VALOR_MINIMO")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_pagamento_Type toAlterarModelCnpj(PagamentoDto source);

    @Mappings({
            @Mapping(source = "TIPO", target = "tipo", ignore = true),
            @Mapping(source = "QUANTIDADE_PERMITIDA", target = "quantidadePermitidas"),
            @Mapping(source = "VALOR_MAXIMO", target = "valorMaximo"),
            @Mapping(source = "VALOR_MINIMO", target = "valorMinimo")
    })
    PagamentoDto toAlterarDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_pagamento_Type source);

}
