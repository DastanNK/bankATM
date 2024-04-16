package com.company;

public class CityBankAccount implements BankAccount {
    String name;
    String surname;
    double balance;
    String accountNumber;
    String pinCode;

    public CityBankAccount(String name, String surname, String accountNumber , String pinCode,double balance) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public CityBankAccount() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        balance=balance+credit;
    }

    @Override
    public void debetBalance(double debet) {
        balance=balance-debet;
    }

    @Override
    public String accountData() {
        return name+" "+surname+" "+accountNumber+" "+pinCode+" "+balance;
    }
}
