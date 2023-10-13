package xxl.core;

import xxl.core.exception.DivideByZeroException;

public abstract class Literal extends Content
{
	Literal value()
	{
		return this;
	}

	public String showCont() throws DivideByZeroException
	{
		return toString();
	}
}