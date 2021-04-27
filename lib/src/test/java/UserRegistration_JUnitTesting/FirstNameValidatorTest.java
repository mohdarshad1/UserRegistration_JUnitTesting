package UserRegistration_JUnitTesting;

import org.junit.Assert;
import org.junit.Test;

public class FirstNameValidatorTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue()
	{
		UserRegistration ur = new UserRegistration();
		boolean result = ur.validateFirstName("Arshad");
		Assert.assertTrue(result);
	}
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse()
	{
		UserRegistration ur = new UserRegistration();
		boolean result = ur.validateFirstName("Au");
		Assert.assertFalse(result);
	}
	@Test
	public void givenFirstName_WhenWithSplChars_ShouldReturnFalse()
	{
		UserRegistration ur = new UserRegistration();
		boolean result = ur.validateFirstName("Ars#had");
		Assert.assertFalse(result);
	}
}
