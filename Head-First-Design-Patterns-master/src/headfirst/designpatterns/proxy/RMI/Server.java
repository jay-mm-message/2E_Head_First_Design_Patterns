package headfirst.designpatterns.proxy.RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
       public static void main(String [] args) {
        // try {
        //     MyRemoteService myRemoteServiceImpl = new MyRemoteServiceImpl();
        //     Naming.rebind("RemoteSayHi", myRemoteServiceImpl);
        // } catch(Exception e) {
        //     System.out.println(e.getMessage());
        // }
        try {
            Registry registry = LocateRegistry.createRegistry(1099); // Default port
            //MyRemoteServiceImpl obj = new MyRemoteServiceImpl();
            //registry.bind("RemoteSayHi", obj);
            registry.bind("RemoteSayHi", new MyRemoteServiceImpl());
            System.out.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
    
    public void execute(String msg) {
        System.out.println(msg);
    }
}
