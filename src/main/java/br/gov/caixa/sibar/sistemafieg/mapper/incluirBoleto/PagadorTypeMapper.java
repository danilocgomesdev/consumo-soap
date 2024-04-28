package br.gov.caixa.sibar.sistemafieg.mapper.incluirBoleto;

import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Altera_boleto_pagador_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Pagador_Type;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.PagadorDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {EnderecoTypeMapper.class})
public interface PagadorTypeMapper {
    PagadorTypeMapper INSTANCE = Mappers.getMapper(PagadorTypeMapper.class);

    @Mappings({
            @Mapping(source = "nome", target = "NOME"),
            @Mapping(source = "cpf", target = "CPF"),
//            @Mapping( target = "", source = "cnpj", ignore = true),
            @Mapping(source = "enderecoDto", target = "ENDERECO")
    })
    Pagador_Type toModel(PagadorDto source);

    @Mappings({
            @Mapping(source = "NOME", target = "nome"),
            @Mapping(source = "CPF", target = "cpf"),
            @Mapping( target = "cnpj", ignore = true),
            @Mapping(source = "ENDERECO", target = "enderecoDto")
    })
    PagadorDto toDto(Pagador_Type source);

    @Mappings({
            @Mapping(source = "nome", target = "RAZAO_SOCIAL"),
            @Mapping(source = "cnpj", target = "CNPJ"),
//            @Mapping(target = "", source = "cpf", ignore = true),
            @Mapping(source = "enderecoDto", target = "ENDERECO")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Pagador_Type toModelCnpj(PagadorDto source);

    @Mappings({
            @Mapping(source = "RAZAO_SOCIAL", target = "nome"),
            @Mapping(source = "CNPJ", target = "cnpj"),
            @Mapping( target = "cpf", ignore = true),
            @Mapping(source = "ENDERECO", target = "enderecoDto")
    })
    PagadorDto toDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Pagador_Type source);

    /******** ALTERAR *******/


    @Mappings({
            @Mapping(source = "nome", target = "NOME"),
            @Mapping(source = "enderecoDto", target = "ENDERECO")
    })
    Altera_boleto_pagador_Type toAlterarModel(PagadorDto source);

    @Mappings({
            @Mapping(source = "NOME", target = "nome"),
            @Mapping(source = "ENDERECO", target = "enderecoDto")
    })
    PagadorDto toAlterarDto(Altera_boleto_pagador_Type source);

    @Mappings({
            @Mapping(source = "nome", target = "RAZAO_SOCIAL"),
            @Mapping(source = "enderecoDto", target = "ENDERECO")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_pagador_Type toAlterarModelCnpj(PagadorDto source);

    @Mappings({
            @Mapping(source = "RAZAO_SOCIAL", target = "nome"),
            @Mapping(source = "ENDERECO", target = "enderecoDto")
    })
    PagadorDto toAlterarDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_pagador_Type source);


}
