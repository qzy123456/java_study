package src.com.aa;

import java.rmi.RemoteException;

public class businessImpl implements Business {

    @Override
    public String echo(String msg) throws RemoteException {

        if("quit".equalsIgnoreCase(msg)) {

            System.out.println("Server will be shutdown");

            System.exit(0);

        }

        System.out.println("Message from client:"+msg);

        return "Server response:"+msg;

    }

}
