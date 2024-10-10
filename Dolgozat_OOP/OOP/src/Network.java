public class Network implements Connectable{

    private String networkName;
    public void disconnectFromNetwork(){
        System.out.println("Az " + networkName +" nevű hálózatról lecsatlakozott");
    }
    @Override
    public void connectToNetwork(String networkName) {
        this.networkName = networkName;
        System.out.println("Az " + networkName +" nevű hálózatra csatlakozott");
    }
}
