package xxl.core;

import java.util.ArrayList;

public class CutBuffer
{
	private ArrayList<Cell> _cells;

	public CutBuffer(ArrayList<Cell> cells){
		_cells=cells;
	}
	public ArrayList<Cell> getCells()
	{
		return _cells;
	}
}