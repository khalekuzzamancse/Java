package callback3annomousinnerclass;


public class OutputUsingLambda {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] res;
        System.out.print("Original Array: ");
        printArray(arr);
        //
        ArrayOperation test = new ArrayOperation();
        //
       IOperation obj= n -> {
            return 2*n;
        };
        //
        res = test.operation(arr,obj);
        System.out.print("Multiply by 2: ");
        printArray(res);

        obj= n -> {
            return n/2;
        };
        //
        System.out.print("Divide by 2: ");
        res = test.operation(arr, obj);
        printArray(res);
        //
        //
        obj= n -> {
            return n+2;
        };
        System.out.print("Added 2: ");
        res = test.operation(arr,obj);
        printArray(res);
    }

    private static void printArray ( int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
