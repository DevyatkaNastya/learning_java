public class GenInterfDemo {
    public static void main (String args[]) {
        Integer inums[] = {2, 3, 5, 1, 9};
        Character chs[] = {'s', 'w', 'x', 'a'};

        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<Character>(chs);

        System.out.println("max inums = " + iob.max());
        System.out.println("min inums = " + iob.min());
        System.out.println();

        System.out.println("max chs = " + cob.max());
        System.out.println("min chs = " + cob.min());
    }
}
