import java.awt.BorderLayout;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class CreateNewPlayer extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private Player mainItem;

	public Player getMainItem() {
		return mainItem;
	}
	
	HashMap<Long, ArrayList<Byte>> players = new HashMap<Long, ArrayList<Byte>>();
	HashMap<Long, Byte> winners = new HashMap<Long, Byte>();
	public CreateNewPlayer() {
		setBounds(100, 100, 600, 900);
		setTitle("CREATE NEW ITEM");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JButton btnAddNewItem = new JButton("Add New Player");

		JFormattedTextField formattedIDTextField = new JFormattedTextField();
		formattedIDTextField.setBounds(152, 10, 178, 33);
		getContentPane().add(formattedIDTextField);

		JFormattedTextField formattedNum_1TextField = new JFormattedTextField("{0,number,#}");
		formattedNum_1TextField.setBounds(152, 47, 178, 33);
		formattedNum_1TextField.setValue(new Integer(0));
		getContentPane().add(formattedNum_1TextField);

		JFormattedTextField formattedNum_2TextField = new JFormattedTextField("{0,number,#}");
		formattedNum_2TextField.setBounds(152, 73, 128, 33);
		formattedNum_2TextField.setValue(new Integer(0));
		getContentPane().add(formattedNum_2TextField);
		
		JFormattedTextField formattedNum_3TextField = new JFormattedTextField("{0,number,#}");
		formattedNum_3TextField.setBounds(152, 106, 128, 33);
		formattedNum_3TextField.setValue(new Integer(0));
		getContentPane().add(formattedNum_3TextField);
		
		JFormattedTextField formattedNum_4TextField = new JFormattedTextField("{0,number,#}");
		formattedNum_4TextField.setBounds(152, 150, 128, 33);
		formattedNum_4TextField.setValue(new Integer(0));
		getContentPane().add(formattedNum_4TextField);
		
		JFormattedTextField formattedNum_5TextField = new JFormattedTextField("{0,number,#}");
		formattedNum_5TextField.setBounds(152, 177, 128, 33);
		formattedNum_5TextField.setValue(new Integer(0));
		getContentPane().add(formattedNum_5TextField);

		btnAddNewItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				mainItem = new Player();
				NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);

				long ID = 0;
				byte num1=0;
				byte num2 = 0;
				byte num3=0;
				byte num4 =0;
				byte num5=0;

				try {
					ID = numberFormat.parse(formattedIDTextField.getText()).longValue();
					num1 = numberFormat.parse(formattedNum_1TextField.getText()).byteValue();
					num2 = numberFormat.parse(formattedNum_2TextField.getText()).byteValue();
					num3 = numberFormat.parse(formattedNum_3TextField.getText()).byteValue();
					num4 = numberFormat.parse(formattedNum_4TextField.getText()).byteValue();
					num5 = numberFormat.parse(formattedNum_5TextField.getText()).byteValue();
				} catch (ParseException ex) {
					JOptionPane.showMessageDialog(null, "Error parsing!");
					ex.printStackTrace();
				}

				if (formattedIDTextField.getText() == null || formattedIDTextField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter ID!");

				} else if (formattedNum_1TextField.getText() == null || formattedNum_1TextField.getText().equals("")
						|| num1 < 0 || num1>30) {
					JOptionPane.showMessageDialog(null, "Please enter number 1 again! It must be greater than 1 and smaller than 30!");

				} 
				else if (formattedNum_2TextField.getText() == null || formattedNum_2TextField.getText().equals("")
						|| num2 < 0 || num2>30) {
					JOptionPane.showMessageDialog(null, "Please enter number 2 again! It must be greater than 1 and smaller than 30!");

				}
				else if (formattedNum_3TextField.getText() == null || formattedNum_3TextField.getText().equals("")
						|| num3 < 0 || num3>30) {
					JOptionPane.showMessageDialog(null, "Please enter number 3 again! It must be  greater than 1 and smaller than 30!");

				}
				else if (formattedNum_4TextField.getText() == null || formattedNum_4TextField.getText().equals("")
						|| num4 < 0 || num4>30) {
					JOptionPane.showMessageDialog(null, "Please enter number 4 again! It must be greater than 1 and smaller than 30!");

				}
				else if (formattedNum_5TextField.getText() == null || formattedNum_5TextField.getText().equals("")
						|| num5 < 0 || num5>30) {
					JOptionPane.showMessageDialog(null, "Please enter number 5 again! It must be greater than 1 and smaller than 30!");

				}else {
					ArrayList<Byte> list = new ArrayList<>();
					
					list.add(num1);
					list.add(num2);
					list.add(num3);
					list.add(num4);
					list.add(num5);
					Collections.sort(list);
					
					players.put(ID, list);
					mainItem.setID(ID);
					mainItem.setNum1(num1);
					mainItem.setNum2(num2);
					mainItem.setNum3(num3);
					mainItem.setNum4(num4);
					mainItem.setNum5(num5);
					byte count = 0;
					for(Long key1: players.keySet()){

						for(int j=0;j<list.size();j++){
							
							ArrayList<Byte> t=players.get(key1);
							if (t.contains(list.get(j))) {
								count++;
							}

						}
						if(count>3){
							winners.put(key1, count);
						}
						count= 0;
					}
					
					
					setVisible(false);
				}
			}
		});
		btnAddNewItem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAddNewItem.setBounds(10, 206, 195, 33);
		getContentPane().add(btnAddNewItem);

		JLabel lblID = new JLabel("ID:");
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblID.setBounds(28, 11, 129, 26);
		getContentPane().add(lblID);

		JLabel lblNum1 = new JLabel("Num_1:");
		lblNum1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNum1.setBounds(28, 48, 129, 26);
		getContentPane().add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Num_2:");
		lblNum2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNum2.setBounds(28, 54, 150, 66);
		getContentPane().add(lblNum2);
		
		JLabel lblNum3 = new JLabel("Num_3:");
		lblNum3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNum3.setBounds(28, 87, 150, 66);
		getContentPane().add(lblNum3);
		
		JLabel lblNum4 = new JLabel("Num_4:");
		lblNum4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNum4.setBounds(28, 131, 150, 66);
		getContentPane().add(lblNum4);
		
		JLabel lblNum5 = new JLabel("Num_5:");
		lblNum5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNum5.setBounds(26, 158, 150, 66);
		getContentPane().add(lblNum5);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancel.setBounds(229, 206, 195, 33);
		getContentPane().add(btnCancel);

	}
	public HashMap<Long, ArrayList<Byte>> getPlayers(){
		return players;
	}
	
	public HashMap<Long,Byte> getWinners(){
		return winners;
	}



}
