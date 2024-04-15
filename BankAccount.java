public class BankAccount {
    private float balance;
    private String name;
    private String overDraft;
    private String address;

    public float checkBalance(){
        return this.balance;
    }

    public void viewDetails(){
        System.out.println("Name: " + this.name + "Over Draft: " + this.overDraft + "Address: " + this.address);
    }
}
