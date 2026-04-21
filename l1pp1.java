import java.util.Scanner;

public class l1pp1 {

    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manual = createSubstring(text, start, end);
        String builtin = text.substring(start, end);

        System.out.println("Manual Substring: " + manual);
        System.out.println("Built-in Substring: " + builtin);
        System.out.println("Are they equal? " + compareStrings(manual, builtin));
    }
}