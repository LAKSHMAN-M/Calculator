import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Window.Type;
//Calculator using Java By Lakshman 
// instagram id : lakshmanrsl23vbs
public class Calculator {

	private JFrame frmCalculator;
	private JTextField variable1;
	private JTextField variable2;
	private JTextField textFieldAns;
	private int num1, num2, ans;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setType(Type.POPUP);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setResizable(false);
		frmCalculator.setBounds(100, 100, 708, 445);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("add");
		btnAdd.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					num1 = Integer.parseInt(variable1.getText());
					num2 = Integer.parseInt(variable2.getText());
					ans = num1 + num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception exception){
					JOptionPane.showMessageDialog(null, "Please Enter a correct Num: ");
				}
			}
		});
		btnAdd.setBounds(40, 264, 97, 44);
		frmCalculator.getContentPane().add(btnAdd);
		
		variable1 = new JTextField();
		variable1.setHorizontalAlignment(SwingConstants.RIGHT);
		variable1.setFont(new Font("SansSerif", Font.BOLD, 20));
		variable1.setBounds(10, 75, 332, 59);
		frmCalculator.getContentPane().add(variable1);
		variable1.setColumns(10);
		
		variable2 = new JTextField();
		variable2.setHorizontalAlignment(SwingConstants.LEFT);
		variable2.setFont(new Font("SansSerif", Font.BOLD, 20));
		variable2.setBounds(371, 75, 318, 59);
		frmCalculator.getContentPane().add(variable2);
		variable2.setColumns(10);
		
		JButton btnSub = new JButton("sub");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Integer.parseInt(variable1.getText());
					num2 = Integer.parseInt(variable2.getText());
					ans = num1 - num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception exception){
					JOptionPane.showMessageDialog(null, "Please Enter a correct Num: ");
				}
			}
		});
		btnSub.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnSub.setBounds(168, 264, 97, 44);
		frmCalculator.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("mul");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Integer.parseInt(variable1.getText());
					num2 = Integer.parseInt(variable2.getText());
					ans = num1 * num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception exception){
					JOptionPane.showMessageDialog(null, "Please Enter a correct Num: ");
				}
			}
		});
		btnMul.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnMul.setBounds(299, 264, 97, 44);
		frmCalculator.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("div");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Integer.parseInt(variable1.getText());
					num2 = Integer.parseInt(variable2.getText());
					ans = num1 / num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception exception){
					JOptionPane.showMessageDialog(null, "Please Enter a correct Num: ");
				}
			}
		});
		btnDiv.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnDiv.setBounds(434, 264, 97, 44);
		frmCalculator.getContentPane().add(btnDiv);
		
		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				variable1.setText("");
				variable2.setText("");
				textFieldAns.setText("");
			}
		});
		btnClear.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnClear.setBounds(558, 264, 111, 122);
		frmCalculator.getContentPane().add(btnClear);
		
		textFieldAns = new JTextField();
		textFieldAns.setFont(new Font("SansSerif", Font.BOLD, 20));
		textFieldAns.setBackground(new Color(192, 192, 192));
		textFieldAns.setEditable(false);
		textFieldAns.setBounds(282, 177, 387, 59);
		frmCalculator.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Number First Num");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(41, 39, 286, 26);
		frmCalculator.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterNumberSecond = new JLabel("Enter Number Second Num");
		lblEnterNumberSecond.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblEnterNumberSecond.setBounds(395, 39, 286, 26);
		frmCalculator.getContentPane().add(lblEnterNumberSecond);
		
		JLabel lblNewLabel_1 = new JLabel("YOUR ANSWER IS :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(286, 145, 203, 22);
		frmCalculator.getContentPane().add(lblNewLabel_1);
		
		JButton btnPreviousAnsPlus = new JButton("PREVIOUS ANS ");
		btnPreviousAnsPlus.setHorizontalAlignment(SwingConstants.LEFT);
		btnPreviousAnsPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldAns.setText(Integer.toString(ans));
				variable1.setText(Integer.toString(ans));
			}
		});
		btnPreviousAnsPlus.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnPreviousAnsPlus.setBounds(40, 179, 196, 59);
		frmCalculator.getContentPane().add(btnPreviousAnsPlus);
		
		JButton btnSqre = new JButton("sqre");
		btnSqre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double sqre = Math.pow(Integer.parseInt(variable1.getText()), 2);
					textFieldAns.setText(Double.toString(sqre));
				}catch(Exception exception) {
					JOptionPane.showMessageDialog(null, "Please check the Num: ");
				}
			}
		});
		btnSqre.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnSqre.setBounds(40, 342, 97, 44);
		frmCalculator.getContentPane().add(btnSqre);
		
		JButton btnCude = new JButton("cude");
		btnCude.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double cude = Math.pow(Integer.parseInt(variable1.getText()), 3);
					textFieldAns.setText(Double.toString(cude));
				}catch(Exception exception) {
					JOptionPane.showMessageDialog(null, "Please check the Num: ");
				}
			}
		});
		btnCude.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnCude.setBounds(168, 342, 97, 44);
		frmCalculator.getContentPane().add(btnCude);
		
		JButton btnRoot = new JButton("root");
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double sqrt = Math.sqrt(Integer.parseInt(variable1.getText()));
					textFieldAns.setText(Double.toString(sqrt));
				}catch(Exception exception) {
					JOptionPane.showMessageDialog(null, "Please check the Num: ");
				}
			}
		});
		btnRoot.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnRoot.setBounds(299, 342, 97, 44);
		frmCalculator.getContentPane().add(btnRoot);
		
		JButton btnPercent = new JButton("percentage");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double sqre = Integer.parseInt(variable1.getText())/100;
					textFieldAns.setText(Double.toString(sqre));
				}catch(Exception exception) {
					JOptionPane.showMessageDialog(null, "Please check the Num: ");
				}
			}
		});
		btnPercent.setToolTipText("percentage");
		btnPercent.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnPercent.setBounds(434, 342, 97, 44);
		frmCalculator.getContentPane().add(btnPercent);
	}
}
