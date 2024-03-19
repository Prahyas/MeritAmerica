package com.techelevator;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        int currentBalance = getBalance();


        if (amountToWithdraw < 0) {

            return currentBalance;
        }

        int newBalance = currentBalance - amountToWithdraw;
        int serviceCharge = 0;

        if (newBalance < 150) {
            serviceCharge = 2;
        }

        if (newBalance - serviceCharge < 0) {

            return currentBalance;
        }


        super.withdraw(amountToWithdraw);

        if (serviceCharge > 0) {

            super.withdraw(serviceCharge);
        }

        return getBalance();
    }
}