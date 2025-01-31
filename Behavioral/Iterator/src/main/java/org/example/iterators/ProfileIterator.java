package org.example.iterators;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
