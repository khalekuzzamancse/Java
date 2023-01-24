package callback3annomousinnerclass;


public class OutputUsingInlineFunction {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] res;
        System.out.print("Original Array: ");
        printArray(arr);
        //
        ArrayOperation test = new ArrayOperation();

        res = test.operation(arr, new IOperation() {
            @Override
            public int doOperation(int n) {
                return 2*n;
            }
        });
        System.out.print("Multiply by 2: ");
        printArray(res);
        res = test.operation(arr, new IOperation() {
            @Override
            public int doOperation(int n) {
                return n/2;
            }
        });
        System.out.print("Divide by 2: ");;
        printArray(res);
        res = test.operation(arr, new IOperation() {
            @Override
            public int doOperation(int n) {
                return n+2;
            }
        });
        System.out.print("Added 2: ");
        printArray(res);
    }

    private static void printArray ( int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
