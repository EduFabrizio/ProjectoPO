package xxl.core;

import java.util.ArrayList;
import java.io.Serializable;

public class CutBuffer implements Serializable
{
	private static final long serialVersionUID = 202311234567L;

	private ArrayList<Cell> _cells;
	private String _orientacao;

	public CutBuffer(ArrayList<Cell> cells){
		_cells=cells;
		setOrientacao(cells);
	}

	public void setOrientacao(ArrayList<Cell> cells)
	{
		if (cells.get(0).getRow() == cells.get(cells.size() - 1).getRow())
			_orientacao = "row";
		else
			_orientacao = "column";
	}

	public ArrayList<Cell> getCutBuffer()
	{
		return _cells;
	}
}