package Findword;

import java.util.*;

public class FindUniqWord {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
             "Kauffman", "Finlandia", "Русский стандарт", "Nemiroff", "Beluga",
             "Absolut", "Grey Goose", "Belvedere", "Reyka", "SKYY",
             "Smirnoff", "J.J. Kurberg", "Diva", "Vermont Spirits", "Grey Cardinal",
             "Хаски", "Ханская", "Stolichnaya", "Царская", "Mamont", "Grey Goose", "Grey Goose", "Grey Goose",
             "Grey Goose", "Grey Goose", "Smirnoff", "Smirnoff", "Smirnoff", "Smirnoff", "Smirnoff",
             "Vermont Spirits", "Vermont Spirits", "Vermont Spirits"
        );

        Set<String> uniq = new HashSet(words);

        System.out.println("*********************************************");
        System.out.println("Все слова:");
        System.out.println("*********************************************");
        System.out.println(words.toString());
        System.out.println("*********************************************");
        System.out.println("Уникальные слова");
        System.out.println("*********************************************");
        System.out.println(uniq.toString());
        System.out.println("*********************************************");
        System.out.println("Частота встречаемости слов");
        System.out.println("*********************************************");
        for (String key : uniq) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}