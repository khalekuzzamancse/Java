package introducingcallback0;
public class ArrayOperation {
    public int[] operation(int[] arr, Operation1 obj) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            res[i] = obj.multBy2(arr[i]);
        return res;
    }
}
/*
This is not a better good approach
because we can pass only the Operation1 class object.
so it is tightly coupled
use  the concept of inheritance
 */