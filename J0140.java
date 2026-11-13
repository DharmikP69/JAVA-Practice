//Approch:
//Step 1: make new String array that contains the each words from the String s using trim and split from J0137
//Step 2: Make new String builder result to store answer 
//Step 3: Loop i from words.length - 1 down to 0.
//          Append words[i] to result.
//          If i != 0, also append one space.
//Step 4: return .toString()

public class J0140 {

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[] inputs   = {"the sky is blue", "  hello world  ", "a good   example", "a", "  a  "};
        String[] expected = {"blue is sky the", "world hello",     "example good a",   "a", "a"};

        for (int i = 0; i < inputs.length; i++) {
            String actual = reverseWords(inputs[i]);
            System.out.println("Test " + (i + 1) + ": [" + inputs[i] + "] -> [" + actual + "]"
                    + (actual.equals(expected[i]) ? "  PASS" : "  FAIL (expected [" + expected[i] + "])"));
        }
    }
}
//Output :
// Test 1: [the sky is blue] -> [blue is sky the]  PASS
// Test 2: [  hello world  ] -> [world hello]  PASS
// Test 3: [a good   example] -> [example good a]  PASS
// Test 4: [a] -> [a]  PASS
// Test 5: [  a  ] -> [a]  PASS