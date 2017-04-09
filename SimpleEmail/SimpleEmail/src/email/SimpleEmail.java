package email;

public class SimpleEmail 
{

	public static void main(String[] args) 
	{
		Server EmailServer = new Server();
		UserInterface UI = new UserInterface(EmailServer);
	}

}
