package testcases;

import org.testng.annotations.Test;
import pageobjects.Dashboard;
import testbase.BaseClass;

public class DashboardTest extends BaseClass {

    @Test
     public void verifytenant(){

        Dashboard db = new Dashboard(driver);

        db.clickTenants();
        db.Createtenat();
        db.TenantName(randomString(5));
        db.TenantSlug(randomString(5));
        db.TenantMail(randomString(6)+"@yopmail.com");
        db.TenantPswd(randomString(8));
        //subscription plan
        db.PlanDrpdwn();
        db.SelectPlan();
        db.ClickChkBox();
        db.ClickCreate();
        db.ClickLogout();

    }

}

