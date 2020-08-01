package feria.principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import feria.clases.Anillo;
import feria.servicio.ListaJoya;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarAnilloFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtMaterial;
	private JTextField txtDiametro;
	private JTextField txtPrecio;
	private JTextField txtStock;


	/**
	 * Create the frame.
	 */
	public AgregarAnilloFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 586, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo Anillo");
		lblNewLabel.setBounds(10, 11, 96, 21);
		contentPane.add(lblNewLabel);
		
		txtCodigo = new JTextField();
		txtCodigo.setToolTipText("Ingresar N\u00FAmeros ...");
		txtCodigo.setBounds(116, 11, 122, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JButton btnLimpiarAnillo = new JButton("Limpiar");
		btnLimpiarAnillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCodigo.setText("");
				txtNombre.setText("");
				txtMaterial.setText("");
				txtDiametro.setText("");
				txtPrecio.setText("");
				txtStock.setText("");			
			}
		});
		btnLimpiarAnillo.setBounds(323, 222, 89, 23);
		contentPane.add(btnLimpiarAnillo);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(10, 43, 96, 21);
		contentPane.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(116, 43, 122, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Material");
		lblNewLabel_2.setBounds(10, 75, 96, 14);
		contentPane.add(lblNewLabel_2);
		
		txtMaterial = new JTextField();
		txtMaterial.setBounds(116, 74, 122, 20);
		contentPane.add(txtMaterial);
		txtMaterial.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Di\u00E1metro");
		lblNewLabel_3.setBounds(10, 108, 96, 14);
		contentPane.add(lblNewLabel_3);
		
		txtDiametro = new JTextField();
		txtDiametro.setBounds(116, 105, 122, 20);
		contentPane.add(txtDiametro);
		txtDiametro.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Precio");
		lblNewLabel_4.setBounds(10, 140, 96, 14);
		contentPane.add(lblNewLabel_4);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(116, 136, 122, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Stock");
		lblNewLabel_5.setBounds(10, 165, 96, 14);
		contentPane.add(lblNewLabel_5);
		
		txtStock = new JTextField();
		txtStock.setBounds(116, 162, 122, 20);
		contentPane.add(txtStock);
		txtStock.setColumns(10);
		
		JButton btnAgregarA = new JButton("Agregar");
		btnAgregarA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Anillo a = new Anillo();
				String vCodigo = txtCodigo.getText();
				int codigoInt = Integer.parseInt(vCodigo);
				a.setCodigo(codigoInt);
				
				a.setNombre(txtNombre.getText());
				a.setMaterial(txtMaterial.getText());
				
				String vDiametro = txtDiametro.getText();
				double diametroDou = Double.parseDouble(vDiametro);				
				a.setDiametro(diametroDou);
				
				String vPrecio = txtPrecio.getText();
				int precioInt = Integer.parseInt(vPrecio);				
				a.setPrecio(precioInt);
				
				String vStock = txtStock.getText();
				int stockInt = Integer.parseInt(vStock);				
				a.setStock(stockInt);
				
				ListaJoya.add(a);
				JOptionPane.showMessageDialog(null, "Anillo Ingresado");
				
				
				
			}
		});
		btnAgregarA.setBounds(448, 222, 89, 23);
		contentPane.add(btnAgregarA);
	}
}
