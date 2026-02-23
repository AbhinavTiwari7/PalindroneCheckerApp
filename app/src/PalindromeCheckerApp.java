public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("UseCase 2 - Hardcoded Palindrome Check");

        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome ✅");
        } else {
            System.out.println("Not Palindrome ❌");
        }
    }
}