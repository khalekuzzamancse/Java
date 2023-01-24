package callback2;
public class Output {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("Original Array: ");
        printArray(arr);
        int[] res;
        //
        ArrayOperation test = new ArrayOperation();
        //
        System.out.print("Multiply by 2: ");
        res = test.operation(arr, new MultiplyBy2());
        printArray(res);
        //
        System.out.print("Divide by 2: ");
        res = test.operation(arr, new DivideBy2());
        printArray(res);
        //
        System.out.print("Added 2: ");
        res = test.operation(arr, new AddBy2());
        printArray(res);

    }
    private static void printArray ( int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
}
