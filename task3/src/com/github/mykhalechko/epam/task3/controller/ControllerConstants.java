package com.github.mykhalechko.epam.task3.controller;

import java.util.ResourceBundle;

final class ControllerConstants {

    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");

    // The Regex
    static String REGEX_NAME = resourceBundle.getString("name.regexp");
    static String REGEX_NICK_NAME = resourceBundle.getString("nick_name.regexp");
    // «nick@mail.com»
    static String REGEX_MAIL = resourceBundle.getString("mail.regexp");
    // «http://www.my-site.com»
    static String REGEX_URL = resourceBundle.getString("url.regexp");
    // «+38(044)555-55-55»
    static String REGEX_PHONE = resourceBundle.getString("phone.regexp");
    static String REGEX_PHONE2 = resourceBundle.getString("phone2.regexp");
    static String REGEX_NUMBERS = resourceBundle.getString("numbers.regexp");

    static String NAME = resourceBundle.getString("name");
    static String SURNAME = resourceBundle.getString("surname");
    static String PATRONYMIC = resourceBundle.getString("patronymic");
    static String NICKNAME = resourceBundle.getString("nickName");
    static String COMMENT = resourceBundle.getString("comment");
    static String GROUPS = resourceBundle.getString("groups");
    static String HOME_PHONE = resourceBundle.getString("home_phone");
    static String MOBILE_PHONE = resourceBundle.getString("mobile_phone");
    static String MOBILE_PHONE2 = resourceBundle.getString("mobile_phone2");
    static String EMAIL = resourceBundle.getString("email");
    static String SKYPE = resourceBundle.getString("skype");
    static String ADDRESS_INDEX = resourceBundle.getString("address_index");
    static String ADDRESS_CITY = resourceBundle.getString("address_city");
    static String ADDRESS_STREET = resourceBundle.getString("address_street");
    static String ADDRESS_HOME = resourceBundle.getString("address_home");
    static String ADDRESS_APARTMENT = resourceBundle.getString("address_apartment");

    private ControllerConstants() {
    }

}
