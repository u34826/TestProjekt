package TestProgramm1;

public abstract class Surface {

	protected float _A;
	protected float _U;
	
	abstract void calculateA();
	abstract void calculateU();
	
	public float getA() {
		calculateA();
		return _A;
	}

	public float getU() {
		calculateU();
		return _U;
	}

}
