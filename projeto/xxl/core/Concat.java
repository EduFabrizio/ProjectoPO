package xxl.core;

public class Concat extends IntervalFunction
{
	public Concat(Range range)
	{
		super(range, "CONCAT");
	}

	protected Literal compute()
	{
		return null;
	}
}