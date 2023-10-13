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
		return "=" + _name + "(" + _range.toString() + ")";
	}

	public String showCont() throws DivideByZeroException
	{
		return value().toString() + toString();
	}
}