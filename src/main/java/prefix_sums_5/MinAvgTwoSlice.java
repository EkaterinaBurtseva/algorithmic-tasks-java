package prefix_sums_5;

public class MinAvgTwoSlice {
    public static void main(String[] args) {
        int x[] = {2, 3, 5, 4};
        solution(x);
    }

    public static int solution(int[] A) {
        int[] sum = new int[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            sum[i + 1] = sum[i] + A[i];
        }
        float minAvg = Float.MAX_VALUE;
        int minSliceIndex = 0;

        for (int i = 0; i < A.length - 1; i++)
        {
            float avg2 = (sum[i + 2] - sum[i]) / 2.0f;

            if (avg2 < minAvg)
            {
                minAvg = avg2;
                minSliceIndex = i;
            }

            if (i < A.length - 2)
            {
                float avg3 = (sum[i + 3] - sum[i]) / 3.0f;

                if (avg3 < minAvg)
                {
                    minAvg = avg3;
                    minSliceIndex = i;
                }
            }
        }
        return minSliceIndex;

    }
}
