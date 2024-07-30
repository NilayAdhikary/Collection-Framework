public class Animal implements Comparable<Animal>{
    String name;
    int age;
    int weight;
    
    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + ", weight=" + weight + "]\n";
    }

    @Override
    public int compareTo(Animal specifiedObj) {
        // public int compareTo(Object obj): It is used to compare the current object with the specified object. It returns -----
        // 1) positive integer, if the current object is greater than the specified object.
        // 2) negative integer, if the current object is less than the specified object.
        // 3) zero, if the current object is equal to the specified object.
        if(this.age == specifiedObj.age){
            // this compareTo() here compares two stirngs unlike the above compareTo() which compares two objects.
            return this.name.compareTo(specifiedObj.name);
        }
        return this.age - specifiedObj.age;
    }
    
}