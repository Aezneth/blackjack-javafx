package com.example.blackjack;

public interface MyList {
    int size();
    Object get(int index);
    void add(Object o);
    void add(int index, Object o);
    void remove(int index);
    void remove (Object o);
    void set (int index, Object o);
    boolean contains (Object o);
    int indexOf (Object o);
    boolean isEmpty();
    void removeAll();




}
