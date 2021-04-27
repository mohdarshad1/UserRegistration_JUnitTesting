package UserRegistration_JUnitTesting;

import java.util.regex.Pattern;

public class UserRegistration {

	private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	private static final String EMAIL_ADDRESS_PATTERN = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
	public boolean validateFirstName(String fname)
	{
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		return pattern.matcher(fname).matches();
	}
	public boolean validateLastName(String lname)
	{
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		return pattern.matcher(lname).matches();
	}
	public boolean validateEmailAddress(String email)
	{
		Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
		return pattern.matcher(email).matches();
	}
}
