package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapInArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        swap(list,1,4);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        List<Integer> newList = list.reversed();
        System.out.println(newList);

    }

    public static void swap(List<Integer> list, int x, int y){
        int temp = list.get(x);
        list.set(x,list.get(y));
        list.set(y,temp);
    }
}
