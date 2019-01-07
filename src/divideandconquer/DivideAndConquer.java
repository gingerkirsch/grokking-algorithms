package divideandconquer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
* How long would each of these operations take in Big O notation?
 * 4.5 Printing the value of each element in an array.
 * Answer: O(n)
 *
 * 4.6 Doubling the value of each element in an array.
 * Answer: O(n)
 *
 * 4.7 Doubling the value of just the first element in an array.
 * Answer: O(1)
 *
 * 4.8 Creating a multiplication table with all the elements in the array.
 * So if your array is [2, 3, 7, 8, 10], you first multiply every element by 2,
 * then multiply every element by 3, then by 7, and so on.
 * Answer: O(n*n)
* */
public class DivideAndConquer {
    public static void main(String[] args) {
        System.out.println(sumOfArray(new ArrayList<>(Arrays.asList(1, 4, 3, 2))));
        System.out.println(biggestItem(new ArrayList<>(Arrays.asList(1, 4, 3, 2))));
        System.out.println(quickSort(new ArrayList<>(Arrays.asList(1, 4, 3, 2))));
    }

    private static int sumOfArray(ArrayList<Integer> array){
        if (array.size() == 0) {
            return 0;
        } else if (array.size() == 1) {
            return array.get(0);
        } else {
            int item = array.get(0);
            array.remove(0);
            return item + sumOfArray(array);
        }
    }

    private static int biggestItem(ArrayList<Integer> array){
        if (array.size() == 0) {
            return 0;
        } else if (array.size() == 1) {
            return array.get(0);
        } else {
            int item = array.get(0);
            array.remove(0);
            int subBigest = biggestItem(array);
            if (item > subBigest) {
                return item;
            } else {
                return subBigest;
            }
        }
    }

    private static List<Integer> quickSort(List<Integer> array) {
        if (array.size() < 2) {
            return array;
        } else {
            Random random = new Random();
            int pivotIndex = random.nextInt(array.size());
            int pivot = array.get(pivotIndex);
            array.remove(pivotIndex);
            return Stream.concat(Stream.concat(
                    quickSort(array.stream().filter(x -> x <= pivot).collect(Collectors.toList())).stream(),
                    Stream.of(pivot)),
                    quickSort(array.stream().filter(x -> x > pivot).collect(Collectors.toList())).stream())
                    .collect(Collectors.toList());
        }
    }

}
