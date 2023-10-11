package xxl.core;

import org.w3c.dom.ranges.Range;

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
}