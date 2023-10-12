package xxl.core;

import xxl.core.exception.AsIntException;
import xxl.core.exception.AsStringException;
import xxl.core.exception.DivideByZeroException;

public abstract class Function extends Content
{
	protected String _name;

	public Function(String name)
	{
		_name = name;
	}

	protected abstract Literal compute() throws DivideByZeroException;

	public String asString() throws AsStringException
	{
		return this.value().asString();
	}

	public int asInt() throws AsIntException
	{
		return this.value().asInt();
	}

	public Literal value()
	{
		return this.compute();
	}
}