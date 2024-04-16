package com.company;

public class Database {
    public static BankAccount allAccounts[] = new BankAccount[10];

    static {
        allAccounts[0] = new CityBankAccount("Ilyas", "Zhuanyshev", "KZ010322312", "0102", 20000);
        allAccounts[1] = new CityBankAccount("Erbol", "Assanbek", "KZ010322313", "0101", 10000);
        allAccounts[2] = new NationalBankAccount("Ilyas Zhuanyshev", "KZ0101112", "0102", 2000);
        allAccounts[3] = new NationalBankAccount("Sherkhan Kozhakhmetov", "KZ0101113", "0103", 25000);
        allAccounts[4] = new CityBankAccount("Bagyzhan", "Asylbay", "KZ010322314", "0103", 12000);
        allAccounts[5] = new CityBankAccount("Mustafa", "Oskanbay", "KZ010322315", "0104", 22000);
        allAccounts[6] = new CityBankAccount("Zaman", "Bolat", "KZ010322316", "0105", 1200);
        allAccounts[7] = new NationalBankAccount("Mukhamedzhan Tolegen", "KZ0101114", "0104", 2000);
        allAccounts[8] = new NationalBankAccount("Orakbay Farabi", "KZ0101115", "0105", 27000);
        allAccounts[9] = new CityBankAccount("Alisher", "Bolatov", "KZ010322317", "0106", 18000);
    }
}
