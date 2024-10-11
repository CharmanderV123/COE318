package lab4.src;

public class Account {
    private String account_holder;
    private int account_num;
    private double account_balance;

    public Account(String account_holder, int account_num, double balance){
        this.account_holder = account_holder;
        this.account_num = account_num;
        account_balance = balance;
    }

    public String getAccount_holder(){
        return this.account_holder;
    }

    public int getAccount_num(){
        return this.account_num;
    }

    public double getAccount_balance(){
        return this.account_balance;
    }

    public boolean deposit(double amount){
        if(amount<=0){
            return false;
        }
        else{
            this.account_balance+= amount;
            return true;
        }
    }

    public boolean withdraw(double amount){
        if(amount>0 && ((this.account_balance-amount)>=0)){
            this.account_balance -= amount;
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public String toString() {//DO NOT MODIFY
    return "(" + getAccount_holder() + ", " + getAccount_num() + ", " +
    String.format("$%.2f", getAccount_balance()) + ")";
}
}
