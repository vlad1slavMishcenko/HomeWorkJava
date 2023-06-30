import java.util.Random;

public class HomeWorkJava {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(2000);
        System.out.println("Случайное число = " + i);


        int n = Integer.toBinaryString(i).length() -1;
        System.out.println("Номер старшего бита = " + n);

        int count = 0;
        for (int j = i; j < Short.MAX_VALUE;j++) {
            if (j % n == 0) {
                count++;

            }
        }
        int m1[] = new int[count];
        int x = 0;
        for (int j = i; j < Short.MAX_VALUE; j++){
            if (j % n == 0){
                m1[x] = j;
                x++;
            }
        }
       for (int j = 0; j < m1.length; j++) {
           System.out.println(m1[j]);
       }

        int count1 = 0;
        for (int j = Short.MIN_VALUE;j < i; j++){
            if (j % n != 0){
                count1++;
            }
        }
        int[] m2 = new int[count1];
        int y = 0;
        for (int j = Short.MIN_VALUE; j < i; j++){
            if (j % n != 0){
                m2[y] = j;
                y ++;
            }
        }
        for (int j = 0; j < m1.length; j++) {
            System.out.println(m2[j]);
        }

    }
}
