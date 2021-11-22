import java.util.ArrayList;
import java.util.Collections;

public class SortOdd {
    public static int[] sortArray(int[] array) {
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        for (int i : array) {
            if (array[i] % 2 == 0) evens.add(i);
            if (array[i] % 2 != 0) odds.add(i);
        }
        Collections.sort(odds);
        int evenCount = 0; int oddCount = 0;
        for (int i : array) {
            if (array[i] % 2 == 0) { array[i] = evens.get(evenCount); evenCount++; }
            if (array[i] % 2 != 0) { array[i] = odds.get(oddCount); oddCount++; }
        }
        return array;
    }
}
