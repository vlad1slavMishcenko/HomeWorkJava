import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HomeWork5 {

    static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        HashMap<String, String> nameMap = new HashMap<>();


        while (true) {
            System.out.println("Ведите имя ");
            String name = scanner.nextLine();
            System.out.println("Введите номер телефона ");
            String numb = scanner.nextLine();
            if(nameMap.containsKey(name)) nameMap.put(name,nameMap.get(name) +", " + numb );
             else  nameMap.put(name,numb );

            System.out.println("Продолжить ввод да/нет");
            String tmp = scanner.nextLine();
            if (tmp.toLowerCase().contains("н")) break;
        }
        nameMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);



    }
}
