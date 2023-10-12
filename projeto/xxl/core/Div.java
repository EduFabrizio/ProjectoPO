package xxl.core;

import xxl.core.exception.AsIntException;
import xxl.core.exception.DivisionByZeroException;

public class Div extends BinaryFunction
{

	public Div(Content arg1, Content arg2)
	{
		super(arg1, arg2, "DIV");
	}

	protected Literal compute() throws DivisionByZeroException
	{
		int i;

		if (_arg2.value().asInt() == 0)
			throw new DivisionByZeroException();
		try
		{
			i = _arg1.value().asInt() / _arg2.value().asInt();
		}
		catch(AsIntException ex)
		{
			return null;
		}
		return new LiteralInt(i);
	}
}