package TestProgramm1;

import java.util.ArrayList;

public class Programm {

	public static void main(String[] args) {
		
		ArrayList<Surface> liste = new ArrayList<Surface>();
		liste.add(new Retangle(20,30));
		liste.add(new Circle(20));
		
		for(Surface surface : liste) {
			System.out.println("A: " + surface.getA());

		}
		
		
		Surface s1 = new Retangle(20,30);
		System.out.println("A: "+ s1.getA());
		System.out.println("U: "+ s1.getU());
		
		Circle c1 = new Circle(20);
		System.out.println("A: "+ c1.getA());
		System.out.println("U: "+ c1.getU());
		
	}

}
