//import com.com.models.aa.Business;
//
//import java.rmi.RemoteException;
//import java.rmi.NotBoundException;
//import java.rmi.registry.LocateRegistry;
//import java.rmi.registry.Registry;
//
//public class Client {
//    public static void main(String[] args) throws RemoteException, NotBoundException {
//
//        // Registry registry = LocateRegistry.getRegistry("localhost");
//
//        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
//
//        Business business = (Business) registry.lookup(Server.SERVER_REGISTER_NAME);
//
//        System.out.println(business.echo("quits"));
//
//    }
//}
