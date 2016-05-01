package pl.com.bottega.webapp.model;

import java.util.List;

/**
 * Resume
 * Sergii
 * 2016-04-30.
 */

public class Organization {
    private final Link link;
    private final List<OrganizationPeriod> periods;

    public Organization(Link title, List<OrganizationPeriod> period) {
        this.link = title;
        this.periods = period;
    }
}
