package feria.clases;

public abstract class Joya {
	protected int codigo;
	protected String nombre;
	protected String material;
	protected int precio;
	protected int stock;
	
	public Joya(int codigo, String nombre, String material, int precio, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.material = material;
		this.precio = precio;
		this.stock = stock;
	}
	
	public Joya () {

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	
	
}
