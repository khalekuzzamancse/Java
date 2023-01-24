package callback2;
class MultiplyBy2 implements IOperation {
    @Override
    public int doOperation(int n) {
        return 2*n;

    }
}
