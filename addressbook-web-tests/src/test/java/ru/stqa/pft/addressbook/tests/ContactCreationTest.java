package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by tw on 06.09.2017.
 */
public class ContactCreationTest extends TestBase{


    @Test
    public void testContactCreation(){
        app.getNavigationHalper().gotoContactCreationPage();
        app.getContactHelper().fillContactForm(new ContactData("Ivan","Ivanov","2433440","iivanov@mail.ru"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToContactFormPage();
    }
}
