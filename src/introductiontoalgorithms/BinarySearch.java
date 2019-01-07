package introductiontoalgorithms;

import java.util.OptionalInt;


/**
 * 1.1 Suppose you have a sorted list of 128 names, and you’re searching through it using binary search.
 * What’s the maximum number of steps it would take?
 * Answer: log 128 = 7
 *
 * 1.2 Suppose you double the size of the list. What’s the maximum number of steps now?
 * Answer: log 256 = 8
 *
 * 1.3 You have a name, and you want to find the person’s phone number in the phone book.
 * Answer:  O(amount of contacts)
 *
 * 1.4 You have a phone number, and you want to find the person’s name in the phone book.
 * (Hint: You’ll have to search through the whole book!)
 *  Answer:  O(amount of numbers)
 *
 * 1.5 You want to read the numbers of every person in the phone book.
 *  Answer:  O(amount of contacts( 1 + its numbers))
 *
 * 1.6 You want to read the numbers of just the As.
 * (This is a tricky one! It involves concepts that are covered more in chapter 4. Read the answer—you may be surprised!)
 *  Answer:  O(amount of As * numbers of As)
 *
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arrayOfInts = new int[] {1,3,5,7,9};
        System.out.println(binarySearch(arrayOfInts, 3).toString());
        System.out.println(binarySearch(arrayOfInts, -1).toString());
    }

    private static OptionalInt binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item){
                return OptionalInt.of(mid);
            } else if (guess < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return OptionalInt.empty();
    }
}
