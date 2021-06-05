package com.company.practice10.src.main.java.ru.mirea.components;

import org.springframework.stereotype.Component;
import com.company.practice10.src.main.java.ru.mirea.interfaces.Knight;

@Component
public class WeakKnight implements Knight {
    @Override
    public void fight() {
        System.out.println("Weak Knight is fighting...");
    }
}
