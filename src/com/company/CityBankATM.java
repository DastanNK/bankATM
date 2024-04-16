package com.company;

import java.util.Scanner;

public class CityBankATM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER ACCOUNT NUMBER");
        String accountnumber=in.next();
        System.out.println("ENTER PINCODE");
        String pincode=in.next();
        String bank="";
        int indexofActiveUser=0;
        int ErrorInfo=0;
        for(int i=0;i<10;i++){
            if(Database.allAccounts[i].getAccountNumber().equals(accountnumber) && Database.allAccounts[i].getPinCode().equals(pincode)){
                ErrorInfo=1;
                indexofActiveUser=i;
                if(Database.allAccounts[i] instanceof CityBankAccount){
                    bank="CityBank";
                }else{
                    bank="NationalBank";
                }
            }else{
                if(ErrorInfo!=1){
                    ErrorInfo=0;
                }
            }
        }
        if(ErrorInfo==0){
            System.out.println("ACCOUNT DOESN'T EXIST");
        }
        else if(ErrorInfo==1){
            System.out.println("ACCOUNT EXISTS");
        }
        if(bank.equals("CityBank")){
            while(true){
                System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                System.out.println("PRESS [2] TO VIEW BALANCE");
                System.out.println("PRESS [3] TO CHANGE PIN CODE");
                System.out.println("PRESS [4] TO CASH IN ACCOUNT");
                System.out.println("PRESS [5] TO VIEW ACCOUNT DATA");
                System.out.println("PRESS [6] TO EXIT");
                String choice=in.next();
                if(choice.equals("1")){
                    System.out.println("ENTER AMOUNT TO WITHDRAWAL");
                    Database.allAccounts[indexofActiveUser].debetBalance(in.nextInt());
                }
                if(choice.equals("2")){
                    System.out.println(Database.allAccounts[indexofActiveUser].totalBalance());
                }
                if(choice.equals("3")){
                    System.out.println("ENTER NEW PINCODE");
                    Database.allAccounts[indexofActiveUser].setPinCode(in.next());
                }
                if(choice.equals("4")){
                    System.out.println("ENTER AMOUNT TO DEPOSIT OF MONEY TO ACCOUNT");
                    Database.allAccounts[indexofActiveUser].creditBalance(in.nextInt());
                }
                if(choice.equals("5")){
                    System.out.println(Database.allAccounts[indexofActiveUser].accountData());
                }
                if(choice.equals("6")){
                    break;
                }
            }
        }if(bank.equals("NationalBank")){
            while(true){
                System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                System.out.println("PRESS [2] TO VIEW BALANCE");
                System.out.println("PRESS [3] TO EXIT");
                String choice=in.next();
                if(choice.equals("1")){
                    System.out.println("ENTER AMOUNT TO CASH WITHDRAWAL");
                    int with= in.nextInt();
                    Database.allAccounts[indexofActiveUser].debetBalance(with+(with*0.01));
                    System.out.println("WITHDRAWN: "+with+",comission: "+with*0.01);
                }
                if(choice.equals("2")){
                    System.out.println(Database.allAccounts[indexofActiveUser].totalBalance());
                }
                if(choice.equals("3")){
                    System.exit(1);
                }
            }
        }
    }
}
