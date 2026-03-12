import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {

    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();

        map.put("india", 120);
        map.put("US", 30);
        map.put("china", 150);

        System.out.println(map);

        // if(map.containsKey("indonesia")) {
        //     System.out.println("key is present in the map");
        // } else {
        //     System.out.println("key is not present in the map");
        // }

        // System.out.println(map.get("china"));

        for( Map.Entry<String, Integer> e : map.entrySet() ) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

    }
}