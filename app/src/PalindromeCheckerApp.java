import java.util.*;

class PalindromeService {

    public boolean checkPalindrome(String input) {

        String normalized = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        LinkedList<Character> list = new LinkedList<>();
        for (char c : normalized.toCharArray()) {
            list.add(c);
        }

        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();

        PalindromeService service = new PalindromeService();
        boolean result = service.checkPalindrome(input);

        System.out.println("Is Palindrome? " + result);

        sc.close();
    }
}