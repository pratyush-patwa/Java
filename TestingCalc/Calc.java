import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

class Calc extends JFrame
{
	JButton [] bt = new JButton[16];
	JPanel pa = new JPanel();
	Border b = BorderFactory.createLineBorder(Color.black,4);
	
	Font fo = new Font("elephant", Font.BOLD, 50);
	public Calc()
	{
	
		setSize(500, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JLabel la = new JLabel("Calculator");
		la.setBounds(40, 5, 400, 100);
		la.setFont(fo);
		la.setBackground(Color.gray);
		add(la);
	
		JTextField tf = new JTextField();
		tf.setBounds(40, 110, 400, 100);
		tf.setFont(fo);
		add(tf);
		
		addButtons();
		pa.setBounds(40, 220, 400, 400);
		pa.setBackground(Color.gray);
		add(pa);

		JButton cbt = new JButton("Clear");
		cbt.setBounds(40,630, 400,80);
		cbt.setBackground(Color.gray);
		cbt.setFont(fo);
		cbt.setBorder(b);
		add(cbt);
	
	setLayout(null);
	setVisible(true);

	}

	private void addButtons(){

		String[] arr= {"1", "2", "3","+", "4", "5", "6","-", "7", "8", "9", "*", ".", "0", "=", "/"};
		pa.setLayout(new GridLayout(4,4));
		pa.setBorder(b);
		for(int i=0; i<16; i++){
			{
			bt[i]= new JButton(arr[i]);
			pa.add(bt[i]);
			bt[i].setBackground(Color.gray);
			bt[i].setBorder(b);
			bt[i].setFont(fo);
			}
		}

	}
	public static void main(String []args)
	{
		new Calc();
	}
}