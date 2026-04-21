import java.util.Scanner;

public class l1pp3{

    public static char[] getChars(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.next();

        char[] manual = getChars(input);
        char[] builtin = input.toCharArray();

        boolean result = compareArrays(manual, builtin);

        System.out.println("Arrays are equal? " + result);
    }
}