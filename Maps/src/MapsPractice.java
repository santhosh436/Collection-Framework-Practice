import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class MapsPractice {
    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<>();
        map.put(500050,"Hyderabad");
        map.put(500051,"Vijayawada");
        map.put(500052,"Kakinada");

        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            System.out.println(key);
        }
        Collection<String> values = map.values();
        for(String value : values){
            System.out.println(value);
        }

    }
}
