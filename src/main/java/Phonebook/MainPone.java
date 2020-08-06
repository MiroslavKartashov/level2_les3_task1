package Phonebook;

public class MainPone {

    public static void main(String[] args){
        System.out.println("Создаем справочник");
        Phonebook phonebook = new Phonebook();
        System.out.println("*********************************************");

        System.out.println(" Вносим в справочник");
        phonebook.add("Карташов", "89110957775");
        phonebook.add("Калягина", "89837338303");
        phonebook.add("Карташов", "89100957775");
        phonebook.add("Дмитриев", "89037475760");
        phonebook.add("Карташов", "88127030903");
        System.out.println("*********************************************");

        System.out.println("Получаем номера");
        System.out.println("Карташов");
        System.out.println(phonebook.get("Карташов"));
        System.out.println("Калягина");
        System.out.println(phonebook.get("Калягина"));
        System.out.println("Дмитриев");
        System.out.println(phonebook.get("Дмитриев"));
        System.out.println("*********************************************");

        System.out.println("Случай отсутствия записи");
        System.out.println("Майденко");
        System.out.println(phonebook.get("Майденко"));
        System.out.println("*********************************************");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Карташов", "89100957775");
        System.out.println("Карташов");
        System.out.println(phonebook.get("Карташов"));
    }
}
