package xxl.core;

import xxl.core.exception.AsIntException;
import xxl.core.exception.DivideByZeroException;

public class Product extends IntervalFunction
{
	public Product(Range range)
	{
		super(range, "PRODUCT");
	}

	protected Literal compute() throws DivideByZeroException
	{
		int acumulator = 1;

		for (Cell c : _range.getCells())
		{
			try
			{
				if (c.getContent().value() == null || c.getContent().value().toString() == "#VALUE")
					return new LiteralError();
				acumulator = acumulator * c.getContent().value().asInt();
			}
			catch (AsIntException ex)
			{
				return null;
			}
		}
		return new LiteralInt(acumulator);
	}
}