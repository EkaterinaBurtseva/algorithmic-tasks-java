package prefix_sums_5;
/*
Compute number of integers divisible by k in range [a..b].
 */

public class CountDiv {
    public static void main(String[] args) {
        solution(0, 1, 11);
        solution2(0, 1, 11);
    }

    public static int solution(int A, int B, int K) {
        int result = 0;
        if (A >= B) {
            return result;
        }

        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                result++;
            }
        }
        return result;

    }


    public static int solution2(int A, int B, int K) {
        int result = B / K - A / K;
        if (A % K == 0) {
            result++;
        }
        return result;
    }
}
