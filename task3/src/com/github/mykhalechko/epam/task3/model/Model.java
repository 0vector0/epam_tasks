package com.github.mykhalechko.epam.task3.model;


import com.github.mykhalechko.epam.task3.entity.Contact;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Model {

    private List<Contact> contacts;

    public Model() {
        contacts = new ArrayList<>();
    }

    // The Program logic
    public void addContact(Contact contact) {

        if (findContact(contact.getName()) == null) {
            contact.setCreation(new Date());
            contact.setModification(new Date());
            contacts.add(contact);
        } else {
            saveContact(contact);
        }
    }

    public void saveContact(Contact contact) {
        Contact tempContact = findContact(contact.getName());
        contact.setCreation(tempContact.getCreation());
        contact.setModification(new Date());
        contacts.remove(tempContact);
        contacts.add(contact);
    }

    public Contact findContact(String name) {
        return contacts.get(contacts.indexOf(name));
    }

    public List<Contact> allContacts() {
        return contacts;
    }
}
