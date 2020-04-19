package countringElements_4;
/*
Find the smallest positive integer that does not occur in a given sequence
 */

import java.util.Arrays;

public class MissingInteger {
    public static void main(String[] args) {
        int[] x = {1};
        solution(x);
        solution2(x);
    }

    public static int solution(int[] A) {
        int minValue = 1;
        if (A[0] > minValue || A[0] < 0 || A.length == 0 || A[0] != 1) {
            return minValue;
        }
        if (A[0] == 1 && A.length == 1) {
            minValue = minValue + 1;
        }
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] + 1 != A[i + 1] && A[i] != A[i + 1]) {
                minValue = A[i] + 1;
                break;
            } else {
                minValue = A[A.length - 1] + 1;
            }
        }
        return minValue;

    }

    public static int solution2(int[] A) {
        int result = 1;
        if (A.length == 0) {
            return result;
        }
        Arrays.sort(A);
        if (A[0] > 1 || A[A.length - 1] <= 0) {
            return result;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == result) {
                result++;
            }
        }
        return result;
    }
}
