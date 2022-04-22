package TrabajoEntornos;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicGraphicsUtils;

import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import java.awt.Font;
import java.awt.Graphics;

/**
 * <h2>Interfaz</h2>
 *
 * @author Adrian Lloria Monterde
 * @version 1.0
 *
 */

public class TrabajoEntornos extends JPanel {

	private static Alimento patatasFritas = new Alimento("Patatas Fritas", 37.47, 10.96, 49.74, 4.12, 6.56, 525, 547);
	private static Alimento alitasDePollo = new Alimento("Alitas de Pollo", 19.3, 5.4, 0, 0, 26.64, 404, 288);
	private static Alimento heladoVainilla = new Alimento("Helado de Vainilla", 11, 6.79, 23.6, 21.22, 33.5, 80, 201);
	private static Alimento gominolas = new Alimento("Gominolas", 0.05, 0, 93.55, 70, 0, 50, 375);
	private static Alimento brocoli = new Alimento("Brocoli", 0.37, 0.039, 6.64, 1.7, 2.82, 33, 34);
	private static Alimento coliflor = new Alimento("Coliflor", 0.1, 0.032, 5.3, 2.4, 1.98, 30, 25);

	private JFrame frmValoracion;
	private JTable table;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JCheckBox chckbxNewCheckBox_4;
	private JCheckBox chckbxNewCheckBox_5;
	private JLabel lblSeleccionaLosAlimentos;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	public TrabajoEntornos() {

		initialize();

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// ARRAY LIST CREADO
		
		ArrayList<Alimento> listaAlimentos = new ArrayList<Alimento>();

		listaAlimentos.add(patatasFritas);
		listaAlimentos.add(alitasDePollo);
		listaAlimentos.add(heladoVainilla);
		listaAlimentos.add(gominolas);
		listaAlimentos.add(brocoli);
		listaAlimentos.add(coliflor);

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrabajoEntornos window = new TrabajoEntornos();
					window.frmValoracion.setVisible(true);
//					window.frmValoracion.setContentPane(window);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmValoracion = new JFrame();
		frmValoracion.setTitle("Valoracion de la Dieta");

		frmValoracion.setBounds(100, 100, 938, 580);
		frmValoracion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Scanner tec = new Scanner(System.in);

		table = new JTable();
		table.setFont(new Font("Arial", Font.BOLD, 13));
		table.setBorder(new LineBorder(new Color(255, 200, 0), 3, true));
		table.setRowHeight(33);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setBounds(66, 41, 696, 330);

		Object[][] data;

		table.setModel(new DefaultTableModel(new Object[][] {
				{ "Nombre", "Grasas", "G Saturadas", "Hidratos", "Azucares", "Proteinas", "Sal", "Calorias" },
				{ String.valueOf(patatasFritas.getNombre()), String.valueOf(patatasFritas.getGrasas()), String.valueOf(patatasFritas.getGrasas_saturadas()), String.valueOf(patatasFritas.getHidratos()),
					String.valueOf(patatasFritas.getAzucar()), String.valueOf(patatasFritas.getProteinas()), String.valueOf(patatasFritas.getSal()), String.valueOf(patatasFritas.getCalorias()) },
				{ String.valueOf(alitasDePollo.getNombre()), String.valueOf(alitasDePollo.getGrasas()), String.valueOf(alitasDePollo.getGrasas_saturadas()), String.valueOf(alitasDePollo.getHidratos()),
						String.valueOf(alitasDePollo.getAzucar()), String.valueOf(alitasDePollo.getProteinas()), String.valueOf(alitasDePollo.getSal()), String.valueOf(alitasDePollo.getCalorias())  }, 
				{ String.valueOf(heladoVainilla.getNombre()), String.valueOf(heladoVainilla.getGrasas()), String.valueOf(heladoVainilla.getGrasas_saturadas()), String.valueOf(heladoVainilla.getHidratos()),
							String.valueOf(heladoVainilla.getAzucar()), String.valueOf(heladoVainilla.getProteinas()), String.valueOf(heladoVainilla.getSal()), String.valueOf(heladoVainilla.getCalorias()) },
				{ String.valueOf(gominolas.getNombre()), String.valueOf(gominolas.getGrasas()), String.valueOf(gominolas.getGrasas_saturadas()), String.valueOf(gominolas.getHidratos()),
								String.valueOf(gominolas.getAzucar()), String.valueOf(gominolas.getProteinas()), String.valueOf(gominolas.getSal()), String.valueOf(gominolas.getCalorias()) },
				{ String.valueOf(brocoli.getNombre()), String.valueOf(brocoli.getGrasas()), String.valueOf(brocoli.getGrasas_saturadas()), String.valueOf(brocoli.getHidratos()),
									String.valueOf(brocoli.getAzucar()), String.valueOf(brocoli.getProteinas()), String.valueOf(brocoli.getSal()), String.valueOf(brocoli.getCalorias()) },
				{ String.valueOf(coliflor.getNombre()), String.valueOf(coliflor.getGrasas()), String.valueOf(coliflor.getGrasas_saturadas()), String.valueOf(coliflor.getHidratos()),
										String.valueOf(coliflor.getAzucar()), String.valueOf(coliflor.getProteinas()), String.valueOf(coliflor.getSal()), String.valueOf(coliflor.getCalorias()) },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, },
				new String[] { "Nombre", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column" }) {
			boolean[] columnEditables = new boolean[] { false, true, true, true, true, true, true, true };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setMinWidth(40);
		table.getColumnModel().getColumn(2).setMinWidth(40);
		table.getColumnModel().getColumn(3).setMinWidth(40);
		table.getColumnModel().getColumn(4).setMinWidth(40);
		table.getColumnModel().getColumn(5).setMinWidth(40);
		frmValoracion.getContentPane().setLayout(null);
		frmValoracion.getContentPane().add(table);

		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(37, 80, 21, 21);
		frmValoracion.getContentPane().add(chckbxNewCheckBox);

		chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBounds(37, 110, 21, 21);
		frmValoracion.getContentPane().add(chckbxNewCheckBox_1);

		chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.setBounds(37, 145, 21, 21);
		frmValoracion.getContentPane().add(chckbxNewCheckBox_2);

		chckbxNewCheckBox_3 = new JCheckBox("");
		chckbxNewCheckBox_3.setBounds(37, 180, 21, 21);
		frmValoracion.getContentPane().add(chckbxNewCheckBox_3);

		chckbxNewCheckBox_4 = new JCheckBox("");
		chckbxNewCheckBox_4.setBounds(37, 210, 21, 21);
		frmValoracion.getContentPane().add(chckbxNewCheckBox_4);

		chckbxNewCheckBox_5 = new JCheckBox("");
		chckbxNewCheckBox_5.setBounds(37, 245, 21, 21);
		frmValoracion.getContentPane().add(chckbxNewCheckBox_5);

		lblSeleccionaLosAlimentos = new JLabel(
				"Selecciona los alimentos que consumes y escribe la cantidad en gramos.");
		lblSeleccionaLosAlimentos.setBounds(195, 12, 455, 17);
		frmValoracion.getContentPane().add(lblSeleccionaLosAlimentos);

		JButton btnNewButton = new JButton("Valorar Dieta");
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNewButton.setBounds(254, 400, 139, 27);
		frmValoracion.getContentPane().add(btnNewButton);

		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"), 3, true));
		textArea.setEnabled(false);
		textArea.setEditable(false);
		textArea.setBounds(509, 402, 371, 99);
		frmValoracion.getContentPane().add(textArea);

		textField = new JTextField();
		textField.setBorder(new LineBorder(Color.GRAY, 3, true));
		textField.setBounds(770, 80, 110, 20);
		frmValoracion.getContentPane().add(textField);
		textField.setColumns(10);

		JCheckBox chckbxNewCheckBox_5_1 = new JCheckBox("");
		chckbxNewCheckBox_5_1.setBounds(37, 275, 21, 21);
		frmValoracion.getContentPane().add(chckbxNewCheckBox_5_1);

		JCheckBox chckbxNewCheckBox_5_2 = new JCheckBox("");
		chckbxNewCheckBox_5_2.setBounds(37, 310, 21, 21);
		frmValoracion.getContentPane().add(chckbxNewCheckBox_5_2);

		JCheckBox chckbxNewCheckBox_5_3 = new JCheckBox("");
		chckbxNewCheckBox_5_3.setBounds(37, 340, 21, 21);
		frmValoracion.getContentPane().add(chckbxNewCheckBox_5_3);

		textField_1 = new JTextField();
		textField_1.setBorder(new LineBorder(new Color(128, 128, 128), 3, true));
		textField_1.setColumns(10);
		textField_1.setBounds(770, 110, 110, 20);
		frmValoracion.getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(Color.GRAY, 3, true));
		textField_2.setColumns(10);
		textField_2.setBounds(770, 145, 110, 20);
		frmValoracion.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(Color.GRAY, 3, true));
		textField_3.setColumns(10);
		textField_3.setBounds(770, 180, 110, 20);
		frmValoracion.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setBorder(new LineBorder(Color.GRAY, 3, true));
		textField_4.setColumns(10);
		textField_4.setBounds(770, 210, 110, 20);
		frmValoracion.getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setBorder(new LineBorder(Color.GRAY, 3, true));
		textField_5.setColumns(10);
		textField_5.setBounds(770, 245, 110, 20);
		frmValoracion.getContentPane().add(textField_5);

		textField_6 = new JTextField();
		textField_6.setBorder(new LineBorder(Color.GRAY, 3, true));
		textField_6.setColumns(10);
		textField_6.setBounds(770, 275, 110, 20);
		frmValoracion.getContentPane().add(textField_6);

		textField_7 = new JTextField();
		textField_7.setBorder(new LineBorder(Color.GRAY, 3, true));
		textField_7.setColumns(10);
		textField_7.setBounds(770, 310, 110, 20);
		frmValoracion.getContentPane().add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBorder(new LineBorder(Color.GRAY, 3, true));
		textField_8.setBounds(770, 340, 110, 20);
		frmValoracion.getContentPane().add(textField_8);
	}

//	@Override
//	public void paint(Graphics g) {
//
//		ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/comida.jpg"));
//
//		g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this);
//
//		setOpaque(false);
//		super.paint(g);
//	}

}
