import java.util.*;

interface TextComponent
{
	public void setColor(String newColor);
	public void print();
	public void add(TextComponent child);
	public TextComponent getChild();
}

class TextComposite implements TextComponent
{
	ArrayList<TextComponent> group;
	public TextComposite()
	{
		group = new ArrayList<TextComponent>();
	}
	@Override
	public void setColor(String newColor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}

class TextLeaf implements TextComponent
{
	char character;
	String color;

	public TextLeaf()
	{

	}

	@Override
	public void setColor(String newColor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}
public class Composite 
{
	public static void main(String[] args) 
	{


	}
}
