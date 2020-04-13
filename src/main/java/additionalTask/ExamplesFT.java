package additionalTask;

import java.util.ArrayList;
import java.util.List;

public class ExamplesFT {
    public static String findNumber(List<Integer> arr, int k) {

        for (Integer number : arr) {
            if (number == k) {
                return "YES";
            }
        }

        return "NO";
    }

    public static List<Integer> oddNumbers(int l, int r) {

        List<Integer> result = new ArrayList<>();
        int start = l;

        if (l % 2 == 0) {
            ++start;
        }

        for (int i = start; i <= r; i += 2) {
            result.add(i);
        }

        return result;
    }
}

