package com.mansoor.java.projects.atmMachine;

import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 5674;

    public void checkPin ( ) {
        System.out.println ( "Enter your pin: " );
        Scanner sc = new Scanner ( System.in );
        int enteredPin = sc.nextInt ( );
        if ( enteredPin == PIN ) {
            menu ( );
        } else {
            System.out.println ( "Enter a valid pin" );
        }
    }

    private void menu ( ) {
        System.out.println (" Enter your Choice");
        System.out.println ( );
        System.out.println ("1. Check A/C Balance" );
        System.out.println ("2. Withdraw Money" );
        System.out.println ("3. Deposit Money" );
        System.out.println ("4.Exit" );

        Scanner sc = new Scanner ( System.in );
        int opt=sc.nextInt ();
        if(opt==1){
            checkBalance();
        } else if ( opt==2 ) {
            withdrawMoney();
        } else if ( opt==3 ) {
            depositMoney();
        } else if ( opt==4 ) {
            return;
        }else {
            System.out.println ("Enter a Valid Choice" );
        }
    }



    private void checkBalance ( ) {
        System.out.println ("Balance" +Balance );
        menu ();
    }


    private void withdrawMoney ( ) {

        System.out.println ("Enter Amount" );
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextInt();
        if(amount>Balance){
            System.out.println ("Insufficient Balance"+Balance );
        }else{
            Balance=Balance-amount;
            System.out.println (amount+" Money Withdrawn Successfully" );
        }
        menu ();
    }
    private void depositMoney ( ) {
        System.out.println ("Enter Amount" );
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextInt();
        Balance=Balance+amount;
        System.out.println (amount+" added" );
        checkBalance ();
        menu ();
    }
}

public class ATMMachine {

    public static void main ( String[] args ) {
        ATM atm=new ATM ();
        atm.checkPin ();
    }
}
