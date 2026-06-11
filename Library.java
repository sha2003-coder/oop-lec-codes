import java.util.ArrayList;
import java.util.List;
public class Library
{
	private List <Book> books;
	public Library()
	{
		books=new ArrayList<>();
	}
	public void addBooks(Book b)
	{
		books.add(b);
	}
	public void Displaybooks()
	{
		for(Book b:books)
		{
			System.out.println(b.toString());
		}
	}
}