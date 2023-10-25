package xxl.core;

import xxl.core.exception.AsIntException;
import xxl.core.exception.DivideByZeroException;

public class Sub extends BinaryFunction
{

	public Sub(Content arg1, Content arg2)
	{
		super(arg1, arg2, "SUB");
	}

	protected Literal compute() throws DivideByZeroException
	{
		int i;

		try
		{
		i = _arg1.value().asInt() - _arg2.value().asInt();
		}
		catch(AsIntException ex)
		{
			return null;
		}
		return new LiteralInt(i);
	}
}