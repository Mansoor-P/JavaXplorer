package com.mansoor.java.projects.moneymanagement;

import java.sql.*;
import java.util.*;

public class HistoryTracker
{
    private final List<Transaction> transactions;
    public HistoryTracker()
    {
        transactions = new LinkedList<>();
    }
    private void add(Scanner scanner)
    {
        Transaction transaction = new Transaction();
        System.out.print("Enter date DD/MM/YYYY  📅: ");
        transaction.date = scanner.next();
//        if (!transaction.date.matches(Transaction.DATE_REGEX))
//        {
//            System.out.println("Invalid date");
//            return;
//        }


        System.out.print("Enter amount you spend 💸: ");
        try
        {
            transaction.amount = scanner.nextDouble();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid number");
        }


        System.out.print("Enter transaction type ❓: ");
        transaction.transactionType = transactionType(scanner.next());
        if (transaction.transactionType == null) {
            System.out.println("expected credit/debit");
            return;
        }
        System.out.print("Enter transaction note 📝: ");
        scanner.nextLine();
        transaction.note = scanner.nextLine();
        transactions.add(transaction);
    }

    public void printHistory() throws Exception
    {

        String HISTORY = String.format("\n| %-12s| %-10s| %-8s| %-9s", "📅Date", "💸Amount", "❓Type", "📝Note");
        System.out.println(HISTORY);
//        StringBuilder builder = new StringBuilder();
//        for (Transaction transaction : transactions) {
//            builder.append(String.format("| %-12s| %-10.2f| %-8s| %-8s\n", transaction.date, transaction.amount, transaction.transactionType, transaction.note));
//        }

        try {
            Connection con = db.establishConnection();

            Statement st=con.createStatement();

            ResultSet rs = st.executeQuery("select * from transactions");

            while (rs.next())
            {
                System.out.println(String.format("\n %-13s  %-15s  %-8s  %-20s",
                        rs.getString("tran_date"),
                        rs.getDouble("amount"),
                        rs.getString("tran_type"),
                        rs.getString("note")));
            }
            con.close();
            st.close();
            rs.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public String transactionType(String input)
    {
        if(input.equals("credit") || input.equals("debit") ||input.equals("Credit") || input.equals("Debit"))
            return input;
        else System.out.println("transaction type required");
            return  input;
    }

    public static void main(String[] args) throws Exception {

        HistoryTracker ht=new HistoryTracker();
        String options = """
                1. Add new transaction
                2. Print history
                3. Options
                0. Exit
                """;
        System.out.println("Welcome to the expense tracker !!");
        System.out.println(options);
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.print("\n> Enter your option : ");
            choice = scanner.nextInt();
            if (choice == 0) System.out.println("See you soon");
            else if (choice == 1) db.main(null);
            else if (choice == 2) ht.printHistory();
            else if (choice == 3) System.out.println(options);
            else System.out.println("Wrong option*");
        } while (choice != 0);

        scanner.close();
    }
}
