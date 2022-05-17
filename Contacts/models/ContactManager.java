package models;

import java.util.ArrayList;

public class ContactManager {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public void removeContact(int index) {
        this.contacts.remove(index);
    }

    public String toString() {
        String temp = "-----------------------------------------------\n" +
            "Here are all the contacts: \n\n";
        for (int i = 0; i < this.contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            temp += contact.toString() + "\n\n";
        }
        return temp;
    }

    public Contact getContact(int index) {
        return this.contacts.get(index);
    }

    public void setContact(int index, Contact contact) {
        this.contacts.set(index, contact);
    }
}
