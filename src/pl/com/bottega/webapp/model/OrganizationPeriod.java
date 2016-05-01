package pl.com.bottega.webapp.model;

import java.util.Date;

/**
 * Resume
 * Sergii
 * 2016-05-01.
 */

public class OrganizationPeriod {
    private Date startDate;
    private Date endDate;
    private String position;
    private String content;

    public OrganizationPeriod(Date startDate, Date endDate, String position, String content) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.position = position;
        this.content = content;
    }
}
