package method.p2;
import method.p1.M;
import method.p1.N;


public class Y extends N
{
	

	public static void main(String[] args) {
		
		System.out.println("methods of Claa M,N");

				new M().publicmethod();
                new Y().publicmethod(); 
				new Y() .protectedmethod();

				System.out.println("\n");
                System.out.println("Variables of class X");
				X ob=new X();

				System.out.println("private int h="+ob.name);
				System.out.println("protected float f="+ob.f);
				System.out.println("public chat name"+ob.name); 

	}

}
