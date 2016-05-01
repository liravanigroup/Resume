package pl.com.bottega.webapp.model;

import java.util.List;

/**
 * Resume
 * Sergii
 * 2016-05-01.
 */

public class OrganizationSection extends Section{
    private List<Organization> values;

    public OrganizationSection(SectionType title) {
        super(title);
    }
}
