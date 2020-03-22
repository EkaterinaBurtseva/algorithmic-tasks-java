package countringElements_4;

import java.util.HashSet;

/*Find the earliest time when a frog can jump to the other side of a river.

 */
public class FrogRiverOne {
    public int solution(int X, int[] A){
        HashSet<Integer> unique= new HashSet<>();
        for (int i = 1; i<= X; i++){
            unique.add(i);
        }
        for(int j = 0; j< A.length; j++){
            if(unique.contains(A[j])){
                unique.remove(A[j]);
                if(unique.isEmpty()){
                    return j;
                }
            }
        }
        return -1;
    }
}
