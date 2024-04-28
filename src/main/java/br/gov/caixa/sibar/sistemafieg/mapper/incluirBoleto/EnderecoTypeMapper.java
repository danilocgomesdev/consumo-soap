package br.gov.caixa.sibar.sistemafieg.mapper.incluirBoleto;

import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Altera_boleto_endereco_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Endereco_Type;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.EnderecoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EnderecoTypeMapper {
    EnderecoTypeMapper INSTANCE = Mappers.getMapper(EnderecoTypeMapper.class);

    @Mappings({
            @Mapping(source = "bairro", target = "BAIRRO"),
            @Mapping(source = "cep", target = "CEP"),
            @Mapping(source = "cidade", target = "CIDADE"),
            @Mapping(source = "logradouro", target = "LOGRADOURO"),
            @Mapping(source = "uf", target = "UF")
    })
    Endereco_Type toModel(EnderecoDto source);

    @Mappings({
            @Mapping(source = "BAIRRO", target = "bairro"),
            @Mapping(source = "CIDADE", target = "cidade"),
            @Mapping(source = "LOGRADOURO", target = "logradouro"),
            @Mapping(source = "UF", target = "uf"),
            @Mapping(source = "CEP", target = "cep")
    })
    EnderecoDto toDto(Endereco_Type source);

    @Mappings({
            @Mapping(source = "bairro", target = "BAIRRO"),
            @Mapping(source = "cep", target = "CEP"),
            @Mapping(source = "cidade", target = "CIDADE"),
            @Mapping(source = "logradouro", target = "LOGRADOURO"),
            @Mapping(source = "uf", target = "UF")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Endereco_Type toModelCnpj(EnderecoDto source);

    @Mappings({
            @Mapping(source = "BAIRRO", target = "bairro"),
            @Mapping(source = "CIDADE", target = "cidade"),
            @Mapping(source = "LOGRADOURO", target = "logradouro"),
            @Mapping(source = "UF", target = "uf"),
            @Mapping(source = "CEP", target = "cep")
    })
    EnderecoDto toDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Endereco_Type source);


    /********** ALTERAR *********/



    @Mappings({
            @Mapping(source = "BAIRRO", target = "bairro"),
            @Mapping(source = "CEP", target = "cep"),
            @Mapping(source = "CIDADE", target = "cidade"),
            @Mapping(source = "LOGRADOURO", target = "logradouro"),
            @Mapping(source = "UF", target = "uf")
    })
    EnderecoDto toAlterarModel(Altera_boleto_endereco_Type source);

    @Mappings({
            @Mapping(source = "bairro", target = "BAIRRO"),
            @Mapping(source = "cidade", target = "CIDADE"),
            @Mapping(source = "logradouro", target = "LOGRADOURO"),
            @Mapping(source = "uf", target = "UF"),
            @Mapping(source = "cep", target = "CEP")
    })
    Altera_boleto_endereco_Type toAlterarDto(EnderecoDto source);

    @Mappings({
            @Mapping(source = "bairro", target = "BAIRRO"),
            @Mapping(source = "cep", target = "CEP"),
            @Mapping(source = "cidade", target = "CIDADE"),
            @Mapping(source = "logradouro", target = "LOGRADOURO"),
            @Mapping(source = "uf", target = "UF")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_endereco_Type toAlterarModelCnpj(EnderecoDto source);

    @Mappings({
            @Mapping(source = "BAIRRO", target = "bairro"),
            @Mapping(source = "CIDADE", target = "cidade"),
            @Mapping(source = "LOGRADOURO", target = "logradouro"),
            @Mapping(source = "UF", target = "uf"),
            @Mapping(source = "CEP", target = "cep")
    })
    EnderecoDto toAlterarDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_endereco_Type source);


}
