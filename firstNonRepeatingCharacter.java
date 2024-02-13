// Name: Monisha Jain
// Qualificaton: MCA
// College: PES(Bengaluru)

// Given a string, identify the position of the first character that appears only once in the string. If no such character exists, return -1.

// Examples

// Example 1:

// Input: "apple"
// Expected Output: 0
// Justification: The first character 'a' appears only once in the string and is the first character.
// Example 2:

// Input: "abcab"
// Expected Output: 2
// Justification: The first character that appears only once is 'c' and its position is 2.
// Example 3:

// Input: "abab"
// Expected Output: -1
// Justification: There is no character in the string that appears only once.

import java.util.HashMap;

public class firstNonRepeatingCharacter {
    public int firstUniqChar(String s) {
        // Create a hashmap to store the frequency of each character
        HashMap<Character, Integer> freq = new HashMap<>();
        
        // Traverse the string to populate the hashmap with character frequencies
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        // Traverse the string again to find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        // If no unique character is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        firstNonRepeatingCharacter sol = new firstNonRepeatingCharacter();
        System.out.println(sol.firstUniqChar("apple"));  // Expected: 0
        System.out.println(sol.firstUniqChar("abcab"));  // Expected: 2
        System.out.println(sol.firstUniqChar("abab"));   // Expected: -1
    }
}
