package xxl.core;

public class LiteralString extends Literal
{
	public String _value;

	public LiteralString(String value)
	{
		_value = value;
	}
	
	public String toString()
	{
		return '\'' + _value;
	}

	public String asString()
	{
		
	}
}