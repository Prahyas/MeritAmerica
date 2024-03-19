package com.techelevator;

public class CheckingAccount extends BankAccount {

    private static final int OVERDRAFT_FEE = 10;
    private static final int OVERDRAFT_LIMIT = -100;

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        int currentBalance = getBalance();
        int newBalance = currentBalance - amountToWithdraw;

        if (newBalance >= 0) {
            return super.withdraw(amountToWithdraw);
        } else if (newBalance > OVERDRAFT_LIMIT) {
            newBalance = newBalance - OVERDRAFT_FEE;
            return super.withdraw(amountToWithdraw + OVERDRAFT_FEE);
        } else {
            return currentBalance;
        }
    }
}
