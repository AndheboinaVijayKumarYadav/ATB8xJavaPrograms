package Collection;

import java.util.ArrayList;
import java.util.List;

public class ReverseArraylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        reverseList(list);
        System.out.println(list);
    }
    public static void reverseList(List<Integer> list){
        // in place reverse
        for (int i = 0; i < list.size()/2 ; i++) {
            SwapInArrayList.swap(list,i,list.size()-1-i);
        }
    }

}
