import java.time.LocalDate;

import models.Contact;
import models.ContactManager;

public class UsingContactManager {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        contactManager.addContact(new Contact("Sara", LocalDate.of(1987, 2, 03) , "0875445345"));
        contactManager.addContact(new Contact("John", LocalDate.of(1988, 6, 21), "0875878788")); 
        contactManager.addContact(new Contact("Pedro", LocalDate.of(1986, 10, 11), "0875876888"));   
        contactManager.removeContact(1);
        contactManager.addContact(new Contact("Albert", LocalDate.of(1982, 1, 18), "0875456546"));
        contactManager.setContact(2, new Contact("Rita", LocalDate.of(1981, 3, 2), "087434344"));
        System.out.println(contactManager);
    }
}
