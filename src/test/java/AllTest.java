import arrays_2.CyclicRotation;
import arrays_2.OddOccurrencesInArray;
import iterations_1.BinaryGap;
import org.junit.Test;
import timeComplexity_3.FrogJmp;
import timeComplexity_3.PermMissingElem;

import static org.junit.Assert.assertEquals;

public class AllTest {

    BinaryGap s = new BinaryGap();
    CyclicRotation cyclicRotation = new CyclicRotation();
    OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
    FrogJmp frogJmp = new FrogJmp();
    PermMissingElem permMissingElem = new PermMissingElem();

    @Test
    public void shouldFindBinaryGap() {
        assertEquals(2, s.solution(9));
        assertEquals(4, s.solution(529));
        assertEquals(1, s.solution(20));
        assertEquals(0, s.solution(15));
        assertEquals(0, s.solution(32));
        assertEquals(5, s.solution(1041));
    }

    @Test
    public void extTests() {
        assertEquals(3, s.solution(561892));
        assertEquals(4, s.solution(74901729));
        assertEquals(5, s.solution(1376796946));
    }

    @Test
    public void shouldCyclycRotationWork() {
        int[] x =new int[]{2, 3,4};
        cyclicRotation.solution(x, 2);
    }

    @Test
    public void shouldOccuranceInArrayWork() {
        int[] x =new int[]{2, 6,4,2,6};
        oddOccurrencesInArray.solution(x);
    }

    @Test
    public void shouldFrogJmpWork() {
        frogJmp.solution(10,85,30);
    }

    @Test
    public void shouldPermMissingElemWork() {
        int[] x =new int[]{1,2,4};
        permMissingElem.solution2(x);
    }

}