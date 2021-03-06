// Email object that gets sent to an account
package email;

public class Email 
{
	private static String mEmailText;
	private static String mEmailSender;
	private static String mEmailReceiver;
	private static String mSubjectText;
	
	public Email(String emailText, String emailSender, String emailReceiver, String subjectText)
	{
		this.mEmailText = emailText;
		this.mEmailSender = emailSender;
		this.mEmailReceiver = emailReceiver;
		this.mSubjectText = subjectText;
	}
	
	public static String getEmailText(Email email)
	{
		return mEmailText;
	}
	
	public static String getEmailSender(Email email)
	{
		return mEmailSender;
	}
	
	public static String getSubjectText(Email email)
	{
		return mSubjectText;
	}
	
	
}
