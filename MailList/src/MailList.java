import java.util.LinkedList;

public class MailList {
    public static void main(String args[]){
        LinkedList<Adress> ml = new LinkedList<>();

        ml.add(new Adress("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        ml.add(new Adress("Raph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        ml.add(new Adress("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));

        for(Adress element : ml){
            System.out.println(element + "\n");
        }
        System.out.println();
    }
}
