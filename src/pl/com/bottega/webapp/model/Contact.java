package pl.com.bottega.webapp.model;

/**
 * Resume
 * Sergii
 * 2016-04-30.
 */

public class Contact {
    private final ContactType type;
    private final String value;

    public Contact(ContactType type, String value) {
        this.type = type;
        this.value = value;
    }

    public ContactType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
