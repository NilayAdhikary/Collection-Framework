import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {

        // at first this will create an array of size 10; By the time whenever the array reaches it limit, automatically it grows following the rule.
        // n --> (n*3)/2+1 where n is the old array length.
        // now the elements of the old array will be copied to this new array of size 16 and the old array will be dumped.

        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Golu");

        List<Integer> list = new ArrayList<>();

        list.add(632);
        list.add(233);
        list.add(632);
        list.add(436);
        list.add(8576);
        System.out.println(list);

        // add an element at the end of the list.
        list.add(3573);
        System.out.println(list);

        // add an element at a particular index. here at index 2, element 245 is added.
        list.add(2, 245);
        System.out.println(list);

        // add a whole new list to the existing list.
        List<Integer> newList = new ArrayList<>();
        newList.add(23);
        newList.add(78);
        list.addAll(newList);
        // add the new list at a particular index.
        list.addAll(0,newList);
        System.out.println(list);

        // how to get an element from a list
        
    }
}
