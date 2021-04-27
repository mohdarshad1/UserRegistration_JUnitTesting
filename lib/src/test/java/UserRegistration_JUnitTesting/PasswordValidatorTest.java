package UserRegistration_JUnitTesting;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PasswordValidatorTest
{
	private String pswdTest;
	private boolean expectedResult;
	public PasswordValidatorTest(String password, boolean expectedResult)
	{
		this.pswdTest = password;
		this.expectedResult = expectedResult;
	}
	@Parameterized.Parameters
	public static Collection data()
	{
		return Arrays.asList(new Object [][] { {"myPswd@1", true},
											{"My@pswd12", true},
											{"mypswd@1", false},
											{"MY_PSWD12", false},
											{"my password",false},
											{"1236456789", false},
											{"@mypswd123", false}
		});
	}
	@Test
	public void givenPasswordAsVar_ShouldReturnAsperParameterizedResult()
	{
		UserRegistration ur = new UserRegistration();
		boolean result = ur.validatePassword(this.pswdTest);
		Assert.assertEquals(this.expectedResult, result);
	}
}
