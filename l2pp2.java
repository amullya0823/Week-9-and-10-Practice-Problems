import java.util.Scanner;

public class l2pp2 {

    // Method to find length without length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    // Count words
    public static int countWords(String str) {
        int length = findLength(str);
        int count = 1;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    // Split using charAt()
    public static String[] splitText(String str) {
        int length = findLength(str);
        int wordCount = countWords(str);

        int[] spaceIndexes = new int[wordCount + 1];
        spaceIndexes[0] = -1;

        int k = 1;

        // Store space indexes
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[k++] = i;
            }
        }
        spaceIndexes[k] = length;

        // Extract words
        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word += str.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    // Compare arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] manual = splitText(text);
        String[] builtin = text.split(" ");

        boolean result = compareArrays(manual, builtin);

        System.out.println("Are both splits equal? " + result);
    }
}