package xxl.core;

import xxl.core.exception.DivideByZeroException;

public class NullContent extends Content{

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }

    @Override
    Literal value() throws DivideByZeroException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'value'");
    }

    @Override
    public String showCont() throws DivideByZeroException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showCont'");
    }

    @Override
    public String toFuncArg() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toFuncArg'");
    }

	public void addFuncCell(Function func)
	{}
}