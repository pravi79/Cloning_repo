package zerodhaproject;

import org.testng.annotations.Test;

public class DashboardTest extends BaseTest {

	@Test
	public void searchShares() {
		db.searchInstruments();

	}
}
