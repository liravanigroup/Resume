package pl.com.bottega.webapp.model;

/**
 * Resume
 * Sergii
 * 2016-05-01.
 */

public enum ContactType {
    PHONE("Тел."),
    MOBILE("Моб.тел."),
    HOME_PHONE("Домашний тел."),
    SKYPE("Skype"),
    MAIL("Email"),
    ICQ("ICQ");

    private String contactType;

    ContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getContactType() {
        return contactType;
    }
}
