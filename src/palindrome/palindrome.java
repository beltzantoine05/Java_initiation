package palindrome;

public class palindrome {
    public static void main(String[] args) {
        char[][] words = {
                {'a', 'n', 'i', 'm', 'a', 'l'},
                {'r', 'a', 'd', 'a', 'r'},
                {'r', 'e', 's', 'u', 'm', 'a'},
                {'r', 'e', 's', 's', 'a', 's', 's', 'e', 'r'},
                {'r', 'e', 'l', 'a', 'c', 'e', 'r'},
                {'k', 'a', 'y', 'a', 'k'},
                {'v', 'i', 'v', 'e', ' ', 'J', 'a', 'v', 'a', ' ', '!'}
        };

        printWord(words);
        System.out.println(isPalindrome(words[0])); // false
        System.out.println(isPalindrome(words[1])); // true
        System.out.println(isPalindrome(words[2])); // false
    }

    public static void printWord(char[][] word) {
        for (char[] mot : word) {
            for (char lettre : mot) {
                System.out.print(lettre);
            }
            System.out.print(" "); // Espace entre les mots
        }
        System.out.println(); // Retour à la ligne
    }

    public static boolean isPalindrome(char[] word) {
        int left = 0;
        int right = word.length - 1;

        while (left < right) {
            if (word[left] != word[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

