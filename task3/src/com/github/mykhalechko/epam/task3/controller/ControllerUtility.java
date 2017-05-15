package com.github.mykhalechko.epam.task3.controller;

import com.github.mykhalechko.epam.task3.entity.Contact;
import com.github.mykhalechko.epam.task3.view.View;

import java.util.Scanner;

class ControllerUtility {

    private View view;
    private Scanner scanner;

    ControllerUtility(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }

    Contact inputContact() {
        Contact contact = new Contact();

        contact.setName(
                inputStringWithScanner(ControllerConstants.NAME, ControllerConstants.REGEX_NAME));
        contact.setSurname(
                inputStringWithScanner(ControllerConstants.SURNAME, ControllerConstants.REGEX_NAME));
        contact.setPatronymic(
                inputStringWithScanner(ControllerConstants.PATRONYMIC, ControllerConstants.REGEX_NAME));
        contact.setNickName(
                inputStringWithScanner(ControllerConstants.NICKNAME, ControllerConstants.REGEX_NICK_NAME));
        contact.setComment(
                inputStringWithScanner(ControllerConstants.COMMENT, ".*"));
        contact.setHomePhone(
                inputStringWithScanner(ControllerConstants.HOME_PHONE, ControllerConstants.REGEX_PHONE));
        contact.setMobilePhone(
                inputStringWithScanner(ControllerConstants.MOBILE_PHONE, ControllerConstants.REGEX_PHONE));
        contact.setMobilePhone2(
                inputStringWithScanner(ControllerConstants.MOBILE_PHONE2, ControllerConstants.REGEX_PHONE2));
        contact.setEmail(
                inputStringWithScanner(ControllerConstants.EMAIL, ControllerConstants.REGEX_MAIL));
        contact.setSkype(
                inputStringWithScanner(ControllerConstants.SKYPE, ControllerConstants.REGEX_NICK_NAME));
        contact.setAddressIndex(
                inputStringWithScanner(ControllerConstants.ADDRESS_INDEX, ControllerConstants.REGEX_NUMBERS));
        contact.setAddressCity(
                inputStringWithScanner(ControllerConstants.ADDRESS_CITY, ControllerConstants.REGEX_NAME));
        contact.setAddressStreet(
                inputStringWithScanner(ControllerConstants.ADDRESS_STREET, ControllerConstants.REGEX_NAME));
        contact.setAddressHome(
                inputStringWithScanner(ControllerConstants.ADDRESS_STREET, ControllerConstants.REGEX_NICK_NAME));
        contact.setAddressApartment(
                inputStringWithScanner(ControllerConstants.ADDRESS_APARTMENT, ControllerConstants.REGEX_NUMBERS));
        return contact;
    }

    private String inputStringWithScanner(String message, String regex) {
        view.printInputMessage(message);
        String result;
        while (!(scanner.hasNext() && (result = scanner.next()).matches(regex))) {
            view.printWrongMessage(message);
        }
        return result;
    }

}
