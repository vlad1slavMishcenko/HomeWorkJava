import java.io.FileReader;
import java.io.File;
public class HomeWork2 {
    public static void main(String[] args) {
        String str =  "name: Ivanov, country: Russia, city: Moscow, age: null";
        str = str.replace(": ", ",");
        StringBuilder bilder = new StringBuilder();
        String[] a = str.split(",");
        for (int i = 1; i < a.length;i += 2){
            if(!a[i].equals("null")){
                bilder.append(a[i -1]).append(" = '").append(a[i]).append("' ");
            }

        }
        System.out.println(bilder.toString());
    }

}
