package xxl.core;

public class Coalesce extends IntervalFunction
{
	public Coalesce(Range range)
	{
		super(range, "COALESCE");
	}

	protected Literal compute()
	{
		return null;
	}
}