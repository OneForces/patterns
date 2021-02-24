package com.company.lab5;
public class Singleton2 {
    private Singleton2() {}

    private static class Singleton2Holder {
        private final static Singleton2 instance = new Singleton2();
    }
    public static Singleton2 getInstance() {
        return Singleton2Holder.instance;
    }
}
