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

	private static Alimento patatasFritas = new Alimento("Patatas Fritas", 14.03, 3.2, 35.62, 0.59, 3.48, 0.76, 273);
	private static Alimento alitasDePollo = new Alimento("Alitas de Pollo", 22.62, 5.9, 0, 0, 27.01, 1.07, 318);
	private static Alimento heladoVainilla = new Alimento("Helado de Vainilla", 11, 6.79, 23.6, 21.22, 3.5, 0.2, 201);
	private static Alimento gominolas = new Alimento("Gominolas", 0.05, 0, 93.55, 70, 0, 0.12, 375);
	private static Alimento brocoli = new Alimento("Brocoli", 0.37, 0.039, 6.64, 1.7, 2.82, 0.08, 34);
	private static Alimento coliflor = new Alimento("Coliflor", 0.1, 0.032, 5.3, 2.4, 1.98, 0.08, 25);
	private static Alimento chocolate = new Alimento("Chocolate", 29.66, 14.23, 59.4, 51.5, 7.65, 0.2, 535);
	private static Alimento merluza = new Alimento("Merluza", 4.38, 0.82, 0.41, 0.09, 21.38, 1.02, 132);
	private static Alimento huevo = new Alimento("Huevos", 9.94, 3.1, 0.77, 0.77, 12.58, 0.35, 147);
	private static ArrayList<Alimento> listaAlimentos;

	private JFrame frmValoracion;
	private JTable table;
	private JLabel lblSeleccionaLosAlimentos;
	private JTextField total_patatas_txt;
	private JTextField total_alitas_txt;
	private JTextField total_helado_txt;
	private JTextField total_gominolas_txt;
	private JTextField total_brocoli_txt;
	private JTextField total_coliflor_txt;
	private JTextField total_chocolate_txt;
	private JTextField total_merluza_txt;
	private JTextField total_huevos_txt;
	private JTextField añadir_nombre_txt;
	private JTextField total_alimento_txt;
	private JTextField añadir_grasas_txt;
	private JTextField añadir_saturadas_txt;
	private JTextField añadir_azucar_txt;
	private JTextField añadir_proteinas_txt;
	private JTextField añadir_sal_txt;
	private JTextField añadir_calorias_txt;
	private JTextField añadir_hidratos_txt;
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

		table.setModel(
				new DefaultTableModel(
						new Object[][] {
								{ "Nombre", "Grasas (g)", "G Saturadas (g)", "Hidratos (g)", "Azucares (g)",
										"Proteinas (g)", "Sal (g)", "Calorias (cal)" },
								{ patatasFritas.getNombre(), patatasFritas.getGrasas(),
										patatasFritas.getGrasas_saturadas(), patatasFritas.getHidratos(),
										patatasFritas.getAzucar(), patatasFritas.getProteinas(), patatasFritas.getSal(),
										patatasFritas.getCalorias() },
								{ alitasDePollo.getNombre(), alitasDePollo.getGrasas(),
										alitasDePollo.getGrasas_saturadas(), alitasDePollo.getHidratos(),
										alitasDePollo.getAzucar(), alitasDePollo.getProteinas(), alitasDePollo.getSal(),
										alitasDePollo.getCalorias() },
								{ heladoVainilla.getNombre(), heladoVainilla.getGrasas(),
										heladoVainilla.getGrasas_saturadas(), heladoVainilla.getHidratos(),
										heladoVainilla.getAzucar(), heladoVainilla.getProteinas(),
										heladoVainilla.getSal(), heladoVainilla.getCalorias() },
								{ gominolas.getNombre(), gominolas.getGrasas(), gominolas.getGrasas_saturadas(),
										gominolas.getHidratos(), gominolas
												.getAzucar(),
										gominolas.getProteinas(), gominolas.getSal(), gominolas.getCalorias() },
								{ brocoli.getNombre(), brocoli.getGrasas(), brocoli.getGrasas_saturadas(),
										brocoli.getHidratos(), brocoli.getAzucar(), brocoli.getProteinas(),
										brocoli.getSal(), brocoli.getCalorias() },
								{ coliflor.getNombre(), coliflor.getGrasas(), coliflor.getGrasas_saturadas(),
										coliflor.getHidratos(), coliflor.getAzucar(), coliflor.getProteinas(),
										coliflor.getSal(), coliflor.getCalorias() },
								{ chocolate.getNombre(), chocolate.getGrasas(), chocolate.getGrasas_saturadas(),
										chocolate.getHidratos(), chocolate.getAzucar(), chocolate.getProteinas(),
										chocolate.getSal(), chocolate.getCalorias() },
								{ merluza.getNombre(), merluza.getGrasas(), merluza.getGrasas_saturadas(),
										merluza.getHidratos(), merluza.getAzucar(), merluza.getProteinas(),
										merluza.getSal(), merluza.getCalorias() },
								{ huevo.getNombre(), huevo.getGrasas(), huevo.getGrasas_saturadas(),
										huevo.getHidratos(), huevo.getAzucar(), huevo.getProteinas(), huevo.getSal(),
										huevo.getCalorias() }, },
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

		JButton btnValorarDieta = new JButton("Valorar Dieta");
		btnValorarDieta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					textArea.setText("");

					patatasFritas.calcularCantidadNutrientesTotales(Double.parseDouble(total_patatas_txt.getText()));
					alitasDePollo.calcularCantidadNutrientesTotales(Double.parseDouble(total_alitas_txt.getText()));
					heladoVainilla.calcularCantidadNutrientesTotales(Double.parseDouble(total_helado_txt.getText()));
					gominolas.calcularCantidadNutrientesTotales(Double.parseDouble(total_gominolas_txt.getText()));
					brocoli.calcularCantidadNutrientesTotales(Double.parseDouble(total_brocoli_txt.getText()));
					coliflor.calcularCantidadNutrientesTotales(Double.parseDouble(total_coliflor_txt.getText()));

					String resultado_ingesta_calorica_malsana = Metodo_Alimento
							.calcularIngestaCaloricaMalsana(listaAlimentos);
					String resultado_consumo_azucar = Metodo_Alimento.calcularConsumoDeAzucar(listaAlimentos);
					String resultado_consumo_sal = Metodo_Alimento.calcularConsumoDiarioDeSal(listaAlimentos);

					textArea.append(resultado_ingesta_calorica_malsana + "\n");
					textArea.append(resultado_consumo_azucar + "\n");
					textArea.append(resultado_consumo_sal + "\n");
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(panel, "Error, rellena todos los campos adecuadamente. ", "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnValorarDieta.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnValorarDieta.setBounds(276, 533, 139, 27);
		frmValoracion.getContentPane().add(btnValorarDieta);

		total_patatas_txt = new JTextField();
		total_patatas_txt.setText("0");

		total_patatas_txt.setBorder(new LineBorder(Color.GRAY, 3, true));
		total_patatas_txt.setBounds(841, 78, 76, 20);
		frmValoracion.getContentPane().add(total_patatas_txt);
		total_patatas_txt.setColumns(10);

		total_alitas_txt = new JTextField();
		total_alitas_txt.setText("0");
		total_alitas_txt.setBorder(new LineBorder(new Color(128, 128, 128), 3, true));
		total_alitas_txt.setColumns(10);
		total_alitas_txt.setBounds(841, 108, 76, 20);
		frmValoracion.getContentPane().add(total_alitas_txt);

		total_helado_txt = new JTextField();
		total_helado_txt.setText("0");
		total_helado_txt.setBorder(new LineBorder(Color.GRAY, 3, true));
		total_helado_txt.setColumns(10);
		total_helado_txt.setBounds(841, 143, 76, 20);
		frmValoracion.getContentPane().add(total_helado_txt);

		total_gominolas_txt = new JTextField();
		total_gominolas_txt.setText("0");
		total_gominolas_txt.setBorder(new LineBorder(Color.GRAY, 3, true));
		total_gominolas_txt.setColumns(10);
		total_gominolas_txt.setBounds(841, 178, 76, 20);
		frmValoracion.getContentPane().add(total_gominolas_txt);

		total_brocoli_txt = new JTextField();
		total_brocoli_txt.setText("0");
		total_brocoli_txt.setBorder(new LineBorder(Color.GRAY, 3, true));
		total_brocoli_txt.setColumns(10);
		total_brocoli_txt.setBounds(841, 208, 76, 20);
		frmValoracion.getContentPane().add(total_brocoli_txt);

		total_coliflor_txt = new JTextField();
		total_coliflor_txt.setText("0");
		total_coliflor_txt.setBorder(new LineBorder(Color.GRAY, 3, true));
		total_coliflor_txt.setColumns(10);
		total_coliflor_txt.setBounds(841, 243, 76, 20);
		frmValoracion.getContentPane().add(total_coliflor_txt);

		total_chocolate_txt = new JTextField();
		total_chocolate_txt.setText("0");
		total_chocolate_txt.setBorder(new LineBorder(Color.GRAY, 3, true));
		total_chocolate_txt.setColumns(10);
		total_chocolate_txt.setBounds(841, 273, 76, 20);
		frmValoracion.getContentPane().add(total_chocolate_txt);

		total_merluza_txt = new JTextField();
		total_merluza_txt.setText("0");
		total_merluza_txt.setBorder(new LineBorder(Color.GRAY, 3, true));
		total_merluza_txt.setColumns(10);
		total_merluza_txt.setBounds(841, 308, 76, 20);
		frmValoracion.getContentPane().add(total_merluza_txt);

		total_huevos_txt = new JTextField();
		total_huevos_txt.setText("0");
		total_huevos_txt.setColumns(10);
		total_huevos_txt.setBorder(new LineBorder(Color.GRAY, 3, true));
		total_huevos_txt.setBounds(841, 338, 76, 20);
		frmValoracion.getContentPane().add(total_huevos_txt);

		añadir_nombre_txt = new JTextField();
		añadir_nombre_txt.setColumns(10);
		añadir_nombre_txt.setBounds(53, 405, 95, 34);
		frmValoracion.getContentPane().add(añadir_nombre_txt);

		JLabel lblAadeTusPropios = new JLabel("Añade tus propios alimentos y escribe la cantidad en gramos.");
		lblAadeTusPropios.setBounds(195, 378, 455, 17);
		frmValoracion.getContentPane().add(lblAadeTusPropios);

		añadir_grasas_txt = new JTextField();
		añadir_grasas_txt.setColumns(10);
		añadir_grasas_txt.setBounds(148, 405, 95, 34);
		frmValoracion.getContentPane().add(añadir_grasas_txt);

		añadir_saturadas_txt = new JTextField();
		añadir_saturadas_txt.setColumns(10);
		añadir_saturadas_txt.setBounds(242, 405, 95, 34);
		frmValoracion.getContentPane().add(añadir_saturadas_txt);

		añadir_azucar_txt = new JTextField();
		añadir_azucar_txt.setColumns(10);
		añadir_azucar_txt.setBounds(434, 405, 95, 34);
		frmValoracion.getContentPane().add(añadir_azucar_txt);

		añadir_proteinas_txt = new JTextField();
		añadir_proteinas_txt.setColumns(10);
		añadir_proteinas_txt.setBounds(530, 405, 95, 34);
		frmValoracion.getContentPane().add(añadir_proteinas_txt);

		añadir_sal_txt = new JTextField();
		añadir_sal_txt.setColumns(10);
		añadir_sal_txt.setBounds(626, 405, 95, 34);
		frmValoracion.getContentPane().add(añadir_sal_txt);

		añadir_calorias_txt = new JTextField();
		añadir_calorias_txt.setColumns(10);
		añadir_calorias_txt.setBounds(721, 405, 95, 34);
		frmValoracion.getContentPane().add(añadir_calorias_txt);

		añadir_hidratos_txt = new JTextField();
		añadir_hidratos_txt.setColumns(10);
		añadir_hidratos_txt.setBounds(338, 405, 95, 34);
		frmValoracion.getContentPane().add(añadir_hidratos_txt);

		JButton botonadd = new JButton("Añadir");
		botonadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Alimento a1 = new Alimento(añadir_nombre_txt.getText(),
							Double.parseDouble(añadir_grasas_txt.getText()),
							Double.parseDouble(añadir_saturadas_txt.getText()),
							Double.parseDouble(añadir_hidratos_txt.getText()),
							Double.parseDouble(añadir_azucar_txt.getText()),
							Double.parseDouble(añadir_proteinas_txt.getText()),
							Double.parseDouble(añadir_sal_txt.getText()),
							Double.parseDouble(añadir_calorias_txt.getText()));

					if (Double.parseDouble(añadir_saturadas_txt.getText()) > Double
							.parseDouble(añadir_grasas_txt.getText())
							|| Double.parseDouble(añadir_azucar_txt.getText()) > Double
									.parseDouble(añadir_hidratos_txt.getText())) {

						JOptionPane.showMessageDialog(panel,
								"No se ha podido a�adir el alimento, corrige los errores por favor ", "Warning",
								JOptionPane.WARNING_MESSAGE);

					} else {

						a1.calcularCantidadNutrientesTotales(Double.parseDouble(total_alimento_txt.getText()));
						listaAlimentos.add(a1);
					}

					añadir_nombre_txt.setText("");
					añadir_grasas_txt.setText("");
					añadir_saturadas_txt.setText("");
					añadir_hidratos_txt.setText("");
					añadir_azucar_txt.setText("");
					añadir_proteinas_txt.setText("");
					añadir_sal_txt.setText("");
					añadir_calorias_txt.setText("");

					total_alimento_txt.setText("");
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(panel, "Error,rellena todos los campos adecuadamente. ", "Warning",
							JOptionPane.WARNING_MESSAGE);
				}

			}
		});

		botonadd.setBorder(new LineBorder(new Color(0, 128, 0), 3, true));
		botonadd.setBounds(53, 483, 139, 27);
		frmValoracion.getContentPane().add(botonadd);

		total_alimento_txt = new JTextField();
		total_alimento_txt.setText("0");
		total_alimento_txt.setColumns(10);
		total_alimento_txt.setBorder(new LineBorder(Color.GRAY, 3, true));
		total_alimento_txt.setBounds(841, 411, 76, 20);
		frmValoracion.getContentPane().add(total_alimento_txt);

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
