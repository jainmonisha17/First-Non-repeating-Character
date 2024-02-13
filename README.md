// Name: Monisha Jain
// Qualification: MCA
// College: PES(Bengaluru)

# First-Non-repeating-Character
Given a string, identify the position of the first character that appears only once in the string. If no such character exists, return -1.
Example 1:

Input: "abab"
Expected Output: -1
Justification: There is no character in the string that appears only once.
Solution
To solve this problem, we'll use a hashmap to keep a record of each character in the string and the number of times it appears. First, iterate through the string and populate the hashmap with each character as the key and its frequency as the value. Then, go through the string again, this time checking each character against the hashmap. The first character that has a frequency of one (indicating it doesn't repeat) is your target. This character is the first non-repeating character in the string. If no such character exists, the solution should indicate that as well. This two-pass approach ensures efficiency, as each character is checked against a pre-compiled frequency map.

Initialization: Begin by creating a hashmap to store the frequency of each character in the string. This hashmap will help in identifying characters that appear only once.

Frequency Count: Traverse the string from the beginning to the end. For each character, increment its count in the hashmap.

First Unique Character: Traverse the string again from the beginning. For each character, check its frequency in the hashmap. If the frequency is 1, return its position as it's the first unique character.

No Unique Character: If the string is traversed completely without finding a unique character, return -1.

Using a hashmap ensures that we can quickly determine the frequency of each character without repeatedly scanning the string.

Algorithm Walkthrough:

Given the input string "abcab":

Initialize a hashmap to store character frequencies.
Traverse the string:
'a' -> frequency is 1
'b' -> frequency is 1
'c' -> frequency is 1
'a' -> frequency is 2
'b' -> frequency is 2
Traverse the string again:
'a' has frequency 2
'b' has frequency 2
'c' has frequency 1, so return its position 2.




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
