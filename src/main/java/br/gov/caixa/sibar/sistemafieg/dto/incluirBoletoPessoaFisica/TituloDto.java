package br.gov.caixa.sibar.sistemafieg.dto.incluirBoletoPessoaFisica;


import java.util.Date;

public class TituloDto {
    private String nossoNumero;
    private String numeroDocumento;
    private Date dataVencimento;
    private String valor;
    private String tipoEspecie;
    private String flagAceite;
    private Date dataEmissao;
    private String valorAbatimento;
    private String codigoMoeda;
    private JurosMoraDto jurosMoraDtoObject;
    private PosVencimentoDto posVencimentoDtoObject;
    private PagadorDto pagadorDtoObject;
    private FichaCompensacaoDto fichaCompensacaoDtoObject;
    private ReciboPagadorDto ReciboPagadorObject;
    private PagamentoDto pagamentoDtoObject;
    private MultaDto multaDtoObject;
    private DescontoDto[] descontoDtoObject;

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

    public JurosMoraDto getJurosMoraDtoObject() {
        return jurosMoraDtoObject;
    }

    public void setJurosMoraDtoObject(JurosMoraDto jurosMoraDtoObject) {
        this.jurosMoraDtoObject = jurosMoraDtoObject;
    }

    public PosVencimentoDto getPosVencimentoDtoObject() {
        return posVencimentoDtoObject;
    }

    public void setPosVencimentoDtoObject(PosVencimentoDto posVencimentoDtoObject) {
        this.posVencimentoDtoObject = posVencimentoDtoObject;
    }

    public PagadorDto getPagadorDtoObject() {
        return pagadorDtoObject;
    }

    public void setPagadorDtoObject(PagadorDto pagadorDtoObject) {
        this.pagadorDtoObject = pagadorDtoObject;
    }

    public FichaCompensacaoDto getFichaCompensacaoDtoObject() {
        return fichaCompensacaoDtoObject;
    }

    public void setFichaCompensacaoDtoObject(FichaCompensacaoDto fichaCompensacaoDtoObject) {
        this.fichaCompensacaoDtoObject = fichaCompensacaoDtoObject;
    }

    public ReciboPagadorDto getReciboPagadorObject() {
        return ReciboPagadorObject;
    }

    public void setReciboPagadorObject(ReciboPagadorDto reciboPagadorObject) {
        ReciboPagadorObject = reciboPagadorObject;
    }

    public PagamentoDto getPagamentoDtoObject() {
        return pagamentoDtoObject;
    }

    public void setPagamentoDtoObject(PagamentoDto pagamentoDtoObject) {
        this.pagamentoDtoObject = pagamentoDtoObject;
    }

    public MultaDto getMultaDtoObject() {
        return multaDtoObject;
    }

    public void setMultaDtoObject(MultaDto multaDtoObject) {
        this.multaDtoObject = multaDtoObject;
    }

    public DescontoDto[] getDescontoDtoObject() {
        return descontoDtoObject;
    }

    public void setDescontoDtoObject(DescontoDto[] descontoDtoObject) {
        this.descontoDtoObject = descontoDtoObject;
    }
}
