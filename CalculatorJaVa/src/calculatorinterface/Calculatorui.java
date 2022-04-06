package calculatorinterface;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Color;
import java.awt.SystemColor;

public class Calculatorui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatorui window = new Calculatorui();
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
	public Calculatorui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 352, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(Color.WHITE);
		btn7.setBackground(Color.DARK_GRAY);
		btn7.setBounds(37, 136, 58, 46);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(Color.WHITE);
		btn8.setBackground(Color.DARK_GRAY);
		btn8.setBounds(105, 136, 58, 46);
		frame.getContentPane().add(btn8);
		
		JTextField txtAnswer = new JTextField();
		txtAnswer.setBackground(Color.BLACK);
		txtAnswer.setForeground(Color.WHITE);
		txtAnswer.setBounds(37, 41, 263, 33);
		frame.getContentPane().add(txtAnswer);
		txtAnswer.setColumns(10);
		
		JLabel lblAnswer = new JLabel("----");
		lblAnswer.setForeground(Color.WHITE);
		lblAnswer.setBackground(Color.BLACK);
		lblAnswer.setBounds(37, 16, 46, 14);
		frame.getContentPane().add(lblAnswer);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(Color.WHITE);
		btn9.setBackground(Color.DARK_GRAY);
		btn9.setBounds(173, 136, 58, 46);
		frame.getContentPane().add(btn9);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBackground(new Color(255, 69, 0));
		btnDivide.setForeground(Color.WHITE);
		btnDivide.setBounds(242, 136, 58, 46);
		frame.getContentPane().add(btnDivide);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(Color.WHITE);
		btn4.setBackground(Color.DARK_GRAY);
		btn4.setBounds(37, 187, 58, 46);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(Color.WHITE);
		btn5.setBackground(Color.DARK_GRAY);
		btn5.setBounds(105, 187, 58, 46);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(Color.WHITE);
		btn6.setBackground(Color.DARK_GRAY);
		btn6.setBounds(173, 187, 58, 46);
		frame.getContentPane().add(btn6);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setForeground(Color.WHITE);
		btnMultiply.setBackground(new Color(255, 69, 0));
		btnMultiply.setBounds(242, 187, 58, 46);
		frame.getContentPane().add(btnMultiply);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.DARK_GRAY);
		btn1.setBounds(37, 239, 58, 46);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.DARK_GRAY);
		btn2.setForeground(Color.WHITE);
		btn2.setBounds(105, 239, 58, 46);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(Color.WHITE);
		btn3.setBackground(Color.DARK_GRAY);
		btn3.setBounds(173, 239, 58, 46);
		frame.getContentPane().add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setForeground(Color.WHITE);
		btnMinus.setBackground(new Color(255, 69, 0));
		btnMinus.setBounds(242, 239, 58, 46);
		frame.getContentPane().add(btnMinus);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.setBackground(Color.DARK_GRAY);
		btnDecimal.setForeground(Color.WHITE);
		btnDecimal.setBounds(37, 291, 58, 46);
		frame.getContentPane().add(btnDecimal);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(Color.WHITE);
		btn0.setBackground(Color.DARK_GRAY);
		btn0.setBounds(105, 291, 58, 46);
		frame.getContentPane().add(btn0);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setForeground(Color.WHITE);
		btnEquals.setBackground(new Color(255, 69, 0));
		btnEquals.setBounds(173, 291, 58, 46);
		frame.getContentPane().add(btnEquals);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setForeground(Color.WHITE);
		btnPlus.setBackground(new Color(255, 69, 0));
		btnPlus.setBounds(242, 291, 58, 46);
		frame.getContentPane().add(btnPlus);
		
		JButton btnC = new JButton("C");
		btnC.setForeground(Color.BLACK);
		btnC.setBackground(Color.LIGHT_GRAY);
		btnC.setBounds(37, 85, 58, 46);
		frame.getContentPane().add(btnC);
	}

}
