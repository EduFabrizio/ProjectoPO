package xxl.core;

import xxl.core.exception.DivideByZeroException;

public class Cell{
    private int _row;
    private int _column;
    private Content _content;

    public Cell(int row, int column){
        _row = row;
        _column = column;
        _content = null;
    }
    public String toString(){
        return _content.toString();
    }
    void setContent(Content c){
        _content = c;
    }
    Literal value() throws DivideByZeroException{
        return _content.value();
    }

	public int getRow()
	{
		return _row;
	}

	public int getColumn()
	{
		return _column;
	}

	public Content getContent()
	{
		return _content;
	}
}