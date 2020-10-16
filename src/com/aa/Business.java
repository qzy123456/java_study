package src.com.aa;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Business extends Remote {

    public String echo(String msg) throws RemoteException;

}
