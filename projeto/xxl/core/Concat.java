package xxl.core;

import java.util.List;

import xxl.core.exception.AsStringException;
import xxl.core.exception.DivideByZeroException;

public class Concat extends IntervalFunction
{
	public Concat(Range range)
	{
		super(range, "CONCAT");
	}

	protected Literal compute() throws DivideByZeroException
	{
		List<Cell> cells = _range.getCells();
		String concat = "";

		if (_changed)
		{}
		for (Cell c : cells)
		{
			try
			{
				concat += c.getContent().value().asString();
			}
			catch (AsStringException ex)
			{}
		}
		return new LiteralString(concat);
	}
}