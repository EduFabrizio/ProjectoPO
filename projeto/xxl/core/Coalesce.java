package xxl.core;

import java.util.List;

import xxl.core.exception.AsStringException;
import xxl.core.exception.DivideByZeroException;

public class Coalesce extends IntervalFunction
{
	public Coalesce(Range range)
	{
		super(range, "COALESCE");
	}

	protected Literal compute() throws DivideByZeroException
	{
		List<Cell> cells = _range.getCells();
		String coalesce = "";

		for (Cell c : cells)
		{
			try
			{
				if (c.getContent().value() == null || c.getContent().value().toString() == "#VALUE")
					return new LiteralError();
				coalesce += c.getContent().value().asString();
				return new LiteralString(coalesce);
			}
			catch (AsStringException ex)
			{
				return null;
			}
		}
		return new LiteralString(coalesce);
	}
}