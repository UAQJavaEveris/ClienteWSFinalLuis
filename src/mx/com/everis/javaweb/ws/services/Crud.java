/**
 * Crud.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.everis.javaweb.ws.services;

public interface Crud extends java.rmi.Remote {
    public boolean insertPerson(mx.com.everis.javaweb.model.Personaje persona) throws java.rmi.RemoteException;
    public boolean deletePerson(mx.com.everis.javaweb.model.Personaje persona) throws java.rmi.RemoteException;
    public java.lang.String listaP() throws java.rmi.RemoteException;
    public java.lang.String lista() throws java.rmi.RemoteException;
    public boolean updatePerson(mx.com.everis.javaweb.model.Personaje persona) throws java.rmi.RemoteException;
}
