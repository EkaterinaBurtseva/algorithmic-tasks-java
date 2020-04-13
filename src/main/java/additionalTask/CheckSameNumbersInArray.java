package additionalTask;

public class CheckSameNumbersInArray {
    void findDuplicates(int arr[]){
        int i;
        for (i = 0; i < arr.length; i++)
        {
            if (arr[ Math.abs(arr[i])] >= 0)
                arr[ Math.abs(arr[i])] = -arr[ Math.abs(arr[i])];
            else
                System.out.print(Math.abs(arr[i]) + " ");
        }
    }


    //for (int i = 0; i < numRay.length; i++) {
    //            numRay[numRay[i] %  numRay.length] = numRay[numRay[i] %  numRay.length] + numRay.length;
    //        }
    //        System.out.println("The repeating elements are : ");
    //        for (int i = 0; i < numRay.length; i++) {
    //            if (numRay[i] >= numRay.length*2) {
    //                System.out.println(i + " ");
    //            }
    //        }
    //    }

}
