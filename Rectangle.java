public class Rectangle
{
	private double lengh;
	private double width;
	
	public Rectangle()
	{
		lengh=6.0;
		width=4.0;
	}
	public Rectangle(double lengh,double width)
	{
		this.lengh=lengh;
		this.width=width;
	}
	public double getlenth()
	{
		return lengh;
	}
	public double getwidth()
	{
		return width;
	}
	public double perimeter()
	{
		return this.lengh*2+this.width*2;
	}
	public double  area()
	{
		return this.lengh*this.width;
	}
	
} 