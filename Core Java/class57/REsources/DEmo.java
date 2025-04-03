import java.util.*;

public class DEmo {
    public static void main(String[] args) {
        TreeSet st = new TreeSet();
        st.add("D");
        st.add("F");
        st.add("C");
        st.add("B");
        st.add("A");
        st.add("E");
        System.out.println(st);
        System.out.println(st.first());
        System.out.println(st.last());
        System.out.println(st.headSet("D"));
        System.out.println(st.tailSet("D"));
        System.out.println(st.subSet("B", "E"));
    }
}
