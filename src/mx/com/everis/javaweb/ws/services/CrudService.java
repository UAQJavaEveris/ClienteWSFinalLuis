/**
 * CrudService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.everis.javaweb.ws.services;

public interface CrudService extends javax.xml.rpc.Service {
    public java.lang.String getCrudAddress();

    public mx.com.everis.javaweb.ws.services.Crud getCrud() throws javax.xml.rpc.ServiceException;

    public mx.com.everis.javaweb.ws.services.Crud getCrud(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
