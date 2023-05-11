package org.bnkAccount;
public class main {
    public static void main(String[] args) {
//First Assignment
        bankAccount newUser = new bankAccount("newUser", 500);
        newUser.deposit(100);
        newUser.acctDetails();
//Second Assignment
        bankAccount Larry = new bankAccount("Larry", 5000);
        bankAccount Mary = new bankAccount("Mary", 300);

        Larry.withdrawal(100);
        Mary.deposit(100);

        Larry.acctDetails();
        Mary.acctDetails();
    }
}
        class bankAccount {
            private double accountBalance;
            private String acctName;

            public bankAccount(String acctName, double accountBalance) {
                this.acctName = acctName;
                this.accountBalance = accountBalance;
            }

            public void deposit(double money) {
                accountBalance = accountBalance + money;
            }

            public void withdrawal(double money) {
                accountBalance -= money;
            }

            public void acctDetails() {
                System.out.println(acctName + " Balance: " + accountBalance);
            }
        }


