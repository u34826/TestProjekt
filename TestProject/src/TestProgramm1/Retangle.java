package TestProgramm1;

public class Retangle extends Surface{
	
	private int a;
	private int b;
	
	public Retangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	void calculateA() {
		_A = a * b;
		
	}

	@Override
	void calculateU() {
		_U = 2 * (a + b);
		
	}

}
