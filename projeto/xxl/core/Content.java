package xxl.core;

import xxl.core.exception.AsIntException;
import xxl.core.exception.AsStringException;
import xxl.core.exception.DivideByZeroException;

public abstract class Content
{
	public abstract String toString();

	abstract Literal value() throws DivideByZeroException;

	public String asString() throws AsStringException, DivideByZeroException
	{
		return value().asString();
	}

	public int asInt() throws AsIntException, DivideByZeroException
	{
		return value().asInt();
	}
}