package triangletest;

public class Triangle {
 
	private int a=0; 
	private int b=0; 
	private int c=0; 
	private String s;
	public Triangle()
	{
		this.a=0;
		this.b=0;
		this.c=0;
	}
	
	public Triangle(int x, int y, int z )
	{
		this.a=x;
		this.b=y;
		this.c=z;
	}
	
	public void calculate()
	{
		if ((a+b>c)&&(a+c>b)&&(b+c>a)) {
		if ((a==b)&&(b==c)) {s="equilateral";}
		else if ((a==b)||(b==c)||(a==c)) {s="isosceles";}
		else {s="scalene";}  }
		
		else {
			     s="not a triangle";
			 }

	}
	
	public String getresult()
	{
	   return s;	
	}
}
