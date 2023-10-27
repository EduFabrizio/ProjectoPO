package xxl.core;

import xxl.core.exception.DivideByZeroException;

public class NullContent extends Content{

    @Override
    public String toString() {
        return "";
    }

    @Override
    Literal value() throws DivideByZeroException {
        return null;
    }

    @Override
    public String showCont() throws DivideByZeroException {
        return "";
    }

    @Override
    public String toFuncArg() {
        return "";
    }

	public void addFuncCell(Function func)
	{}
}