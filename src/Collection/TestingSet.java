package Collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // add returns true if added successfully
        Boolean success = set.add(3);
        System.out.println(success);
    }
}
