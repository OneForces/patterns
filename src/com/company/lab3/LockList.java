package com.company.lab3;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockList<E, R> extends ArrayList<E> {
    private static final Lock lock = new ReentrantLock();

    @Override
    public E set(int index, E element) {
        lock.lock();
        E t = super.set(index, element);
        lock.unlock();
        return t;
    }

    @Override
    public boolean add(E e) {
        lock.lock();
        boolean t = super.add(e);
        lock.unlock();
        return t;

    }

    @Override
    public void add(int index, E element) {
        lock.lock();
        super.add(index, element);
        lock.unlock();
    }

    @Override
    public E remove(int index) {
        lock.lock();
        E t = super.remove(index);
        lock.unlock();
        return t;
    }

    @Override
    public boolean remove(Object o) {
        lock.lock();
        boolean t = super.remove(o);
        lock.unlock();
        return t;
    }

    @Override
    public void clear() {
        lock.lock();
        super.clear();
        lock.unlock();
    }
}