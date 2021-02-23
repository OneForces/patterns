package com.company.lab2;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Human> humans = StreamAPIUtil.getHuman();
        //Тестирование сортировки
        System.out.println("Тестирование сортировки");
        List<Human> sortedHumanAsc = StreamAPIUtil.sortHumanByAge(humans);
        List<Human> sortedHumanDesc = StreamAPIUtil.sortHumanByAgeReversed(humans);
        StreamAPIUtil.printHuman(sortedHumanAsc);
        StreamAPIUtil.printHuman(sortedHumanDesc);
        System .out.println("фильтрация по возрасту меньше, чем 20,");
        // фильтрация по возрасту меньше, чем 20,
        List<Human> AllHumanLessThen20 = StreamAPIUtil.AllHumanLessThen(humans,20);
        StreamAPIUtil.printHuman(AllHumanLessThen20);

        // фильтрация по имени «содержит ‘е’»,
        System .out.println("фильтрация по имени «содержит ‘е’»");
        List<Human> NameWithE = AllHumanWithSomeLetter(humans);
        StreamAPIUtil.printHuman(NameWithE);
        //конкатенация первых букв имен.
        System.out.println(StreamAPIUtil.firstLettersOfTheName(humans));
    }
    public static List<Human> AllHumanWithSomeLetter(List<Human> humans){
        return humans.stream().filter(i -> i.getFirstName().contains("e")).collect(Collectors.toList());
    }
}