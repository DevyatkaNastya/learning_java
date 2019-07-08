import java.io.*;
public class ParseDemo {
    public static void main (String args[])
        throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;
            int i;
            int sum = 0;
            System.out.println("Enter number or 0 for exit");

            do {
                str = br.readLine();
                try{
                    i = Integer.parseInt(str);
                } catch (NumberFormatException e) {
                    System.out.println("Format Exception");
                    i = 0;
                }
                sum+=i;
                System.out.println("Current sum = " + sum);
            } while(i!= 0);

            System.out.println(sum + " binary = " + Integer.toBinaryString(sum));
            System.out.println(sum + " octal = " + Integer.toOctalString(sum));
            System.out.println(sum + " hex = " + Integer.toHexString(sum));
        }
    }

