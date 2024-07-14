package headfirst.designpatterns.proxy.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemoteService extends Remote {
    public String sayHi() throws RemoteException;

    public String clientQuery(String msg) throws RemoteException;
    public String serviceResponse(String msg) throws RemoteException;
}
