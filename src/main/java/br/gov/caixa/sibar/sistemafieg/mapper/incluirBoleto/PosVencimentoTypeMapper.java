package br.gov.caixa.sibar.sistemafieg.mapper.incluirBoleto;

import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Altera_boleto_pos_vencimento_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Pos_vencimento_Type;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.PosVencimentoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {TituloEntradaTypeMapper.class})
public interface PosVencimentoTypeMapper {
    PosVencimentoTypeMapper INSTANCE = Mappers.getMapper(PosVencimentoTypeMapper.class);

    @Mappings({
            @Mapping(source = "numero_dias", target = "NUMERO_DIAS"),
            @Mapping(source = "acao", target = "ACAO", ignore = true)
    })
    Pos_vencimento_Type toModel(PosVencimentoDto source);

    @Mappings({
            @Mapping(source = "NUMERO_DIAS", target = "numero_dias"),
            @Mapping(source = "ACAO", target = "acao", ignore = true)
    })
    PosVencimentoDto toDto(Pos_vencimento_Type source);


    @Mappings({
            @Mapping(source = "numero_dias", target = "NUMERO_DIAS"),
            @Mapping(source = "acao", target = "ACAO", ignore = true)
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Pos_vencimento_Type toModelCnpj(PosVencimentoDto source);

    @Mappings({
            @Mapping(source = "NUMERO_DIAS", target = "numero_dias"),
            @Mapping(source = "ACAO", target = "acao", ignore = true)
    })
    PosVencimentoDto toDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Pos_vencimento_Type source);

    /************* ALTERAR ********/

    @Mappings({
            @Mapping(source = "numero_dias", target = "NUMERO_DIAS"),
            @Mapping(source = "acao", target = "ACAO", ignore = true)
    })
    Altera_boleto_pos_vencimento_Type toAlterarModel(PosVencimentoDto source);

    @Mappings({
            @Mapping(source = "NUMERO_DIAS", target = "numero_dias"),
            @Mapping(source = "ACAO", target = "acao", ignore = true)
    })
    PosVencimentoDto toAlterarDto(Altera_boleto_pos_vencimento_Type source);


    @Mappings({
            @Mapping(source = "numero_dias", target = "NUMERO_DIAS"),
            @Mapping(source = "acao", target = "ACAO", ignore = true)
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_pos_vencimento_Type toAlterarModelCnpj(PosVencimentoDto source);

    @Mappings({
            @Mapping(source = "NUMERO_DIAS", target = "numero_dias"),
            @Mapping(source = "ACAO", target = "acao", ignore = true)
    })
    PosVencimentoDto toAlterarDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_pos_vencimento_Type source);

}
