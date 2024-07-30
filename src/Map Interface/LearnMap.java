import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class LearnMap {
    public static void main(String[] args) {
        // Map interface is also a part of collection framework, but unlike set, list and queue, it does not implements collection interface. It is a different interface all along. Map is implemented by HashMap, LinkedHashMap, TreeMap, EnumMap and WeakHashMap classes.

        // It does not supports duplicate key values like HashSet. Each key is associated with a single value

        // Methods Used in Map interface-----------
        // 1) put(K, V) - Inserts the association of a key K and a value V into the map. If the key is already present, the new value replaces the old value.
        // 2) putAll() - Inserts all the entries from the specified map to this map.
        // 3) putIfAbsent(K, V) - Inserts the association if the key K is not already associated with the value V.
        // 4) get(K) - Returns the value associated with the specified key K. If the key is not found,it returns null.
        // 5) getOrDefault(K, defaultValue) - Returns the value associated with the specified key K. If the key is not found, it returns the defaultValue.
        // 6) containsKey(K) - Checks if the specified key K is present in the map or no
        // containsKey(K) - Checks if the specified key K is present in the map or not.
        // 7) containsValue(V) - Checks if the specified value V is present in the map or not.
        // 8) replace(K,V) - Replace the value of the key K with the new specified value V.
        // 9) replace(K, oldValue, newValue) - Replaces the value of the key K with the new value newValue only if the key K is associated with the value oldValue.
        // 10) remove(K) - Removes the entry from the map represented by the key K.
        // 11) remove(K, V) - Removes the entry from the map that has key K associated with value
        // V.
        // 12) keySet() - Returns a set of all the keys present in a map.
        // 13) values() - Returns a set of all the values present in a map.
        // 14) entrySet() - Returns a set of all the key/value mapping present in a map.

        
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Shubhra");
        map.put(2, "Tanmay");
        map.put(3, "Nilay");
        map.put(4, "Sayan");
        map.put(3, "RajDeep");
        map.put(3, "RajDeep");
        map.put(5, "RajDeep");
       
        System.out.println(map);

        // System.out.println(map.get(3));
        // System.out.println(map.getOrDefault(7, "Key 7 is not availabl e."));
        // System.out.println(map.containsKey(4));
        // System.out.println(map.containsValue("Arijit"));

        // System.out.println(map.size());
        // System.out.println(map.isEmpty());

        // System.out.println(map.remove(2));
        // System.out.println(map);

        // System.out.println(map.containsValue("Arijit"));

        // map.replace(2, "Nilay");
        // System.out.println(map);

        // ----------- retriving the keys ---------------
        // i) putting them in a set ----------
        // Set<Integer> keys = map.keySet();

        // ii) putting them in an arraylist ----------
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        
        // System.out.println(keys);

        // ----------- retriving the values ---------------
        Collection<String>  values = map.values();
        
        // System.out.println(values);

        // Iterate every key and value -----------------
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for(Map.Entry<Integer, String> entry : entries){
            System.out.print("Key is : " + entry.getKey() + "  ");
            System.out.println("Value is : " + entry.getValue());
        }
    }
}
