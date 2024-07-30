import java.util.Stack;

public class StackIntro {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Nilay");
        st.push("giuehig");
        st.push("fhweiuf");
        st.push("wrnks");

        System.out.println(st);
        st.pop();
        System.out.println(st);
    }
}
