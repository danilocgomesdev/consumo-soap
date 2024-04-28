package br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaJuridica;


import java.util.Date;

public class TituloPessoaJuridicaDto {
    private String nossoNumero;
    private String numeroDocumento;
    private Date dataVencimento;
    private String valor;
    private String tipoEspecie;
    private String flagAceite;
    private Date dataEmissao;
    private String valorAbatimento;
    private String codigoMoeda;
    private JurosMoraPessoaJuridicaDto jurosMoraDtoObject;
    private PosVencimentoPessoaJuridicaDto posVencimentoDtoObject;
    private PagadorPessoaJuridicaDto pagadorDtoObject;
    private FichaCompensacaoPessoaJuridicaDto fichaCompensacaoDtoObject;
    private ReciboPagadorPessoaJuridicaDto ReciboPagadorObject;
    private PagamentoPessoaJuridicaDto pagamentoDtoObject;

    public String getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipoEspecie() {
        return tipoEspecie;
    }

    public void setTipoEspecie(String tipoEspecie) {
        this.tipoEspecie = tipoEspecie;
    }

    public String getFlagAceite() {
        return flagAceite;
    }

    public void setFlagAceite(String flagAceite) {
        this.flagAceite = flagAceite;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getValorAbatimento() {
        return valorAbatimento;
    }

    public void setValorAbatimento(String valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
    }

    public String getCodigoMoeda() {
        return codigoMoeda;
    }

    public void setCodigoMoeda(String codigoMoeda) {
        this.codigoMoeda = codigoMoeda;
    }

    public JurosMoraPessoaJuridicaDto getJurosMoraDtoObject() {
        return jurosMoraDtoObject;
    }

    public void setJurosMoraDtoObject(JurosMoraPessoaJuridicaDto jurosMoraDtoObject) {
        this.jurosMoraDtoObject = jurosMoraDtoObject;
    }

    public PosVencimentoPessoaJuridicaDto getPosVencimentoDtoObject() {
        return posVencimentoDtoObject;
    }

    public void setPosVencimentoDtoObject(PosVencimentoPessoaJuridicaDto posVencimentoDtoObject) {
        this.posVencimentoDtoObject = posVencimentoDtoObject;
    }

    public PagadorPessoaJuridicaDto getPagadorDtoObject() {
        return pagadorDtoObject;
    }

    public void setPagadorDtoObject(PagadorPessoaJuridicaDto pagadorDtoObject) {
        this.pagadorDtoObject = pagadorDtoObject;
    }

    public FichaCompensacaoPessoaJuridicaDto getFichaCompensacaoDtoObject() {
        return fichaCompensacaoDtoObject;
    }

    public void setFichaCompensacaoDtoObject(FichaCompensacaoPessoaJuridicaDto fichaCompensacaoDtoObject) {
        this.fichaCompensacaoDtoObject = fichaCompensacaoDtoObject;
    }

    public ReciboPagadorPessoaJuridicaDto getReciboPagadorObject() {
        return ReciboPagadorObject;
    }

    public void setReciboPagadorObject(ReciboPagadorPessoaJuridicaDto reciboPagadorObject) {
        ReciboPagadorObject = reciboPagadorObject;
    }

    public PagamentoPessoaJuridicaDto getPagamentoDtoObject() {
        return pagamentoDtoObject;
    }

    public void setPagamentoDtoObject(PagamentoPessoaJuridicaDto pagamentoDtoObject) {
        this.pagamentoDtoObject = pagamentoDtoObject;
    }
}
