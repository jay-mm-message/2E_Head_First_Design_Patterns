package headfirst.designpatterns.proxy.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemoteService extends Remote {
    public String sayHi() throws RemoteException;
}
