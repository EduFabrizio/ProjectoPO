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

		if (_changed)
		{}
		for (Cell c : _range.getCells())
		{
			try
			{
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