package xxl.core;

import xxl.core.exception.DivideByZeroException;

public interface Subscriber
{
	void update() throws DivideByZeroException;
}