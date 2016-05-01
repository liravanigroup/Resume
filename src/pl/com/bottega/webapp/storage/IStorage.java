package pl.com.bottega.webapp.storage;

import pl.com.bottega.webapp.model.Resume;

import java.util.Collection;

/**
 * Resume
 * Sergii
 * 2016-05-01.
 */

public interface IStorage {
    void clear();

    void save(Resume resume);

    void update(Resume resume);

    Resume load(String uuid);

    void delete(String uuid);

    Collection<Resume> getAllSorted();

    int size();
}
