public class Server {



    public static final String SERVER_REGISTER_NAME = "BusineeDemo";



    public static void main(String[] args) throws RemoteException {

        int port = 2016;

        Business business = new BusinessImpl();

        UnicastRemoteObject.exportObject(business,port);

        Registry registry = LocateRegistry.createRegistry(1099);

        registry.rebind(SERVER_REGISTER_NAME, business);

    }

}