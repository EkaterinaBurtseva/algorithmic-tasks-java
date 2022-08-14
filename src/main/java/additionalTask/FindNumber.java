package additionalTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Determine the minimum number of moves required to sort an array such that all of the even elements
 * are at the beginning of the array and all of the odd elements are at the end of the array.
 *
 * Input parameter: int arr[n] - an array of positive integers
 * Returns: int - the minimum number of moves it takes to sort an array of integers with all even elements
 *          at earlier indices that any odd element.
 * Note: the order of the elements within even or odd does not matter.
 * Constraints:
 *   - 2 <= n <= 10^5
 *   - 1 <= arr[i] <= 10^9, where 0 <= i < n.
 *   - it is guaranteed that array a contains at least one even and one odd element.
 */

public class FindNumber {

    public static void main(String[] args) {
       List <Integer> param = new ArrayList<>();
       param.add(12);
       param.add(10);
        moves(param);

    }

    public static int moves(List<Integer> arr) {
        int movesQuantity = 0;
        int startPoint = 0;
        int endPoint = arr.size() - 1;

        while (startPoint < endPoint) {
            if (isEven (arr.get(startPoint))) {
                ++ startPoint;
                continue;
            }

            if(!isEven (arr.get(endPoint))) {
                -- endPoint;
                continue;
            }

            Collections.swap(arr, startPoint, endPoint);

            ++ startPoint;
            -- endPoint;
            ++ movesQuantity;
        }

        return movesQuantity;

    }

     static boolean isEven(int value) {
        return value % 2 == 0;
    }


}
