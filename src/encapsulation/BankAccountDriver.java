package encapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class BankAccountDriver {

    public static void main(String[] args) {

       
        Comparator<BankAccount> sortByName = new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        
        ArrayList<BankAccount> accounts = new ArrayList<>();

        
        accounts.add(new BankAccount("Pratik", "101", 20000.00));
        accounts.add(new BankAccount("Ganesh", "102", 18000.00));
        accounts.add(new BankAccount("Om", "103", 25000.00));
        accounts.add(new BankAccount("Harshal", "104", 15000.00));
        accounts.add(new BankAccount("Rohit", "105", 30000.00));
        accounts.add(new BankAccount("Saurabh", "106", 22000.00));
        accounts.add(new BankAccount("Nikhil", "107", 28000.00));
        accounts.add(new BankAccount("Akash", "108", 12000.00));
        accounts.add(new BankAccount("Tushar", "109", 27000.00));
        accounts.add(new BankAccount("Vishal", "110", 19000.00));
        
       
        Collections.sort(accounts,sortByName);

        
        for (BankAccount acc : accounts) {
            System.out.println(acc);
        }
    }
}
