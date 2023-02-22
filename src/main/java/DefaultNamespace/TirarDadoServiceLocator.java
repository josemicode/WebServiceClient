/**
 * TirarDadoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class TirarDadoServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.TirarDadoService {

    public TirarDadoServiceLocator() {
    }


    public TirarDadoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TirarDadoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TirarDado
    private java.lang.String TirarDado_address = "http://localhost:8080/ServicioWebDinamic/services/TirarDado";

    public java.lang.String getTirarDadoAddress() {
        return TirarDado_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TirarDadoWSDDServiceName = "TirarDado";

    public java.lang.String getTirarDadoWSDDServiceName() {
        return TirarDadoWSDDServiceName;
    }

    public void setTirarDadoWSDDServiceName(java.lang.String name) {
        TirarDadoWSDDServiceName = name;
    }

    public DefaultNamespace.TirarDado getTirarDado() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TirarDado_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTirarDado(endpoint);
    }

    public DefaultNamespace.TirarDado getTirarDado(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.TirarDadoSoapBindingStub _stub = new DefaultNamespace.TirarDadoSoapBindingStub(portAddress, this);
            _stub.setPortName(getTirarDadoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTirarDadoEndpointAddress(java.lang.String address) {
        TirarDado_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.TirarDado.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.TirarDadoSoapBindingStub _stub = new DefaultNamespace.TirarDadoSoapBindingStub(new java.net.URL(TirarDado_address), this);
                _stub.setPortName(getTirarDadoWSDDServiceName());
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
        if ("TirarDado".equals(inputPortName)) {
            return getTirarDado();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "TirarDadoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "TirarDado"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TirarDado".equals(portName)) {
            setTirarDadoEndpointAddress(address);
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
