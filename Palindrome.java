public class Palindrome {

    public static boolean isPalindrome(String str) {
        // Remove all non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Initialize two pointers
        int left = 0;
        int right = str.length() - 1;

        // Check if the string is a palindrome
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {"wow", "Racecar", "hello", "madam", "A man, a plan, a canal, Panama"};

        for (String string : testStrings) {
            if (isPalindrome(string)) {
                System.out.println('"' + string + "\" is a palindrome");
            } else {
                System.out.println('"' + string + "\" is not a palindrome");
            }
        }
    }
}

