package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list  = Arrays.asList("Bear","Lion","Ant","Cat");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);
        // to find the frequency of any object in collection
        int frequency = Collections.frequency(list,"Bear");
        System.out.println(frequency);
    }

    public static void sortInDescending(List<String> list){
//         Collections.sort(list,Collections.reverseOrder());
//         Collections.sort(list);
//         System.out.println(list);
//         Collections.reverse(list);
           Collections.sort(list, new Comparator<String>() {
               @Override
               public int compare(String o1, String o2) {
                   if(o1.equals(o2)){
                       return 0;
                   }
                   else if(o1.charAt(0) < o2.charAt(0)){
                       return -1;
                   }
                   else{
                       return 1;
                   }
               }
           });
    }
}
