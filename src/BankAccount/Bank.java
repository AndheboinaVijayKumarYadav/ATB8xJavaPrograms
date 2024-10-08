package BankAccount;

public class Bank {
    private long accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public Bank(long accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(double money){
        if(money < 500){
            System.out.println("Invalid deposit, deposit should be greater than 500");
            return;
        }
        this.accountBalance += money;
    }

    public void withDraw(double money){

        if(money <=499){
            System.out.println("Invalid withdrawal , money should be greater than 500");
            return;
        }

        if(this.accountBalance <=0){
            System.out.println("Your account balance is Zero, Please deposit some money");
        }
        else if(this.accountBalance < money){
            System.out.println("Your withdraw amount is greater than account balance, Invalid transaction");
        }
        else{
            this.accountBalance -= money;
            System.out.println("Withdraw is successful");
        }
    }

    public static void main(String[] args) {
        Bank customer = new Bank(12345,"Vijay",0);

        customer.deposit(499);
        System.out.printf("After deposit of the Account balance is %.2f\n",customer.getAccountBalance());

        customer.withDraw(10000);
        System.out.printf("After withdraw, the Account balance is %.2f\n",customer.getAccountBalance());
        customer.withDraw(-100);
    }
}
