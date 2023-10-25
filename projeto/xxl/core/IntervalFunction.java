package xxl.core;

import xxl.core.exception.DivideByZeroException;

public abstract class IntervalFunction extends Function implements Subscriber
{

	protected boolean _changed;
	protected Range _range;

	public IntervalFunction(Range range, String name)
	{
		super(name);
		_changed = false;
		_range = range;
	}

	public void update(Literal value)
	{
		_changed = true;
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