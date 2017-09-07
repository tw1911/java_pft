package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by tw on 29.08.2017.
 */
public class ApplicationManager {
    FirefoxDriver wd;

    private SessionHelper sessionHelper;
    private  NavigationHalper navigationHalper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;



    public void init() {
        System.setProperty("webdriver.gecko.driver", "E:\\soft\\geckodriver-v0.18.0-win64\\geckodriver.exe");
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(wd);
        contactHelper = new ContactHelper(wd);
        navigationHalper = new NavigationHalper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("admin", "secret");
    }



    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHalper getNavigationHalper() {
        return navigationHalper;
    }

    public ContactHelper getContactHelper() {return contactHelper; }
}
