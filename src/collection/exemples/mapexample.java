package collection.exemples;

import java.util.HashMap;
import java.util.Map;

public class mapexample
{
    public static void main ( String [] args)
    {
        Map<Integer, String> namesMap= new HashMap<>();
        namesMap.put(12, "andrius");
        namesMap.put(1, "Jonas");
        namesMap.put(3, "Petras");
        namesMap.put(4, "andrius");

        for(Integer key: namesMap.keySet()){
            System.out.println("key"+key+"value"+namesMap.get(key));
        }
    }
}
