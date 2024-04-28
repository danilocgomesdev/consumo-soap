package br.gov.caixa.sibar.sistemafieg.mapper.incluirBoleto;

import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Altera_boleto_recibo_pagador_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Recibo_pagador_Type;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.ReciboPagadorDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReciboPagadorTypMapper {
    ReciboPagadorTypMapper INSTANCE = Mappers.getMapper(ReciboPagadorTypMapper.class);

    @Mappings({
            @Mapping(source = "mensagensDtoObject", target = "MENSAGENS")
    })
    Recibo_pagador_Type toModel(ReciboPagadorDto source);

    @Mappings({
            @Mapping(source = "MENSAGENS", target = "mensagensDtoObject")
    })
    ReciboPagadorDto toDto(Recibo_pagador_Type source);

    @Mappings({
            @Mapping(source = "mensagensDtoObject", target = "MENSAGENS")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Recibo_pagador_Type toModelCnpj(ReciboPagadorDto source);

    @Mappings({
            @Mapping(source = "MENSAGENS", target = "mensagensDtoObject")
    })
    ReciboPagadorDto toDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Recibo_pagador_Type source);


    /************ ALTERAR ***********/


    @Mappings({
            @Mapping(source = "mensagensDtoObject", target = "MENSAGENS")
    })
    Altera_boleto_recibo_pagador_Type toAlterarModel(ReciboPagadorDto source);

    @Mappings({
            @Mapping(source = "MENSAGENS", target = "mensagensDtoObject")
    })
    ReciboPagadorDto toAlterarDto(Altera_boleto_recibo_pagador_Type source);

    @Mappings({
            @Mapping(source = "mensagensDtoObject", target = "MENSAGENS")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_recibo_pagador_Type toAlterarModelCnpj(ReciboPagadorDto source);

    @Mappings({
            @Mapping(source = "MENSAGENS", target = "mensagensDtoObject")
    })
    ReciboPagadorDto toAlterarDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_recibo_pagador_Type source);


}
