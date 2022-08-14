package additionalTask;
/*
 * complete the function computeParameterValue. The function must return an array of strings that
 * denotes the final parameter list values in the order their keys were first encountered.
 *
 * computeParameterValue has the following parameter(s):
 *   sources: a 2-dimensional array of key:value pairs, each row is one source's data,
 *     sources presented from lowest to highest preference.
 *
 * constraints
 *   1 <= n < 100
 *   1 <= p < 1000
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputeParameterValue {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 7, 9};
        findHappyTicket(arr);
    }

    public static void findHappyTicket(int[] arr) {
        //implement method
    }



//    public void computeParameterValue(String[][] array) {
//        String[] finalArray = new String[0];
//        Object[] cal = Arrays.stream(array)
//                .flatMap(Arrays::stream)
//                .toArray();

//        Arrays.stream(cal).forEach(param ->
//                c);


//        def computeParameterValue (sources):
//        mapping = {}
//        for idx, source in enumerate (sources):
//        for kv in source:
//        k, v = kv.split(":")
//        mapping[k] = v
//
//        results = []
//        for key in mapping:
//        results.append(mapping[key])
//        return results


}
