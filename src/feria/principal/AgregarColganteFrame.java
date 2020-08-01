package feria.principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import feria.clases.Colgante;
import feria.servicio.ListaJoya;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarColganteFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigoColgante;
	private JTextField txtNombreColgante;
	private JTextField txtMaterialColgante;
	private JTextField txtLargoColgante;
	private JTextField txtPrecioColgante;
	private JTextField txtStockColgante;


	/**
	 * Create the frame.
	 */
	public AgregarColganteFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo Colgante");
		lblNewLabel.setBounds(10, 11, 94, 14);
		contentPane.add(lblNewLabel);
		
		txtCodigoColgante = new JTextField();
		txtCodigoColgante.setBounds(133, 8, 86, 20);
		contentPane.add(txtCodigoColgante);
		txtCodigoColgante.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(10, 36, 94, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNombreColgante = new JTextField();
		txtNombreColgante.setBounds(133, 33, 86, 20);
		contentPane.add(txtNombreColgante);
		txtNombreColgante.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Material");
		lblNewLabel_2.setBounds(10, 61, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Largo");
		lblNewLabel_3.setBounds(10, 86, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Precio");
		lblNewLabel_4.setBounds(10, 111, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Stock");
		lblNewLabel_5.setBounds(10, 136, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		txtMaterialColgante = new JTextField();
		txtMaterialColgante.setBounds(133, 58, 86, 20);
		contentPane.add(txtMaterialColgante);
		txtMaterialColgante.setColumns(10);
		
		txtLargoColgante = new JTextField();
		txtLargoColgante.setBounds(133, 83, 86, 20);
		contentPane.add(txtLargoColgante);
		txtLargoColgante.setColumns(10);
		
		txtPrecioColgante = new JTextField();
		txtPrecioColgante.setBounds(133, 108, 86, 20);
		contentPane.add(txtPrecioColgante);
		txtPrecioColgante.setColumns(10);
		
		txtStockColgante = new JTextField();
		txtStockColgante.setBounds(133, 133, 86, 20);
		contentPane.add(txtStockColgante);
		txtStockColgante.setColumns(10);
		
		JButton btnAgregarColgante = new JButton("Agregar");
		btnAgregarColgante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Colgante c = new Colgante();
				
				int codigoC = Integer.parseInt(txtCodigoColgante.getText());
				c.setCodigo(codigoC);
				
				c.setNombre(txtNombreColgante.getText());
				c.setMaterial(txtMaterialColgante.getText());
				
				double largoC = Double.parseDouble(txtLargoColgante.getText());
				c.setLargo(largoC);
				
				int precioC = Integer.parseInt(txtPrecioColgante.getText());
				c.setPrecio(precioC);
				
				int stockC = Integer.parseInt(txtStockColgante.getText());
				c.setStock(stockC);
				
				ListaJoya.add(c);
				JOptionPane.showMessageDialog(null, "Colgante Ingresado");
			}
		});
		btnAgregarColgante.setBounds(323, 200, 89, 23);
		contentPane.add(btnAgregarColgante);
		
		JButton btnLimpiarColgante = new JButton("Limpiar");
		btnLimpiarColgante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCodigoColgante.setText("");
				txtNombreColgante.setText("");
				txtMaterialColgante.setText("");
				txtLargoColgante.setText("");
				txtPrecioColgante.setText("");
				txtStockColgante.setText("");
			}
		});
		btnLimpiarColgante.setBounds(193, 200, 89, 23);
		contentPane.add(btnLimpiarColgante);
	}
}
