public class OvverrideDemo {
    public static void main(String args[]) {
        Gen<Integer> iob = new Gen<>(88);

        Gen2<Integer> iob2 = new Gen2<>(99);

        Gen2<String> strOb = new Gen2<>("Ovverride text");

        System.out.println(iob.getob());
        System.out.println(iob2.getob());
        System.out.println(strOb.getob());
    }
}
