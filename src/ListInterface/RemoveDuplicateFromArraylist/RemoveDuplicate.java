package ListInterface.RemoveDuplicateFromArraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

    public static List<Integer> removeDuplicates(List<Integer> list){
            List<Integer> newList = new ArrayList<>();
            // we are looping through the list which contains duplicate
            for(Integer element: list){

                // logic is we check whether the element is present in the new list if no we add it
                if(!newList.contains(element)){
                    newList.add(element);
                }
            }

            return newList;
    }
    public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(1);
            list.add(2);
            list.add(2);
            list.add(2);
            list.add(3);
            list.add(3);
            list.add(3);
            list.add(4);

            List<Integer> noDuplicateList = removeDuplicates(list);

        System.out.println("New list after removing duplicates is ");
        for(Integer element: noDuplicateList){
            System.out.println(element);
        }
    }
}
