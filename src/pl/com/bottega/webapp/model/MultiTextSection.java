package pl.com.bottega.webapp.model;

import java.util.List;

/**
 * Resume
 * Sergii
 * 2016-05-01.
 */

public class MultiTextSection extends Section{
    private List<String> values;

    public MultiTextSection(SectionType title) {
        super(title);
    }
}
