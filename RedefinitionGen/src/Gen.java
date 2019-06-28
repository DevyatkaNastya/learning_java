public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        System.out.print("getob Gen ");
        return ob;
    }
}
