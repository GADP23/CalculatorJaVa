package calculatorinterface;

import java.awt.EventQueue;
import javax.swing.*;

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
		frame.setBounds(100, 100, 352, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(37, 136, 58, 46);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(105, 136, 58, 46);
		frame.getContentPane().add(btn8);
		
		JTextField txtAnswer = new JTextField();
		txtAnswer.setBounds(37, 54, 263, 20);
		frame.getContentPane().add(txtAnswer);
		txtAnswer.setColumns(10);
		
		JLabel lblAnswer = new JLabel("----");
		lblAnswer.setBounds(37, 27, 46, 14);
		frame.getContentPane().add(lblAnswer);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(174, 136, 58, 46);
		frame.getContentPane().add(btn9);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBounds(242, 136, 58, 46);
		frame.getContentPane().add(btnDivide);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(37, 187, 58, 46);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(105, 187, 58, 46);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(174, 187, 58, 46);
		frame.getContentPane().add(btn6);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setBounds(242, 187, 58, 46);
		frame.getContentPane().add(btnMultiply);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(37, 239, 58, 46);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(105, 239, 58, 46);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(174, 239, 58, 46);
		frame.getContentPane().add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(242, 239, 58, 46);
		frame.getContentPane().add(btnMinus);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.setBounds(37, 291, 58, 46);
		frame.getContentPane().add(btnDecimal);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(105, 291, 58, 46);
		frame.getContentPane().add(btn0);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setBounds(174, 291, 58, 46);
		frame.getContentPane().add(btnEquals);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(242, 291, 58, 46);
		frame.getContentPane().add(btnPlus);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(37, 85, 58, 46);
		frame.getContentPane().add(btnC);
	}

}
