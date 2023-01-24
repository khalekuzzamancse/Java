package callback3annomousinnerclass;

public class ArrayOperation {
    public int[] operation(int[] arr, IOperation obj) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            res[i] = obj.doOperation(arr[i]);
        return res;
    }
}
