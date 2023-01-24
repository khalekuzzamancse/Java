package introducingcallback0;

public class Output {
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50};
            int[] res;
            ArrayOperation test = new ArrayOperation();
            res = test.operation(arr, new Operation1());
            printArray(res);
        }

    private static void printArray(int []arr)
    {
        for (int i = 0; i <arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}