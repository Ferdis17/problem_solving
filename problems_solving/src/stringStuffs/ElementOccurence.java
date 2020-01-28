package stringStuffs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementOccurence {

    private static void frequency(List<String> stringList){

        Map<String, Integer> map = new HashMap<>();
        Integer count = 0;

        for(String s : stringList){
            count = map.get(s);
            map.put(s, (count == null)? 1 : count + 1);
        }
    }
}
