import java.util.HashMap;
import java.util.Map;

public class StrobogrammaticNumber {
    public static boolean isStrobogrammaticNumber(Map<Character, Character> map, String s) {
        int i = 0, j = s.length() - 1;

        while (i <= j) {
            char l = s.charAt(i);
            char r = s.charAt(j);

            if (map.containsKey(l)) {
                if (map.get(l) != r) {
                    return false;
                } else {
                    i++;
                    j--;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "198861";
        String s2 = "198891";
        String s3 = "19261";

        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');

        System.out.println(isStrobogrammaticNumber(map, s));
        System.out.println(isStrobogrammaticNumber(map, s2));
        System.out.println(isStrobogrammaticNumber(map, s3));
    }
}
