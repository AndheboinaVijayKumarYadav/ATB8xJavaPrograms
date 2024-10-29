package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // once we give <Integer> then list will store only integer values
        // below is one way of initializing the list
        List<Integer> list2 = new ArrayList<>(){
            {
                add(3);
                add(4);
            }
        };
        // below is another way of initializing the list
        List<Integer> strlist = new ArrayList<Integer>();

        strlist.add(34);
        strlist.add(76);
        strlist.add(23);
        System.out.println(strlist.get(2));

        for (int i = 0; i < strlist.size(); i++) {
            System.out.println(strlist.get(i));
        }

        for(Integer str: strlist){
            System.out.println(str);
        }

        // in list we can all any way not restricted to particular data type
        System.out.println("This is second list");
        List anyList = new ArrayList<>();

        anyList.add("123");
        anyList.add(23);
        anyList.add(true);
        anyList.add(23);
        System.out.println(anyList.get(2));
        // to insert a specific position
        anyList.add(1,"I am first index now");
        // removes the index 1 object added in the list
        anyList.remove(2);

        anyList.set(2,"I am new value");

        System.out.println(anyList.get(2));
        System.out.println(anyList.contains("I am new value"));
        anyList.clear();
        // no values will be printed in below for loop
        for (int i = 0; i < anyList.size(); i++) {
            System.out.println(anyList.get(i));
        }



    }
}
