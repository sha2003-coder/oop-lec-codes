public class Main
{
	public static void main(String []args)
	{
		Library l1=new Library();
		Book b1=new Book("story","shamil",2006);
		Book b2=new Book("story","shamil",2006);
		l1.addBooks(b1);
		l1.addBooks(b2);
		l1.Displaybooks();
		
		
	}
}