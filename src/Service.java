import java.util.HashMap;

import java.util.Scanner;;

public class Service {

	HashMap <Integer, Account> accounts = new HashMap<Integer,Account>();
	
	
	public void createAccount(int accountNumber) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter first name");
		String firstName = sc.nextLine();
		
		System.out.println("Please enter last name");
		String lastName = sc.nextLine();
		
		Account account = new Account(firstName,lastName,accountNumber);
		
		accounts.put(accountNumber, account);
		
		
	}
	
	public void retrieveAccount(int AccountNumber) {
		
		
		System.out.println("First Name:" + accounts.get(AccountNumber).getFirstName());
		System.out.println("Last Name:" + accounts.get(AccountNumber).getLastName());
		System.out.println("Account Number:" + accounts.get(AccountNumber).getAccountNumber());
	}
	
	public void removeAccount(int AccountNumber) {
		accounts.remove(AccountNumber);
	}
	
}
