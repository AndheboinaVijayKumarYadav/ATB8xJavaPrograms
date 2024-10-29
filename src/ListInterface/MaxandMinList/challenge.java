package ListInterface.MaxandMinList;

import java.util.ArrayList;
import java.util.List;

public class challenge {

    // method to find max value in the list
    public static int findMax(List<Integer> list){

        if(list == null || list.size() == 0){
            return Integer.MAX_VALUE;
        }

        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) > max){
                max = list.get(i);
            }
        }

        return max;
    }

    // method to find min value in the list
    public static int findMin(List<Integer> list){

        if(list == null || list.size() == 0){
            return Integer.MIN_VALUE;
        }

        int min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) < min){
                min = list.get(i);
            }
        }

        return min;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(0);
        list.add(67);
        list.add(8);
        list.add(1);

        int maxValueInList = findMax(list);
        System.out.printf("Max value in the list is %d",maxValueInList);

        int minValueInList = findMin(list);
        System.out.printf("\nMax value in the list is %d",minValueInList);
    }
}
