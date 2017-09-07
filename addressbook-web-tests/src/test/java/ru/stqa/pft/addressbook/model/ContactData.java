package ru.stqa.pft.addressbook.model;

/**
 * Created by tw on 06.09.2017.
 */
public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String phoneHome;
    private final String email;

    public ContactData(String firstName, String lastName, String phoneHome, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneHome = phoneHome;
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneHome() {
        return phoneHome;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {

        return firstName;
    }
}
