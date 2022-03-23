import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Entornos {

	private JFrame frame;
	private JTable table;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JCheckBox chckbxNewCheckBox_4;
	private JCheckBox chckbxNewCheckBox_5;
	private JLabel lblSeleccionaLosAlimentos;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entornos window = new Entornos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Entornos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 536, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Scanner tec = new Scanner(System.in);
		table = new JTable();
		table.setBounds(96, 67, 366, 160);
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Nombre", "Calorias", "Hidratos", "Sal", "Azucares", "Proteinas"},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Nombre", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setMinWidth(40);
		table.getColumnModel().getColumn(1).setMinWidth(40);
		table.getColumnModel().getColumn(2).setMinWidth(40);
		table.getColumnModel().getColumn(3).setMinWidth(40);
		table.getColumnModel().getColumn(4).setMinWidth(40);
		table.getColumnModel().getColumn(5).setMinWidth(40);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(table);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(67, 83, 21, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBounds(67, 108, 21, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.setBounds(67, 131, 21, 21);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		chckbxNewCheckBox_3 = new JCheckBox("");
		chckbxNewCheckBox_3.setBounds(67, 156, 21, 21);
		frame.getContentPane().add(chckbxNewCheckBox_3);
		
		chckbxNewCheckBox_4 = new JCheckBox("");
		chckbxNewCheckBox_4.setBounds(67, 181, 21, 21);
		frame.getContentPane().add(chckbxNewCheckBox_4);
		
		chckbxNewCheckBox_5 = new JCheckBox("");
		chckbxNewCheckBox_5.setBounds(67, 206, 21, 21);
		frame.getContentPane().add(chckbxNewCheckBox_5);
		
		lblSeleccionaLosAlimentos = new JLabel("Selecciona los alimentos que consumes y escribe la cantidad en gramos.");
		lblSeleccionaLosAlimentos.setBounds(55, 12, 455, 17);
		frame.getContentPane().add(lblSeleccionaLosAlimentos);
		
		JButton btnNewButton = new JButton("Valorar Dieta");
		btnNewButton.setBounds(204, 256, 139, 27);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setEditable(false);
		textArea.setBounds(96, 306, 371, 99);
		frame.getContentPane().add(textArea);
		
		textField = new JTextField();
		textField.setBounds(474, 83, 114, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
