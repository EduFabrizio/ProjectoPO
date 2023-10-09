package xxl.core;

public class Reference extends Content
{
	private int _row;
	private int _column;
	private Spreadsheet _sheet;

	public Reference(int row, int column)
	{
		_row = row;
		_column = column;
	}

	public String toString() {}

	Literal value() {}
}

