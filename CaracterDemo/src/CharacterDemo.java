public class CharacterDemo {
    public static void main (String args[]) {
        char a[] = {'a', 'B', '5', '?', ' '};

        for(int i = 0; i < a.length; i++) {
            if(Character.isDigit(a[i]))
                System.out.println(a[i] + " is number");
            if(Character.isLetter(a[i]))
                System.out.println(a[i] + " is letter");
            if(Character.isWhitespace(a[i]))
                System.out.println(a[i] + " is space");
            if(Character.isUpperCase(a[i]))
                System.out.println(a[i] + " is upper letter");
            if(Character.isLowerCase(a[i]))
                System.out.println(a[i] + " is lower letter");
        }
    }
}
