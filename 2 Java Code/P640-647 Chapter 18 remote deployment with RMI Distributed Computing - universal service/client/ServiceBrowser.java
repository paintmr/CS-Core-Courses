import java.awt.*;
import javax.swing.*;
import java.rmi.*;
import java.awt.event.*;

public class ServiceBrowser {
  JPanel mainPanel;
  JComboBox serviceList;
  ServiceServer server;

  public static void main(String[] args) {
    new ServiceBrowser().buildGUI();
  }

  public void buildGUI() {
    JFrame frame = new JFrame("RMI Brwoser");
    mainPanel = new JPanel();
    frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
    // this method does the RMI registry lookup, gets the stub, and calls
    // getServiceList().
    Object[] services = getServicesList();
    // Add the services (an array of Objects) to the JComboBox(the list). The
    // JComboBox knows how to make displayable Strings out of eath thing in the
    // array.
    serviceList = new JComboBox(services);
    frame.getContentPane().add(BorderLayout.NORTH, serviceList);
    serviceList.addActionListener(new MyListListener());

    frame.setSize(500, 500);
    frame.setVisible(true);
  }

  Object[] getServicesList() {
    Object obj = null;
    Object[] services = null;

    // Do the RMI lookup, and get the stub
    try {
      obj = Naming.lookup("rmi://127.0.0.1/ServiceServer");
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    // Cast the stub to the remote interface type, so that we can call
    // getServiceList() on it
    server = (ServiceServer) obj;

    try {
      // getServiceList() gives us the array of Objects, that we display in the
      // JComboBox for the user to select from.
      services = server.getServiceList();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return services;
  }

  class MyListListener implements ActionListener {
    public void actionPerformed(ActionEvent ev) {
      // If we are here, it means the user made a selection from the JComboBox list.
      // So, take the selection they made and load the appropriate service. (see the
      // loadService method that asks the server for the service that corresponds with
      // this selection)
      Object selection = serviceList.getSelectedItem();
      loadService(selection);
    }
  }

  // Here's where we add the actual service to the GUI, after the user has
  // selected one. (This method is called by the event listener on the JComboBox).
  // We call getService() on the remote server (the stub for ServiceServer) and
  // pass it the String that was displayed in the list (which is the SAME String
  // we originally got from the server when we called getServiceList()). The
  // server returns the actual service (serialized), which is automatically
  // deserialized (thanks to RMI) and we simply call the getGuiPanel() on the
  // service and add the result (a JPanel) to the browser's main Panel.
  void loadService(Object serviceSelection) {
    try {
      Service svc = server.getService(serviceSelection);

      mainPanel.removeAll();
      mainPanel.add(svc.getGuiPanel());
      mainPanel.validate();
      mainPanel.repaint();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

}
