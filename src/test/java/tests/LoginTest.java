package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.DashboardPage;
import utils.DriverManager;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage login = new LoginPage(DriverManager.getDriver()); // ✅ fixed
        DashboardPage dashboard = login.loginAs("Admin", "admin123");
        Assert.assertTrue(dashboard.isLoggedIn(), "Login failed!");
    }
}

