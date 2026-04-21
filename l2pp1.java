import java.util.Scanner;

public class l2pp1 {

    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Exception means end of string reached
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.next();

        int manualLength = findLength(input);
        int builtInLength = input.length();

        System.out.println("Manual Length: " + manualLength);
        System.out.println("Built-in Length: " + builtInLength);
    }
}