package zerodhaproject;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	public void loginWithCorrectCredentials() {
		lp.login();

	}
}
