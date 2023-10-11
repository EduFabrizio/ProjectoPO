package xxl.core;

import xxl.core.exception.AsIntException;

public class Div extends BinaryFunction
{

	public Div(Content arg1, Content arg2)
	{
		super(arg1, arg2, "DIV");
	}

	protected Literal compute()
	{
		int i;

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