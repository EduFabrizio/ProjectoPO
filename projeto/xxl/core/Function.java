package xxl.core;

import xxl.core.exception.AsIntException;
import xxl.core.exception.AsStringException;
import xxl.core.exception.DivideByZeroException;
import java.util.List;
import java.util.ArrayList;

// VERIFICAR BOOLEANO NO COMPUTE EM CADA FUNCAO

public abstract class Function extends Content implements Subscriber
{
	protected String _name;
	protected List<Cell> _cellDepend;
	protected Literal _value;

	public Function(String name)
	{
		_name = name;
		_cellDepend = new ArrayList<Cell>();
	}

	public void update() throws DivideByZeroException
	{
		_value = compute();
	}

	protected abstract Literal compute() throws DivideByZeroException;

	public String asString() throws AsStringException, DivideByZeroException
	{
		return this.value().asString();
	}

	public int asInt() throws AsIntException, DivideByZeroException
	{
		return this.value().asInt();
	}

	public Literal value() throws DivideByZeroException
	{
		return _value;
	}
}