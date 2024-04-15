public class BankAccount {
    protected double balance;
    protected String name;
    protected String overDraft;
    protected String address;

    public BankAccount(double balance, String name, String overDraft, String address){
        this.balance = balance;
        this.name = name;
        this.overDraft = overDraft;
        this.address = address;
    }

    public double checkBalance(){
        return this.balance;
    }

    public void viewDetails(){
        System.out.println("Name: " + this.name + " Over Draft: " + this.overDraft + " Address: " + this.address + " Balance " + this.balance);
    }
}
