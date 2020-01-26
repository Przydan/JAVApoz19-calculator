package pl.sda.spring.operation;

import pl.sda.spring.exception.DivisionByZeroException;


class DivisionOperation implements Operation {
    private final String msgException;

    public DivisionOperation(String msgException) {
        this.msgException = msgException;
    }

    @Override
    public double calculate(double arg1, double arg2) {
        if (arg2 == 0) {
            throw new DivisionByZeroException(msgException);
        }
        return arg1 / arg2;
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.DIVISION;
    }
}
