package com.company.lab2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class StreamAPIUtil {

    public static List<Human> getHuman(){
        List<Human> result = new ArrayList<>();
        result.add(new Human(50, "Ivan", "Ivanov", LocalDate.of(1971,2,8), 85));
        result.add(new Human(60, "Fedor", "Alexandrov",LocalDate.of(1961,3,7), 95));
        result.add(new Human(34, "Alexander ", "Sergeev", LocalDate.of(1987,9,24), 77));
        result.add(new Human(71, "Petr", "Fedorov", LocalDate.of(1950,4,16), 71));
        result.add(new Human(19, "Dima", "Fedorov", LocalDate.of(2002,11,11), 67));
        result.add(new Human(12, "Nikita", "Petrov", LocalDate.of(2009,9,24), 51));

        return result;
    }
    public static List<String> getNameOfHuman(){
        List<String> result = new ArrayList<>();
        result.add("Ivan");
        result.add("Fedor");
        result.add("Alexander");
        return result;
    }

    public static List<Human> sortHumanByAge(List<Human> h) {//По Возростанию
        return h.stream()
                .sorted(Comparator.comparing(Human::getAge))
                .collect(Collectors.toList());
    }

    public static List<Human> sortHumanByAgeReversed(List<Human> h) {//По убыванию
        return h.stream()
                .sorted(Comparator.comparing(Human::getAge).reversed())
                .collect(Collectors.toList());
    }

    public static List<Human> AllHumanLessThen(List<Human> humans, int age) {// фильтрация по возрасту меньше
        return humans.stream().filter(i -> i.getAge() > age).collect(Collectors.toList());
    }
    public static String firstLettersOfTheName(List<Human> h){
        AtomicReference<String> abgdeyozh = new AtomicReference<>("");
        h.stream().forEach((x) -> {
                    abgdeyozh.updateAndGet(v -> v + x.getFirstName().charAt(0));
                }
        );
        return abgdeyozh.get();
    }

    // Вывод в консоль
    public static void printHuman(List<Human> humans) {
        humans.forEach(System.out::println);
    }
}