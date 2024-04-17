package hw2;

public class BankAccount {
    private int accountNumber;
    private int balance = 0;

    public BankAccount(int accNumber, int balance){
        this.accountNumber = accNumber;
        this.balance = balance;
    }

    public int getAcountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(Integer accNumber){
        try{
            this.accountNumber = accNumber;
        }catch(IllegalArgumentException exception){
            System.out.println("Wrong args passed: " + exception.getMessage());
        };
    }

    public int getBalance(){
        return this.balance;
    }

    public void setBalance(Integer balance){
        try{
            this.balance = balance;
        }catch(IllegalArgumentException exception){
            System.out.println("Wrong args passed: " + exception.getMessage());
        }
    }

    public void withdrawMoney(int amount){
        if(amount <= 0){
            System.out.println("Amount cannot be 0 or less.");
        }

        boolean canWithdraw = this.balance - amount >= 1;

        if(canWithdraw){
            this.balance -=amount;
            System.out.println("New balance: " + this.balance);
        }else{
            System.out.println("Not enough money in balance.");
        }
    }

    public void depositMoney(int amount){
        if(amount <= 0){
            System.out.println("Amount cannot be 0 or less.");
        }
        this.balance +=amount;
        System.out.println("New balance: " + this.balance);
    }

    public static void main(String[] args){
        BankAccount bank = new BankAccount(1, 100);

        System.out.println(bank.getBalance());
        bank.withdrawMoney(43);
        bank.depositMoney(-2);
    }
}
