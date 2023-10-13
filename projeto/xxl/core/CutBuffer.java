package xxl.core;

import java.util.ArrayList;
import java.io.Serializable;

public class CutBuffer implements Serializable
{
	private static final long serialVersionUID = 202311234567L;

	private ArrayList<Cell> _cells;

	public CutBuffer(ArrayList<Cell> cells){
		_cells=cells;
	}
	public ArrayList<Cell> getCells()
	{
		return _cells;
	}
}