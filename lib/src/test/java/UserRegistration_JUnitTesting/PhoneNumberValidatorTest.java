package UserRegistration_JUnitTesting;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PhoneNumberValidatorTest
{
	private String phnoTest;
	private boolean expectedResult;
	public PhoneNumberValidatorTest(String phno, boolean expectedResult)
	{
		this.phnoTest = phno;
		this.expectedResult = expectedResult;
	}
	@Parameterized.Parameters
	public static Collection data()
	{
		return Arrays.asList(new Object [][] { {"91 7093812025", true},
											{"91 9948158788", true},
											{"916302806811", false},
											{"9395155810", false},
											{"91 5678901234",false},
											{"+1(473) 972-7474", false},
											{"91-7013693332", false}
		});
	}
	@Test
	public void givenPhoneNumberAsVar_ShouldReturnAsperParameterizedResult()
	{
		UserRegistration ur = new UserRegistration();
		boolean result = ur.validatePhoneNumber(this.phnoTest);
		Assert.assertEquals(this.expectedResult, result);
	}
}