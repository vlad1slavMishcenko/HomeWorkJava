import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HomeWork6 {


    public static void main(String[] args) {
        MyMap<Integer> mymap = new MyMap<>();
        System.out.println(mymap.add(345));
        System.out.println(mymap.add(345));
        System.out.println(mymap.add(346));
        System.out.println(mymap.add(343));
        System.out.println(mymap.add(341));
        System.out.println(mymap.add(340));
        System.out.println(mymap.add(null));
        System.out.println(mymap.remove(346));
        System.out.println(mymap.remove(null));
        System.out.println(mymap);
        Object[] ar = mymap.get();
        for (int i = 0; i < ar.length;i++){
            System.out.println(ar[i]);
        }
        Iterator<Integer> iter = mymap.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    static class MyMap<T> {

        private HashMap<T, Object> map = new HashMap<T, Object>();
        private static final Object myO = new Object();

        public boolean add(T value) {
           return map.put(value, myO) == null;


        }

        public boolean remove(T value){
            return map.remove(value) == myO;

        }
        public String toString(){
            return map.keySet().toString();
        }

        public Iterator<T> iterator(){
            return map.keySet().iterator();
        }

        public Object[] get(){
            return  map.keySet().toArray();


        }
    }
}


