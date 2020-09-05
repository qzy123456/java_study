//public class Client {
//
//
//
//public static void main(String[] args) throws RemoteException, NotBoundException {
//
//        // Registry registry = LocateRegistry.getRegistry("localhost");
//
//        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
//
//        Business business = (Business) registry.lookup(Server.SERVER_REGISTER_NAME);
//
//        System.out.println(business.echo("Hello2 Server"));
//
//    }
//
//}