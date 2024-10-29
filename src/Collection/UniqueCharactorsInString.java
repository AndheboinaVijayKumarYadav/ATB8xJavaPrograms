package Collection;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharactorsInString {
    public static void main(String[] args) {
        String str = "vijaykumaryadavbb";
        int uniqueChars = uniqueCharactors(str);
        System.out.println(uniqueChars);
    }

    public static int uniqueCharactors(String str){
        Set<Character> set = new HashSet();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        return set.size();
    }
}
