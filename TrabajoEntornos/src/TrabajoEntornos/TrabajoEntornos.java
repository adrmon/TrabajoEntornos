package TrabajoEntornos;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.Component;

import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

/**
 * <h2>Interfaz</h2>
 *
 * @author Adrian Lloria Monterde
 * @version 1.0
 *
 */

public class TrabajoEntornos extends JPanel {

	private static Alimento patatasFritas = new Alimento("Patatas Fritas", 7.47, 6.96, 49.74, 4.12, 6.56, 0.76, 273);
	private static Alimento alitasDePollo = new Alimento("Alitas de Pollo", 19.3, 5.4, 0, 0, 26.64, 404, 288);
	private static Alimento heladoVainilla = new Alimento("Helado de Vainilla", 11, 6.79, 23.6, 21.22, 33.5, 80, 201);
	private static Alimento gominolas = new Alimento("Gominolas", 0.05, 0, 93.55, 70, 0, 50, 375);
	private static Alimento brocoli = new Alimento("Brocoli", 0.37, 0.039, 6.64, 1.7, 2.82, 0.33, 34);
	private static Alimento coliflor = new Alimento("Coliflor", 0.1, 0.032, 5.3, 2.4, 1.98, 30, 25);
	// private static Alimento chocolate = new Alimento("chocolate", 0.05, 0, 93.55,
	// 70, 0, 50, 375);
	// private static Alimento merluza = new Alimento("Brocoli", 0.37, 0.039, 6.64,
	// 1.7, 2.82, 33, 34);
	// private static Alimento piza = new Alimento("Coliflor", 0.1, 0.032, 5.3, 2.4,
	// 1.98, 30, 25);
	private static ArrayList<Alimento> listaAlimentos;

	private JFrame frmValoracion;
	private JTable table;
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
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_15;
	private JTextField textField_19;
	private JTextField textField_21;
	private JTextField textField_23;
	private JTextField textField_13;
	private JLabel lblGr;
	private JLabel lblGr_1;
	private JLabel lblGr_2;
	private JLabel lblGr_3;
	private JLabel lblGr_4;
	private JLabel lblGr_5;
	private JLabel lblGr_6;
	private JLabel lblGr_7;
	private JLabel lblGr_8;
	private JLabel lblGr_9;
	protected JPanel panel = new JPanel();

