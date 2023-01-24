package withoutcallback;
public class ArrayOperation {
    public int[] arrayMultiBy2(int []arr) {
        int []res = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            res[i] = 2 * arr[i];
        return res;
    }
    public int[] arrayDivideBy2(int []arr) {
        int []res = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            res[i] =  arr[i]/2;
        return res;
    }
    public int[] arrayAddBy2(int []arr) {
        int []res = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            res[i] = 2 +arr[i];
        return res;
    }
}
