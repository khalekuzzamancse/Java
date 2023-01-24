public class ArrayOperation {

    public int[] operation(int[] arr, IOperation obj) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            res[i] = obj.doOperation(arr[i]);
        return res;
    }
}

interface IOperation{
    int doOperation(int n);
}

class MultiplyBy2 implements IOperation{

    @Override
    public int doOperation(int n) {
        return 2*n;
    }
}

class DivideBy2 implements IOperation{

    @Override
    public int doOperation(int n) {
        return n/2;
    }
}
class AddBy2 implements IOperation{

    @Override
    public int doOperation(int n) {
        return n+2;
    }
}

