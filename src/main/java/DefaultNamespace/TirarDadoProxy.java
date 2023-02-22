package DefaultNamespace;

public class TirarDadoProxy implements DefaultNamespace.TirarDado {
  private String _endpoint = null;
  private DefaultNamespace.TirarDado tirarDado = null;
  
  public TirarDadoProxy() {
    _initTirarDadoProxy();
  }
  
  public TirarDadoProxy(String endpoint) {
    _endpoint = endpoint;
    _initTirarDadoProxy();
  }
  
  private void _initTirarDadoProxy() {
    try {
      tirarDado = (new DefaultNamespace.TirarDadoServiceLocator()).getTirarDado();
      if (tirarDado != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tirarDado)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)tirarDado)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (tirarDado != null)
      ((javax.xml.rpc.Stub)tirarDado)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.TirarDado getTirarDado() {
    if (tirarDado == null)
      _initTirarDadoProxy();
    return tirarDado;
  }
  
  
}