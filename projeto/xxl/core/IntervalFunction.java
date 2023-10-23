package xxl.core;

import xxl.core.exception.DivideByZeroException;

public abstract class IntervalFunction extends Function
{

	protected Range _range;

	public IntervalFunction(Range range, String name)
	{
		super(name);
		_range = range;
	}

	public String toString() 
	{
		return "=" + _name + "(" + this.toFuncArg() + ")";
	}

	public String showCont() throws DivideByZeroException
	{
		return value().toString() + toString();
	}

	public String toFuncArg()
	{
		return _range.toString();
	}
}