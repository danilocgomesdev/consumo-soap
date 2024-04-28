package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class Consulta_Cobranca_Bancaria_BoletoProxy implements br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_Cobranca_Bancaria_Boleto_PortType {
  private String _endpoint = null;
  private br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_Cobranca_Bancaria_Boleto_PortType consulta_Cobranca_Bancaria_Boleto_PortType = null;
  
  public Consulta_Cobranca_Bancaria_BoletoProxy() {
    _initConsulta_Cobranca_Bancaria_BoletoProxy();
  }
  
  public Consulta_Cobranca_Bancaria_BoletoProxy(String endpoint) {
    _endpoint = endpoint;
    _initConsulta_Cobranca_Bancaria_BoletoProxy();
  }
  
  private void _initConsulta_Cobranca_Bancaria_BoletoProxy() {
    try {
      consulta_Cobranca_Bancaria_Boleto_PortType = (new br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_Cobranca_Bancaria_Boleto_ServiceLocator()).getConsulta_Cobranca_Bancaria_BoletoSOAP();
      if (consulta_Cobranca_Bancaria_Boleto_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)consulta_Cobranca_Bancaria_Boleto_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)consulta_Cobranca_Bancaria_Boleto_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (consulta_Cobranca_Bancaria_Boleto_PortType != null)
      ((javax.xml.rpc.Stub)consulta_Cobranca_Bancaria_Boleto_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_Cobranca_Bancaria_Boleto_PortType getConsulta_Cobranca_Bancaria_Boleto_PortType() {
    if (consulta_Cobranca_Bancaria_Boleto_PortType == null)
      _initConsulta_Cobranca_Bancaria_BoletoProxy();
    return consulta_Cobranca_Bancaria_Boleto_PortType;
  }
  
  public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SERVICO_SAIDA_NEGOCIAL_TYPE CONSULTA_BOLETO(br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SERVICO_ENTRADA_NEGOCIAL_TYPE parameters) throws java.rmi.RemoteException{
    if (consulta_Cobranca_Bancaria_Boleto_PortType == null)
      _initConsulta_Cobranca_Bancaria_BoletoProxy();
    return consulta_Cobranca_Bancaria_Boleto_PortType.CONSULTA_BOLETO(parameters);
  }
  
  
}