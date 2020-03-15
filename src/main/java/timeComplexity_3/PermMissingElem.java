package timeComplexity_3;/*
Find the missing element in a given permutation.
 */

import java.util.Arrays;

public class PermMissingElem {
    public int solution(int[] A) {
        if (A.length == 0) return 1;

        long n = A.length + 1;
        long sumOfAllElements = (n * (1 + n)) / 2;
        long missingElement = sumOfAllElements - Arrays.stream(A).sum();
        return (int) missingElement;
    }

    public int solution2(int [] A){
        int sumArrAct = 0;
        for(int i=0; i < A.length; i++){
            sumArrAct += A[i];
        }
        int sumExp = 0;
        // n * (n + 1) // 2
        for(int i=1; i <= A.length+1; i++){
            sumExp = sumExp + i;
        }
        if(sumArrAct == sumExp) { return A.length;}
        return  sumExp - sumArrAct;
    }
}

