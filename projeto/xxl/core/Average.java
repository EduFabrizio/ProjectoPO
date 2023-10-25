package xxl.core;

import java.util.List;

import xxl.core.exception.AsIntException;
import xxl.core.exception.DivideByZeroException;

public class Average extends IntervalFunction
{
	public Average(Range range)
	{
		super(range, "AVERAGE");
	}

	protected Literal compute() throws DivideByZeroException
	{
		List<Cell> cells = _range.getCells();
		int acumulator = 0;
		if (_changed)
		{}
		for (Cell c : cells)
		{
			try
			{
				acumulator += c.getContent().value().asInt();
			}
			catch(AsIntException ex)
			{
				return null;
			}
		}
		return new LiteralInt(acumulator / cells.size());
	}
}