import java.util.*;

public class ListInDetails {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();

        arrList.add("Nilay");
        arrList.add("Rahul");
        arrList.add("Rimpa");
        arrList.add("Dhruba");
        arrList.add("Hello");

        // for(int i = 0; i<arrList.size(); i++){
        //     System.out.println(arrList.get(i));
        // }

        // for(String name: arrList){
        //     System.out.println(name);
        // }

        Iterator<String> it =  arrList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // ------------- Sublist -------------------------
        // It acts like substing
        // fromIndex is inclusive, toIndex is exclusive.
        List<String> sublist = arrList.subList(1, 3);
        System.out.println(sublist);

    }
}
