package xxl.core;

import xxl.core.exception.AsIntException;
import xxl.core.exception.AsStringException;

public abstract class Content
{
	public abstract String toString();

	abstract Literal value();

	public String asString() throws AsStringException
	{
		return value().asString();
	}

	public int asInt() throws AsIntException
	{
		return value().asInt();
	}
}