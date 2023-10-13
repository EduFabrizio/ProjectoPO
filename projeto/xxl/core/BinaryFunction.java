package xxl.core;

import xxl.core.exception.DivideByZeroException;

public abstract class BinaryFunction extends Function
{
	protected Content _arg1;
	protected Content _arg2;

	public BinaryFunction(Content arg1, Content arg2, String name)
	{
		super(name);
		_arg1 = arg1;
		_arg2 = arg2;
		
	}

	public String toString()
	{
		return "=" + " " + _name + "(" + _arg1.toString() + "," + _arg2.toString() + ")";
	}

	public String showCont() throws DivideByZeroException
	{
		return value().toString() + toString();
	}
}