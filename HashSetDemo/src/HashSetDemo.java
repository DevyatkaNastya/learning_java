import java.util.*;
public class HashSetDemo {
    public static void main(String args[]){
        HashSet<String> hs = new HashSet<String>();

        hs.add("B");
        hs.add("A");
        hs.add("F");
        hs.add("D");
        hs.add("E");
        hs.add("C");

        System.out.println(hs);
    }
}
