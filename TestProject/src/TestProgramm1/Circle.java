package TestProgramm1;

public class Circle extends Surface{
	
	private int _r;
	
	public Circle(int r) {
		_r = r;
	}
	
	@Override
	void calculateA() {
		_A = (float) (Math.PI * _r * _r);
	}
	
	@Override
	void calculateU() {
		_U = (float) (2 * Math.PI * _r);
	}


}
