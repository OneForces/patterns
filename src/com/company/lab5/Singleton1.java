package com.company.lab5;
public class Singleton1 {
    private volatile Singleton1 instance;

    private Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
            return instance;
        }
        return instance;
    }

    private Singleton1() {}
}
