package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class DialogoConsultar extends JDialog implements ActionListener {
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblLargo;
	private JLabel lblEspesor;
	private JLabel lblCanOptima;
	private JComboBox<String> cboModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtCanOptima;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoConsultar dialog = new DialogoConsultar();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConsultar() {
		setModal(true);
		setTitle("Consultar ladrillo");
		setBounds(100, 100, 450, 210);
		getContentPane().setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(15, 15, 120, 14);
		getContentPane().add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(15, 40, 120, 14);
		getContentPane().add(lblPrecio);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(15, 65, 120, 14);
		getContentPane().add(lblAncho);
		
		lblLargo = new JLabel("Largo (cm)");
		lblLargo.setBounds(15, 90, 120, 14);
		getContentPane().add(lblLargo);
		
		lblEspesor = new JLabel("Espesor (mm)");
		lblEspesor.setBounds(15, 115, 120, 14);
		getContentPane().add(lblEspesor);
		
		lblCanOptima = new JLabel("Can. Óptima (millares)");
		lblCanOptima.setBounds(15, 140, 120, 14);
		getContentPane().add(lblCanOptima);
		
		cboModelo = new JComboBox<String>();
		cboModelo.setModel(new DefaultComboBoxModel<String>(new String[] {"Ladrillo King Kong 18 Huecos", "Ladrillo King Kong Macizo", "Ladrillo Pandereta Acanalada", "Ladrillo Patelero", "Ladrillo Techo Hueco"}));
		cboModelo.setBounds(145, 11, 180, 22);
		getContentPane().add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEnabled(false);
		txtPrecio.setBounds(145, 37, 180, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setEnabled(false);
		txtAncho.setBounds(145, 62, 180, 20);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);
		
		txtLargo = new JTextField();
		txtLargo.setEnabled(false);
		txtLargo.setBounds(145, 87, 180, 20);
		getContentPane().add(txtLargo);
		txtLargo.setColumns(10);
		
		txtEspesor = new JTextField();
		txtEspesor.setEnabled(false);
		txtEspesor.setBounds(145, 112, 180, 20);
		getContentPane().add(txtEspesor);
		txtEspesor.setColumns(10);
		
		txtCanOptima = new JTextField();
		txtCanOptima.setEnabled(false);
		txtCanOptima.setBounds(145, 137, 180, 20);
		getContentPane().add(txtCanOptima);
		txtCanOptima.setColumns(10);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 11, 89, 23);
		getContentPane().add(btnCerrar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		
	}
}
