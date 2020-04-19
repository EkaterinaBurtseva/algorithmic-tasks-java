package countringElements_4;
/*
Calculate the values of counters after applying all alternating operations:
increase counter by 1; set value of all counters to current maximum
 */

public class MaxCounters {
    public static void main(String[] args) {
        int [] x = {2,4,5};
        solution(4,x);
    }

    public static int[] solution(int N, int[] A) {
        int maxOfCounter = 0;
        int lastUpdate = 0;
        int applyMax = N + 1;
        int result[] = new int[N];
        for (int i = 0; i < A.length; ++i) {
            if (A[i] == applyMax) {
                lastUpdate = maxOfCounter;
            } else if (A[i] <= N) {
                int position = A[i] - 1;
                result[position] = result[position] > lastUpdate ?
                        result[position] + 1 : lastUpdate + 1;
                //update max for future use{
                if (maxOfCounter <= result[position]) {
                    maxOfCounter = result[position];
                }
            }
        }

        for(int i=0;i<N;++i){
            if(result[i]<lastUpdate){
                result[i]=lastUpdate;
            }
        }
        return result;
    }
}
