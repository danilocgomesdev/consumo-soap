/**
 * Consulta_Cobranca_Bancaria_Boleto_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

public class Consulta_Cobranca_Bancaria_Boleto_ServiceLocator extends org.apache.axis.client.Service implements br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_Cobranca_Bancaria_Boleto_Service {

    public Consulta_Cobranca_Bancaria_Boleto_ServiceLocator() {
    }


    public Consulta_Cobranca_Bancaria_Boleto_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Consulta_Cobranca_Bancaria_Boleto_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Consulta_Cobranca_Bancaria_BoletoSOAP
    private java.lang.String Consulta_Cobranca_Bancaria_BoletoSOAP_address = "https://barramento.caixa.gov.br/sibar/ConsultaCobrancaBancaria/Boleto";

    public java.lang.String getConsulta_Cobranca_Bancaria_BoletoSOAPAddress() {
        return Consulta_Cobranca_Bancaria_BoletoSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Consulta_Cobranca_Bancaria_BoletoSOAPWSDDServiceName = "Consulta_Cobranca_Bancaria_BoletoSOAP";

    public java.lang.String getConsulta_Cobranca_Bancaria_BoletoSOAPWSDDServiceName() {
        return Consulta_Cobranca_Bancaria_BoletoSOAPWSDDServiceName;
    }

    public void setConsulta_Cobranca_Bancaria_BoletoSOAPWSDDServiceName(java.lang.String name) {
        Consulta_Cobranca_Bancaria_BoletoSOAPWSDDServiceName = name;
    }

    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_Cobranca_Bancaria_Boleto_PortType getConsulta_Cobranca_Bancaria_BoletoSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Consulta_Cobranca_Bancaria_BoletoSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConsulta_Cobranca_Bancaria_BoletoSOAP(endpoint);
    }

    public br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_Cobranca_Bancaria_Boleto_PortType getConsulta_Cobranca_Bancaria_BoletoSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_Cobranca_Bancaria_BoletoSOAPStub _stub = new br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_Cobranca_Bancaria_BoletoSOAPStub(portAddress, this);
            _stub.setPortName(getConsulta_Cobranca_Bancaria_BoletoSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConsulta_Cobranca_Bancaria_BoletoSOAPEndpointAddress(java.lang.String address) {
        Consulta_Cobranca_Bancaria_BoletoSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_Cobranca_Bancaria_Boleto_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_Cobranca_Bancaria_BoletoSOAPStub _stub = new br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.Consulta_Cobranca_Bancaria_BoletoSOAPStub(new java.net.URL(Consulta_Cobranca_Bancaria_BoletoSOAP_address), this);
                _stub.setPortName(getConsulta_Cobranca_Bancaria_BoletoSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Consulta_Cobranca_Bancaria_BoletoSOAP".equals(inputPortName)) {
            return getConsulta_Cobranca_Bancaria_BoletoSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "Consulta_Cobranca_Bancaria_Boleto");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "Consulta_Cobranca_Bancaria_BoletoSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Consulta_Cobranca_Bancaria_BoletoSOAP".equals(portName)) {
            setConsulta_Cobranca_Bancaria_BoletoSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
