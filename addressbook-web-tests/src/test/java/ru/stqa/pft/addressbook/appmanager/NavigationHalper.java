package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by tw on 29.08.2017.
 */
public class NavigationHalper extends HelperBase{

    public NavigationHalper(FirefoxDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }

    public void gotoContactCreationPage() {click(By.linkText("add new"));
    }
}
