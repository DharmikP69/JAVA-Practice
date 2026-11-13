//Approch :
//Step 1 : Inititalize HashMap<Character, Integer>
//Step 2 : Traverse string using for loop and stores the freq of every character with its index number
//Step 3 : Use another for loop to get the first unique character by map.get(s.charAt(i)) == 1 and retuern its index
//Step 4 : Else return -1

import java.util.HashMap;

public class J0139 {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        String[] inputs   = {"leetcode", "loveleetcode", "aabb", "z", "aadadaad"};
        int[]    expected = {0,          2,              -1,     0,   -1};

        for (int i = 0; i < inputs.length; i++) {
            int actual = firstUniqChar(inputs[i]);
            System.out.println("Test " + (i + 1) + ": " + inputs[i]
                    + " -> " + actual + (actual == expected[i] ? "  PASS" : "  FAIL (expected " + expected[i] + ")"));
        }
    }
}
//Output : 
// Test 1: leetcode -> 0  PASS
// Test 2: loveleetcode -> 2  PASS
// Test 3: aabb -> -1  PASS
// Test 4: z -> 0  PASS
// Test 5: aadadaad -> -1  PASS

//Time Complexity: O(n + n) ~ O(n) where n is s.length()
//Space complexity: O(n) where n is s.length()