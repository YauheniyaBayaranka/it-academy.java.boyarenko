package by.itakadimy.boyarenko;

import java.util.ArrayList;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        System.out.println(names == null);
        System.out.println(names.isEmpty());

        names.add("Mike");
        names.add("Mike");
        names.add("Joni");
        names.add("Michael");
        names.add("Mira");
        names.add("Mir");
        names.add("Michael");
        names.add("Jenny");

        System.out.println(names);

        System.out.println(filter(names));
    }

    private static ArrayList<String> filter(ArrayList<String> names) {
        final int MAX_LENGTH_NAME = 4;

        ArrayList<String> filterNames = new ArrayList<>();

        for (String name : names) {
            if (name.length() <= MAX_LENGTH_NAME) {
                filterNames.add(name);
            }
        }
        return filterNames;
    }
}



