package lesson02;

import pl.com.bottega.webapp.model.Link;

/**
 * Resume
 * Sergii
 * 2016-04-30.
 */

public class Main {
    public static void main(String[] args) {
        Link link = new Link("Bottega", "www.bottega.com.pl");
        Link link1 = link;
        Link link2 = new Link(link);
        System.out.println(link1.equals(link));
         System.out.println(link1.equals(link2));
        System.out.println(link);
        System.out.println(link.getClass());
    }
}
