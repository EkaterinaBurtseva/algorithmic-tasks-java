package countringElements_4;
/*
Check whether array A is a permutation.
 */

import java.util.Arrays;

public class PermCheck {
    public static void main(String[] args) {
        int[] x = {1};
        solution(x);
    }

    public static int solution(int[] A) {
        Arrays.sort(A);

        if (A[0] != 1) {
            return 0;
        }
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] + 1 != A[i + 1]) {
                return 0;
            }
        }
        return 1;
    }

}
