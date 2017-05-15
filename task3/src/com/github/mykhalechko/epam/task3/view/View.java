package com.github.mykhalechko.epam.task3.view;

import com.github.mykhalechko.epam.task3.entity.Contact;

import java.text.SimpleDateFormat;
import java.util.List;

public class View {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printAllContacts(List<Contact> contacts) {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.print(i + 1 + " ");
            System.out.println(contacts.get(i).getFullName());
            System.out.println(contacts.get(i).getHomePhone());
            System.out.println(contacts.get(i).getMobilePhone());
            if (!(contacts.get(i).getMobilePhone2() == null)) {
                System.out.println(contacts.get(i).getMobilePhone2());
            }
            System.out.println(contacts.get(i).getAddressFull());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
            System.out.println(ViewConstants.DATE_CREATION + dateFormat.format(contacts.get(i).getCreation()));
            System.out.println(ViewConstants.DATE_MODIFICATION + dateFormat.format(contacts.get(i).getModification()));
        }
    }

    public void printInputMessage(String message) {
        System.out.println(ViewConstants.INPUT + " " + message);
    }

    public void printWrongMessage(String message) {
        System.out.println(ViewConstants.WRONG_INPUT + " " + message);
    }
}
