import java.util.List;
import java.util.stream.*;
import java.io.*;


// Setting Value to Enumurable. 
enum Color
{
	RED, GREEN, BLUE, YELLOW, BLACK, WHITE, PINK, VIOLET, BROWN, GRAY, ORANGE
}

enum Size
{
	VERYSMALL, SMALL, MEDIUM, LARGE, VERYLARGE, EXTRA
}

enum Category
{
	FOOD, ENTERTAINMENT, BOOK, ACCESSORY, CLOTHING, CONSUMING, STATIONARY, GADGET, OTHER
}

// Create Product Initialization Class. 
class Product
{
	public String name;
	public Color color;
	public Size size;
	public Category category;

	public Product(String name, Color color, Size size, Category category)
	{
		this.name = name;
		this.color = color;
		this.size = size;
		this.category = category;
	}
}

class ProductFilter
{

}

interface Filter<T>
{
	Stream<T> filter(List<T> item, Specification<T> spec);
}

class GreatFilter implements Filter<Product>
{
	@Override
	public Stream<Product> filter(List<Product> item, Specification<Product> spec)
	{
		return;
	}
}

interface Specification<T>
{

}

class ColorSpecification implements Specification<Product>
{

}

public class SOLID_O
{
	public static void main(String[] args)
	{
		Product banana = new Product("Banana", Color.GREEN, Size.MEDIUM, Category.FOOD);
		Product pencil01 = new Product("Rotting", Color.BLACK, Size.SMALL, Category.STATIONARY);
		Product smartphone01 = new Product("iPhone 20", Color.GRAY, Size.SMALL, Category.GADGET);

		List<Product> products = List.of(banana, pencil01, smartphone01);
	}
}