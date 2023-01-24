package callback2;


class AddBy2 implements IOperation {
    @Override
    public int doOperation(int n) {
        return n+2;
    }
}
