package headfirst.designpatterns.proxy.RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteServiceImpl extends UnicastRemoteObject implements MyRemoteService {

    public String sayHi()throws RemoteException {
       return "!!!! Server Says, 'Hey'";
    }

    public String clientQuery(String msg) throws RemoteException {
        execute("(service) recv query from client: " + msg);
        return serviceRespone(msg);
    }

    public String serviceRespone(String msg) throws RemoteException {
        return "\n(service) respone: I'm there.";
    }
    
    private static final long serialVersionUID = 1L;

    public MyRemoteServiceImpl() throws RemoteException { super(); };

    public void execute(String msg) {
        System.out.println(msg);
    }
}