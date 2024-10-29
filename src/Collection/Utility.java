package Collection;

import java.util.Collection;

public class Utility {
    public static <E> void print(Collection<E> coll){
        System.out.print("Collection is: ");
        for (E e : coll) {
            System.out.printf("%s ",e);
        }
        System.out.println();
    }
}