	public TrabajoEntornos() {

		initialize();

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// ARRAY LIST CREADO
		listaAlimentos = new ArrayList<Alimento>();

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

		frmValoracion.setBounds(100, 100, 980, 750);
		frmValoracion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Scanner tec = new Scanner(System.in);

		table = new JTable();
		table.setFont(new Font("Arial", Font.BOLD, 13));
		table.setBorder(new LineBorder(new Color(255, 200, 0), 3, true));
		table.setRowHeight(33);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setBounds(34, 41, 795, 330);

		Object[][] data;

		table.setModel(new DefaultTableModel(new Object[][] {
				{ "Nombre", "Grasas (g)", "G Saturadas (g)", "Hidratos (g)", "Azucares (g)", "Proteinas (g)", "Sal (g)",
						"Calorias (g)" },
				{ String.valueOf(patatasFritas.getNombre()), String.valueOf(patatasFritas.getGrasas()),
						String.valueOf(patatasFritas.getGrasas_saturadas()),
						String.valueOf(patatasFritas.getHidratos()), String.valueOf(patatasFritas.getAzucar()),
						String.valueOf(patatasFritas.getProteinas()), String.valueOf(patatasFritas.getSal()),
						String.valueOf(patatasFritas.getCalorias()) },
				{ String.valueOf(alitasDePollo.getNombre()), String.valueOf(alitasDePollo.getGrasas()),
						String.valueOf(alitasDePollo.getGrasas_saturadas()),
						String.valueOf(alitasDePollo.getHidratos()), String.valueOf(alitasDePollo.getAzucar()),
						String.valueOf(alitasDePollo.getProteinas()), String.valueOf(alitasDePollo.getSal()),
						String.valueOf(alitasDePollo.getCalorias()) },
				{ String.valueOf(heladoVainilla.getNombre()), String.valueOf(heladoVainilla.getGrasas()),
						String.valueOf(heladoVainilla.getGrasas_saturadas()),
						String.valueOf(heladoVainilla.getHidratos()), String.valueOf(heladoVainilla.getAzucar()),
						String.valueOf(heladoVainilla.getProteinas()), String.valueOf(heladoVainilla.getSal()),
						String.valueOf(heladoVainilla.getCalorias()) },
				{ String.valueOf(gominolas.getNombre()), String.valueOf(gominolas.getGrasas()),
						String.valueOf(gominolas.getGrasas_saturadas()), String.valueOf(gominolas.getHidratos()),
						String.valueOf(gominolas.getAzucar()), String.valueOf(gominolas.getProteinas()),
						String.valueOf(gominolas.getSal()), String.valueOf(gominolas.getCalorias()) },
				{ String.valueOf(brocoli.getNombre()), String.valueOf(brocoli.getGrasas()),
						String.valueOf(brocoli.getGrasas_saturadas()), String.valueOf(brocoli.getHidratos()),
						String.valueOf(brocoli.getAzucar()), String.valueOf(brocoli.getProteinas()),
						String.valueOf(brocoli.getSal()), String.valueOf(brocoli.getCalorias()) },
				{ String.valueOf(coliflor.getNombre()), String.valueOf(coliflor.getGrasas()),
						String.valueOf(coliflor.getGrasas_saturadas()), String.valueOf(coliflor.getHidratos()),
						String.valueOf(coliflor.getAzucar()), String.valueOf(coliflor.getProteinas()),
						String.valueOf(coliflor.getSal()), String.valueOf(coliflor.getCalorias()) },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
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

		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"), 3, true));
		textArea.setEditable(false);
		textArea.setBounds(509, 500, 371, 99);
		frmValoracion.getContentPane().add(textArea);

		lblSeleccionaLosAlimentos = new JLabel(
				"Selecciona los alimentos que consumes y escribe la cantidad en gramos.");
		lblSeleccionaLosAlimentos.setBounds(195, 12, 455, 17);
		frmValoracion.getContentPane().add(lblSeleccionaLosAlimentos);

		JButton btnNewButton = new JButton("Valorar Dieta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textArea.setText("");

				patatasFritas.calcularCantidadNutrientesTotales(Double.parseDouble(textField.getText()));
				alitasDePollo.calcularCantidadNutrientesTotales(Double.parseDouble(textField_1.getText()));
				heladoVainilla.calcularCantidadNutrientesTotales(Double.parseDouble(textField_2.getText()));
				gominolas.calcularCantidadNutrientesTotales(Double.parseDouble(textField_3.getText()));
				brocoli.calcularCantidadNutrientesTotales(Double.parseDouble(textField_4.getText()));
				coliflor.calcularCantidadNutrientesTotales(Double.parseDouble(textField_5.getText()));

				String resultado_ingesta_calorica_malsana = Alimento.calcularIngestaCaloricaMalsana(listaAlimentos);
				String resultado_consumo_azucar = Alimento.calcularConsumoDeAzucar(listaAlimentos);
				String resultado_consumo_sal = Alimento.calcularConsumoDiarioDeSal(listaAlimentos);

				textArea.append(resultado_ingesta_calorica_malsana + "\n");
				textArea.append(resultado_consumo_azucar + "\n");
				textArea.append(resultado_consumo_sal + "\n");

			}
		});
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNewButton.setBounds(276, 533, 139, 27);
		frmValoracion.getContentPane().add(btnNewButton);

		textField = new JTextField();
		textField.setText("0");

		textField.setBorder(new LineBorder(Color.GRAY, 3, true));
		textField.setBounds(841, 78, 76, 20);
		frmValoracion.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setBorder(new LineBorder(new Color(128, 128, 128), 3, true));
		textField_1.setColumns(10);
		textField_1.setBounds(841, 108, 76, 20);
		frmValoracion.getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setBorder(new LineBorder(Color.GRAY, 3, true));
		textField_2.setColumns(10);
		textField_2.setBounds(841, 143, 76, 20);
		frmValoracion.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setBorder(new LineBorder(Color.GRAY, 3, true));
		textField_3.setColumns(10);
		textField_3.setBounds(841, 178, 76, 20);
		frmValoracion.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setBorder(new LineBorder(Color.GRAY, 3, true));
		textField_4.setColumns(10);
		textField_4.setBounds(841, 208, 76, 20);
		frmValoracion.getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setText("0");
		textField_5.setBorder(new LineBorder(Color.GRAY, 3, true));
		textField_5.setColumns(10);
		textField_5.setBounds(841, 243, 76, 20);
		frmValoracion.getContentPane().add(textField_5);

		textField_6 = new JTextField();
		textField_6.setText("0");
		textField_6.setBorder(new LineBorder(Color.GRAY, 3, true));
		textField_6.setColumns(10);
		textField_6.setBounds(841, 273, 76, 20);
		frmValoracion.getContentPane().add(textField_6);

		textField_7 = new JTextField();
		textField_7.setText("0");
		textField_7.setBorder(new LineBorder(Color.GRAY, 3, true));
		textField_7.setColumns(10);
		textField_7.setBounds(841, 308, 76, 20);
		frmValoracion.getContentPane().add(textField_7);

		textField_8 = new JTextField();
		textField_8.setText("0");
		textField_8.setColumns(10);
		textField_8.setBorder(new LineBorder(Color.GRAY, 3, true));
		textField_8.setBounds(841, 338, 76, 20);
		frmValoracion.getContentPane().add(textField_8);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(53, 405, 95, 34);
		frmValoracion.getContentPane().add(textField_16);

		JLabel lblAadeTusPropios = new JLabel("Añade tus propios alimentos y escribe la cantidad en gramos.");
		lblAadeTusPropios.setBounds(195, 378, 455, 17);
		frmValoracion.getContentPane().add(lblAadeTusPropios);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(148, 405, 95, 34);
		frmValoracion.getContentPane().add(textField_9);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(242, 405, 95, 34);
		frmValoracion.getContentPane().add(textField_11);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(434, 405, 95, 34);
		frmValoracion.getContentPane().add(textField_15);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(530, 405, 95, 34);
		frmValoracion.getContentPane().add(textField_19);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(626, 405, 95, 34);
		frmValoracion.getContentPane().add(textField_21);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(721, 405, 95, 34);
		frmValoracion.getContentPane().add(textField_23);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(338, 405, 95, 34);
		frmValoracion.getContentPane().add(textField_13);

		JButton botonadd = new JButton("Añadir");
		botonadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Alimento a1 = new Alimento(textField_16.getText(), Double.parseDouble(textField_9.getText()),
							Double.parseDouble(textField_11.getText()), Double.parseDouble(textField_13.getText()),
							Double.parseDouble(textField_15.getText()), Double.parseDouble(textField_19.getText()),
							Double.parseDouble(textField_21.getText()), Double.parseDouble(textField_23.getText()));

					if (Double.parseDouble(textField_11.getText()) > Double.parseDouble(textField_9.getText()) || Double
							.parseDouble(textField_15.getText()) > Double.parseDouble(textField_13.getText())) {

						JOptionPane.showMessageDialog(panel,
								"No se ha podido a�adir el alimento, corrige los errores por favor ", "Warning",
								JOptionPane.WARNING_MESSAGE);

					} else {
						// FALTA METER EL METODO PARA CALCULAR LA CANTIDAD DE GRAMOS INTRODUCIDA
						a1.calcularCantidadNutrientesTotales(Double.parseDouble(textField_17.getText()));
						listaAlimentos.add(a1);
					}

					textField_16.setText("");
					textField_9.setText("");
					textField_11.setText("");
					textField_13.setText("");
					textField_15.setText("");
					textField_19.setText("");
					textField_21.setText("");
					textField_23.setText("");

					textField_17.setText("");
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(panel, "No puede haber campos vacios. ", "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});

		botonadd.setBorder(new LineBorder(new Color(0, 128, 0), 3, true));
		botonadd.setBounds(53, 483, 139, 27);
		frmValoracion.getContentPane().add(botonadd);

		textField_17 = new JTextField();
		textField_17.setText("0");
		textField_17.setColumns(10);
		textField_17.setBorder(new LineBorder(Color.GRAY, 3, true));
		textField_17.setBounds(841, 411, 76, 20);
		frmValoracion.getContentPane().add(textField_17);

		lblGr = new JLabel("g");
		lblGr.setBounds(926, 80, 60, 17);
		frmValoracion.getContentPane().add(lblGr);

		lblGr_1 = new JLabel("g");
		lblGr_1.setBounds(926, 110, 60, 17);
		frmValoracion.getContentPane().add(lblGr_1);

		lblGr_2 = new JLabel("g");
		lblGr_2.setBounds(926, 145, 60, 17);
		frmValoracion.getContentPane().add(lblGr_2);

		lblGr_3 = new JLabel("g");
		lblGr_3.setBounds(926, 180, 60, 17);
		frmValoracion.getContentPane().add(lblGr_3);

		lblGr_4 = new JLabel("g");
		lblGr_4.setBounds(926, 210, 60, 17);
		frmValoracion.getContentPane().add(lblGr_4);

		lblGr_5 = new JLabel("g");
		lblGr_5.setBounds(926, 245, 60, 17);
		frmValoracion.getContentPane().add(lblGr_5);

		lblGr_6 = new JLabel("g");
		lblGr_6.setBounds(926, 275, 60, 17);
		frmValoracion.getContentPane().add(lblGr_6);

		lblGr_7 = new JLabel("g");
		lblGr_7.setBounds(926, 310, 60, 17);
		frmValoracion.getContentPane().add(lblGr_7);

		lblGr_8 = new JLabel("g");
		lblGr_8.setBounds(926, 340, 60, 17);
		frmValoracion.getContentPane().add(lblGr_8);

		lblGr_9 = new JLabel("g");
		lblGr_9.setBounds(926, 413, 60, 17);
		frmValoracion.getContentPane().add(lblGr_9);
	}
}
