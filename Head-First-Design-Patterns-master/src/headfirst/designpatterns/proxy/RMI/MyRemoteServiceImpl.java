package headfirst.designpatterns.proxy.RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteServiceImpl extends UnicastRemoteObject implements MyRemoteService{

    public String sayHi()throws RemoteException {
       return "!!!! Server Says, 'Hey'";
    }
    
    private static final long serialVersionUID = 1L;

    public MyRemoteServiceImpl() throws RemoteException { super(); };
}