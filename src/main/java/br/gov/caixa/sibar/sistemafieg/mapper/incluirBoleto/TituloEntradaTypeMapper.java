package br.gov.caixa.sibar.sistemafieg.mapper.incluirBoleto;

import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Altera_boleto_titulo_entrada_Type;
import br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_fisica.Titulo_entrada_Type;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.TituloDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {JurosMoraMapper.class, PosVencimentoTypeMapper.class,
        PagadorTypeMapper.class, FichaCompesacaoMapper.class, ReciboPagadorTypMapper.class,
        PagamentoTypeMapper.class,
        MultaTypeMapper.class,
        DescontoTypeMapper.class
})
public interface TituloEntradaTypeMapper {
    TituloEntradaTypeMapper INSTANCE = Mappers.getMapper(TituloEntradaTypeMapper.class);

    @Mappings({
            @Mapping(source = "valor", target = "VALOR"),
            @Mapping(source = "codigoMoeda", target = "CODIGO_MOEDA"),
            @Mapping(source = "dataEmissao", target = "DATA_EMISSAO"),
            @Mapping(source = "dataVencimento", target = "DATA_VENCIMENTO"),
            @Mapping(source = "nossoNumero", target = "NOSSO_NUMERO"),
            @Mapping(source = "numeroDocumento", target = "NUMERO_DOCUMENTO"),
            @Mapping(source = "tipoEspecie", target = "TIPO_ESPECIE"),
            @Mapping(source = "valorAbatimento", target = "VALOR_ABATIMENTO"),
            @Mapping(source = "fichaCompensacaoDtoObject", target = "FICHA_COMPENSACAO"),
            @Mapping(source = "jurosMoraDtoObject", target = "JUROS_MORA"),
            @Mapping(source = "pagadorDtoObject", target = "PAGADOR"),
            @Mapping(source = "posVencimentoDtoObject", target = "POS_VENCIMENTO"),
            @Mapping(source = "reciboPagadorObject", target = "RECIBO_PAGADOR"),
            @Mapping(source = "multaDtoObject", target = "MULTA"),
            @Mapping(source = "descontoDtoObject", target = "DESCONTOS"),
            @Mapping(source = "flagAceite", target = "FLAG_ACEITE", ignore = true),
            @Mapping(source = "pagamentoDtoObject", target = "PAGAMENTO")
    })
    Titulo_entrada_Type toModel(TituloDto source);

    @Mappings({
            @Mapping(source = "VALOR", target = "valor"),
            @Mapping(source = "CODIGO_MOEDA", target = "codigoMoeda"),
            @Mapping(source = "DATA_EMISSAO", target = "dataEmissao"),
            @Mapping(source = "DATA_VENCIMENTO", target = "dataVencimento"),
            @Mapping(source = "NOSSO_NUMERO", target = "nossoNumero"),
            @Mapping(source = "NUMERO_DOCUMENTO", target = "numeroDocumento"),
            @Mapping(source = "TIPO_ESPECIE", target = "tipoEspecie"),
            @Mapping(source = "VALOR_ABATIMENTO", target = "valorAbatimento"),
            @Mapping(source = "FICHA_COMPENSACAO", target = "fichaCompensacaoDtoObject"),
            @Mapping(source = "JUROS_MORA", target = "jurosMoraDtoObject"),
            @Mapping(source = "PAGADOR", target = "pagadorDtoObject"),
            @Mapping(source = "POS_VENCIMENTO", target = "posVencimentoDtoObject"),
            @Mapping(source = "RECIBO_PAGADOR", target = "reciboPagadorObject"),
            @Mapping(source = "MULTA", target = "multaDtoObject"),
            @Mapping(source = "DESCONTOS", target = "descontoDtoObject"),
            @Mapping(source = "FLAG_ACEITE", target = "flagAceite", ignore = true),
            @Mapping(source = "PAGAMENTO", target = "pagamentoDtoObject")
    })
    TituloDto toDto(Titulo_entrada_Type source);



