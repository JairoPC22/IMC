package Codigo;

public class Solucion {
	float kg, mt;
	double imc;
	public Solucion() {}
	
	
	public Solucion(float kg, float mt, double imc) {
		super();
		this.kg = kg;
		this.mt = mt;
		this.imc = imc;
	}

	public float getKg() {
		return kg;
	}
	public void setKg(float kg) {
		this.kg = kg;
	}
	public float getMt() {
		return mt;
	}
	public void setMt(float mt) {
		this.mt = mt;
	}
	public double getImc() {
		return imc;
	}
	public void setImc(double imc) {
		this.imc = imc;
	}
	@Override
	public String toString() {
		return "Solucion [kg=" + kg + ", mt=" + mt + ", imc=" + imc + "]";
	}
	
	
	

}
