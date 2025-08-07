
package banking;


public class bankingClass {
    
    int accountNo = 10001;
    String name;
    float initialBalance = 0;
    int pin = 1234;
   
    public boolean verifyAccount(int acc, int pn) {
        return acc == accountNo && pn == pin;
    }
    
    public int setAccount() {
        return accountNo;
    }
    
    public void viewBalance() {
        System.out.println("Current balance: " + initialBalance);
    }
    
    public void deposit(float amount) {
        if (amount > 0) {
            initialBalance += amount;
            System.out.println("Deposited: " + amount);
            viewBalance(); 
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
}