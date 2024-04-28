package br.gov.caixa.sibar.sistemafieg.mapper.incluirBoleto;

import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Dados_entrada_Type;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.DadosDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {IncluirBoletoEntradaTypeMapper.class, AlterarBoletoEntradaTypeMapper.class})
public interface DadosEntradaTypeMapper {
    DadosEntradaTypeMapper INSTANCE = Mappers.getMapper(DadosEntradaTypeMapper.class);

    @Mappings({
            @Mapping(source = "incluiBoletoDtoObject", target = "INCLUI_BOLETO"),
            @Mapping(source = "aterarBoletoDtoObject", target = "ALTERA_BOLETO")
    })
    Dados_entrada_Type toModel(DadosDto source);

    @Mappings({
            @Mapping(target = "cpf_cnpj_head", ignore = true),
            @Mapping(source = "INCLUI_BOLETO", target = "incluiBoletoDtoObject"),
            @Mapping(source = "ALTERA_BOLETO", target = "aterarBoletoDtoObject")
    })
    DadosDto toDto(Dados_entrada_Type source);


    @Mappings({
            @Mapping(source = "aterarBoletoDtoObject", target = "ALTERA_BOLETO"),
            @Mapping(source = "incluiBoletoDtoObject", target = "INCLUI_BOLETO")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Dados_entrada_Type toModelCnpj(DadosDto source);

    @Mappings({
            @Mapping(target = "cpf_cnpj_head", ignore = true),
            @Mapping(source = "ALTERA_BOLETO", target = "aterarBoletoDtoObject"),
            @Mapping(source = "INCLUI_BOLETO", target = "incluiBoletoDtoObject")
    })
    DadosDto toDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Dados_entrada_Type source);

}
