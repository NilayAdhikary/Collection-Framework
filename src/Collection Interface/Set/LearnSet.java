// import java.util.HashSet;
// import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        // No duplicate elements allowed in set.
        // all the operations like add(), remove(), contains() etc. are performed in O(1) t.c. So it is widely used to reduce time complexity.
        

        // 1) add() - adds the specified element to the set
        // 2) addAlL() - adds all the elements of the specified collection to the set
        // 3) remove() - removes the specified element from the set
        // 4) removeALL() - removes all the elements from the set that is present in another specified set
        // 5) retainAll() - retains all the elements in the set that are also present in another specified set
        // 6) clear() - removes all the elements from the set
        // 7) size() - returns the length (number of elements) of the set.
        // 8) contains() - returns true if the set contains the specified element.

        // i) HashSet() where elements are randomly placed in the set. They don't follow any order. T.C. mostly O(1)
        // Set<Integer> set = new HashSet<>();

        // ii) LinkedHashSet() where the elements are placed in the order they are added. Because they use LinkedList internally. Time complexity mostly O(n)
        // Set<Integer> set = new LinkedHashSet<>();

        // iii) TreeSet() internally implements BST(Binary Search Tree) and the we get the elements in sorted order. And during printing, it does inorder traversal to print the set.  Time complexity mostly O(logn)
        Set<Integer> set = new TreeSet<>();
        set.add(356);
        set.add(25676);
        set.add(75);
        set.add(202);
        set.add(356); //duplicate element will be be added again.
        set.add(567);
        set.add(927);
        System.out.println(set);
        System.out.println(set.size());
        set.remove(75);
        System.out.println(set);
        System.out.println(set.contains(902));
        // set.clear();
    }
}
