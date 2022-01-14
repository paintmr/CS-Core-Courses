import java.rmi.*;
import java.rmi.server.*; // UnicastRemoteObject is in the java.rmi.server package

// extending UnicastRemoteObject is the easiest way to make a remote object
// You MUST implement your remote interface!
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
  // You have to implement all the interface methods, of course. But notice that
  // you do NOT have to declare the RemoteException.
  public String sayHello() {
    return "Server says, 'Hey";
  }

  // your superclass constructor (for UnicastRemoteObject) declares an exception,
  // so YOU must write a constructor, because it means that your constructor is
  // calling risky code (its super constructor)
  public MyRemoteImpl() throws RemoteException {
  }

  public static void main(String[] args) {
    try {
      MyRemote service = new MyRemoteImpl();
      Naming.rebind("Remote Hello", service);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

}
