package xxl.core;

import xxl.core.Content;
import xxl.core.exception.AsIntException;
import xxl.core.exception.AsStringException;

public abstract class Function extends Content
{
	private String _name;

	protected abstract Literal compute();

	public String asString() throws AsStringException {}

	public int asInt() throws AsIntException {}

	public Literal value() {}
}