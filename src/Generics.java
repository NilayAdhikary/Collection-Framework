class User<E,T> {
    E name;
    T age;
    
    public User(E name, T age) {
        this.name = name;
        this.age = age;
    }
    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
    
}

public class Generics{
    public static void main(String[] args) {
        User<Integer, String> obj = new User<>(24, "Nilay");
        System.out.println(obj.getName());
        User<String, Integer> obj2 = new User<>("Rahul", 28);
        // System.out.println(obj2.getName());
        obj2.setName("Sayan");
        System.out.println(obj2.getName());
    }
}