import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// custom comparator to compare two objects rather than making the Animal class comparable.
class MyCustomComparator implements Comparator<Animal>{
    // comparaing based on the weight of the animal
    @Override
    public int compare(Animal o1, Animal o2) {
        // if (o1.age == o2.age) {
        //     return o1.name.compareTo(o2.name);
        // }
        return Integer.compare(o1.weight, o2.weight);
    }
}


public class LearnComparableAndComparators {
    public static void main(String[] args) {
        Animal a1 = new ("Rozy", 12, 40);
        Animal a2 = new Animal("Liza", 28, 41);
        Animal a3 = new Animal("Reeva", 18, 42);
        Animal a4 = new Animal("Golu", 4, 43);
        Animal a5 = new Animal("Amit", 18, 23);

        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        dogs.add(a5);
        System.out.println(dogs);
        
        // To use Collections.sort(), you have to Animal class comparable----------------
        // Collections.sort(dogs);

        // But in order to use dogs.sort() directly, you need to pass custom comparator-----------------
        dogs.sort(new MyCustomComparator());

        System.out.println(dogs);
    }
}
