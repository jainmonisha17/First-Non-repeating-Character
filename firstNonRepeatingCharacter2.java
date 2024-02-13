// Name: Monisha Jain
// Qualificaton: MCA
// College: PES(Bengaluru)

import java.util.*;

public class firstNonRepeatingCharacter2 {

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> myHashMap = new HashMap<>();
        // 1. Traverse the string, make it a string to char and add it to hashmap with
        // (key, value) pairs

        for (char c : s.toCharArray()) {
            myHashMap.put(c, myHashMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (myHashMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        firstNonRepeatingCharacter2 sol = new firstNonRepeatingCharacter2();
        System.out.println(sol.firstUniqChar("apple")); // Expected: 0
        System.out.println(sol.firstUniqChar("abcab")); // Expected: 2
        System.out.println(sol.firstUniqChar("abab")); // Expected: -1
    }
}

// Time Complexity
// Populating the hashmap with frequencies: We traverse the entire string once to populate the hashmap with the frequency of each character. This operation takes O(n) time, where n is the length of the string.

// Finding the first unique character: We traverse the string again to find the first character with a frequency of 1. This operation also takes O(n) time.

// Given that these two operations are sequential and not nested, the overall time complexity is O(n) + O(n), which simplifies to O(n).

// Space Complexity
// Hashmap for frequencies: In the worst case, every character in the string is unique. For a string with only lowercase English letters, the maximum number of unique characters is 26. However, if we consider all possible ASCII characters, the number is 128. If we consider extended ASCII, it's 256. In any case, this is a constant number. Therefore, the space complexity for the hashmap is O(1) because it doesn't grow proportionally with the size of the input string.

// Input string: The space taken by the input string is not counted towards the space complexity, as it's considered input space.

// Given the above, the overall space complexity of the algorithm is O(1).

// Conclusion

// The approach is efficient in terms of both time and space. The time complexity is linear, which means the algorithm's runtime grows linearly with the size of the input. The space complexity is constant, indicating that the amount of additional space (memory) the algorithm uses does not grow with the size of the input.
