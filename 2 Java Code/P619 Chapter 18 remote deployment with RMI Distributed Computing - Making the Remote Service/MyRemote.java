import java.rmi.*; // RemoteException and Remote interface are in java.rmi package

// Your interface MUST extend java.rmi.Remote
public interface MyRemote extends Remote {
  // All of your remote methods must declare a RemoteException
  public String sayHello() throws RemoteException;
}