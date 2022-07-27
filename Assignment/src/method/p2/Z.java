package method.p2;

import method.p1.M;
import method.p1.N;
import method.p1.P;

public class Z extends M{
	public static void main(String[] args) {
		System.out.println("Methodas Of Class M,N,P");
		new Z().publicmethod();
		new Z().protectedmethod();
		new N().publicmethod();
		new P().publicmethod();
		System.out.println("\n");
		System.out.println("variables of class x ");
		X ob=new X();
		System.out.println("private int s="+ob.name);
		System.out.println("protected float f="+ob.f);
		System.out.println("public char name "+ob.f);
		
		
		
		
		

	}

}
