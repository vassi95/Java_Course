import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class AppWindow {

	private JFrame frmLottaryGame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWindow window = new AppWindow();
					window.frmLottaryGame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	HashMap<Long, ArrayList<Byte>> players = new HashMap<Long, ArrayList<Byte>>();
	HashMap<Long, Byte> winners = new HashMap<Long, Byte>();
	private void initialize() {
		frmLottaryGame = new JFrame();
		frmLottaryGame.setBackground(new Color(244, 164, 96));
		frmLottaryGame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Vasi\\Desktop\\asd.jpg"));
		frmLottaryGame.setForeground(new Color(255, 0, 0));
		frmLottaryGame.getContentPane().setForeground(new Color(240, 230, 140));
		frmLottaryGame.setFont(new Font("Dialog", Font.PLAIN, 15));
		frmLottaryGame.setTitle("Lottary Game");
		frmLottaryGame.setBounds(100, 100, 1171, 758);
		frmLottaryGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLottaryGame.getContentPane().setLayout(null);
		
		JButton btnAddNewPlayer = new JButton("Add New Player");
		btnAddNewPlayer.setBackground(Color.RED);
		btnAddNewPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CreateNewPlayer dialog = new CreateNewPlayer();
				dialog.setModal(true);
				dialog.setVisible(true);
				winners= dialog.getWinners();
				players = dialog.getPlayers();
				
				Player item = dialog.getMainItem();
				if (item != null) {
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] { item.getID(),item.getNum1(), item.getNum2(), item.getNum3(), item.getNum4(), item.getNum5() });
				}

			}
		});
		btnAddNewPlayer.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAddNewPlayer.setForeground(new Color(128, 0, 0));
		btnAddNewPlayer.setBounds(67, 615, 194, 48);
		frmLottaryGame.getContentPane().add(btnAddNewPlayer);
		ArrayList<Integer> list = new ArrayList<>();
		JButton btnWinningNumbers = new JButton("Winning Numbers");
		btnWinningNumbers.setBackground(Color.RED);
		btnWinningNumbers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				

				Random rand = new Random();
				for(int i=0; i<5;i++){
					int randNum = rand.nextInt(30);
					list.add(randNum);
					
				}
				for(int j=0; j<list.size(); j++){
					JOptionPane.showMessageDialog(null, list.get(j));
				}
			}
		});
		btnWinningNumbers.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnWinningNumbers.setForeground(new Color(128, 0, 0));
		btnWinningNumbers.setBounds(336, 615, 194, 48);
		frmLottaryGame.getContentPane().add(btnWinningNumbers);
		
		JButton btnShowWinners = new JButton("Show Winners");
		btnShowWinners.setBackground(Color.RED);
		btnShowWinners.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(Long key: winners.keySet()){
				JOptionPane.showMessageDialog(null, key+":" + winners.get(key).toString()+ "numbers");
				}
			}
		});
		btnShowWinners.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnShowWinners.setForeground(new Color(128, 0, 0));
		btnShowWinners.setBounds(610, 615, 194, 48);
		frmLottaryGame.getContentPane().add(btnShowWinners);
		
		JButton btnExport = new JButton("Export");
		btnExport.setBackground(Color.RED);
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setFileFilter(new FileNameExtensionFilter("Storage System File", "sss"));
					fileChooser.showDialog(null, "Choose...");
					File file = fileChooser.getSelectedFile();
					if (file == null) {
						return;
					}
					String path = file.getPath();
					if (path == null) {
						return;
					}
					path = path.endsWith(".sss") ? path : path + ".sss";
					FileWriter fileStream = new FileWriter(path);
					BufferedWriter writer = new BufferedWriter(fileStream);

					writer.append("Winning numbers:");
						writer.append(list.toString());

					writer.close();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error while saving file!");
				}
				
				

				try {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setFileFilter(new FileNameExtensionFilter("Storage System File", "sss"));
					fileChooser.showDialog(null, "Choose...");
					File file = fileChooser.getSelectedFile();
					if (file == null) {
						return;
					}
					String path = file.getPath();
					if (path == null) {
						return;
					}
					path = path.endsWith(".sss") ? path : path + ".sss";
					FileWriter fileStream = new FileWriter(path);
					BufferedWriter writer = new BufferedWriter(fileStream);

					for(Long key1: players.keySet()){
						writer.append(key1+ ":");
						ArrayList<Byte> t=players.get(key1);
					
							writer.append(t.toString());
							
							

					}
					
					
					
					writer.close();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error while saving file!");
				}
				
				
				try {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setFileFilter(new FileNameExtensionFilter("Storage System File", "sss"));
					fileChooser.showDialog(null, "Choose...");
					File file = fileChooser.getSelectedFile();
					if (file == null) {
						return;
					}
					String path = file.getPath();
					if (path == null) {
						return;
					}
					path = path.endsWith(".sss") ? path : path + ".sss";
					FileWriter fileStream = new FileWriter(path);
					BufferedWriter writer = new BufferedWriter(fileStream);

					for(Long key1: winners.keySet()){
						writer.append(key1+ ":");
						Byte t=winners.get(key1);
					
							writer.append(t.toString());
							
							

					}
					
					
					
					writer.close();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error while saving file!");
				}
				
				
				JOptionPane.showMessageDialog(null, "Successfully saved file!");
			}
			
		});
		btnExport.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnExport.setForeground(new Color(128, 0, 0));
		btnExport.setBounds(877, 615, 194, 48);
		frmLottaryGame.getContentPane().add(btnExport);
		Object[][] rowData = new Object[0][6];
		Object[] columnNames = { "ID", "Num1", "Num2", "Num3", "Num4", "Num5" };
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 1135, 593);
		frmLottaryGame.getContentPane().add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane.setColumnHeaderView(scrollPane_1);
		
		table = new JTable();
		table = new JTable(new DefaultTableModel(rowData, columnNames));
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);

	}
}
