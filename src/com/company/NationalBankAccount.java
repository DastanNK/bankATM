package com.company;

public class NationalBankAccount implements BankAccount {
    String fullName;
    double balance;
    String accountNumber;
    String pinCode;

    public NationalBankAccount() {
    }

    public NationalBankAccount(String fullName, String accountNumber, String pinCode, int balance) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }



    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {
        this.pinCode=pinCode;
    }

    @Override
    public double totalBalance() {
        return this.balance;
    }

    @Override
    public void creditBalance(int credit) {
        this.balance=balance+credit;
    }

    @Override
    public void debetBalance(double debet) {
        this.balance=balance-debet;
    }

    @Override
    public String accountData() {
        return fullName+" "+accountNumber+" "+pinCode+" "+balance;
    }
}
