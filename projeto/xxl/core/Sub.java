package xxl.core;

import xxl.core.exception.AsIntException;

public class Sub extends BinaryFunction
{

	public Sub(Content arg1, Content arg2)
	{
		super(arg1, arg2, "SUB");
	}

	protected Literal compute()
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