package com.company.lab8.observer;

public interface Observable {
    void registerObserver(Observer o);
    void removeObject(Observer o );
    void notifyObserver();
}
