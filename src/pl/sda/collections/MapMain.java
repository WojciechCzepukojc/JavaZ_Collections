package pl.sda.collections;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Styczen");
        map.put(2, "Luty");
        map.put(3, "Marzec");
        map.put(4, "Kwiecień");

        System.out.println(map.get(3));

        System.out.println(map.containsKey(6));

        for (Integer i : map.keySet()){
            System.out.print(i + " ");
        }

        System.out.println();

        for (String v : map.values()){
            System.out.print(v + " ");
        }
        System.out.println();

        for (Map.Entry<Integer,String> entry :map.entrySet()){
            System.out.println("key " + entry.getKey() + " value " + entry.getValue());
        }

    }
}
