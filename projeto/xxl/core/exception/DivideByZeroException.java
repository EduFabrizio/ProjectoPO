package xxl.core.exception;

public class DivideByZeroException extends Exception
{
	public DivideByZeroException()
	{
		super("Impossível dividir por zero.");
	}
}