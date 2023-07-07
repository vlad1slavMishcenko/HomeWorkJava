import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(new Random().nextInt(50));
        }
        System.out.println(list);


        for (int i = 0; i < list.size();i++){
            if(list.get(i) % 2 == 0){
               list.remove(i);
               i--;
            }
        }
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        int min = list.get(0);
        int max = list.get(list.size()-1);

        int averages = 0;
        for (int i = 0;i < list.size();i++){
            averages += list.get(i);
        }
        int midle = averages / list.size();

        System.out.println(min);
        System.out.println(max);
        System.out.println(midle);

    }
}
