package xxl.core;

import xxl.core.exception.AsIntException;
import xxl.core.exception.AsStringException;
import xxl.core.exception.DivideByZeroException;
import java.io.Serializable;

public abstract class Content implements Serializable
{
	private static final long serialVersionUID = 7308670846L;

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

	public abstract String showCont() throws DivideByZeroException;
}