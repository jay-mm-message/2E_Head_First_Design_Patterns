package headfirst.designpatterns.proxy.RMI;

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
            String RMI_host = "127.0.0.1";
            int RMI_port = 1099;
            Registry registry = LocateRegistry.getRegistry(RMI_host, RMI_port);
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
