package feria.principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import feria.clases.Anillo;
import feria.clases.Colgante;
import feria.clases.Joya;
import feria.servicio.ListaJoya;

import javax.swing.JTable;
import javax.swing.JScrollPane;

public class ListarJoyaframe extends JFrame {

	private JPanel contentPane;
	private JTable tablaInventario;


	/**
	 * Create the frame.
	 */
	public ListarJoyaframe() {
		setTitle("Modulo Listar Inventario");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 526, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 32, 415, 201);
		contentPane.add(scrollPane);
		
		tablaInventario = new JTable();
		scrollPane.setViewportView(tablaInventario);
		List<Joya> joyas = ListaJoya.getAll();
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Código");
		modelo.addColumn("Nombre");
		modelo.addColumn("Material");
		modelo.addColumn("Diámetro");
		modelo.addColumn("Largo");
		modelo.addColumn("Precio");
		modelo.addColumn("Stock");
		modelo.addColumn("Precio Venta");
		
		for(Joya j:joyas) {
			if(j instanceof Anillo) {
				Anillo a = (Anillo) j;
				
				Object[] fila = new Object[8];
				fila[0]= a.getCodigo();
				fila[1]= a.getNombre();
				fila[2]= a.getMaterial();
				fila[3]= a.getDiametro();
				fila[4]= "N/A";
				fila[5]= a.getPrecio();
				fila[6]= a.getStock();
				fila[7]= a.CalcularPrecioVenta();
						
				modelo.addRow(fila);
			}
			if(j instanceof Colgante) {
				Colgante c = (Colgante) j;
				
				Object[] fila = new Object[8];
				fila[0]= c.getCodigo();
				fila[1]= c.getNombre();
				fila[2]= c.getMaterial();
				fila[3]= "N/A";
				fila[4]= c.getLargo();
				fila[5]= c.getPrecio();
				fila[6]= c.getStock();
				fila[7]= c.CalcularPrecioVenta();
				
				modelo.addRow(fila);
			}
			
			
		}
		
		tablaInventario.setModel(modelo);
	}
}
