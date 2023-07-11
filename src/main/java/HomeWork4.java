import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HomeWork4 {
    static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        ArrayList<String> ma = new ArrayList<>();
        ArrayList<String> ms = new ArrayList<>();
        ArrayList<String> md = new ArrayList<>();
        ArrayList<Integer> mf = new ArrayList<>();
        ArrayList<Boolean> mg = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();
        while (true) {
            System.out.println("Введите фамилию ");

            ma.add(scanner.nextLine());
            System.out.println("Ведите имя ");
            ms.add(scanner.nextLine());
            System.out.println("Введите отчество ");
            md.add(scanner.nextLine());
            System.out.println("Введите возраст ");
            mf.add(Integer.valueOf(scanner.nextLine()));
            System.out.println("Введите пол ");
            mg.add(scanner.nextLine().toLowerCase().contains("ж"));
            id.add(mg.size() - 1);
            System.out.println("Продолжить ввод да/нет");
            String tmp = scanner.nextLine();
            if (tmp.toLowerCase().contains("н")) break;

        }
        for (int i = 0; i < ma.size(); i++) {

            System.out.println((ma.get(i)) + " " + ms.get(i).toUpperCase().charAt(0) + "." +
                    md.get(i).toUpperCase().charAt(0) + ". " + mf.get(i) + " " + (mg.get(i) ? "ж" : "М"));
        }

        System.out.println("Сортировать по возрасту да/нет");
        String tmp = scanner.nextLine();
        if (tmp.toLowerCase().contains("да")) {
            id.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return mf.get(o1) - mf.get(o2);
                }
            });
            for (int i = 0; i < id.size(); i++) {
                System.out.println((ma.get(id.get(i))) + " " + ms.get(id.get(i)).toUpperCase().charAt(0) + "." +
                        md.get(id.get(i)).toUpperCase().charAt(0) + ". " + mf.get(id.get(i)) + " " + (mg.get(id.get(i)) ? "ж" : "М"));

            }


        }
        System.out.println("Сортировать по возрасту  и полу  да/нет");
        String str = scanner.nextLine();
        if (str.toLowerCase().contains("да")) {
            id.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (mf.get(o1) == mf.get(o2)) {
                        if(mg.get(o1) == true){
                            return -1;
                        }
                    }
                    return 1;
                }

            });
            for (int i = 0; i < id.size(); i++) {
                System.out.println((ma.get(id.get(i))) + " " + ms.get(id.get(i)).toUpperCase().charAt(0) + "." +
                        md.get(id.get(i)).toUpperCase().charAt(0) + ". " + mf.get(id.get(i)) + " " + (mg.get(id.get(i)) ? "ж" : "М"));


            }
        }
    }
}

