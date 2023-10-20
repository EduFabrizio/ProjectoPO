package xxl.core;

import xxl.core.exception.DivideByZeroException;

public class Reference extends Content
{
	private int _row;
	private int _column;
	private Spreadsheet _sheet;

	public Reference(int row, int column, Spreadsheet sheet)
	{
		_row = row;
		_column = column;
		_sheet = sheet;
	}

	public String toString()
	{
		return "=" + Integer.toString(_row) + ";" + Integer.toString(_column);
	}

	Literal value() throws DivideByZeroException
	{
		Cell[][] cells = _sheet.getMatrizCells();
		return cells[_row - 1][_column - 1].getContent().value();
	}

	public String showCont() throws DivideByZeroException
	{
		try {
			return value().toString() + toString();
		} catch(NullPointerException npe) {
			return "#VALUE" + toString();
		}
	}
}

