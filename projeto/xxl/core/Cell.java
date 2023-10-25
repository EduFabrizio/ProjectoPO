package xxl.core;

import xxl.core.exception.DivideByZeroException;
import java.io.Serializable;
import java.util.List;

public class Cell implements Serializable{
	private static final long serialVersionUID = 80085797949L;
    private int _row;
    private int _column;
    private Content _content;
	private List<Subscriber> _funcDepend;

    public Cell(int row, int column, Content content){
        _row = row;
        _column = column;
        _content = content;
    }
    public String toString(){
		try{
			return "" + _row + ";" + _column + "|" + _content.showCont();
		}
		catch(DivideByZeroException ex)
		{
			return "" + _row + ";" + _column + "|";
		}
        
    }
    void setContent(Content c) throws DivideByZeroException
	{
        _content = c;
		notifyFuncs();
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

	public void notifyFuncs() throws DivideByZeroException
	{
		for (Subscriber s : _funcDepend)
		{
			s.update();
		}
	}

	public void addFunc(Subscriber s)
	{
		_funcDepend.add(s);
	}
	public void remFunc(Subscriber s)
	{
		_funcDepend.remove(s);
	}
}