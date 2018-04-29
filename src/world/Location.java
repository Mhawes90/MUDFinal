package world;

public class Location
{
	int row, col;
	
	public Location(int row, int col)
	{
		this.row = row;
		this.col = col;
	}

	public int getRow()
	{
		return row;
	}

	public void setRow(int row)
	{
		this.row = row;
	}

	public int getCol()
	{
		return col;
	}

	public void setCol(int col)
	{
		this.col = col;
	}
	
	@Override
	public String toString()
	{
		return "Location [row=" + (row+1) + ", col=" +( col+1) + "]";
	}
	
}