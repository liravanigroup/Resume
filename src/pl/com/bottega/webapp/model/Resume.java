package pl.com.bottega.webapp.model;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/**
 * Sergej Povzaniuk
 * 2016-04-29.
 */
public class Resume {
    private String uuid;
    private String fullName;
    private String location;
    private String homePage;
    private List<Contact> contactList = new LinkedList<>();
    private List<Section> sectionsList = new LinkedList<>();

    public Resume(String fullName, String location, String homePage) {
        this.fullName = fullName;
        this.location = location;
        this.homePage = homePage;
        this.uuid = UUID.randomUUID().toString();
    }

    public String getUuid() {
        return uuid;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLocation() {
        return location;
    }

    public String getHomePage() {
        return homePage;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public List<Section> getSectionsList() {
        return sectionsList;
    }

    public void addContact(Contact contact){
        contactList.add(contact);
    }

    public void addSection(Section section){
        sectionsList.add(section);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Resume resume = (Resume) o;

        return uuid.equals(resume.uuid);
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }
}
