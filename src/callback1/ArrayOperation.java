package callback1;
public class ArrayOperation {
    public int[] operation(int[] arr, Operation obj) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            res[i] = obj.doOperation(arr[i]);
        return res;
    }
}
