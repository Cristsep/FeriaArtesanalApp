package feria.clases;

public class Anillo extends Joya {
	private double diametro;

	public Anillo(int codigo, String nombre, String material, int precio, int stock, double diametro) {
		super(codigo, nombre, material, precio, stock);
		this.diametro = diametro;
	}
	
	public Anillo() {
		super();
		
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	public double CalcularPrecioVenta() {
		return (precio*1.35);
	}
}
