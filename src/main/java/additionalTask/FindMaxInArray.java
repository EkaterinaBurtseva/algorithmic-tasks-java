package additionalTask;

public class FindMaxInArray {
    int findMaxValueInArray(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }
}

// static int largest(int []arr,
//                       int n)
//    {
//        Arrays.sort(arr);
//        return arr[n - 1];
//    }