package MapsAndList;

import java.util.*;

public class Hash {

    public static void main(String[] args) {


        Map<Integer, String> m = new HashMap<>();
        m.put(1, "T-pain");
        m.put(2, "Biggie");
        m.put(3, "Tupac");

        for(Map.Entry<Integer, String>  entry : m.entrySet()){
            System.out.println(entry);

        }

        for(Map.Entry<Integer, String> entry : m.entrySet()){
            System.out.println(entry);
        }

        System.out.println("");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); numbers.add(2); numbers.add(3);
        System.out.println(numbers);
        ListIterator<Integer> litr = numbers.listIterator(); // only for lists!
        //forward direction
        while (litr.hasNext()){
            System.out.println(litr.next());
        }
        //backward direction
        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }

    }

}
