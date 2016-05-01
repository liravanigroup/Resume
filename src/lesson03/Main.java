package lesson03;

import pl.com.bottega.webapp.model.Contact;
import pl.com.bottega.webapp.model.ContactType;
import pl.com.bottega.webapp.model.Link;

import java.util.Arrays;

/**
 * Resume
 * Sergii
 * 2016-05-01.
 */

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException {
        Contact contact = new Contact(ContactType.SKYPE, "vamsterdamv");
        ContactType contactType = ContactType.ICQ;


        Link l = new Link("Link_name", "Link_url");

        System.out.println(Link.class.isInstance(l));

        int[] test = new int[20];

        Arrays.fill(test,2,5,4);

        System.out.println(Arrays.toString(test));

    }
}
