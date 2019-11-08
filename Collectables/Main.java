import java.util.HashMap;

public class Main {
    public static void main(String[] args)
    {
        String[] words = {"Понедельник", "Вторник", "Вторник",
                "Воскресенье", "Вася", "Каша", "Лодка", "Вася",
                "Воскресенье", "Вторник", "Надоело", "Придумывать",
                "Слова", "Осень", "Надоело", "Хватит"};
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words)
        {
            if (!wordToCount.containsKey(word))
                wordToCount.put(word, 0);
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet())
            System.out.println(word + " " + wordToCount.get(word));

    PhoneBook PhoneBook = new PhoneBook();
    PhoneBook.add("Васин", "555-45-61");
    PhoneBook.add("Петров", "555-12-41");
    PhoneBook.add("Олешин", "532-11-12");
    PhoneBook.add("Гудинин", "873-44-11");
    PhoneBook.add("Гудинин", "815-09-76");
    PhoneBook.info();
    System.out.println(PhoneBook.get("Гудинин"));
    }
}
