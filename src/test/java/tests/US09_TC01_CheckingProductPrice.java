package tests;

import org.testng.annotations.Test;
import pages.Page;
import utilities.TestBaseRapor;

public class US09_TC01_CheckingProductPrice extends TestBaseRapor {
    Page pages=new Page();

    @Test
    public void test01() {
        extentTest=extentReports.createTest("US09_TC09_Checking Filtered Product Prices ",
                "User can verify that filtered product prices are suitable for filter");
        pages.goToHomePage();
        pages.checkPrice();

        extentTest.pass("User  verified that filtered product prices are suitable for filter");
    }
}
