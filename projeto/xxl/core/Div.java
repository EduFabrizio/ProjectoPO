package xxl.core;

import xxl.core.exception.AsIntException;
import xxl.core.exception.DivideByZeroException;

public class Div extends BinaryFunction
{

	public Div(Content arg1, Content arg2)
	{
		super(arg1, arg2, "DIV");
	}

	protected Literal compute() throws DivideByZeroException
	{
		int i;

		try
		{
			if (_arg2.value().asInt() == 0)
				throw new DivideByZeroException();
			i = _arg1.value().asInt() / _arg2.value().asInt();
		}
		catch(AsIntException ex)
		{
			return null;
		}
		return new LiteralInt(i);
	}
}