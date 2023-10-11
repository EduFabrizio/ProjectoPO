package xxl.core;

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

	Literal value() {}
}

