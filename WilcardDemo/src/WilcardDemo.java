public class WilcardDemo {
    public static void main(String args[]) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double iv = iob.average();
        System.out.println("Integer array = " + iv);

        Double dnums[] = {1.0, 2.0, 3.0, 4.0, 5.0};
        Stats<Double> dob = new Stats<Double>(dnums);
        double dv = dob.average();
        System.out.println("Double dv = " + dv);

        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<Float>(fnums);
        double fv = fob.average();
        System.out.println("Float fv = " + fv);

        System.out.print("iob && dob");
        if(iob.sameAvg(dob))
            System.out.println(" ==");
        else
            System.out.println(" =!");

        System.out.print("iob && fob");
        if(iob.sameAvg(fob))
            System.out.println(" ==");
        else
            System.out.println(" =!");
    }
}
