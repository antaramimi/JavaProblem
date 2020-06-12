package interview;

import java.util.*;

public class MapLearing {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ram");
        map.put(2, "pink");
        map.put(3, "hfi");
        map.put(4, "dfgdg");
        map.put(5, "dfss");
        map.put(6, "vfss");
        map.put(7, "sfsf");
        map.put(8, "fsfs");
        map.put(9, "sgsgss");
        System.out.println(map);
        //System.out.println(Arrays.toString(map.entrySet().toArray()));

        LinkedHashMap<Integer, String> maps =
                new LinkedHashMap<>();
        maps.put(1, "Ram");
        maps.put(2, "pink");
        maps.put(3, "hfi");
        maps.put(4, "dfgdg");
        maps.put(5, "dfss");
        maps.put(6, "vfss");
        maps.put(7, "sfsf");
        maps.put(8, "fsfs");
        maps.put(9, "sgsgss");
        System.out.println(maps);




    }
}
