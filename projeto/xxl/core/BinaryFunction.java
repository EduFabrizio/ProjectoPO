package xxl.core;

import xxl.core.Function;

public abstract class BinaryFunction extends Function
{
	private Content _arg1;
	private Content _arg2;

	public BinaryFunction(Content arg1, Content arg2)
	{
		_arg1 = arg1;
		_arg2 = arg2;
	}

	public String toString() {}
}