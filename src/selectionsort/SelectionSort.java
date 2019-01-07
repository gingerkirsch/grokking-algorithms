package selectionsort;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(array);
        System.out.println(selectionSort(array));
    }

    private static ArrayList<Integer> selectionSort(ArrayList<Integer> array) {
        ArrayList<Integer> sortedArray = new ArrayList<>();
        int smallest;
        while (!array.isEmpty()){
            smallest = findSmallest(array);
            sortedArray.add(array.get(smallest));
            array.remove(smallest);
        }
        return sortedArray;
    }

    private static int findSmallest(ArrayList<Integer> array){
        int smallestIndex = 0;
        for (int i = 0; i < array.size(); i++){
            if (array.get(smallestIndex) > array.get(i)) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
