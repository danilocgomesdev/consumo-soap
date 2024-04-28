package br.gov.caixa.sibar.sistemafieg.mapper.incluirBoleto;

import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Altera_boleto_ficha_compensacao_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Ficha_compensacao_Type;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.FichaCompensacaoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FichaCompesacaoMapper {
    FichaCompesacaoMapper INSTANCE = Mappers.getMapper(FichaCompesacaoMapper.class);

    @Mappings({
            @Mapping(source = "mensagensDtoObject", target = "MENSAGENS")
    })
    Ficha_compensacao_Type toModel(FichaCompensacaoDto source);

    @Mappings({
            @Mapping(source = "MENSAGENS", target = "mensagensDtoObject")
    })
    FichaCompensacaoDto toDto(Ficha_compensacao_Type source);


    @Mappings({
            @Mapping(source = "mensagensDtoObject", target = "MENSAGENS")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Ficha_compensacao_Type toModelCnpj(FichaCompensacaoDto source);

    @Mappings({
            @Mapping(source = "MENSAGENS", target = "mensagensDtoObject")
    })
    FichaCompensacaoDto toDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Ficha_compensacao_Type source);

    /***************** ALTERAR *************/


    @Mappings({
            @Mapping(source = "mensagensDtoObject", target = "MENSAGENS")
    })
    Altera_boleto_ficha_compensacao_Type toAlterarModel(FichaCompensacaoDto source);

    @Mappings({
            @Mapping(source = "MENSAGENS", target = "mensagensDtoObject")
    })
    FichaCompensacaoDto toAlterarDto(Altera_boleto_ficha_compensacao_Type source);


    @Mappings({
            @Mapping(source = "mensagensDtoObject", target = "MENSAGENS")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_ficha_compensacao_Type toAlterarModelCnpj(FichaCompensacaoDto source);

    @Mappings({
            @Mapping(source = "MENSAGENS", target = "mensagensDtoObject")
    })
    FichaCompensacaoDto toAlterarDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_ficha_compensacao_Type source);

}
