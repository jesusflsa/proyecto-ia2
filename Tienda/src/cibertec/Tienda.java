package cibertec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Tienda extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JMenu mnMantenimiento;
	private JMenuItem mntmConsultar;
	private JMenuItem mntmModificar;
	private JMenuItem mntmListar;
	private JMenu mnVentas;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerar;
	private JMenu mnConfiguracion;
	private JMenuItem mntmDescuentos;
	private JMenuItem mntmObsequios;
	private JMenu mnAyuda;
	private JMenuItem mntmAcerca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tienda() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 465);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mntmSalir.setIcon(null);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultar = new JMenuItem("Consultar ladrillo");
		mntmConsultar.addActionListener(this);
		mntmConsultar.setIcon(null);
		mnMantenimiento.add(mntmConsultar);
		
		mntmModificar = new JMenuItem("Modificar ladrillo");
		mntmModificar.addActionListener(this);
		mntmModificar.setIcon(null);
		mnMantenimiento.add(mntmModificar);
		
		mntmListar = new JMenuItem("Listar ladrillos");
		mntmListar.addActionListener(this);
		mntmListar.setIcon(null);
		mnMantenimiento.add(mntmListar);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mntmVender.setIcon(null);
		mnVentas.add(mntmVender);
		
		mntmGenerar = new JMenuItem("Generar reportes");
		mntmGenerar.addActionListener(this);
		mntmGenerar.setIcon(null);
		mnVentas.add(mntmGenerar);
		
		mnConfiguracion = new JMenu("Configuraci�n");
		menuBar.add(mnConfiguracion);
		
		mntmDescuentos = new JMenuItem("Configurar descuentos");
		mntmDescuentos.addActionListener(this);
		mntmDescuentos.setIcon(null);
		mnConfiguracion.add(mntmDescuentos);
		
		mntmObsequios = new JMenuItem("Configurar obsequios");
		mntmObsequios.addActionListener(this);
		mntmObsequios.setIcon(null);
		mnConfiguracion.add(mntmObsequios);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcerca = new JMenuItem("Acerca de Tienda");
		mntmAcerca.addActionListener(this);
		mntmAcerca.setIcon(null);
		mnAyuda.add(mntmAcerca);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmAcerca) {
			actionPerformedMntmAcerca(e);
		}
		if (e.getSource() == mntmObsequios) {
			actionPerformedMntmObsequios(e);
		}
		if (e.getSource() == mntmDescuentos) {
			actionPerformedMntmDescuentos(e);
		}
		if (e.getSource() == mntmGenerar) {
			actionPerformedMntmGenerar(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmListar) {
			actionPerformedMntmListar(e);
		}
		if (e.getSource() == mntmModificar) {
			actionPerformedMntmModificar(e);
		}
		if (e.getSource() == mntmConsultar) {
			actionPerformedMntmConsultar(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
		
	}
	
	// Archivo
	protected void actionPerformedMntmSalir(ActionEvent e) {
		System.exit(0);
	}
	
	// Mantenimiento
	protected void actionPerformedMntmConsultar(ActionEvent e) {
		// Declarar VARIABLE REFERENCIA que permita controlar la caja de diálogo
		DialogoConsultar d;
		
		// Crear la caja de dialogo en la VARIABLE REFERENCIA
		d = new DialogoConsultar();
		
		// Fijar la localizacion de la caja
		d.setLocationRelativeTo(this);
		
		// Hacer visible la caja de dialogo
		d.setVisible(true);
				
	}
	protected void actionPerformedMntmModificar(ActionEvent e) {
		DialogoModificar d = new DialogoModificar();
		d.setLocationRelativeTo(this);
		d.setVisible(true);
	}
	protected void actionPerformedMntmListar(ActionEvent e) {
		DialogoListar d = new DialogoListar();
		d.setLocationRelativeTo(this);
		d.setVisible(true);
	}
	
	// Ventas
	protected void actionPerformedMntmVender(ActionEvent e) {
		DialogoVender d = new DialogoVender();
		d.setLocationRelativeTo(this);
		d.setVisible(true);
	}
	protected void actionPerformedMntmGenerar(ActionEvent e) {
		DialogoReportes d = new DialogoReportes();
		d.setLocationRelativeTo(this);
		d.setVisible(true);
	}
	
	// Configuraci�n
	protected void actionPerformedMntmDescuentos(ActionEvent e) {
		configDescuento d = new configDescuento();
		d.setLocationRelativeTo(this);
		d.setVisible(true);
	}
	protected void actionPerformedMntmObsequios(ActionEvent e) {
		configObsequio d = new configObsequio();
		d.setLocationRelativeTo(this);
		d.setVisible(true);
	}
	
	// Ayuda
	protected void actionPerformedMntmAcerca(ActionEvent e) {
		DialogoAyuda d = new DialogoAyuda();
		d.setLocationRelativeTo(this);
		d.setVisible(true);
	}
}
