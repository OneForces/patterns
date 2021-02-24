package com.company.lab7.composite;

public class Client {
    public Client() {
        Composite composite = new Composite(2);
        composite.add(new Leaf()).add(new Composite(2));
        ((Composite) composite.getChildren()[1]).add(new Leaf()).add(new Leaf());
        composite.execute();
    }

    public static void main(String[] args) {
        Client client = new Client();
    }
}
