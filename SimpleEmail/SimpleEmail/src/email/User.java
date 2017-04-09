package email;

import java.util.ArrayList;

public class User {
	
	private String username;
	private ArrayList<Account> remoteAccounts;
	private ArrayList<Account> localAccounts;
	
	public User(String username)
	{
		this.username = username;
		remoteAccounts = new ArrayList<Account>();
		localAccounts = new ArrayList<Account>();
	}
	
	public String getUserName()
	{
		return username;
	}
	
	public boolean checkIfRemoteAccountExists(String accountname)
	{
		for (Account a : remoteAccounts)
		{
			if (a.getAccountName().equals(accountname))
				return true;
		}
		return false;		
	}
	
	public boolean checkIfLocalAccountExists(String name)
	{
		for (Account a : localAccounts)
		{
			if (a.getAccountName().equals(name))
				return true;
		}
		return false;		
	}
	
	public void addLocalAccount(String accountName)
	{
		Account account = new Account(accountName);
		localAccounts.add(account);
	}
	
	public void addRemoteAccount(String accountName)
	{
		Account account = new Account(accountName);
		remoteAccounts.add(account);
	}
	
	public void deleteLocalAccount(int accountNumber)
	{
		localAccounts.remove(accountNumber);
	}
	
	public void deleteRemoteAccount(int accountNumber)
	{
		remoteAccounts.remove(accountNumber);
	}
}
