package pl.com.bottega.webapp.storage;

import pl.com.bottega.webapp.model.Resume;

import java.util.Collection;

/**
 * Resume
 * Sergii
 * 2016-05-01.
 */

public class ArrayStorage implements IStorage {
    private Resume[] array = new Resume[100];

    @Override
    public void clear() {

    }

    @Override
    public void save(Resume resume) {

    }

    @Override
    public void update(Resume resume) {

    }

    @Override
    public Resume load(String uuid) {
        return null;
    }

    @Override
    public void delete(String uuid) {

    }

    @Override
    public Collection<Resume> getAllSorted() {
        return null;
    }

    @Override
    public int size() {
        return array.length;
    }
}
