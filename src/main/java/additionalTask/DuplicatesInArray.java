package additionalTask;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, -3, -5};
        findFirstDuplicate(arr);
        findAllDuplicates(arr);

    }

    static int findFirstDuplicate(int[] a) {
        int result = 0;

        outerLoop:
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (Math.abs(a[i]) == Math.abs(a[j])) {
                    result = a[i];

                    break outerLoop;
                }
            }
        }

        return result;

    }

    static Set<Integer> findAllDuplicates(int[] a) {
        Set<Integer> result = new HashSet<Integer>();

        outerLoop:
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (Math.abs(a[i]) == Math.abs(a[j])) {
                    result.add(a[i]);

                }
            }
        }

        return result;

    }
}
