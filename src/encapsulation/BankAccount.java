package encapsulation;

public class BankAccount implements Comparable{

	private String name;
	private String accountNumber;
	private double balance;
	public BankAccount() {
		
	}
    public BankAccount(String name,String accountNumber,double balance) {
    	
    	this.name=name;
    	this.accountNumber=accountNumber;
    	this.balance=balance;
    	System.out.println("Account Created Successfully");
    	
		
	}
    public String getName() {
    	return this.name;
    }
    public String getAccountNumber() {
    	return this.accountNumber;
    }
    
    public double getBalance() {
    	return this.balance;
    }
    
    public void getAccountDetails() {
        System.out.println("Account Holder Name: " + getName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Available Balance: " + getBalance());
    }

    
    @Override
    public String toString() {
    	return "[Name:"+name + " Account Number:" + accountNumber+" Available Balance:"+balance+"]";
    }
    @Override
    public boolean equals(Object obj) {
    	BankAccount ob=(BankAccount)obj;
    	if(this.accountNumber.equals(ob.accountNumber) && this.name.equals(ob.name) && this.balance==ob.balance) {
    		return true;
    	}
    	return false;
    }
    
    
    @Override
    public int hashCode() {
    	return name.hashCode()+(int)balance+accountNumber.hashCode();
    }
	@Override
	public int compareTo(Object o) {
		
		return (int) (this.balance-((BankAccount)o).balance);
		
		
	}
   
	
}
