package headfirst.designpatterns.proxy.RMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyRemoteClient {
    // client
    public static void main(String [] args) {
        new MyRemoteClient().go();
    }
    
    public void go() {
        // try {
        //     MyRemoteService service = 
        //     (MyRemoteService) Naming.lookup(ip);

        //     String s = service.sayHi();
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }
        try {
            String host = "127.0.0.1";//(args.length < 1) ? null : args[0];
            Registry registry = LocateRegistry.getRegistry(host, 1099);
            MyRemoteService stub = (MyRemoteService) registry.lookup("RemoteSayHi");
            // String response = stub.sayHi();
            // execute("response: " + response);
            
            String response;
            response = stub.clientQuery("client: Are you there service");
            execute(response);

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }

    public void execute(String msg) {
        System.out.println(msg);
    }
}
