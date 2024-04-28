package br.gov.caixa.sibar.util;

import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.DadosDto;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.EnderecoDto;
import br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica.PagadorDto;

public class UtilBody {
    public DadosDto validacaoCaracteresEspeciaisDto(DadosDto dto) {
        PagadorDto pagadorDtoObject = null;
        if (dto.getIncluiBoletoDtoObject() != null) {
            pagadorDtoObject = dto.getIncluiBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject();
        } else {
            pagadorDtoObject = dto.getAterarBoletoDtoObject().getTituloDtoObject().getPagadorDtoObject();
        }
        String nome = pagadorDtoObject
                .getNome();
        if (nome != null) {
            pagadorDtoObject
                    .setNome(susbtitueCaracterespecial(nome));
        }
        EnderecoDto enderecoDto = pagadorDtoObject.getEnderecoDto();

        if (enderecoDto != null) {
            String logradouro = enderecoDto
                    .getLogradouro();
            if (logradouro != null) {
                enderecoDto.setLogradouro(susbtitueCaracterespecial(logradouro));
            }

            String bairro = enderecoDto
                    .getBairro();
            if (bairro != null) {
                enderecoDto.setBairro(susbtitueCaracterespecial(bairro));
            }

            String cidade = enderecoDto
                    .getCidade();
            if (cidade != null) {
                enderecoDto.setCidade(susbtitueCaracterespecial(cidade));
            }
        }

        return dto;
    }


    public String susbtitueCaracterespecial(String value) {

        /*troca caracteres */
        value = value
                .replaceAll("[ãâàáä]", "a")
                .replaceAll("[êèéë&]", "e")
                .replaceAll("[îìíï]", "i")
                .replaceAll("[õôòóö]", "o")
                .replaceAll("[ûúùü]", "u")
                .replaceAll("[ÃÂÀÁÄ]", "A")
                .replaceAll("[ÊÈÉË]", "E")
                .replaceAll("[ÎÌÍÏ]", "I")
                .replaceAll("[ÕÔÒÓÖ]", "O")
                .replaceAll("[ÛÙÚÜ]", "U")
                .replace('ç', 'c')
                .replace('Ç', 'C')
                .replace('ñ', 'n')
                .replace('Ñ', 'N')
                .replaceAll("[^a-zA-Z]", " ")
                .replaceAll("[-+=*&;%$#@!_°ºª§¬¢£³²¹₢º°]", "")
                .replaceAll("['\"]", "")
                .replaceAll("[<>()\\{\\}]", "")
                .replaceAll("['\\\\.,()|/]", "")
                .replaceAll("[^!-ÿ]{1}[^ -ÿ]{0,}[^!-ÿ]{1}|[^!-ÿ]{1}", " ")
        ;

        return value;
    }

    public String substitueCaracterEspeciaisCnpjCpf(String value) {
        return value.replaceAll("[.-]", "").trim();
    }
}