    @Mappings({
            @Mapping(source = "valor", target = "VALOR"),
            @Mapping(source = "codigoMoeda", target = "CODIGO_MOEDA"),
            @Mapping(source = "dataEmissao", target = "DATA_EMISSAO"),
            @Mapping(source = "dataVencimento", target = "DATA_VENCIMENTO"),
            @Mapping(source = "nossoNumero", target = "NOSSO_NUMERO"),
            @Mapping(source = "numeroDocumento", target = "NUMERO_DOCUMENTO"),
            @Mapping(source = "tipoEspecie", target = "TIPO_ESPECIE"),
            @Mapping(source = "valorAbatimento", target = "VALOR_ABATIMENTO"),
            @Mapping(source = "fichaCompensacaoDtoObject", target = "FICHA_COMPENSACAO"),
            @Mapping(source = "jurosMoraDtoObject", target = "JUROS_MORA"),
            @Mapping(source = "pagadorDtoObject", target = "PAGADOR"),
            @Mapping(source = "posVencimentoDtoObject", target = "POS_VENCIMENTO"),
            @Mapping(source = "reciboPagadorObject", target = "RECIBO_PAGADOR"),
            @Mapping(source = "multaDtoObject", target = "MULTA"),
            @Mapping(source = "descontoDtoObject", target = "DESCONTOS"),
            @Mapping(source = "flagAceite", target = "FLAG_ACEITE", ignore = true),
            @Mapping(source = "pagamentoDtoObject", target = "PAGAMENTO")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Titulo_entrada_Type toModelAlterarCnpj(TituloDto source);

    @Mappings({
            @Mapping(source = "VALOR", target = "valor"),
            @Mapping(source = "CODIGO_MOEDA", target = "codigoMoeda"),
            @Mapping(source = "DATA_EMISSAO", target = "dataEmissao"),
            @Mapping(source = "DATA_VENCIMENTO", target = "dataVencimento"),
            @Mapping(source = "NOSSO_NUMERO", target = "nossoNumero"),
            @Mapping(source = "NUMERO_DOCUMENTO", target = "numeroDocumento"),
            @Mapping(source = "FLAG_ACEITE", target = "flagAceite", ignore = true),
            @Mapping(source = "TIPO_ESPECIE", target = "tipoEspecie"),
            @Mapping(source = "VALOR_ABATIMENTO", target = "valorAbatimento"),
            @Mapping(source = "JUROS_MORA", target = "jurosMoraDtoObject"),
            @Mapping(source = "PAGADOR", target = "pagadorDtoObject"),
            @Mapping(source = "POS_VENCIMENTO", target = "posVencimentoDtoObject"),
            @Mapping(source = "RECIBO_PAGADOR", target = "reciboPagadorObject"),
            @Mapping(source = "MULTA", target = "multaDtoObject"),
            @Mapping(source = "DESCONTOS", target = "descontoDtoObject"),
            @Mapping(source = "FICHA_COMPENSACAO", target = "fichaCompensacaoDtoObject"),
            @Mapping(source = "PAGAMENTO", target = "pagamentoDtoObject")
    })
    TituloDto toDtoCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Titulo_entrada_Type source);

/************* Altera boleto ************/



@Mappings({
        @Mapping(source = "valor", target = "VALOR"),
        @Mapping(source = "dataVencimento", target = "DATA_VENCIMENTO"),
        @Mapping(source = "nossoNumero", target = "NOSSO_NUMERO"),
        @Mapping(source = "numeroDocumento", target = "NUMERO_DOCUMENTO"),
        @Mapping(source = "tipoEspecie", target = "TIPO_ESPECIE"),
        @Mapping(source = "valorAbatimento", target = "VALOR_ABATIMENTO"),
        @Mapping(source = "fichaCompensacaoDtoObject", target = "FICHA_COMPENSACAO"),
        @Mapping(source = "jurosMoraDtoObject", target = "JUROS_MORA"),
        @Mapping(source = "pagadorDtoObject", target = "PAGADOR"),
        @Mapping(source = "posVencimentoDtoObject", target = "POS_VENCIMENTO"),
        @Mapping(source = "reciboPagadorObject", target = "RECIBO_PAGADOR"),
        @Mapping(source = "multaDtoObject", target = "MULTA"),
        @Mapping(source = "descontoDtoObject", target = "DESCONTOS"),
        @Mapping(source = "flagAceite", target = "FLAG_ACEITE", ignore = true),
        @Mapping(source = "pagamentoDtoObject", target = "PAGAMENTO")
})
Altera_boleto_titulo_entrada_Type toAlterarModel(TituloDto source);

    @Mappings({
            @Mapping(source = "VALOR", target = "valor"),
            @Mapping(source = "DATA_VENCIMENTO", target = "dataVencimento"),
            @Mapping(source = "NOSSO_NUMERO", target = "nossoNumero"),
            @Mapping(source = "NUMERO_DOCUMENTO", target = "numeroDocumento"),
            @Mapping(source = "TIPO_ESPECIE", target = "tipoEspecie"),
            @Mapping(source = "VALOR_ABATIMENTO", target = "valorAbatimento"),
            @Mapping(source = "FICHA_COMPENSACAO", target = "fichaCompensacaoDtoObject"),
            @Mapping(source = "JUROS_MORA", target = "jurosMoraDtoObject"),
            @Mapping(source = "PAGADOR", target = "pagadorDtoObject"),
            @Mapping(source = "POS_VENCIMENTO", target = "posVencimentoDtoObject"),
            @Mapping(source = "RECIBO_PAGADOR", target = "reciboPagadorObject"),
            @Mapping(source = "MULTA", target = "multaDtoObject"),
            @Mapping(source = "DESCONTOS", target = "descontoDtoObject"),
            @Mapping(source = "FLAG_ACEITE", target = "flagAceite", ignore = true),
            @Mapping(source = "PAGAMENTO", target = "pagamentoDtoObject")
    })
    TituloDto toAlterarDto(Altera_boleto_titulo_entrada_Type source);



    @Mappings({
            @Mapping(source = "valor", target = "VALOR"),
            @Mapping(source = "dataVencimento", target = "DATA_VENCIMENTO"),
            @Mapping(source = "nossoNumero", target = "NOSSO_NUMERO"),
            @Mapping(source = "numeroDocumento", target = "NUMERO_DOCUMENTO"),
            @Mapping(source = "tipoEspecie", target = "TIPO_ESPECIE"),
            @Mapping(source = "valorAbatimento", target = "VALOR_ABATIMENTO"),
            @Mapping(source = "fichaCompensacaoDtoObject", target = "FICHA_COMPENSACAO"),
            @Mapping(source = "jurosMoraDtoObject", target = "JUROS_MORA"),
            @Mapping(source = "pagadorDtoObject", target = "PAGADOR"),
            @Mapping(source = "posVencimentoDtoObject", target = "POS_VENCIMENTO"),
            @Mapping(source = "reciboPagadorObject", target = "RECIBO_PAGADOR"),
            @Mapping(source = "multaDtoObject", target = "MULTA"),
            @Mapping(source = "descontoDtoObject", target = "DESCONTOS"),
            @Mapping(source = "flagAceite", target = "FLAG_ACEITE", ignore = true),
            @Mapping(source = "pagamentoDtoObject", target = "PAGAMENTO")
    })
    br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_titulo_entrada_Type toModelAlteraCnpj(TituloDto source);

    @Mappings({
            @Mapping(source = "VALOR", target = "valor"),
            @Mapping(source = "DATA_VENCIMENTO", target = "dataVencimento"),
            @Mapping(source = "NOSSO_NUMERO", target = "nossoNumero"),
            @Mapping(source = "NUMERO_DOCUMENTO", target = "numeroDocumento"),
            @Mapping(source = "TIPO_ESPECIE", target = "tipoEspecie"),
            @Mapping(source = "VALOR_ABATIMENTO", target = "valorAbatimento"),
            @Mapping(source = "FICHA_COMPENSACAO", target = "fichaCompensacaoDtoObject"),
            @Mapping(source = "JUROS_MORA", target = "jurosMoraDtoObject"),
            @Mapping(source = "PAGADOR", target = "pagadorDtoObject"),
            @Mapping(source = "POS_VENCIMENTO", target = "posVencimentoDtoObject"),
            @Mapping(source = "RECIBO_PAGADOR", target = "reciboPagadorObject"),
            @Mapping(source = "MULTA", target = "multaDtoObject"),
            @Mapping(source = "DESCONTOS", target = "descontoDtoObject"),
            @Mapping(source = "FLAG_ACEITE", target = "flagAceite", ignore = true),
            @Mapping(source = "PAGAMENTO", target = "pagamentoDtoObject")
    })
    TituloDto toDtoAlterarCnpj(br.gov.caixa.sibar.manutencao_cobranca_bancaria.boleto.externo.pessoa_juridica.Altera_boleto_titulo_entrada_Type source);


}
