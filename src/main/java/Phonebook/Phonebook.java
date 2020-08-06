package Phonebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

    public class Phonebook {
       private HashMap<String, List<String>> book;

       public Phonebook(){
          this.book = new HashMap<>();
       }

       public void add(String name, String number){
           if(book.containsKey(name)){
              List<String> numbers = book.get(name);
                if(!numbers.contains(number)){
                numbers.add(number);
                  System.out.println(String.format("Номер %s добавлен для фамилии %s", number, name));
            } else {
                 System.out.println(String.format("Номер %s уже существует для фамилии %s", number, name));
              }
           } else {
             book.put(name, new ArrayList<>(Arrays.asList(number)));
             System.out.println(String.format("Номер %s добавлен для фамилии %s", number, name));
             }
           }

       public List<String> get(String name){
            if(book.containsKey(name)){
              return book.get(name);
            } else {
               System.out.println(String.format("В справочнике нет записи для фамилии %s", name));
                return new ArrayList<>();
               }
       }
}