package xxl.core;

import xxl.core.exception.AsIntException;
import xxl.core.exception.DivideByZeroException;

public class Add extends BinaryFunction
{

	public Add(Content arg1, Content arg2)
	{
		super(arg1, arg2, "ADD");
	}

	protected Literal compute() throws DivideByZeroException
	{
		int i;
		
		try
		{
			if (_arg1.value() == null || _arg2.value() == null || _arg1.value().toString() == "#VALUE" || _arg2.value().toString() == "#VALUE")
				return new LiteralError();
			i = _arg1.value().asInt() + _arg2.value().asInt();
		}
		catch(AsIntException ex)
		{
			return null;
		}
		return new LiteralInt(i);
	}
}