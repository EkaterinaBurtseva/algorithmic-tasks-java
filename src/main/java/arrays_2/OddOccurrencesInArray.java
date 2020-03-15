package arrays_2;/*
A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element
of the array can be paired with another element that has the same value, except for one element that is left unpaired.
 */

import java.util.Arrays;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        int odd = -1;

        if (A.length == 0) {
            return 0;
        }
        if (A.length == 1) {
            return A[0];
        }
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (i == A.length - 1) {
                odd = A[i];
                break;
            }
            if (A[i] == A[i + 1]) {
                i++;
                continue;
            }

            odd = A[i];
        }

        return odd;
    }

    public int solution2(int[] A) {
        int result = 0;
        for (int i : A) {
            result ^= i;

        }
        return result;
    }

}
