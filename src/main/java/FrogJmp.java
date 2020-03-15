/*
Count minimal number of jumps from position X to Y.
 */

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int count =0;
        if ((Y - X) % D > 0) {
            count = (Y - X) / D+1;
        }
        else{
            count=  (Y - X) / D;
        }
        return count;
    }

    public int solution2(int X, int Y, int D){
        int count = 0;
        while (X < Y) {
            X = X + D;
            count++;
        }
        return count;
    }
}
