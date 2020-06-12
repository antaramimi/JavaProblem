package map;

import java.util.HashMap;

public class MapShare {

    public static HashMap<String, String> main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
        hm.remove("c");

        if (hm.containsKey("a")) {
            hm.put("b", hm.get("a"));

        }
        return hm;

    }
}
