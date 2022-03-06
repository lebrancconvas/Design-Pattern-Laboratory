import java.util.*;

class GraphicComposite
{
	public String name;
	public String color;
	public int width;
	public int height;
	public ArrayList<GraphicComposite> children = new ArrayList<>();

	public GraphicComposite()
	{

	}
}

class Oval extends GraphicComposite
{
	public Oval(String color, int width, int height)
	{
		name = "Oval";
		this.color = color;
		this.width = width;
		this.height = height;
	}
}

class Rectangle extends GraphicComposite
{
	public Rectangle(String color, int width, int height)
	{
		name = "Rectangle";
		this.color = color;
		this.width = width;
		this.height = height;
	}
}

public class Builder 
{
	public static void main(String[] args)
	{
		GraphicComposite drawing = new GraphicComposite();
		drawing.children.add(new Rectangle("Red", 100, 100));
		System.out.println(drawing);
	}
}
