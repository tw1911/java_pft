package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by tw on 06.09.2017.
 */
public class ContactHelper extends HelperBase{
    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData){
        type(By.name("firstname"),contactData.getFirstName());
        type(By.name("lastname"),contactData.getLastName());
        type(By.name("home"),contactData.getPhoneHome());
        type(By.name("email"),contactData.getEmail());
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void returnToContactFormPage() {
        click(By.linkText("add next"));
    }

}
