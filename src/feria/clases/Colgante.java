package feria.clases;

public class Colgante extends Joya {
	private double largo;

	public Colgante(int codigo, String nombre, String material, int precio, int stock, double largo) {
		super(codigo, nombre, material, precio, stock);
		this.largo = largo;
	}
	
	public Colgante() {
		super();
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	public double CalcularPrecioVenta() {
		return precio*1.45;
	}

}
