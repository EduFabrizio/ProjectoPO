package xxl.core;

import xxl.core.exception.AsStringException;
import xxl.core.exception.AsIntException;

public abstract class Literal extends Content
{
	Literal value()
	{
		int i;
		String str;
		try
		{
			str = this.asString();
			i = this.asInt();
		}
		catch(AsStringException exStr)
		{
			return new LiteralInt(i);
		}
		catch(AsIntException exInt)
		{
			return new LiteralString(str);
		}
	}
}