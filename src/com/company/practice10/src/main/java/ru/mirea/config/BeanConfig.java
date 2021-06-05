package com.company.practice10.src.main.java.ru.mirea.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.company.practice10.src.main.java.ru.mirea.components.KingOfKnights;
import com.company.practice10.src.main.java.ru.mirea.components.StrongKnight;
import com.company.practice10.src.main.java.ru.mirea.components.WeakKnight;

// @Configuration
public class BeanConfig {
    @Bean
    public KingOfKnights kingOfKnights() {
        return new KingOfKnights();
    }

    @Bean
    public StrongKnight strongKnight() {
        return new StrongKnight();
    }

    @Bean
    public WeakKnight weakKnight() {
        return new WeakKnight();
    }
}
