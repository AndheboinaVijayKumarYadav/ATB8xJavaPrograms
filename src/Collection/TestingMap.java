package Collection;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("apple",25);
        map.put("banana",5);
        map.put("Carrot",45);
//        System.out.println(map);
//        System.out.println(map.get("banana"));
//        map.remove("apple");
//        System.out.println(map);

        // Iteration over map in Java
        for(String key: map.keySet()){
            System.out.printf("Kye is %s and Value is %d \n",key,map.get(key));
        }
    }
}
