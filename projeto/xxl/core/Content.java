package xxl.core;

import java.io.IOException;

import xxl.core.exception.AsIntException;
import xxl.core.exception.AsStringException;
import xxl.core.exception.UnrecognizedEntryException;

public abstract class Content
{
	public abstract String toString();

	abstract Literal value();

	public String asString() throws AsStringException{}

	public int asInt() throws AsIntException{}
}