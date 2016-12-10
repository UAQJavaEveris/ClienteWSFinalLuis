package mx.com.everis.javaweb.ws.services;

public class CrudProxy implements mx.com.everis.javaweb.ws.services.Crud {
  private String _endpoint = null;
  private mx.com.everis.javaweb.ws.services.Crud crud = null;
  
  public CrudProxy() {
    _initCrudProxy();
  }
  
  public CrudProxy(String endpoint) {
    _endpoint = endpoint;
    _initCrudProxy();
  }
  
  private void _initCrudProxy() {
    try {
      crud = (new mx.com.everis.javaweb.ws.services.CrudServiceLocator()).getCrud();
      if (crud != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)crud)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)crud)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (crud != null)
      ((javax.xml.rpc.Stub)crud)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mx.com.everis.javaweb.ws.services.Crud getCrud() {
    if (crud == null)
      _initCrudProxy();
    return crud;
  }
  
  public boolean insertPerson(mx.com.everis.javaweb.model.Personaje persona) throws java.rmi.RemoteException{
    if (crud == null)
      _initCrudProxy();
    return crud.insertPerson(persona);
  }
  
  public boolean deletePerson(mx.com.everis.javaweb.model.Personaje persona) throws java.rmi.RemoteException{
    if (crud == null)
      _initCrudProxy();
    return crud.deletePerson(persona);
  }
  
  public java.lang.String listaP() throws java.rmi.RemoteException{
    if (crud == null)
      _initCrudProxy();
    return crud.listaP();
  }
  
  public java.lang.String lista() throws java.rmi.RemoteException{
    if (crud == null)
      _initCrudProxy();
    return crud.lista();
  }
  
  public boolean updatePerson(mx.com.everis.javaweb.model.Personaje persona) throws java.rmi.RemoteException{
    if (crud == null)
      _initCrudProxy();
    return crud.updatePerson(persona);
  }
  
  
}