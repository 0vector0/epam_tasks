package com.github.mykhalechko.epam.task3.entity;


/*
        1. Фамилия абонента
        2. Имя абонента
        3. Отчество абонента
        4. Сформировать из введенных данных: Фамилия + Пробел + Первая буква Имени + точка
        5. Никнейм
        6. Комментарий
        7. Группы в которую занесен абонент (Enum с названиями групп).
        8. Телефон дом
        9. Телефон моб.
        10. Телефон моб. 2 (может отсутствовать)
        11. Е-майл
        12. Скайп
        13. Адрес, состоящий из:
        - Индекс
        - город проживания
        - улица
        - номер дома
        - номер квартиры
        14. Строка полного адреса сформированного из данных п.13.
        15. Даты внесения записи в записную книжку
        16. Даты последнего изменения записи
*/

import java.util.ArrayList;
import java.util.Date;

public class Contact {

    private String surname;
    private String name;
    private String patronymic;
    private String nickName;
    private String comment;
    private ArrayList<Groups> groups;
    private String homePhone;
    private String mobilePhone;
    private String mobilePhone2;
    private String email;
    private String skype;
    private String addressIndex;
    private String addressCity;
    private String addressStreet;
    private String addressHome;
    private String addressApartment;
    private Date creation;
    private Date modification;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFullName() {
//        Фамилия + Пробел + Первая буква Имени + точка
        return this.surname + " " + name.substring(0, 1).toUpperCase() + ".";
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ArrayList<Groups> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Groups> groups) {
        this.groups = groups;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getMobilePhone2() {
        return mobilePhone2;
    }

    public void setMobilePhone2(String mobilePhone2) {
        this.mobilePhone2 = mobilePhone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getAddressIndex() {
        return addressIndex;
    }

    public void setAddressIndex(String addressIndex) {
        this.addressIndex = addressIndex;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressHome() {
        return addressHome;
    }

    public void setAddressHome(String addressHome) {
        this.addressHome = addressHome;
    }

    public String getAddressApartment() {
        return addressApartment;
    }

    public void setAddressApartment(String addressApartment) {
        this.addressApartment = addressApartment;
    }

    public String getAddressFull() {
        return addressIndex + " " + addressCity + " " + addressStreet + " " + addressHome + " " + addressApartment;
    }


    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public Date getModification() {
        return modification;
    }

    public void setModification(Date modification) {
        this.modification = modification;
    }


}
