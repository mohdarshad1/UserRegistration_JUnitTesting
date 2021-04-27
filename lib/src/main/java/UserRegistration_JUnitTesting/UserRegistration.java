package UserRegistration_JUnitTesting;

import java.util.regex.Pattern;

public class UserRegistration {

	private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
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
}
