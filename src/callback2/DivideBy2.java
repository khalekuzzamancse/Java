package callback2;


class DivideBy2 implements IOperation{
    @Override
    public int doOperation(int n) {
        return n/2;

    }
}
