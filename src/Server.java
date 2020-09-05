//package src;
//
//import java.rmi.RemoteException;
//import java.rmi.registry.LocateRegistry;
//import java.rmi.registry.Registry;
//import java.rmi.server.UnicastRemoteObject;
//
//import com.com.models.aa.*;
//public class Server {
//     static final String SERVER_REGISTER_NAME = "BusineeDemo";
//
//
//
//    public static void main(String[] args) throws RemoteException {
//
//        int port = 2016;
//
//        Business business = new businessImpl();
//
//        UnicastRemoteObject.exportObject(business,port);
//
//        Registry registry = LocateRegistry.createRegistry(1099);
//
//        registry.rebind(SERVER_REGISTER_NAME, business);
//
//    }
//}
