import java.util.*;

public class ArrayListDemo {
    public static void main (String args[]){
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Size array list = " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");

        System.out.println("Size array list after add = " + al.size());
        System.out.println("Array list: \n" + al);


        al.remove("F");
        al.remove(2);

        System.out.println("Size array after remove = " + al.size());
        System.out.println("Array list: \n" + al);
    }
}
