public class ClientAccount extends BankAccount{

    public ClientAccount(double balance, String name, String overDraft, String address){
        super(balance, name, overDraft, address);
    }

    public void setSavingsAmount(double savings){
        this.balance += savings;
        //(which adds my savings amount to the balance amount) Shouldnt it be the other way around? because the methods name says different
    }

    public void setTransferAmount(double transfer){
        if(this.balance >= 1){
            this.balance -= transfer;
        }else{
            System.out.println("Not enough funds in balance!");
        }
    }
}
