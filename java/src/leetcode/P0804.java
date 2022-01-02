package leetcode;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class P0804 {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }


    public static int uniqueMorseRepresentations(String[] words) {
        Character a = 'a';
        Set<String> result = new HashSet<>();

        HashMap<Character, String> morseMap = new HashMap<>();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String s : morse) {
            morseMap.put(a, s);
            a++;
        }


        for (String s : words) {
            StringBuilder morseResult = new StringBuilder();
            for (char c : s.toCharArray()) {
                morseResult.append(morseMap.get(c));
            }
            result.add(morseResult.toString());
        }
        return result.size();
    }
}
