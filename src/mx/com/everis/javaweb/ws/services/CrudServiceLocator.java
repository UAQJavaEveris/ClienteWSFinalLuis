/**
 * CrudServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.everis.javaweb.ws.services;

public class CrudServiceLocator extends org.apache.axis.client.Service implements mx.com.everis.javaweb.ws.services.CrudService {

    public CrudServiceLocator() {
    }


    public CrudServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CrudServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Crud
    private java.lang.String Crud_address = "http://localhost:8082/CrudR/services/Crud";

    public java.lang.String getCrudAddress() {
        return Crud_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CrudWSDDServiceName = "Crud";

    public java.lang.String getCrudWSDDServiceName() {
        return CrudWSDDServiceName;
    }

    public void setCrudWSDDServiceName(java.lang.String name) {
        CrudWSDDServiceName = name;
    }

    public mx.com.everis.javaweb.ws.services.Crud getCrud() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Crud_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCrud(endpoint);
    }

    public mx.com.everis.javaweb.ws.services.Crud getCrud(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mx.com.everis.javaweb.ws.services.CrudSoapBindingStub _stub = new mx.com.everis.javaweb.ws.services.CrudSoapBindingStub(portAddress, this);
            _stub.setPortName(getCrudWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCrudEndpointAddress(java.lang.String address) {
        Crud_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mx.com.everis.javaweb.ws.services.Crud.class.isAssignableFrom(serviceEndpointInterface)) {
                mx.com.everis.javaweb.ws.services.CrudSoapBindingStub _stub = new mx.com.everis.javaweb.ws.services.CrudSoapBindingStub(new java.net.URL(Crud_address), this);
                _stub.setPortName(getCrudWSDDServiceName());
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
        if ("Crud".equals(inputPortName)) {
            return getCrud();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.ws.javaweb.everis.com.mx", "CrudService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.ws.javaweb.everis.com.mx", "Crud"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Crud".equals(portName)) {
            setCrudEndpointAddress(address);
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
