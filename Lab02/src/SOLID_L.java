class Rectangle
{
	protected int width, height;

	public Rectangle()
	{

	}

	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}

	public int getWidth()
	{
		return width;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	@Override
	public String toString()
	{
		return "Rectangle{" + "width = " + width + ", height = " + height + "}";
	}
}

public class SOLID_L 
{
	public static void main(String[] args)
	{

	}
}
