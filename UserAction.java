public class UserAction {
    
    public static void main(String[] args){
        ClientAccount client = new ClientAccount(100.0, "StudentName", "None", "Street 1");

        System.out.println(client.checkBalance());
        client.viewDetails();
        client.setSavingsAmount(20.0);
        client.setTransferAmount(40.0);
        client.viewDetails();
    }
}
