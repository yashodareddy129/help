package method.p1;

public class P {
	
	public void publicmethod() 
	{
		System.out.println("Class P is in public method");
	}
	void defaultmethod()
	{
		System.out.println("Class P is in default method");
		
	}
	private void privatemethod()
	{
		System.out.println("Class P is in private method");
	}
	protected void protectedmethod()
	{
		System.out.println("Class P is in protected method");
	}

	public static void main(String[] args) {
		M obj=new M();
		System.out.println("Class M variables");
		System.out.println("long y="+obj.y);
		System.out.println("protected float perecentage="+obj.percentage);
		System.out.println("\n");
		
		N obj1=new N();
		System.out.println("Class N variables");
		System.out.println("double meters="+obj1.meters);
		System.out.println("public int marks="+obj1.marks);
	}
		
		
		

	}
