package com.company.lab7.composite;

public class Composite implements Component{

    private Component[] children;
    private int t = -1;

    public Composite(int numOfChildren) {
        children = new Component[numOfChildren];
    }

    @Override
    public void execute() {
        System.out.println("Shaking");
        for (int i = 0; i <= t; i++) {
            children[i].execute();
        }
    }

    public Component[] getChildren() {
        return children;
    }

    public Composite add(Component child) {
        if (t + 1 > children.length)
        {
            Component[] newStorage = new Component[children.length * 2];
            System.arraycopy(children, 0, newStorage, 0, children.length);
            newStorage[++t] = child;
            children = newStorage;
        }
        else {
            children[++t] = child;
        }
        return this;
    }

    public void remove(Component child) {
        for (int i = 0; i <= t; i++) {
            if (child == children[i]) {
                System.arraycopy(children, i+1, children, i, children.length - i + 1);
            }
        }
    }
}
