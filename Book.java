public class Book
{
	private String title;
	private String author;
	private int publishYear;
	public Book(String title,String author,int publishYear)
	{
		this.title=title;
		this.author=author;
		this.publishYear=publishYear;
	}
	public String gettitle()
	{
		return title;
	}
	public String getauthor()
	{
		return author;
	}
	public int publishYear()
	{
		return publishYear;
	}
	public String toString()
	{
		return "title="+this.title +", author="+this.author+ ", publishYear="+this.publishYear;
	}
	
}