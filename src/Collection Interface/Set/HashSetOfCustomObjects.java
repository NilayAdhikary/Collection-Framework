import java.util.HashSet;
import java.util.Set;

class Student {
    String name;
    int roll;
    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + roll;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (roll != other.roll)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", roll=" + roll + "]";
    }
    
}

public class HashSetOfCustomObjects {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        Student s1 = new Student("Nilay", 10);
        Student s2 = new Student("Nilay", 20);
        System.out.println(s1.equals(s2));


        set.add(new Student("Nilay", 37));
        set.add(new Student("Rashid", 27));
        set.add(new Student("Tanmay", 37));

        System.out.println(set);
    }
}
