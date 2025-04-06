import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.Font;

public class Calc {

	private JFrame frame;
	private JTextField textField;
	
	double a,b,result;
	String operation,answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 483, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
			    textField.setText(number);	
			}
		});
		btn0.setBounds(10, 321, 98, 45);
		frame.getContentPane().add(btn0);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(10, 20, 449, 56);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBack = new JButton("\uF0E7");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String back = null;
				if(textField.getText().length()>0 )
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					back =str.toString();
					textField.setText(back);
				}
			}
		});
		btnBack.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBack.setBounds(10, 86, 98, 45);
		frame.getContentPane().add(btnBack);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
			    textField.setText(number);	
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 139, 98, 45);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
			    textField.setText(number);	
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 197, 98, 45);
		frame.getContentPane().add(btn4);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(130, 86, 98, 45);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
			    textField.setText(number);	
				
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(130, 139, 98, 45);
		frame.getContentPane().add(btn8);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
			    textField.setText(number);	
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(250, 86, 98, 45);
		frame.getContentPane().add(btn00);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "+";
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdd.setBounds(361, 86, 98, 45);
		frame.getContentPane().add(btnAdd);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
			    textField.setText(number);	
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(250, 139, 98, 45);
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "-";
				
			}
		});
		btnSub.setBounds(361, 139, 98, 45);
		frame.getContentPane().add(btnSub);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
			    textField.setText(number);	
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(130, 197, 98, 45);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
			    textField.setText(number);	
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(250, 197, 98, 45);
		frame.getContentPane().add(btn6);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "*";
				
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiply.setBounds(361, 197, 98, 45);
		frame.getContentPane().add(btnMultiply);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
			    textField.setText(number);	
			}
		});
		btn1.setBounds(10, 255, 98, 45);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
			    textField.setText(number);	
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBounds(130, 256, 98, 45);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
			    textField.setText(number);	
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(250, 255, 98, 45);
		frame.getContentPane().add(btn3);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "*";
				
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(361, 255, 98, 45);
		frame.getContentPane().add(btnDivide);
		
		JButton btndot = new JButton(".");
		btndot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btndot.getText();
			    textField.setText(number);	
			}
		});
		btndot.setBounds(130, 321, 98, 45);
		frame.getContentPane().add(btndot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b= Double.parseDouble(textField.getText());
				
				if (operation=="+")
				{
					result= a + b;
					answer=String.format("%.3f"   , result);
			         textField.setText(answer);
				
				}
				else if (operation=="-")
				{
					result= a - b;
					answer=String.format("%.3f"   , result);
			         textField.setText(answer);
			    }
				else if (operation=="*")
				{
					result= a * b;
					answer=String.format("%.3f"   , result);
			         textField.setText(answer);
				}
				else if (operation=="/")
				{
					result= a / b;
					answer=String.format("%.3f"   , result);
			         textField.setText(answer);
				}
				else if (operation=="%")
				{
					result= a % b;
					answer=String.format("%.3f"   , result);
			         textField.setText(answer);
				}    
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(250, 321, 98, 45);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPer = new JButton("%");
		btnPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "%";
				
			}
		});
		btnPer.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPer.setBounds(361, 321, 98, 45);
		frame.getContentPane().add(btnPer);
	}
}
