import java.util.ArrayList;
import java.util.List;

public class ArrayListIntro {
    public static void main(String[] args) {
        // Here ArrayList is the class that implements the List interface
        // List interface only accepts generics like Integer, String etc., not any primitive datatypes.
        List<Integer> list = new ArrayList<>();
        list.add(238);
        list.add(338);
        list.add(4928);
        // System.out.println(list);
        // System.out.println(list.get(1));
        list.add(839);
        list.add(3849);
        // System.out.println(list.size());
        // System.out.println(list.contains(238));
        System.out.println(list);
        list.set(4,9846);
        System.out.println(list);
        
        list.add(1, 5872);
        System.out.println(list);


        // This remove mehtod removes the element at the index 3...
        list.remove(3);
        // this remove directly removes element 338 from the list...
        list.remove(Integer.valueOf(338));
        // System.out.println(list);
        
        List<Integer> list2 = new ArrayList<>();
        list2.add(3738);
        list2.add(338);
        // System.out.println(list2);

        list.addAll(2,list2);
        // System.out.println(list);

        // remove the common elements of both the list from the first list.
        list.removeAll(list2);
        // System.out.println(list);

        // clear method clears the entire list
        list.clear();
        // System.out.println(list);
    }
}
