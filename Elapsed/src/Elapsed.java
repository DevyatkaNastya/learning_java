public class Elapsed {
    public static void main (String args[]) {
        long start, end;

        System.out.println("Time to run 0 - 100 000 000");

        start = System.currentTimeMillis();

        for(int i = 0; i < 100000000L; i++);
        end = System.currentTimeMillis();

        System.out.println("Total time = " + (end-start));

    }
}
